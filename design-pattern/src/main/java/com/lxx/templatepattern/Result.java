package com.lxx.templatepattern;

import lombok.Data;

/**
 * @author lixiaoxiang
 */
@Data
public class Result {
    //返回码
    private String responseCode;
    //描述
    private String message;
    //数据
    private Object data;

    public Result() {
    }

    public Result(String responseCode, String message) {
        this.responseCode = responseCode;
        this.message = message;
    }

    public Result(String responseCode, String message, Object data) {
        this.responseCode = responseCode;
        this.message = message;
        this.data = data;
    }
}