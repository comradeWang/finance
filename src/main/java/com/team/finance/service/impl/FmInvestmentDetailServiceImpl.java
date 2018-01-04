package com.team.finance.service.impl;


import com.team.finance.dao.FmInvestmentDetailMapper;
import com.team.finance.service.FmInvestmentDetailService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/12/27.
 */
@Service
@Transactional
public class FmInvestmentDetailServiceImpl  implements FmInvestmentDetailService {
    @Resource
    private FmInvestmentDetailMapper fmInvestmentDetailMapper;

}
