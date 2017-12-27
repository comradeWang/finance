package com.team.finance.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "fm_partner")
public class FmPartner {
    /**
     * 主键，自增列
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 股东名称
     */
    private String name;

    /**
     * 跟分公司表主键关联
     */
    @Column(name = "company_id")
    private Long companyId;

    /**
     * 认缴额(万元)
     */
    @Column(name = "confusing_amount")
    private BigDecimal confusingAmount;

    /**
     * 实缴额
     */
    @Column(name = "pay_amount")
    private BigDecimal payAmount;

    /**
     * 记录创建时间
     */
    @Column(name = "gmt_create")
    private Date gmtCreate;

    /**
     * 记录修改时间
     */
    @Column(name = "gmt_modified")
    private Date gmtModified;

    /**
     * 股东变更信息申请状态1.待审核2同意3驳回
     */
    @Column(name = "modified_type")
    private Integer modifiedType;

    /**
     * 驳回理由
     */
    @Column(name = "void_message")
    private String voidMessage;

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
     * 获取股东名称
     *
     * @return name - 股东名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置股东名称
     *
     * @param name 股东名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取跟分公司表主键关联
     *
     * @return company_id - 跟分公司表主键关联
     */
    public Long getCompanyId() {
        return companyId;
    }

    /**
     * 设置跟分公司表主键关联
     *
     * @param companyId 跟分公司表主键关联
     */
    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    /**
     * 获取认缴额(万元)
     *
     * @return confusing_amount - 认缴额(万元)
     */
    public BigDecimal getConfusingAmount() {
        return confusingAmount;
    }

    /**
     * 设置认缴额(万元)
     *
     * @param confusingAmount 认缴额(万元)
     */
    public void setConfusingAmount(BigDecimal confusingAmount) {
        this.confusingAmount = confusingAmount;
    }

    /**
     * 获取实缴额
     *
     * @return pay_amount - 实缴额
     */
    public BigDecimal getPayAmount() {
        return payAmount;
    }

    /**
     * 设置实缴额
     *
     * @param payAmount 实缴额
     */
    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    /**
     * 获取记录创建时间
     *
     * @return gmt_create - 记录创建时间
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 设置记录创建时间
     *
     * @param gmtCreate 记录创建时间
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * 获取记录修改时间
     *
     * @return gmt_modified - 记录修改时间
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * 设置记录修改时间
     *
     * @param gmtModified 记录修改时间
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * 获取股东变更信息申请状态1.待审核2同意3驳回
     *
     * @return modified_type - 股东变更信息申请状态1.待审核2同意3驳回
     */
    public Integer getModifiedType() {
        return modifiedType;
    }

    /**
     * 设置股东变更信息申请状态1.待审核2同意3驳回
     *
     * @param modifiedType 股东变更信息申请状态1.待审核2同意3驳回
     */
    public void setModifiedType(Integer modifiedType) {
        this.modifiedType = modifiedType;
    }

    /**
     * 获取驳回理由
     *
     * @return void_message - 驳回理由
     */
    public String getvoidMessage() {
        return voidMessage;
    }

    /**
     * 设置驳回理由
     *
     * @param voidMessage 驳回理由
     */
    public void setvoidMessage(String voidMessage) {
        this.voidMessage = voidMessage;
    }
}