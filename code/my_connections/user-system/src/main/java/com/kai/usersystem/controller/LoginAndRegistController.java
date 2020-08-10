package com.kai.usersystem.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vo.LoginVo;

@RestController
@RequestMapping("/system/loginAndRegist")
public class LoginAndRegistController {

    @PostMapping("/login")
    public String login(@RequestBody LoginVo vo){
        return vo.toString();
    }


}
