package com.luwei.system.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * APP用户详情信息
 */
@Data
@ApiModel(value = "后台管理-APP用户信息")
public class AppUserSysVO {
    /**
     * 用户ID
     */
    @ApiModelProperty(value = "用户ID")
    private Long userId;

    /**
     * 用户名称
     */
    @ApiModelProperty(value = "用户名称")
    private String username;

    /**
     * 手机号码
     */
    @ApiModelProperty(value = "手机号码")
    private String phoneNumber;

    /**
     * 头像地址
     */
    @ApiModelProperty(value = "头像地址")
    private String avatar;

    /**
     * 帐号状态（0正常 1停用）
     */
    @ApiModelProperty(value = "帐号状态（0正常 1停用）")
    private boolean status;

    @ApiModelProperty(value = "注册时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "（0=存在;1=删除）")
    private boolean deleted;

    @ApiModelProperty(value = "身份")
    private String roleName;

}
