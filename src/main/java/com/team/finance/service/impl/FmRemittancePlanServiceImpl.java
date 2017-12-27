package com.team.finance.service.impl;


import com.team.finance.dao.FmRemittancePlanMapper;
import com.team.finance.service.FmRemittancePlanService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/12/27.
 */
@Service
@Transactional
public class FmRemittancePlanServiceImpl   implements FmRemittancePlanService {
    @Resource
    private FmRemittancePlanMapper fmRemittancePlanMapper;

}
