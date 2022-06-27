package com.luwei.system.api.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 更新数据排序的DTO
 * @author Nick
 * @since 2022/2/14
 */
@Data
@ApiModel(value = "更新数据排序DTO对象", description = "更新数据排序DTO对象")
public class UpdateDataSortDTO implements Serializable {

    @ApiModelProperty("id")
    @NotNull(message = "[id] 不可为null")
    private Long id;

    @ApiModelProperty("排序号码")
    @NotNull(message = "[sortNum] 不可为null")
    private Integer sortNum;

}