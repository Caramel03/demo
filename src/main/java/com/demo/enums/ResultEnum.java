package com.demo.enums;

/**
 * @author yami fang
 * @since 20:04 2018/3/11
 */
public enum ResultEnum {

    UNKNOW_ERROR(1,"未知错误"),
    SUCCESS(0,"成功"),
    PRIMARY_SCHOOL(100,"小学生"),
    MIDDLE_SCHOOLE(101,"中学生")
    ;
    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
