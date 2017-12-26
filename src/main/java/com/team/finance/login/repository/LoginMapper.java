package com.team.finance.login.repository;

import org.apache.ibatis.annotations.Mapper;
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

    @Select("select realname from fm_user where id=#{id}")
    public String find(int id);
}
