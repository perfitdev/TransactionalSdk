package com.myperfit.sdk.transactional;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.myperfit.sdk.transactional.annotations.ImmutableStyle;
import com.myperfit.sdk.transactional.config.ObjectMapperConfig;
import com.myperfit.sdk.transactional.domain.SendMailRequest;
import com.myperfit.sdk.transactional.domain.responses.PemResponse;
import com.myperfit.sdk.transactional.exceptions.*;
import org.immutables.value.Value;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

@Value.Immutable
@ImmutableStyle
public abstract class AbstractPerfitTransactional {

    public abstract String apiKey();

    @Value.Default
    public String url() {
        return "https://transactional.myperfit.com/v1/";
    }

    @Value.Default
    public ObjectMapper mapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        new ObjectMapperConfig().registerModules(objectMapper);
        return objectMapper;
    }

    @Value.Default
    public JSONParser parser() {
        return new JSONParser();
    }

    public PemResponse send(SendMailRequest mailRequest) throws RequestFailedException {

        try {
            HttpResponse<String> responseHttp = Unirest.post(url() + "mail/send")
                    .header("Content-Type", "application/json")
                    .header("Authorization", "bearer " + apiKey())
                    .body(mapper().writeValueAsString(mailRequest))
                    .asString();
            JSONObject body = (JSONObject) parser().parse(responseHttp.getBody());
            checkIfResponseNotSuccess(responseHttp.getStatus(), body);
            return PemResponse.builder()
                    .body(body)
                    .build();
        } catch (JsonProcessingException | UnirestException | ParseException e) {
            throw new RequestFailedException("");
        } catch (RequestFailedException e) {
            throw e;
        }
    }


    protected void checkIfResponseNotSuccess(Integer status, JSONObject response) throws RequestFailedException {
        if (response != null) {
            if (status >= 300) {
                if (!(Boolean) response.get("success")) {
                    JSONObject error = (JSONObject) response.get("error");
                    switch ((String) error.get("type")) {
                        case "service_unavailable":
                            throw new ServiceUnavailableRequestException(response.toJSONString());
                        case "validation_error":
                            throw new ValidationErrorRequestException(response.toJSONString());
                        case "unauthorized":
                            throw new UnauthorizedRequestException(response.toJSONString());
                        case "forbidden":
                            throw new ForbiddenRequestException(response.toJSONString());
                        case "bad_request":
                            throw new BadRequestRequestException(response.toJSONString());
                        case "internal_server_error":
                            throw new InternalServerErrorRequestException(response.toJSONString());
                    }
                    throw new RequestFailedException(response.toJSONString());
                }
            }
        }
    }
}
