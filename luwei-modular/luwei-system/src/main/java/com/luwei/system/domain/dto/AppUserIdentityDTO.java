package com.luwei.system.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

/**
 * APP用户身份验证表 DTO
 *
 * @author jinhuaPeng
 * @since 2022-04-14
 */
@Data
@Accessors(chain = true)
@ApiModel("APP用户身份验证表")
public class AppUserIdentityDTO {
    /**
     * 用户与身份验证关系id
     */
    @ApiModelProperty(value = "用户与身份验证关系id")
    private Long appUserIdentityId;

    /**
     * 身份证id
     */
    @NotEmpty(message = "身份证id不能为空")
    @ApiModelProperty(value = "身份证id")
    private String identityId;

    /**
     * 身份证名称
     */
    @NotEmpty(message = "身份证名称不能为空")
    @ApiModelProperty(value = "身份证名称")
    private String identityName;

    /**
     * 资格证号
     */
    @NotEmpty
    @ApiModelProperty(value = "资格证号")
    private String qualificationId;

    /**
     * 身份审核状态（0=未审核；1=通过；2=不通过）
     */
    @ApiModelProperty(value = "身份审核状态（0=未审核；1=通过；2=不通过）")
    private Integer auditStatus;

    /**
     * 审核意见
     */
    @ApiModelProperty(value = "审核意见")
    private String auditOpinion;

    /**
     * 创建者
     */
    @ApiModelProperty(value = "创建者")
    private String createBy;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    /**
     * 更新者
     */
    @ApiModelProperty(value = "更新者")
    private String updateBy;

    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String remark;

    /**
     * 提交认证码
     */
    @ApiModelProperty(value = "提交认证码")
    private String auditCode;

    @ApiModelProperty(value = "用户角色Id")
    private Long roleId;
    @ApiModelProperty(value = "用户角色名")
    private String roleName;

    @ApiModelProperty(value = "用户id")
    private Long userId;
}