package com.luwei.system.api.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.luwei.common.core.annotation.Excel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

/**
 * 用户信息表
 *
 * @author jinhuaPeng
 * @since 2022-03-28
 */
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@TableName("app_user")
@ApiModel("用户信息表")
public class AppUserDTO {
    private static final long serialVersionUID = 1L;
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
     * 用户性别（0男 1女 2未知）
     */
    @ApiModelProperty(value = "用户性别（0男 1女 2未知）")
    private String sex;
}