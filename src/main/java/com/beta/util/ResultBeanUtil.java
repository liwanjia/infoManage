package com.beta.util;

import com.beta.util.commons.Codes;
import com.beta.util.commons.Messages;

/**
 * Created by jimi on 2019/10/19
 * Comments:
 * For:
 */
public class ResultBeanUtil {
    //查询成功
    public static <T> ResultBean successQuery(T data) {
        ResultBean<T> bean = new ResultBean<>(Codes.SUCCESS, true, Messages.SUCCESS_QUERY, data);
        return bean;
    }
    //查询成功
    public static <T> ResultBean successQueryState(String state,T data) {
        ResultBean<T> bean = new ResultBean<T>(Codes.SUCCESS, true, Messages.SUCCESS_QUERY, state,data);
        return bean;
    }
    //查询成功
    public static <T> ResultBean successQueryState(String state,T data,String code) {
        ResultBean<T> bean = new ResultBean<T>(Codes.SUCCESS, true, Messages.SUCCESS_QUERY, state,data);
        return bean;
    }
    //更新成功
    public static <T> ResultBean successUpdate(T data) {
        ResultBean<T> bean = new ResultBean<>(Codes.SUCCESS, true, Messages.SUCCESS_UPDATE, data);
        return bean;
    }

    //更新成功
    public static <T> ResultBean successUpdate() {
        ResultBean<T> bean = new ResultBean<>(Codes.SUCCESS, true, Messages.SUCCESS_UPDATE, null);
        return bean;
    }

    //失败
    public static ResultBean error(int code, String message) {
        ResultBean bean = new ResultBean<>(code, false, message, null);
        return bean;
    }
}
