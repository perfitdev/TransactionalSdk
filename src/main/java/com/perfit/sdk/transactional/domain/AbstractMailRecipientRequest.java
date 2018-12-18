package com.perfit.sdk.transactional.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.perfit.sdk.transactional.annotations.ImmutableStyle;
import org.immutables.value.Value;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;

@Value.Immutable
@JsonSerialize(as = MailRecipientRequest.class)
@JsonDeserialize(as = MailRecipientRequest.class)
@ImmutableStyle
public abstract class AbstractMailRecipientRequest {

    @Nullable
    public abstract MailAddressRequest to();

    public abstract List<MailAddressRequest> cc();

    public abstract List<MailAddressRequest> bcc();

    public abstract Map<String, Object> substitutions();

    @JsonProperty("custom_args")
    public abstract Map<String, String> customArgs();

}
