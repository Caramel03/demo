package com.demo.controller;

import com.demo.Utils.ResultUtils;
import com.demo.entity.Girl;
import com.demo.entity.Result;
import com.demo.enums.ResultEnum;
import com.demo.repository.GirlRepository;
import com.demo.service.GirlService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class GirlController {

    @Autowired
    GirlRepository girlRepository;

    @Autowired
    GirlService girlService;

    private final static Logger logger = LoggerFactory.getLogger(GirlController.class);

    /**
     * 返回所有女生列表
     * @return
     */
    @GetMapping(value="/girls")
    public List<Girl> getGirlList(){
        logger.info("333333333333333333333333333");
        return girlRepository.findAll();
    }

    /**
     * 添加一个女生
     * @return
     */
    @PostMapping(value = "/girls")
    public Result<Girl> addGirl(@Valid Girl girl, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return ResultUtils.error(ResultEnum.UNKNOW_ERROR);
        }
        girl.setAge(girl.getAge());
        girl.setCupSize(girl.getCupSize());

        return ResultUtils.success(girlRepository.save(girl));
    }

    /**
     * 查询某个女孩
     * @param id
     * @return
     */
    @GetMapping(value = "/girls/{id}")
    public Girl getGirl(@PathVariable("id")int id){
        return girlRepository.findOne(id);
    }

    /**
     * 修改某个女孩
     * @param id
     * @param age
     * @param cupSize
     * @return
     */
    @PutMapping(value = "/girls/{id}")
    public Girl updateGirl(@PathVariable("id")int id,@RequestParam("age")int age,@RequestParam("cupSize")String cupSize){
        Girl girl = new Girl();
        girl.setId(id);
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return girlRepository.save(girl);
    }

    /**
     * 删除某个女生
     * @param id
     */
    @DeleteMapping(value = "/girls/{id}")
    public void deleteGirl(@PathVariable("id")int id){
        girlRepository.delete(id);
    }

    /**
     * 查询某个年龄的女孩
     * @param age
     * @return
     */
    @GetMapping(value = "/girls/age/{age}")
    public List<Girl> getGirlsByAge(@PathVariable("age")int age){
        return girlRepository.findByAge(age);
    }


    @GetMapping(value = "/girls/getAge/{id}")
    public void getGirlsAge(@PathVariable("id")Integer id){
        girlService.getAge(id);
    }

}
