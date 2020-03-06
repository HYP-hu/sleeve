package com.lin.missyou.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "spec_key", schema = "sleeve", catalog = "")
public class SpecKey {
    private int id;
    private String name;
    private String unit;
    private byte standard;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Timestamp deleteTime;
    private String description;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "unit")
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Basic
    @Column(name = "standard")
    public byte getStandard() {
        return standard;
    }

    public void setStandard(byte standard) {
        this.standard = standard;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "update_time")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "delete_time")
    public Timestamp getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Timestamp deleteTime) {
        this.deleteTime = deleteTime;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpecKey specKey = (SpecKey) o;
        return id == specKey.id &&
                standard == specKey.standard &&
                Objects.equals(name, specKey.name) &&
                Objects.equals(unit, specKey.unit) &&
                Objects.equals(createTime, specKey.createTime) &&
                Objects.equals(updateTime, specKey.updateTime) &&
                Objects.equals(deleteTime, specKey.deleteTime) &&
                Objects.equals(description, specKey.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, unit, standard, createTime, updateTime, deleteTime, description);
    }
}
