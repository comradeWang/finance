package com.team.finance.dao;

import com.team.finance.entity.FmProject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface FmProjectMapper {

    @Select("select * from fm_project where state = 1")
    List<FmProject> selectAll();

    @Update("update fm_project set type=#{type},show_value=#{showValue}  where id=#{id}")
     int updateProject(@Param("id")Long id,@Param("type")String type,@Param("showValue")String showValue );

    @Update("update fm_project set state=#{state} where id=#{id}")
    int updateProjectState(@Param("id")Long id,@Param("state")String state);

}