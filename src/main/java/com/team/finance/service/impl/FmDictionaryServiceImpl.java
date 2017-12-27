package com.team.finance.service.impl;


import com.team.finance.dao.FmDictionaryMapper;
import com.team.finance.service.FmDictionaryService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/12/27.
 */
@Service
@Transactional
public class FmDictionaryServiceImpl   implements FmDictionaryService {
    @Resource
    private FmDictionaryMapper fmDictionaryMapper;

}
