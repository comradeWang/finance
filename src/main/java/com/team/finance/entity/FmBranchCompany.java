package com.team.finance.entity;

import javax.persistence.*;
import java.util.Date;

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
    private String name;

    /**
     * 分公司编码（8位  唯一 不可修改）
     */
    @Column(name = "company_number")
    private String companyNumber;

    /**
     * 法人代表姓名
     */
    @Column(name = "corporation_name")
    private String corporationName;

    /**
     * 分公司地址
     */
    private String address;

    /**
     * 财务主管联系方式
     */
    private String phone;

    /**
     * 分公司所在区域
     */
    private String area;

    /**
     * 创建时间
     */
    @Column(name = "gmt_create")
    private Date gmtCreate;

    /**
     * 主营业务
     */
    @Column(name = "sphere_of_business")
    private String sphereOfBusiness;

    /**
     * 备注
     */
    private String remark;

    /**
     * 公司注册资本
     */
    @Column(name = "register_fund")
    private Long registerFund;

    /**
     * 公司类型
     */
    @Column(name = "company_type")
    private Byte companyType;

    /**
     * 登记机关
     */
    private String registration;

    /**
     * 营业期限日期
     */
    @Column(name = "business_term")
    private Date businessTerm;

    /**
     * 获取主键，自增列
     *
     * @return id - 主键，自增列
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键，自增列
     *
     * @param id 主键，自增列
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取分公司名称
     *
     * @return name - 分公司名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置分公司名称
     *
     * @param name 分公司名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取分公司编码（8位  唯一 不可修改）
     *
     * @return company_number - 分公司编码（8位  唯一 不可修改）
     */
    public String getCompanyNumber() {
        return companyNumber;
    }

    /**
     * 设置分公司编码（8位  唯一 不可修改）
     *
     * @param companyNumber 分公司编码（8位  唯一 不可修改）
     */
    public void setCompanyNumber(String companyNumber) {
        this.companyNumber = companyNumber;
    }

    /**
     * 获取法人代表姓名
     *
     * @return corporation_name - 法人代表姓名
     */
    public String getCorporationName() {
        return corporationName;
    }

    /**
     * 设置法人代表姓名
     *
     * @param corporationName 法人代表姓名
     */
    public void setCorporationName(String corporationName) {
        this.corporationName = corporationName;
    }

    /**
     * 获取分公司地址
     *
     * @return address - 分公司地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置分公司地址
     *
     * @param address 分公司地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取财务主管联系方式
     *
     * @return phone - 财务主管联系方式
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置财务主管联系方式
     *
     * @param phone 财务主管联系方式
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取分公司所在区域
     *
     * @return area - 分公司所在区域
     */
    public String getArea() {
        return area;
    }

    /**
     * 设置分公司所在区域
     *
     * @param area 分公司所在区域
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * 获取创建时间
     *
     * @return gmt_create - 创建时间
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 设置创建时间
     *
     * @param gmtCreate 创建时间
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * 获取主营业务
     *
     * @return sphere_of_business - 主营业务
     */
    public String getSphereOfBusiness() {
        return sphereOfBusiness;
    }

    /**
     * 设置主营业务
     *
     * @param sphereOfBusiness 主营业务
     */
    public void setSphereOfBusiness(String sphereOfBusiness) {
        this.sphereOfBusiness = sphereOfBusiness;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取公司注册资本
     *
     * @return register_fund - 公司注册资本
     */
    public Long getRegisterFund() {
        return registerFund;
    }

    /**
     * 设置公司注册资本
     *
     * @param registerFund 公司注册资本
     */
    public void setRegisterFund(Long registerFund) {
        this.registerFund = registerFund;
    }

    /**
     * 获取公司类型
     *
     * @return company_type - 公司类型
     */
    public Byte getCompanyType() {
        return companyType;
    }

    /**
     * 设置公司类型
     *
     * @param companyType 公司类型
     */
    public void setCompanyType(Byte companyType) {
        this.companyType = companyType;
    }

    /**
     * 获取登记机关
     *
     * @return registration - 登记机关
     */
    public String getRegistration() {
        return registration;
    }

    /**
     * 设置登记机关
     *
     * @param registration 登记机关
     */
    public void setRegistration(String registration) {
        this.registration = registration;
    }

    /**
     * 获取营业期限日期
     *
     * @return business_term - 营业期限日期
     */
    public Date getBusinessTerm() {
        return businessTerm;
    }

    /**
     * 设置营业期限日期
     *
     * @param businessTerm 营业期限日期
     */
    public void setBusinessTerm(Date businessTerm) {
        this.businessTerm = businessTerm;
    }
}