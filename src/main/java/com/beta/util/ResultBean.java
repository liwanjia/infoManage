package com.beta.util;

import lombok.Data;

/**
 * Created by jimi on 2019/10/19
 * Comments:
 * For:
 */
@Data
public class ResultBean<T> {
    private int code;//响应码
    private boolean success;//相应状态
    private T data; //数据
    private String message;//返回信
    private String state;//微信查询结果
    public ResultBean() {
    }

    public ResultBean(int code, boolean success, String message, T data) {
        this.code = code;
        this.success = success;
        this.message = message;
        this.data = data;
    }
    public ResultBean(int code, boolean success, String message, String state,T data) {
        this.code = code;
        this.success = success;
        this.message = message;
        this.state = state;
        this.data = data;
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
