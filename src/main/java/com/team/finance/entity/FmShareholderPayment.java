package com.team.finance.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "fm_shareholder_payment")
public class FmShareholderPayment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 股东名称
     */
    @Column(name = "shareholder_name")
    private String shareholderName;

    /**
     * 认缴额
     */
    @Column(name = "confusing_amount")
    private Double confusingAmount;

    /**
     * 实缴额（万元）
     */
    private Double payment;

    /**
     * 认缴出资方式
     */
    @Column(name = "confusing_amount_way")
    private String confusingAmountWay;

    /**
     * 认缴出资额
     */
    @Column(name = "confusing_amount_number")
    private Double confusingAmountNumber;

    /**
     * 认缴出资日期
     */
    @Column(name = "confusing_amount_date")
    private Date confusingAmountDate;

    /**
     * 实际出资方式
     */
    @Column(name = "payment_way")
    private String paymentWay;

    /**
     * 实缴出资额
     */
    @Column(name = "payment_number")
    private Double paymentNumber;

    /**
     * 实缴出资日期
     */
    @Column(name = "payment_date")
    private Date paymentDate;

    @Column(name = "gmt_create")
    private Date gmtCreate;

    @Column(name = "gmt_modified")
    private Date gmtModified;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取股东名称
     *
     * @return shareholder_name - 股东名称
     */
    public String getShareholderName() {
        return shareholderName;
    }

    /**
     * 设置股东名称
     *
     * @param shareholderName 股东名称
     */
    public void setShareholderName(String shareholderName) {
        this.shareholderName = shareholderName;
    }

    /**
     * 获取认缴额
     *
     * @return confusing_amount - 认缴额
     */
    public Double getConfusingAmount() {
        return confusingAmount;
    }

    /**
     * 设置认缴额
     *
     * @param confusingAmount 认缴额
     */
    public void setConfusingAmount(Double confusingAmount) {
        this.confusingAmount = confusingAmount;
    }

    /**
     * 获取实缴额（万元）
     *
     * @return payment - 实缴额（万元）
     */
    public Double getPayment() {
        return payment;
    }

    /**
     * 设置实缴额（万元）
     *
     * @param payment 实缴额（万元）
     */
    public void setPayment(Double payment) {
        this.payment = payment;
    }

    /**
     * 获取认缴出资方式
     *
     * @return confusing_amount_way - 认缴出资方式
     */
    public String getConfusingAmountWay() {
        return confusingAmountWay;
    }

    /**
     * 设置认缴出资方式
     *
     * @param confusingAmountWay 认缴出资方式
     */
    public void setConfusingAmountWay(String confusingAmountWay) {
        this.confusingAmountWay = confusingAmountWay;
    }

    /**
     * 获取认缴出资额
     *
     * @return confusing_amount_number - 认缴出资额
     */
    public Double getConfusingAmountNumber() {
        return confusingAmountNumber;
    }

    /**
     * 设置认缴出资额
     *
     * @param confusingAmountNumber 认缴出资额
     */
    public void setConfusingAmountNumber(Double confusingAmountNumber) {
        this.confusingAmountNumber = confusingAmountNumber;
    }

    /**
     * 获取认缴出资日期
     *
     * @return confusing_amount_date - 认缴出资日期
     */
    public Date getConfusingAmountDate() {
        return confusingAmountDate;
    }

    /**
     * 设置认缴出资日期
     *
     * @param confusingAmountDate 认缴出资日期
     */
    public void setConfusingAmountDate(Date confusingAmountDate) {
        this.confusingAmountDate = confusingAmountDate;
    }

    /**
     * 获取实际出资方式
     *
     * @return payment_way - 实际出资方式
     */
    public String getPaymentWay() {
        return paymentWay;
    }

    /**
     * 设置实际出资方式
     *
     * @param paymentWay 实际出资方式
     */
    public void setPaymentWay(String paymentWay) {
        this.paymentWay = paymentWay;
    }

    /**
     * 获取实缴出资额
     *
     * @return payment_number - 实缴出资额
     */
    public Double getPaymentNumber() {
        return paymentNumber;
    }

    /**
     * 设置实缴出资额
     *
     * @param paymentNumber 实缴出资额
     */
    public void setPaymentNumber(Double paymentNumber) {
        this.paymentNumber = paymentNumber;
    }

    /**
     * 获取实缴出资日期
     *
     * @return payment_date - 实缴出资日期
     */
    public Date getPaymentDate() {
        return paymentDate;
    }

    /**
     * 设置实缴出资日期
     *
     * @param paymentDate 实缴出资日期
     */
    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    /**
     * @return gmt_create
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * @param gmtCreate
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * @return gmt_modified
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * @param gmtModified
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}