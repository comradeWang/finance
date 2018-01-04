package com.team.finance.service;

import com.team.finance.entity.FmBranchCompany;

import java.util.List;

/**
 * Created by CodeGenerator on 2017/12/27.
 */
public interface FmBranchCompanyService  {
     List<FmBranchCompany> selectAll();

     int updateBranchCompany(String name,String corporationName,String address,String phone,String area,String sphereOfBusiness,String remark,Long id);

    int deleteBranchCompanyByID(Long id);


}
