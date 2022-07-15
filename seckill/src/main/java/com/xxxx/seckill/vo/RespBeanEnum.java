package com.xxxx.seckill.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
public enum RespBeanEnum  {
    SUCCESS(200, "SUCCESS"),
    ERROR(500, "server side abnormal");
    private final Integer code;
    private final String message;
}
