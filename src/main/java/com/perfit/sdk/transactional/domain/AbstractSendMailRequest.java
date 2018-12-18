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
@JsonSerialize(as = SendMailRequest.class)
@JsonDeserialize(as = SendMailRequest.class)
@ImmutableStyle
public abstract class AbstractSendMailRequest {

    @Nullable
    @JsonProperty("batch_code")
    public abstract String batchCode();

    @Nullable
    public abstract MailAddressRequest from();

    @Nullable
    @JsonProperty("reply_to")
    public abstract MailAddressRequest replyTo();

    @Nullable
    public abstract String subject();

    @Nullable
    public abstract MailContentRequest content();

    public abstract Map<String, String> headers();

    public abstract List<MailRecipientRequest> recipients();

    public abstract List<MailAttachmentRequest> attachments();

    public abstract Map<String, Object> substitutions();

    @Nullable
    public abstract MailTrackingRequest tracking();

    public abstract List<String> tags();

    @Nullable
    public abstract MailSubscriptionRequest subscription();

}