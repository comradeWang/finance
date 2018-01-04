package com.team.finance.branchCompany.service;

import com.team.finance.branchCompany.repository.CompanyRepository;
import com.team.finance.entity.FmBranchComapny;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ZhaoHongliang
 * @Description:
 * @Date: Created in 15:06 2018/1/4
 */
@Service
public class CompanyService  {
    @Autowired
    private CompanyRepository companyRepository;

    public List<FmBranchComapny> selectAll(){
        return companyRepository.selectAll();
    }
}
