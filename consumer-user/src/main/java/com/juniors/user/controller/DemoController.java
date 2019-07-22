package com.juniors.user.controller;

import com.juniors.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Juniors
 */
@Controller
public class DemoController {

    @Autowired
    UserService userService;

    @RequestMapping("/skr")
    public String demo(){

        System.out.println(userService.micro());
        return "JUNIORS SUCCESS";
    }
}
