package com.team.finance.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "fm_remittance_plan")
public class FmRemittancePlan {
    /**
     * 主键自增
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 跟分公司表关联主键
     */
    @Column(name = "company_id")
    private Long companyId;

    /**
     * 计划汇款时间
     */
    @Column(name = "remittance_date")
    private Date remittanceDate;

    /**
     * 计划汇款金额
     */
    @Column(name = "remittance_number")
    private BigDecimal remittanceNumber;

    /**
     * 汇出账号
     */
    @Column(name = "remittance_account")
    private String remittanceAccount;

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
     * 获取跟分公司表关联主键
     *
     * @return company_id - 跟分公司表关联主键
     */
    public Long getCompanyId() {
        return companyId;
    }

    /**
     * 设置跟分公司表关联主键
     *
     * @param companyId 跟分公司表关联主键
     */
    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    /**
     * 获取计划汇款时间
     *
     * @return remittance_date - 计划汇款时间
     */
    public Date getRemittanceDate() {
        return remittanceDate;
    }

    /**
     * 设置计划汇款时间
     *
     * @param remittanceDate 计划汇款时间
     */
    public void setRemittanceDate(Date remittanceDate) {
        this.remittanceDate = remittanceDate;
    }

    /**
     * 获取计划汇款金额
     *
     * @return remittance_number - 计划汇款金额
     */
    public BigDecimal getRemittanceNumber() {
        return remittanceNumber;
    }

    /**
     * 设置计划汇款金额
     *
     * @param remittanceNumber 计划汇款金额
     */
    public void setRemittanceNumber(BigDecimal remittanceNumber) {
        this.remittanceNumber = remittanceNumber;
    }

    /**
     * 获取汇出账号
     *
     * @return remittance_account - 汇出账号
     */
    public String getRemittanceAccount() {
        return remittanceAccount;
    }

    /**
     * 设置汇出账号
     *
     * @param remittanceAccount 汇出账号
     */
    public void setRemittanceAccount(String remittanceAccount) {
        this.remittanceAccount = remittanceAccount;
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