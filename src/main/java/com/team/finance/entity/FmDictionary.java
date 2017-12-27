package com.team.finance.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "fm_dictionary")
public class FmDictionary {
    /**
     * 主键，自增
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 类别名称
     */
    @Column(name = "type_name")
    private String typeName;

    /**
     * 类型编号
     */
    @Column(name = "type_id")
    private Long typeId;

    /**
     * 类别创建时间
     */
    @Column(name = "type_create_time")
    private Date typeCreateTime;

    /**
     * 类别创建用户（fm_user.id）
     */
    @Column(name = "type_create_id")
    private Long typeCreateId;

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
     * 获取类别名称
     *
     * @return type_name - 类别名称
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * 设置类别名称
     *
     * @param typeName 类别名称
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * 获取类型编号
     *
     * @return type_id - 类型编号
     */
    public Long getTypeId() {
        return typeId;
    }

    /**
     * 设置类型编号
     *
     * @param typeId 类型编号
     */
    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    /**
     * 获取类别创建时间
     *
     * @return type_create_time - 类别创建时间
     */
    public Date getTypeCreateTime() {
        return typeCreateTime;
    }

    /**
     * 设置类别创建时间
     *
     * @param typeCreateTime 类别创建时间
     */
    public void setTypeCreateTime(Date typeCreateTime) {
        this.typeCreateTime = typeCreateTime;
    }

    /**
     * 获取类别创建用户（fm_user.id）
     *
     * @return type_create_id - 类别创建用户（fm_user.id）
     */
    public Long getTypeCreateId() {
        return typeCreateId;
    }

    /**
     * 设置类别创建用户（fm_user.id）
     *
     * @param typeCreateId 类别创建用户（fm_user.id）
     */
    public void setTypeCreateId(Long typeCreateId) {
        this.typeCreateId = typeCreateId;
    }
}