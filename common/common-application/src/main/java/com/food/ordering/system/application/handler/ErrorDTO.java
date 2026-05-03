package com.food.ordering.system.application.handler;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Builder
@AllArgsConstructor
public class ErrorDTO {
    private final String code;
    private final String message;

}
