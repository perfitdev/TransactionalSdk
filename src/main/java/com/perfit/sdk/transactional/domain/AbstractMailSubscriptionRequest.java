package com.perfit.sdk.transactional.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.perfit.sdk.transactional.annotations.ImmutableStyle;
import org.immutables.value.Value;

import javax.annotation.Nullable;

@Value.Immutable
@JsonSerialize(as = MailSubscriptionRequest.class)
@JsonDeserialize(as = MailSubscriptionRequest.class)
@ImmutableStyle
public abstract class AbstractMailSubscriptionRequest {

    @Nullable
    public abstract String group();

    @Nullable
    @JsonProperty("disable_check")
    public abstract Boolean disableCheck();
}
