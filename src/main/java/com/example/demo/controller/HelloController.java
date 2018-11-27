package com.example.demo.controller;

import com.example.demo.entity.LearnResouce;
import com.example.demo.mapper.LearnMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制器
 *
 * @author: @我没有三颗心脏
 * @create: 2018-05-08-下午 16:46
 */
@Controller
public class HelloController {
    @Autowired
    LearnMapper learnMapper;
    @RequestMapping("/hello")
    public String hello(Model model) {
        LearnResouce learnResouce = learnMapper.queryLearnResouceById(1001L);
        model.addAttribute("learn",learnResouce);
        System.out.println(learnResouce);
        return "index";
    }
}
