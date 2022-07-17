package com.xxxx.seckill.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
public enum RespBeanEnum  {
    //general
    SUCCESS(200, "SUCCESS"),
    ERROR(500, "server side abnormal!"),
    //login module 5002xx
    LOGIN_ERROR(500210, "account name or password wrong!"),
    MOBILE_ERROR(500211, "mobile number wrong!"),
    BIND_ERROR(500212, "argument validation abnormal!"),
    //secKill module 5005xx
    EMPTY_STOCK(500500, "out of stock"),
    REPEATE_ERROR(500501, "one can only order one of this product!"),
    ;


    private final Integer code;
    private final String message;
}
