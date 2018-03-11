package com.demo.Utils;

import com.demo.entity.Result;

/**
 * @author yami fang
 * @since 16:56 2018/3/11
 */
public class ResultUtils {
    public static Result success(Object object){
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static Result success(){
        return success(null);
    }

    public static Result error(Integer code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
