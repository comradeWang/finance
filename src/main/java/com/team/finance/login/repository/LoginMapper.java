package com.team.finance.login.repository;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author: Avenger
 * @describe: TODO
 * @create: 2017年12月26日 13:35
 **/
@Repository
@Mapper
public interface LoginMapper {

    @Select("select password from fm_user where username=#{username}")
    String findFmUseByUername(String name);
    @Insert("insert into fm_user (username,password) values (#{username},#{password})")
    int insertFmUser(@Param("username")String username,@Param("password")String password);
}
