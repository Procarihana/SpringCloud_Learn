package com.luwei.common.core.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * 分页返回对象
 * @author Nick
 * @since 2022/3/2
 */
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Data
@ApiModel(value = "分页返回对象", description = "分页返回对象")
public class PageDataInfoVO<T> implements Serializable {

    /**
     * 总记录数
     */
    @ApiModelProperty("总数")
    private Long total;

    /**
     * 列表数据
     */
    @ApiModelProperty("列表数据")
    private List<T> rows;

}
