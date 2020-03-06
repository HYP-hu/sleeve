package com.lin.missyou.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "spec_value", schema = "sleeve", catalog = "")
public class SpecValue {
    private int id;
    private String value;
    private int specId;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Timestamp deleteTime;
    private String extend;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "value")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Basic
    @Column(name = "spec_id")
    public int getSpecId() {
        return specId;
    }

    public void setSpecId(int specId) {
        this.specId = specId;
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
    @Column(name = "extend")
    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpecValue specValue = (SpecValue) o;
        return id == specValue.id &&
                specId == specValue.specId &&
                Objects.equals(value, specValue.value) &&
                Objects.equals(createTime, specValue.createTime) &&
                Objects.equals(updateTime, specValue.updateTime) &&
                Objects.equals(deleteTime, specValue.deleteTime) &&
                Objects.equals(extend, specValue.extend);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value, specId, createTime, updateTime, deleteTime, extend);
    }
}
