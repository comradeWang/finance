package com.team.finance.entity;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "fm_branch_company")
public class FmBranchCompany {
    /**
     * 主键，自增列
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 分公司名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 分公司编码（8位  唯一 不可修改）
     */
    @Column(name = "company_number")
    private String company_number;

    /**
     * 法人代表姓名
     */
    @Column(name = "corporation_name")
    private String corporation_name;

    /**
     * 分公司地址
     */
    @Column(name = "address")
    private String address;

    /**
     * 财务主管联系方式
     */
    @Column(name = "phone")
    private String phone;

    /**
     * 分公司所在区域
     */
    @Column(name = "area")
    private String area;

    /**
     * 创建时间
     */
    @Column(name = "gmt_create")
    private Date gmt_create;

    /**
     * 主营业务
     */
    @Column(name = "sphere_of_business")
    private String sphere_of_business;

    /**
     * 备注
     */
    @Column(name = "remark")
    private String remark;

    /**
     * 公司注册资本
     */
    @Column(name = "register_fund")
    private String register_fund;

    /**
     * 公司类型
     */
    @Column(name = "company_type")
    private int company_type;

    /**
     * 登记机关
     */
    @Column(name = "registration")
    private String registration;

    /**
     * 营业期限日期
     */
    @Column(name = "business_term")
    private Date business_term;

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

    public String getCompany_number() {
        return company_number;
    }

    public void setCompany_number(String company_number) {
        this.company_number = company_number;
    }

    public String getCorporation_name() {
        return corporation_name;
    }

    public void setCorporation_name(String corporation_name) {
        this.corporation_name = corporation_name;
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

    public Date getGmt_create() {
        return gmt_create;
    }

    public void setGmt_create(Date gmt_create) {
        this.gmt_create = gmt_create;
    }

    public String getSphere_of_business() {
        return sphere_of_business;
    }

    public void setSphere_of_business(String sphere_of_business) {
        this.sphere_of_business = sphere_of_business;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRegister_fund() {
        return register_fund;
    }

    public void setRegister_fund(String register_fund) {
        this.register_fund = register_fund;
    }

    public int getCompany_type() {
        return company_type;
    }

    public void setCompany_type(int company_type) {
        this.company_type = company_type;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public Date getBusiness_term() {
        return business_term;
    }

    public void setBusiness_term(Date business_term) {
        this.business_term = business_term;
    }
}