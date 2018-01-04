package com.team.finance.branchCompany.repository;

import com.team.finance.entity.FmBranchComapny;
import com.team.finance.util.BaseEntity;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: ZhaoHongliang
 * @Description:
 * @Date: Created in 15:11 2018/1/4
 */
@Repository
public interface CompanyRepository {

    @Select("select * from fm_branch_company")
    List<FmBranchComapny> selectAll();
}
