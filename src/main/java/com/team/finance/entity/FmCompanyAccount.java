package com.team.finance.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "fm_company_account")
public class FmCompanyAccount {
    /**
     * 主键，自增列
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
     * 分公司收支账户所属银行
     */
    @Column(name = "bank_name")
    private String bankName;

    /**
     * 银行账号
     */
    @Column(name = "bank_number")
    private String bankNumber;

    /**
     * 货币类型
     */
    @Column(name = "currency_type")
    private String currencyType;

    /**
     * 账号用途
     */
    @Column(name = "account_application")
    private String accountApplication;

    /**
     * 支付密码
     */
    @Column(name = "bank_password")
    private String bankPassword;

    /**
     * 创建时间
     */
    @Column(name = "gmt_create")
    private Date gmtCreate;

    /**
     * 初始化资金
     */
    @Column(name = "init_fund")
    private BigDecimal initFund;

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
     * 获取分公司收支账户所属银行
     *
     * @return bank_name - 分公司收支账户所属银行
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 设置分公司收支账户所属银行
     *
     * @param bankName 分公司收支账户所属银行
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * 获取银行账号
     *
     * @return bank_number - 银行账号
     */
    public String getBankNumber() {
        return bankNumber;
    }

    /**
     * 设置银行账号
     *
     * @param bankNumber 银行账号
     */
    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    /**
     * 获取货币类型
     *
     * @return currency_type - 货币类型
     */
    public String getCurrencyType() {
        return currencyType;
    }

    /**
     * 设置货币类型
     *
     * @param currencyType 货币类型
     */
    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    /**
     * 获取账号用途
     *
     * @return account_application - 账号用途
     */
    public String getAccountApplication() {
        return accountApplication;
    }

    /**
     * 设置账号用途
     *
     * @param accountApplication 账号用途
     */
    public void setAccountApplication(String accountApplication) {
        this.accountApplication = accountApplication;
    }

    /**
     * 获取支付密码
     *
     * @return bank_password - 支付密码
     */
    public String getBankPassword() {
        return bankPassword;
    }

    /**
     * 设置支付密码
     *
     * @param bankPassword 支付密码
     */
    public void setBankPassword(String bankPassword) {
        this.bankPassword = bankPassword;
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
     * 获取初始化资金
     *
     * @return init_fund - 初始化资金
     */
    public BigDecimal getInitFund() {
        return initFund;
    }

    /**
     * 设置初始化资金
     *
     * @param initFund 初始化资金
     */
    public void setInitFund(BigDecimal initFund) {
        this.initFund = initFund;
    }
}