package com.team.finance.login.service;

import com.team.finance.login.repository.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Avenger
 * @describe: TODO
 * @create: 2017年12月26日 13:35
 **/
@Service
public class LoginService {

    @Autowired
    LoginMapper loginMapper;
    public String find(int id){
        return loginMapper.find(id);
    }
}
