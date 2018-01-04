package com.team.finance.dao;

import com.team.finance.entity.FmBranchCompany;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
@Mapper
public interface FmBranchCompanyMapper  {

    @Select("select * from fm_branch_company")
    List<FmBranchCompany> selectAll();
    @Update("update fm_branch_company set name=#{name},corporation_name=#{corporationName},address=#{address},phone=#{phone},area=#{area},sphere_of_business=#{sphereOfBusiness},remark=#{remark} where id=#{id}")
    int updateBranchCompanyByID(@Param("name")String name, @Param("corporationName")String corporationName, @Param("address")String address, @Param("phone")String phone, @Param("area")String area, @Param("sphereOfBusiness")String sphereOfBusiness, @Param("remark")String remark, @Param("id")Long id);
    @Delete("delete fm_branch_company where id=#{id}")
    int deleteBranchCompanyByID(Long id);
    @Insert("insert fm_branch_company (name,company_number,corporation_name,address,phone,area,gmt_create,sphere_of_business,remark，register_fund,company_type,registration,business_term ) values(#{name},#{companyNumber},#{corporationName},#{address},#{phone},#{area},#{gmtCreate},#{sphereOfBusiness},#{remark},#{registerFund},#{companyType},#{registration},#{businessTerm})")
    int addBranchCompany(@Param("name")String name, @Param("companyNumber")String companyNumber, @Param("corporationName")String corporationName, @Param("address")String address, @Param("phone")String phone, @Param("area")String area, @Param("gmtCreate")Date gmtCreate, @Param("sphereOfBusiness")String sphereOfBusiness, @Param("remark")String remark, @Param("registerFund")String registerFund, @Param("companyType")int companyType, @Param("registration")String registration, @Param("businessTerm")Date businessTerm);

}