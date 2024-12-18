package com.scoremg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: scoremg
 * @description:
 * @author: 陈程猿
 * @create: 2024-12-18 09:31
 **/
@Controller
public class LoginController {


    // 登录
    @RequestMapping("/login")
    public String login() {
         return "/login";
    }
}
