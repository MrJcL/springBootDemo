package com.jc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springBootDemo
 * @Date: 2018/12/4 14:32
 * @Author: LiJc
 * @Description:
 */
@RestController //等同于同时加上了@Controller和@ResponseBody
public class HelloController {
    //访问/hello或者/hi任何一个地址，都会返回一样的结果
    @RequestMapping(value = {"/hello","/hi"},method = RequestMethod.GET)
    public String say(){
        return "hi you !!!";
    }
}
