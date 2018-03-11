package com.demo.Utils;

import com.demo.entity.Result;
import com.demo.enums.ResultEnum;

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

    public static Result error(ResultEnum resultEnum){
        Result result = new Result();
        result.setCode(resultEnum.getCode());
        result.setMsg(resultEnum.getMsg());
        return result;
    }
}
