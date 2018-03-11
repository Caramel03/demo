package com.demo.handler;

import com.demo.Utils.ResultUtils;
import com.demo.entity.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author yami fang
 * @since 19:20 2018/3/11
 */

@RestControllerAdvice
public class MyExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(MyExceptionHandler.class);

    @ExceptionHandler(RuntimeException.class)
    public Result handle(Exception e){
        logger.error("异常", e);
        return ResultUtils.error(100,e.getMessage());
    }
}
