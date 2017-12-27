package com.team.finance.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "fm_investment_detail")
public class FmInvestmentDetail {
    /**
     * 主键，自增列
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 关联股东表主键
     */
    @Column(name = "partner_id")
    private Long partnerId;

    /**
     * 1.认缴额2.实缴额
     */
    @Column(name = "amount_type")
    private Integer amountType;

    /**
     * 出资方式
     */
    @Column(name = "investment_form")
    private String investmentForm;

    /**
     * 出资日期
     */
    @Column(name = "investment_date")
    private Date investmentDate;

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
     * 获取关联股东表主键
     *
     * @return partner_id - 关联股东表主键
     */
    public Long getPartnerId() {
        return partnerId;
    }

    /**
     * 设置关联股东表主键
     *
     * @param partnerId 关联股东表主键
     */
    public void setPartnerId(Long partnerId) {
        this.partnerId = partnerId;
    }

    /**
     * 获取1.认缴额2.实缴额
     *
     * @return amount_type - 1.认缴额2.实缴额
     */
    public Integer getAmountType() {
        return amountType;
    }

    /**
     * 设置1.认缴额2.实缴额
     *
     * @param amountType 1.认缴额2.实缴额
     */
    public void setAmountType(Integer amountType) {
        this.amountType = amountType;
    }

    /**
     * 获取出资方式
     *
     * @return investment_form - 出资方式
     */
    public String getInvestmentForm() {
        return investmentForm;
    }

    /**
     * 设置出资方式
     *
     * @param investmentForm 出资方式
     */
    public void setInvestmentForm(String investmentForm) {
        this.investmentForm = investmentForm;
    }

    /**
     * 获取出资日期
     *
     * @return investment_date - 出资日期
     */
    public Date getInvestmentDate() {
        return investmentDate;
    }

    /**
     * 设置出资日期
     *
     * @param investmentDate 出资日期
     */
    public void setInvestmentDate(Date investmentDate) {
        this.investmentDate = investmentDate;
    }
}