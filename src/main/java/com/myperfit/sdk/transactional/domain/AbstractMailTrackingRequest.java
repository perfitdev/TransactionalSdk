package com.myperfit.sdk.transactional.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.myperfit.sdk.transactional.annotations.ImmutableStyle;
import com.myperfit.sdk.transactional.domain.tracking.TrackingClickRequest;
import com.myperfit.sdk.transactional.domain.tracking.TrackingGAnalyticsRequest;
import com.myperfit.sdk.transactional.domain.tracking.TrackingOpenRequest;
import org.immutables.value.Value;

import javax.annotation.Nullable;

@Value.Immutable
@JsonSerialize(as = MailTrackingRequest.class)
@JsonDeserialize(as = MailTrackingRequest.class)
@ImmutableStyle
public abstract class AbstractMailTrackingRequest {

    @Nullable
    public abstract TrackingOpenRequest open();

    @Nullable
    public abstract TrackingClickRequest click();

    @Nullable
    public abstract TrackingGAnalyticsRequest ganalytics();
}
