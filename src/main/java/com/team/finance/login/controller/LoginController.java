package com.team.finance.login.controller;

import com.team.finance.entity.AjaxResponse;
import com.team.finance.entity.FmUser;
import com.team.finance.login.service.LoginService;
import com.team.finance.util.PasswordUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
    public String find(String username,String password){
        FmUser fmUser=new FmUser();
        fmUser.setUsername(username);
        fmUser.setPassword(PasswordUtils.e(password));
        FmUser fmUser1=loginService.findFmUseByUername(username);
        if(null!=fmUser1){
            return "false";
        }else {
            return "true";
        }
    }
    @PostMapping("/register")
    public AjaxResponse register(String username, String password){
        AjaxResponse ajaxResponse=new AjaxResponse();
        int i=loginService.insertFmuUser(username,PasswordUtils.e(password));
        if(i>0){
            ajaxResponse.setMsg("success");
        }else {
            ajaxResponse.setMsg("error");
        }
        return ajaxResponse;
    }
}
