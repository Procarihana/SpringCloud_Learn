package com.luwei.system.domain.dto;

import com.luwei.system.domain.vo.AppRoleVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * app身份认证
 *
 * @author JinhuaPeng
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "app身份认证DTO")
@AllArgsConstructor
@NoArgsConstructor
public class AppUserAuditDTO {

    @ApiModelProperty(value = "用户id")
    private Long userId;
    @ApiModelProperty(value = "用户角色")
    private AppRoleVO appRole;
    @ApiModelProperty(value = "身份证名称")
    private String identityName;
    @ApiModelProperty(value = "身份证号")
    private String identityId;
    @ApiModelProperty(value = "资格证号码")
    private String qualificationId;
    @ApiModelProperty(value = "状态")
    private Integer auditStatus;
    @ApiModelProperty(value = "申请日期")
    private LocalDateTime createTime;
    @ApiModelProperty(value = "手机号")
    private String phone;

}
