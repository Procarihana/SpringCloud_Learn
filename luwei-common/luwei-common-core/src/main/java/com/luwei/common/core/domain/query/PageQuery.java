package com.luwei.common.core.domain.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.Objects;

/**
 * 分页查询对象
 * @author Nick
 * @since 2022/2/10
 */
@SuperBuilder
@Data
@ApiModel(value = "分页请求对象", description = "分页参数")
public class PageQuery implements Serializable {

    /**
     * 页面大小
     */
    @ApiModelProperty("页面大小")
    private Long pageSize;

    /**
     * 当前页面
     */
    @ApiModelProperty("当前页面")
    private Long pageNum;

    public Long getPageSize() {

        if (Objects.isNull(pageSize)) {
            pageSize = 10L;
        }

        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageNum() {
        if (Objects.isNull(pageNum)) {
            pageNum = 1L;
        }
        return pageNum;
    }

    public void setPageNum(Long pageNum) {
        this.pageNum = pageNum;
    }
}
