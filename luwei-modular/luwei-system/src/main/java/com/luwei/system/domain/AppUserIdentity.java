package com.luwei.system.domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.luwei.common.core.annotation.Excel;
import com.luwei.common.datasource.base.domain.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

/**
 * APP用户身份验证表 (AppUserIdentity) 实体类
 *
 * @author jinhuaPeng
 * @since 2022-04-14
 */
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@TableName("app_user_identity")
@ApiModel("APP用户身份验证表")
@Accessors(chain = true)
public class AppUserIdentity extends BaseEntity {
    private static final long serialVersionUID = 1L;
    /**
     * 用户与身份验证关系id
     */
    @TableId(value = "app_user_identity_id", type = IdType.AUTO)
    @Excel(name = "用户与身份验证关系id")
    @ApiModelProperty(value = "用户与身份验证关系id")
    private Long appUserIdentityId;

    /**
     * 身份证id
     */

    @Excel(name = "身份证id")
    @ApiModelProperty(value = "身份证id")
    private String identityId;

    /**
     * 身份证名称
     */

    @Excel(name = "身份证名称")
    @ApiModelProperty(value = "身份证名称")
    private String identityName;

    /**
     * 资格证号
     */

    @Excel(name = "资格证号")
    @ApiModelProperty(value = "资格证号")
    private String qualificationId;

    /**
     * 身份审核状态（0=未审核；1=通过；2=不通过）
     */

    @Excel(name = "身份审核状态（0=未审核；1=通过；2=不通过）")
    @ApiModelProperty(value = "身份审核状态（0=未审核；1=通过；2=不通过）")
    private Integer auditStatus;

    /**
     * 审核意见
     */

    @Excel(name = "审核意见")
    @ApiModelProperty(value = "审核意见")
    private String auditOpinion;

    /**
     * 提交认证码
     */

    @Excel(name = "提交认证码")
    @ApiModelProperty(value = "提交认证码")
    private String auditCode;

    @ApiModelProperty(value = "用户ID")
    private Long userId;

    @ApiModelProperty(value = "用户角色Id")
    private Long roleId;

}