package com.team.finance.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface FmProjectMapper {

    @Select("select fmP.*,fmU.username from fm_project fmP left join fm_user fmU on fmP.create_id = fmU.id where state = 1")
    List<Map<String,Object>> selectAll();

    @Update("update fm_project set type=#{type},show_value=#{showValue}  where id=#{id}")
     int updateProject(@Param("id")Long id,@Param("type")String type,@Param("showValue")String showValue );

    @Update("update fm_project set state=#{state} where id=#{id}")
    int updateProjectState(@Param("id")Long id,@Param("state")String state);

}