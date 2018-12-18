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

import java.util.Map;

@Value.Immutable
@JsonSerialize(as = PemError.class)
@JsonDeserialize(as = PemError.class)
@ImmutableStyle
public abstract class AbstractPemError {
    public abstract Integer status();

    public abstract String type();

    public abstract String message();

    public abstract String moreInfo();

    public abstract Map errors();
}
