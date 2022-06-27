package com.luwei.system.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

/**
 * 用户与openId关系表  VO
 *
 * @author jinhuaPeng
 * @since 2022-04-14
 */
@Data
@Accessors(chain = true)
@ApiModel("用户与openId关系表 ")
public class AppUserOpenIdVO {
    /**
     * app用户openid关系id
     */
    @NotEmpty(message = "app用户openid关系id不能为空")
    @ApiModelProperty(value = "app用户openid关系id")
    private Long appUserOpenId;

    /**
     * 用户ID
     */
    @NotEmpty(message = "用户ID不能为空")
    @ApiModelProperty(value = "用户ID")
    private Long userId;

    /**
     * OpenId
     */
    @NotEmpty(message = "OpenId不能为空")
    @ApiModelProperty(value = "OpenId")
    private String openId;

    /**
     * OpenId类型（0=微信；1=QQ；2=微博；3=手机一键登录）
     */
    @NotEmpty(message = "OpenId类型（0=微信；1=QQ；2=微博；3=手机一键登录）不能为空")
    @ApiModelProperty(value = "OpenId类型（0=微信；1=QQ；2=微博；3=手机一键登录）")
    private Integer openIdType;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

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

}