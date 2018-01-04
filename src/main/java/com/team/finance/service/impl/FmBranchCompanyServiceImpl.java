package com.team.finance.service.impl;


import com.team.finance.dao.FmBranchCompanyMapper;
import com.team.finance.entity.FmBranchCompany;
import com.team.finance.service.FmBranchCompanyService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by CodeGenerator on 2017/12/27.
 */
@Service
@Transactional
public class FmBranchCompanyServiceImpl   implements FmBranchCompanyService {
    @Resource
    private FmBranchCompanyMapper fmBranchCompanyMapper;
    public List<FmBranchCompany> selectAll(){
        return fmBranchCompanyMapper.selectAll();
    }
    public int updateBranchCompany(String name,String corporationName,String address,String phone,String area,String sphereOfBusiness,String remark,Long id){
        return fmBranchCompanyMapper.updateBranchCompanyByID(name,corporationName,address,phone,area,sphereOfBusiness,remark,id);
    }
    public int deleteBranchCompanyByID(Long id){
        return fmBranchCompanyMapper.deleteBranchCompanyByID(id);
    }

}
