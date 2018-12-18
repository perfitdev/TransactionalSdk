package com.perfit.sdk.transactional.domain;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.perfit.sdk.transactional.annotations.ImmutableStyle;
import org.immutables.value.Value;

import javax.annotation.Nullable;

@Value.Immutable
@JsonSerialize(as = MailAttachmentRequest.class)
@JsonDeserialize(as = MailAttachmentRequest.class)
@ImmutableStyle
public abstract class AbstractMailAttachmentRequest {
    @Nullable
    public abstract String url();

    @Nullable
    public abstract String data();

    @Nullable
    @JsonProperty("file_name")
    public abstract String fileName();

    @Nullable
    @JsonProperty("mime_type")
    public abstract String mimeType();

}
