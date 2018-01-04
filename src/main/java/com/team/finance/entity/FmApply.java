package com.team.finance.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "fm_apply")
public class FmApply {
    /**
     * 主键自增
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 与分公司表的主键相关联
     */
    @Column(name = "company_id")
    private Long companyId;

    /**
     * 申请资金数额（万元）
     */
    @Column(name = "apply_number")
    private BigDecimal applyNumber;

    /**
     * 资金用途
     */
    @Column(name = "apply_use")
    private String applyUse;

    /**
     * 收款账号，对应于公司银行中的账号
     */
    @Column(name = "apply_account")
    private String applyAccount;

    /**
     * 计划用款日期
     */
    @Column(name = "plan_use_date")
    private Date planUseDate;

    /**
     * 实际申请人
     */
    @Column(name = "real_applyer")
    private String realApplyer;

    /**
     * 实际申请人的联系方式
     */
    @Column(name = "applyer_phone")
    private String applyerPhone;

    /**
     * 是否一次性到账1是2否
     */
    @Column(name = "is_all")
    private Integer isAll;

    /**
     * 申请状态1审核中2审核通过3驳回
     */
    @Column(name = "apply_type")
    private Integer applyType;

    /**
     * 驳回理由
     */
    @Column(name = "void_message")
    private String voidMessage;

    /**
     * 创建时间
     */
    @Column(name = "gmt_create")
    private Date gmtCreate;

    /**
     * 获取主键自增
     *
     * @return id - 主键自增
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键自增
     *
     * @param id 主键自增
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取与分公司表的主键相关联
     *
     * @return company_id - 与分公司表的主键相关联
     */
    public Long getCompanyId() {
        return companyId;
    }

    /**
     * 设置与分公司表的主键相关联
     *
     * @param companyId 与分公司表的主键相关联
     */
    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    /**
     * 获取申请资金数额（万元）
     *
     * @return apply_number - 申请资金数额（万元）
     */
    public BigDecimal getApplyNumber() {
        return applyNumber;
    }

    /**
     * 设置申请资金数额（万元）
     *
     * @param applyNumber 申请资金数额（万元）
     */
    public void setApplyNumber(BigDecimal applyNumber) {
        this.applyNumber = applyNumber;
    }

    /**
     * 获取资金用途
     *
     * @return apply_use - 资金用途
     */
    public String getApplyUse() {
        return applyUse;
    }

    /**
     * 设置资金用途
     *
     * @param applyUse 资金用途
     */
    public void setApplyUse(String applyUse) {
        this.applyUse = applyUse;
    }

    /**
     * 获取收款账号，对应于公司银行中的账号
     *
     * @return apply_account - 收款账号，对应于公司银行中的账号
     */
    public String getApplyAccount() {
        return applyAccount;
    }

    /**
     * 设置收款账号，对应于公司银行中的账号
     *
     * @param applyAccount 收款账号，对应于公司银行中的账号
     */
    public void setApplyAccount(String applyAccount) {
        this.applyAccount = applyAccount;
    }

    /**
     * 获取计划用款日期
     *
     * @return plan_use_date - 计划用款日期
     */
    public Date getPlanUseDate() {
        return planUseDate;
    }

    /**
     * 设置计划用款日期
     *
     * @param planUseDate 计划用款日期
     */
    public void setPlanUseDate(Date planUseDate) {
        this.planUseDate = planUseDate;
    }

    /**
     * 获取实际申请人
     *
     * @return real_applyer - 实际申请人
     */
    public String getRealApplyer() {
        return realApplyer;
    }

    /**
     * 设置实际申请人
     *
     * @param realApplyer 实际申请人
     */
    public void setRealApplyer(String realApplyer) {
        this.realApplyer = realApplyer;
    }

    /**
     * 获取实际申请人的联系方式
     *
     * @return applyer_phone - 实际申请人的联系方式
     */
    public String getApplyerPhone() {
        return applyerPhone;
    }

    /**
     * 设置实际申请人的联系方式
     *
     * @param applyerPhone 实际申请人的联系方式
     */
    public void setApplyerPhone(String applyerPhone) {
        this.applyerPhone = applyerPhone;
    }

    /**
     * 获取是否一次性到账1是2否
     *
     * @return is_all - 是否一次性到账1是2否
     */
    public Integer getIsAll() {
        return isAll;
    }

    /**
     * 设置是否一次性到账1是2否
     *
     * @param isAll 是否一次性到账1是2否
     */
    public void setIsAll(Integer isAll) {
        this.isAll = isAll;
    }

    /**
     * 获取申请状态1审核中2审核通过3驳回
     *
     * @return apply_type - 申请状态1审核中2审核通过3驳回
     */
    public Integer getApplyType() {
        return applyType;
    }

    /**
     * 设置申请状态1审核中2审核通过3驳回
     *
     * @param applyType 申请状态1审核中2审核通过3驳回
     */
    public void setApplyType(Integer applyType) {
        this.applyType = applyType;
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
}