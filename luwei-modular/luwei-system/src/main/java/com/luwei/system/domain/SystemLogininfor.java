package com.luwei.system.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.luwei.common.core.annotation.Excel;
import com.luwei.common.core.annotation.Excel.ColumnType;
import com.luwei.common.datasource.base.domain.BaseEntity;

import java.util.Date;

/**
 * 系统访问记录表 sys_logininfor
 *
 * @author luwei
 */
@TableName("sys_logininfor")
public class SystemLogininfor extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @Excel(name = "序号", cellType = ColumnType.NUMERIC)
    @TableId(value = "info_id", type = IdType.AUTO)
    private Long infoId;

    /**
     * 用户账号
     */
    @Excel(name = "用户账号")
    @TableField(value = "user_name")
    private String userName;

    /**
     * 状态 0成功 1失败
     */
    @Excel(name = "状态", readConverterExp = "0=成功,1=失败")
    @TableField(value = "status")
    private String status;

    /**
     * 地址
     */
    @Excel(name = "地址")
    @TableField(value = "ipaddr")
    private String ipaddr;

    /**
     * 描述
     */
    @Excel(name = "描述")
    @TableField(value = "msg")
    private String msg;

    /**
     * 访问时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "访问时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "access_time")
    private Date accessTime;

    public Long getInfoId() {
        return infoId;
    }

    public void setInfoId(Long infoId) {
        this.infoId = infoId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIpaddr() {
        return ipaddr;
    }

    public void setIpaddr(String ipaddr) {
        this.ipaddr = ipaddr;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getAccessTime() {
        return accessTime;
    }

    public void setAccessTime(Date accessTime) {
        this.accessTime = accessTime;
    }
}