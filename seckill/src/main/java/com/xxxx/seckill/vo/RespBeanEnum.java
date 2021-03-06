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
    MOBILE_NOT_EXIST(500213, "mobile number does not exist!"),
    PASSWORD_UPDATE_FAIL(500214, "password update fail!"),
    SESSION_ERROR(500215, "user does not exists!"),
    //secKill module 5005xx
    EMPTY_STOCK(500500, "out of stock"),
    REPEATE_ERROR(500501, "one can only order one of this product!"),

    REQUEST_ILLEGAL(500502, "illegal request, please try again!"),

    ERROR_CAPTCHA(500503, "wrong validation code, please try again!"),

    ACCESS_LIMIT_REACHED(500504, "too frequent access request, please try again later!"),
    //order module 5003xx
    ORDER_NOT_EXIST(500300, "order does not exist!"),
    ;


    private final Integer code;
    private final String message;
}
