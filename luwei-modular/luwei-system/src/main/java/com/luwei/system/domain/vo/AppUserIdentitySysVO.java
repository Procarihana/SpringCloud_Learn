package com.luwei.system.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

/**
 * 后台管理-APP用户身份验证表 VO
 *
 * @author jinhuaPeng
 * @since 2022-04-14
 */
@Data
@Accessors(chain = true)
@ApiModel("后台管理-APP用户身份验证表 VO")
public class AppUserIdentitySysVO {
    @ApiModelProperty(value = "手机号码")
    private String phone;
    /**
     * 头像地址
     */
    @ApiModelProperty(value = "头像地址")
    private String avatar;

    /**
     * 用户与身份验证关系id
     */
    @NotEmpty(message = "用户与身份验证关系id不能为空")
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
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    /**
     * 提交认证码
     */
    @ApiModelProperty(value = "提交认证码")
    private String auditCode;

    @ApiModelProperty(value = "用户角色Id")
    private Long roleId;
    @ApiModelProperty(value = "用户角色名")
    private String roleName;
}
