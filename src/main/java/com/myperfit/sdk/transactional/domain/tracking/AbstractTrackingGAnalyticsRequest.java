package com.myperfit.sdk.transactional.domain.tracking;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.myperfit.sdk.transactional.annotations.ImmutableStyle;
import org.immutables.value.Value;

import javax.annotation.Nullable;

@Value.Immutable
@JsonSerialize(as = TrackingGAnalyticsRequest.class)
@JsonDeserialize(as = TrackingGAnalyticsRequest.class)
@ImmutableStyle
public abstract class AbstractTrackingGAnalyticsRequest {

    @Value.Derived
    public Boolean enable() {
        return !(isNullOrEmpty(utmSource()) &&
                isNullOrEmpty(utmMedium()) &&
                isNullOrEmpty(utmCampaign()) &&
                isNullOrEmpty(utmContent()) &&
                isNullOrEmpty(utmTerm()));
    }

    private boolean isNullOrEmpty(String s) {
        if (s == null) {
            return true;
        }
        return s.isEmpty();
    }

    @JsonProperty("utm_source")
    @Nullable
    public abstract String utmSource();

    @JsonProperty("utm_medium")
    @Nullable
    public abstract String utmMedium();

    @JsonProperty("utm_campaign")
    @Nullable
    public abstract String utmCampaign();

    @JsonProperty("utm_content")
    @Nullable
    public abstract String utmContent();

    @JsonProperty("utm_term")
    @Nullable
    public abstract String utmTerm();

}
