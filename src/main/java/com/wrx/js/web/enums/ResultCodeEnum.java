package com.wrx.js.web.enums;

public enum ResultCodeEnum {

    SUCCESS("成功", 1), FAIL("失败", -1);


    private String desc;

    private int code;

    public int getCode() {
        return code;
    }

    private ResultCodeEnum(String desc, int code) {
        this.desc = desc;
        this.code = code;
    }

}
