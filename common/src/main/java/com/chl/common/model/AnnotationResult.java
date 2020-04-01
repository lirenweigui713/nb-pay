package com.chl.common.model;

/**
 * @Description: TODO()
 * @Author: Xiao V
 * @Date: 2020/3/27 18:27
 */
public class AnnotationResult {

    private boolean success = false;
    private String err_msg;
    private String data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErr_msg() {
        return err_msg;
    }

    public void setErr_msg(String err_msg) {
        this.err_msg = err_msg;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
