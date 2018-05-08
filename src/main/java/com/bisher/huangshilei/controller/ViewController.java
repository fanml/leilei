package com.bisher.huangshilei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: songjiajun
 * @Description:
 * @Date:2018-05-08 20:33
 */
@Controller
public class ViewController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
