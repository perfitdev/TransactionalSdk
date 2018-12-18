package com.myperfit.sdk.transactional.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.myperfit.sdk.transactional.annotations.ImmutableStyle;
import org.immutables.value.Value;

import javax.annotation.Nullable;

@Value.Immutable
@JsonSerialize(as = MailAddressRequest.class)
@JsonDeserialize(as = MailAddressRequest.class)
@ImmutableStyle
public abstract class AbstractMailAddressRequest {
    @Nullable
    public abstract String email();

    @Nullable
    public abstract String name();
}
