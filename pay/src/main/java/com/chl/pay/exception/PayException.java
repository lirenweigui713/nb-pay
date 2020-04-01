package com.chl.pay.exception;

import com.chl.common.model.Result;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @Description: TODO()
 * @Author: Xiao V
 * @Date: 2020/3/11 21:59
 */
@ControllerAdvice
public class PayException  {


    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(value=Exception.class)
    public Result run() {
        System.out.println(404);
        return new Result(404,"资源/接口不存在");
    }

}
