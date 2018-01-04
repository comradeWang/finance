package com.team.finance.entity;

/**
 * Http 请求返回的数据对象
 * @author: Avenger
 * @describe: TODO
 * @create: 2017年12月22日 11:27
 **/
public class AjaxResponse<T> {
    /**
     * 错误码
     */
    private Integer errorCode;

    /**
     * 提示信息
     */
    private String msg;

    private  Integer successCode;
    /**
     * 具体数据内容
     */
    private T data;

    public Integer getSuccessCode() {
        return successCode;
    }

    public void setSuccessCode(Integer successCode) {
        this.successCode = successCode;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
