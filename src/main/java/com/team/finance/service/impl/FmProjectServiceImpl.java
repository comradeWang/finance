package com.team.finance.service.impl;


import com.team.finance.dao.FmProjectMapper;
import com.team.finance.entity.FmProject;
import com.team.finance.service.FmProjectService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by CodeGenerator on 2017/12/27.
 */
@Service
@Transactional
public class FmProjectServiceImpl   implements FmProjectService {
    @Resource
    private FmProjectMapper fmProjectMapper;

    //查询fm_project表内所有数据 状态为 1
    @Override
    public List<FmProject> selectAll() {
        return fmProjectMapper.selectAll();
    }

    //往fm_project表内新插入一条数据 默认状态为 1
    @Override
    public int updateProject(Long id, String type, String showValue) {
        return fmProjectMapper.updateProject(id,type,showValue);
    }

    //屏蔽一条数据 修改其 状态位 1显示 2屏蔽
    @Override
    public int updateProjectState(Long id, String state) {
        return fmProjectMapper.updateProjectState(id,state);
    }
}
