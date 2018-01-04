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
    private String project_id;

    /**
     * 项目显示值
     */
    @Column(name = "show_value")
    private String show_value;

    /**
     * 项目创建时间（不可修改、
     */
    @Column(name = "create_time")
    private String create_time;

    /**
     * 项目创建用户（不可修改fm_user.id）
     */
    @Column(name = "create_id")
    private Long create_id;

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

    public String getProject_id() {
        return project_id;
    }

    public void setProject_id(String project_id) {
        this.project_id = project_id;
    }

    public String getShow_value() {
        return show_value;
    }

    public void setShow_value(String show_value) {
        this.show_value = show_value;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public Long getCreate_id() {
        return create_id;
    }

    public void setCreate_id(Long create_id) {
        this.create_id = create_id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}