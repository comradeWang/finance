package com.team.finance.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "fm_project")
public class FmProject {
    /**
     * 主键，自增
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 活动类别()
     */
    private Byte type;

    /**
     * 项目编号（类别内唯一，创建后不可修改）
     */
    @Column(name = "project_id")
    private Long projectId;

    /**
     * 项目显示值
     */
    @Column(name = "show_value")
    private Long showValue;

    /**
     * 项目创建时间（不可修改、
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 项目创建用户（不可修改fm_user.id）
     */
    @Column(name = "create_id")
    private Long createId;

    /**
     * 屏蔽状态,1 不审核 2 屏蔽 
     */
    private Byte state;

    /**
     * 获取主键，自增
     *
     * @return id - 主键，自增
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键，自增
     *
     * @param id 主键，自增
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取活动类别()
     *
     * @return type - 活动类别()
     */
    public Byte getType() {
        return type;
    }

    /**
     * 设置活动类别()
     *
     * @param type 活动类别()
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * 获取项目编号（类别内唯一，创建后不可修改）
     *
     * @return project_id - 项目编号（类别内唯一，创建后不可修改）
     */
    public Long getProjectId() {
        return projectId;
    }

    /**
     * 设置项目编号（类别内唯一，创建后不可修改）
     *
     * @param projectId 项目编号（类别内唯一，创建后不可修改）
     */
    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    /**
     * 获取项目显示值
     *
     * @return show_value - 项目显示值
     */
    public Long getShowValue() {
        return showValue;
    }

    /**
     * 设置项目显示值
     *
     * @param showValue 项目显示值
     */
    public void setShowValue(Long showValue) {
        this.showValue = showValue;
    }

    /**
     * 获取项目创建时间（不可修改、
     *
     * @return create_time - 项目创建时间（不可修改、
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置项目创建时间（不可修改、
     *
     * @param createTime 项目创建时间（不可修改、
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取项目创建用户（不可修改fm_user.id）
     *
     * @return create_id - 项目创建用户（不可修改fm_user.id）
     */
    public Long getCreateId() {
        return createId;
    }

    /**
     * 设置项目创建用户（不可修改fm_user.id）
     *
     * @param createId 项目创建用户（不可修改fm_user.id）
     */
    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    /**
     * 获取屏蔽状态,1 不审核 2 屏蔽 
     *
     * @return state - 屏蔽状态,1 不审核 2 屏蔽 
     */
    public Byte getState() {
        return state;
    }

    /**
     * 设置屏蔽状态,1 不审核 2 屏蔽 
     *
     * @param state 屏蔽状态,1 不审核 2 屏蔽 
     */
    public void setState(Byte state) {
        this.state = state;
    }
}