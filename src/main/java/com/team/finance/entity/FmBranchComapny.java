package com.team.finance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @Author: ZhaoHongliang
 * @Description:
 * @Date: Created in 14:41 2018/1/4
 */
@Entity
@Table(name = "fm_branch_company")
public class FmBranchComapny {
    @Id
    @Column(name = "id")
    private  Long id;
    @Column(name = "name")
    private  String name;
    @Column(name = "company_number")
    private  String companyNumber;
    @Column(name = "corporation_name")
    private  String corporationName;
    @Column(name = "address")
    private  String address;
    @Column(name = "phone")
    private  String phone;
    @Column(name = "area")
    private  String area;
    @Column(name = "sphere_of_business")
    private  String sphereOfBusiness;
    @Column(name = "remark")
    private  String remark;
    @Column(name = "register_fund")
    private  String registerFund;
    @Column(name = "company_type")
    private  String companyType;
    @Column(name = "registration")
    private  String registration;
    @Column(name = "business_term")
    private Date businessTerm;
    @Column(name = "gmt_create")
    private  Date gmtCreate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    public void setCompanyNumber(String companyNumber) {
        this.companyNumber = companyNumber;
    }

    public String getCorporationName() {
        return corporationName;
    }

    public void setCorporationName(String corporationName) {
        this.corporationName = corporationName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getSphereOfBusiness() {
        return sphereOfBusiness;
    }

    public void setSphereOfBusiness(String sphereOfBusiness) {
        this.sphereOfBusiness = sphereOfBusiness;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRegisterFund() {
        return registerFund;
    }

    public void setRegisterFund(String registerFund) {
        this.registerFund = registerFund;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public Date getBusinessTerm() {
        return businessTerm;
    }

    public void setBusinessTerm(Date businessTerm) {
        this.businessTerm = businessTerm;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}
