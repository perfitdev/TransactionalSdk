package com.perfit.sdk.transactional.domain.tracking;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.perfit.sdk.transactional.annotations.ImmutableStyle;
import org.immutables.value.Value;

import javax.annotation.Nullable;

@Value.Immutable
@JsonSerialize(as = TrackingOpenRequest.class)
@JsonDeserialize(as = TrackingOpenRequest.class)
@ImmutableStyle
public abstract class AbstractTrackingOpenRequest {
    @Nullable
    public abstract Boolean enable();

}
