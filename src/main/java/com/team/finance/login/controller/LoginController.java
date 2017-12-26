package com.team.finance.login.controller;

import com.team.finance.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Avenger
 * @describe: TODO
 * @create: 2017年12月26日 13:35
 **/
@RestController
public class LoginController {
    @Autowired
    LoginService loginService;

    @GetMapping("/login")
    public String find(int id){
        return loginService.find(id);
    }
}
