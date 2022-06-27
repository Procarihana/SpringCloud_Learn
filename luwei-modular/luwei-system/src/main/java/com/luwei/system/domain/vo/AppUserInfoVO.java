package com.luwei.system.domain.vo;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * 被点赞、回帖数、收藏数、用户名称、学校、个人介绍，（查看为他人）是否有关注log
 *
 * @author JinhuaPeng
 */
public class AppUserInfoVO {
    /**
     * 用户ID
     */
    @ApiModelProperty(value = "用户ID")
    private Long userId;

    /**
     * 用户账号
     */
    @ApiModelProperty(value = "用户账号")
    private String username;

    /**
     * 头像地址
     */
    @ApiModelProperty(value = "头像地址")
    private String avatar;

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
    @ApiModelProperty(value = "被点赞")
    private BigDecimal likeNum;
    @ApiModelProperty(value = "回帖数")
    private BigDecimal recommendPostNum;
    @ApiModelProperty(value = "收藏数")
    private BigDecimal collectNum;
    @ApiModelProperty(value = "关注数")
    private BigDecimal followNum;
    @ApiModelProperty(value = "被关注数")
    private BigDecimal fanNum;

}
