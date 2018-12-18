package com.perfit.sdk.transactional.annotations;

import org.immutables.value.Value;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PACKAGE, ElementType.TYPE})
@Retention(RetentionPolicy.CLASS) // Make it class retention for incremental compilation
@Value.Style(
        typeAbstract = {"Abstract*"}, // 'Abstract' prefix will be detected and trimmed
        typeImmutable = "*",// No prefix or suffix for generated immutable type
        jdkOnly = true
)
public @interface ImmutableStyle {
}
