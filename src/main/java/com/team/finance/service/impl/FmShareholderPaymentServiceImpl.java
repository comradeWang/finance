package com.team.finance.service.impl;

import com.team.finance.dao.FmShareholderPaymentMapper;
import com.team.finance.service.FmShareholderPaymentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/12/27.
 */
@Service
@Transactional
public class FmShareholderPaymentServiceImpl   implements FmShareholderPaymentService {
    @Resource
    private FmShareholderPaymentMapper fmShareholderPaymentMapper;

}
