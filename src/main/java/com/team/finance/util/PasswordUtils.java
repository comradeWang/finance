package com.team.finance.util;


import org.apache.commons.codec.digest.DigestUtils;

public class PasswordUtils  {
  //加密
    public  static String e(String pwd){
       String md5Str= DigestUtils.md5Hex(pwd);
       return md5Str;
    }
}
