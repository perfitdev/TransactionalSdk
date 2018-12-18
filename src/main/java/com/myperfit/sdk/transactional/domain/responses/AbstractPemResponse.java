/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myperfit.sdk.transactional.domain.responses;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.myperfit.sdk.transactional.annotations.ImmutableStyle;
import org.immutables.value.Value;
import org.json.simple.JSONObject;


@Value.Immutable
@JsonSerialize(as = PemResponse.class)
@JsonDeserialize(as = PemResponse.class)
@ImmutableStyle
public abstract class AbstractPemResponse {
    public abstract JSONObject body();
}
