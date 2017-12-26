package com.team.finance.login.service;

import com.team.finance.entity.FmUser;
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
    public FmUser findFmUseByUername(String username){
        return loginMapper.findFmUseByUername(username);
    }
    public  int insertFmuUser(String username,String password){
        return loginMapper.insertFmUser(username,password);
    }

}
