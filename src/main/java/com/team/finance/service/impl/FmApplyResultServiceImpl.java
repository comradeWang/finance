package com.team.finance.service.impl;


import com.team.finance.dao.FmApplyvoidMapper;
import com.team.finance.service.FmApplyvoidService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/12/27.
 */
@Service
@Transactional
public class FmApplyvoidServiceImpl   implements FmApplyvoidService {
    @Resource
    private FmApplyvoidMapper fmApplyvoidMapper;

}
