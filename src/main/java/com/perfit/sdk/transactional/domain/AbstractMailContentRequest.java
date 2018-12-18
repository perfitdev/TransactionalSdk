package com.perfit.sdk.transactional.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.perfit.sdk.transactional.annotations.ImmutableStyle;
import org.immutables.value.Value;

import javax.annotation.Nullable;

@Value.Immutable
@JsonSerialize(as = MailContentRequest.class)
@JsonDeserialize(as = MailContentRequest.class)
@ImmutableStyle
public abstract class AbstractMailContentRequest {

    @Nullable
    public abstract String html();

    @Nullable
    public abstract String text();

}
