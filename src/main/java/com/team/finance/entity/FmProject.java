package com.team.finance.entity;

import javax.persistence.*;

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
    @Column(name = "type")
    private String type;

    /**
     * 项目编号（类别内唯一，创建后不可修改）
     */
    @Column(name = "project_id")
    private String projectId;

    /**
     * 项目显示值
     */
    @Column(name = "show_value")
    private String showValue;

    /**
     * 项目创建时间（不可修改、
     */
    @Column(name = "create_time")
    private String createTime;

    /**
     * 项目创建用户（不可修改fm_user.id）
     */
    @Column(name = "create_id")
    private String createId;

    /**
     * 屏蔽状态,1 不审核 2 屏蔽
     */
    @Column(name = "state")
    private String state;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getShowValue() {
        return showValue;
    }

    public void setShowValue(String showValue) {
        this.showValue = showValue;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}