package com.example.demo.controller;

import com.example.demo.entity.LearnResouce;
import com.example.demo.mapper.LearnMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制器
 *
 * @author: @我没有三颗心脏
 * @create: 2018-05-08-下午 16:46
 */
@RestController
public class HelloController {
    @Autowired
    LearnMapper learnMapper;
    @RequestMapping("/hello")
    public String hello() {
        LearnResouce learnResouce = learnMapper.queryLearnResouceById(999L);
        System.out.println(learnResouce);
        return learnResouce.toString();
    }
}
