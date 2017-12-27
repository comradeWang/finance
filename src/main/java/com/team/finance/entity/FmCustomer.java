package com.team.finance.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "fm_customer")
public class FmCustomer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 客户编号（8位，唯一）
     */
    @Column(name = "c_id")
    private Integer cId;

    /**
     * 客户名称
     */
    @Column(name = "c_name")
    private String cName;

    /**
     * 客户开户行
     */
    @Column(name = "c_account_bank")
    private String cAccountBank;

    /**
     * 客户结算账户
     */
    @Column(name = "c_balance_account")
    private String cBalanceAccount;

    /**
     * 默认结算货币类型
     */
    @Column(name = "c_balance_currency_type")
    private String cBalanceCurrencyType;

    /**
     * 默认结算方式
     */
    @Column(name = "c_balance_type")
    private String cBalanceType;

    /**
     * 结算客户联系人
     */
    @Column(name = "c_balance_linkman")
    private String cBalanceLinkman;

    /**
     * 结算客户所属分公司（为空则表示属于母公司结算客户）
     */
    @Column(name = "c_branch_company")
    private String cBranchCompany;

    /**
     * 创建时间
     */
    @Column(name = "gmt_creat")
    private Date gmtCreat;

    @Column(name = "create_user_id")
    private Long createUserId;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取客户编号（8位，唯一）
     *
     * @return c_id - 客户编号（8位，唯一）
     */
    public Integer getcId() {
        return cId;
    }

    /**
     * 设置客户编号（8位，唯一）
     *
     * @param cId 客户编号（8位，唯一）
     */
    public void setcId(Integer cId) {
        this.cId = cId;
    }

    /**
     * 获取客户名称
     *
     * @return c_name - 客户名称
     */
    public String getcName() {
        return cName;
    }

    /**
     * 设置客户名称
     *
     * @param cName 客户名称
     */
    public void setcName(String cName) {
        this.cName = cName;
    }

    /**
     * 获取客户开户行
     *
     * @return c_account_bank - 客户开户行
     */
    public String getcAccountBank() {
        return cAccountBank;
    }

    /**
     * 设置客户开户行
     *
     * @param cAccountBank 客户开户行
     */
    public void setcAccountBank(String cAccountBank) {
        this.cAccountBank = cAccountBank;
    }

    /**
     * 获取客户结算账户
     *
     * @return c_balance_account - 客户结算账户
     */
    public String getcBalanceAccount() {
        return cBalanceAccount;
    }

    /**
     * 设置客户结算账户
     *
     * @param cBalanceAccount 客户结算账户
     */
    public void setcBalanceAccount(String cBalanceAccount) {
        this.cBalanceAccount = cBalanceAccount;
    }

    /**
     * 获取默认结算货币类型
     *
     * @return c_balance_currency_type - 默认结算货币类型
     */
    public String getcBalanceCurrencyType() {
        return cBalanceCurrencyType;
    }

    /**
     * 设置默认结算货币类型
     *
     * @param cBalanceCurrencyType 默认结算货币类型
     */
    public void setcBalanceCurrencyType(String cBalanceCurrencyType) {
        this.cBalanceCurrencyType = cBalanceCurrencyType;
    }

    /**
     * 获取默认结算方式
     *
     * @return c_balance_type - 默认结算方式
     */
    public String getcBalanceType() {
        return cBalanceType;
    }

    /**
     * 设置默认结算方式
     *
     * @param cBalanceType 默认结算方式
     */
    public void setcBalanceType(String cBalanceType) {
        this.cBalanceType = cBalanceType;
    }

    /**
     * 获取结算客户联系人
     *
     * @return c_balance_linkman - 结算客户联系人
     */
    public String getcBalanceLinkman() {
        return cBalanceLinkman;
    }

    /**
     * 设置结算客户联系人
     *
     * @param cBalanceLinkman 结算客户联系人
     */
    public void setcBalanceLinkman(String cBalanceLinkman) {
        this.cBalanceLinkman = cBalanceLinkman;
    }

    /**
     * 获取结算客户所属分公司（为空则表示属于母公司结算客户）
     *
     * @return c_branch_company - 结算客户所属分公司（为空则表示属于母公司结算客户）
     */
    public String getcBranchCompany() {
        return cBranchCompany;
    }

    /**
     * 设置结算客户所属分公司（为空则表示属于母公司结算客户）
     *
     * @param cBranchCompany 结算客户所属分公司（为空则表示属于母公司结算客户）
     */
    public void setcBranchCompany(String cBranchCompany) {
        this.cBranchCompany = cBranchCompany;
    }

    /**
     * 获取创建时间
     *
     * @return gmt_creat - 创建时间
     */
    public Date getGmtCreat() {
        return gmtCreat;
    }

    /**
     * 设置创建时间
     *
     * @param gmtCreat 创建时间
     */
    public void setGmtCreat(Date gmtCreat) {
        this.gmtCreat = gmtCreat;
    }

    /**
     * @return create_user_id
     */
    public Long getCreateUserId() {
        return createUserId;
    }

    /**
     * @param createUserId
     */
    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }
}