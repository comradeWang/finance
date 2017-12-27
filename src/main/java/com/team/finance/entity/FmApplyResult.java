package com.team.finance.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "fm_apply_void")
public class FmApplyvoid {
    /**
     * 主键，自增列
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 跟申请表的主键相关联
     */
    @Column(name = "apply_id")
    private Long applyId;

    /**
     * 跟用户表的主键相关联
     */
    @Column(name = "user_login_id")
    private Long userLoginId;

    /**
     * 财务主管对申请表的审核状态1通过2驳回
     */
    private Integer type;

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
     * 获取跟申请表的主键相关联
     *
     * @return apply_id - 跟申请表的主键相关联
     */
    public Long getApplyId() {
        return applyId;
    }

    /**
     * 设置跟申请表的主键相关联
     *
     * @param applyId 跟申请表的主键相关联
     */
    public void setApplyId(Long applyId) {
        this.applyId = applyId;
    }

    /**
     * 获取跟用户表的主键相关联
     *
     * @return user_login_id - 跟用户表的主键相关联
     */
    public Long getUserLoginId() {
        return userLoginId;
    }

    /**
     * 设置跟用户表的主键相关联
     *
     * @param userLoginId 跟用户表的主键相关联
     */
    public void setUserLoginId(Long userLoginId) {
        this.userLoginId = userLoginId;
    }

    /**
     * 获取财务主管对申请表的审核状态1通过2驳回
     *
     * @return type - 财务主管对申请表的审核状态1通过2驳回
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置财务主管对申请表的审核状态1通过2驳回
     *
     * @param type 财务主管对申请表的审核状态1通过2驳回
     */
    public void setType(Integer type) {
        this.type = type;
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