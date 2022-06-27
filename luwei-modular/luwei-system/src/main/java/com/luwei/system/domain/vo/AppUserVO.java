package com.luwei.system.domain.vo;

import com.luwei.common.core.annotation.Excel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

/**
 * APP用户信息表 VO
 *
 * @author jinhuaPeng
 * @since 2022-03-30
 */
@Data
@Accessors(chain = true)
@ApiModel("APP用户信息表")
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class AppUserVO {
    /**
     * 用户ID
     */
    @NotEmpty(message = "用户ID不能为空")
    @ApiModelProperty(value = "用户ID")
    private Long userId;

    /**
     * 用户账号
     */
    @NotEmpty(message = "用户账号不能为空")
    @ApiModelProperty(value = "用户账号")
    private String username;

    /**
     * OpenId
     */
    @Excel(name = "OpenId")
    @ApiModelProperty(value = "OpenId")
    private String openId;

    /**
     * 用户邮箱
     */
    @ApiModelProperty(value = "用户邮箱")
    private String email;

    /**
     * 手机号码
     */
    @ApiModelProperty(value = "手机号码")
    private String phoneNumber;

    /**
     * 用户性别（0男 1女 2未知）
     */
    @ApiModelProperty(value = "用户性别（0男 1女 2未知）")
    private String sex;

    /**
     * 头像地址
     */
    @ApiModelProperty(value = "头像地址")
    private String avatar;

    /**
     * 密码
     */
    @ApiModelProperty(value = "密码")
    private String password;

    /**
     * 帐号状态（0正常 1停用）
     */
    @ApiModelProperty(value = "帐号状态（0正常 1停用）")
    private boolean status;

    /**
     * 删除标志（0代表存在 1代表删除）
     */
    @ApiModelProperty(value = "删除标志（0=存在;1=删除）")
    private boolean deleted;;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String remark;

    /**
     * 自我介绍
     */
    @ApiModelProperty(value = "自我介绍")
    private String introduction;

    /**
     * 院校
     */
    @ApiModelProperty(value = "院校")
    private String school;

    @ApiModelProperty(value = "主页背景图")
    private String backgroundUrl;
    @ApiModelProperty(value = "身份证id")
    private String identityId;
    @ApiModelProperty(value = "身份证名称")
    private String identityName;
    @ApiModelProperty(value = "资格证号")
    private String qualificationId;

}