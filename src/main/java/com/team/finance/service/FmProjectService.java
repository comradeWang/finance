package com.team.finance.service;

import java.util.List;
import java.util.Map;

/**
 * Created by CodeGenerator on 2017/12/27.
 */
public interface FmProjectService  {
    //查询fm_project表内所有数据 状态为 1
    List<Map<String,Object>> selectAll();

    //修改fm_project表内的一条数据
    int updateProject(Long id,String type,String showValue);

    //屏蔽一条数据 修改其 状态位 1显示 2屏蔽
    int updateProjectState(Long id,String state);

}
