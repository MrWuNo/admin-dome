package com.mrwu.model.base;

import java.io.Serializable;
import java.util.Date;

/**
 * @program SSM
 * @description: 实体类基类
 * @author: wuzhangyi
 * @create: 2018/12/02 15:46
 */
public abstract class BaseEntry implements Serializable {
    private Date createDate;    // 创建时间
    private Date updateDate;    // 更新时间
    private Integer createBy;   // 创建人
    private Integer updateBy;   // 更新人
    private Integer delFlag;   // 逻辑删除（0：未删除，1：删除）

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }
}
