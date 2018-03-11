package com.demo.handler;

import com.demo.Utils.ResultUtils;
import com.demo.entity.Result;
import com.demo.enums.ResultEnum;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author yami fang
 * @since 19:20 2018/3/11
 */

@RestControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public Result handle(Exception e){
        return ResultUtils.error(ResultEnum.MIDDLE_SCHOOLE);
    }
}
