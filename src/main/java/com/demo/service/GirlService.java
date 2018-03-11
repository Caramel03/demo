package com.demo.service;

import com.demo.entity.Girl;
import com.demo.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yami fang
 * @since 18:36 2018/3/11
 */

@Service
public class GirlService {
    @Autowired
    GirlRepository girlRepository;

    public void getAge(Integer id) {

        Girl girl = girlRepository.findOne(id);
        Integer age = girl.getAge();
        if (age<10){
            throw new RuntimeException("小学生");
        }else if(age>10&&age<18){
            throw new RuntimeException("中学生");
        }

    }
}
