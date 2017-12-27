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
        String pwd = loginService.findFmUseByUername(username);
        if(pwd.equals(PasswordUtils.e(password))){
            return "true";
        }else {
            return "false";
        }
    }
    @PostMapping("/register")
    public AjaxResponse register(String username, String password){
        AjaxResponse ajaxResponse=new AjaxResponse();
        FmUser fmUser = loginService.findFmUserNameRepeat(username);
        if(fmUser==null) {
            int j = loginService.insertFmuUser(username, PasswordUtils.e(password));
            if (j > 0) {
                ajaxResponse.setMsg("success");
            } else {
                ajaxResponse.setMsg("error");
            }
            return ajaxResponse;
        }else{
            ajaxResponse.setMsg("repeat");
            return ajaxResponse;
        }
    }
}
