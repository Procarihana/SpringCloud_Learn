package com.luwei.system.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "用户类型关系新增对象DTO")
public class AppUserTypeAddDTO {
    @ApiModelProperty("用户ID")
    private Long userId;
    @ApiModelProperty("用户类型ID")
    private List<Long> AddUserTypeIds;
}
