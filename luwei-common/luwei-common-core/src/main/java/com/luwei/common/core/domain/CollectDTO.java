package com.luwei.common.core.domain;

import lombok.Data;
import lombok.experimental.SuperBuilder;

/**
 * 更新收藏对象
 */
@Data
@SuperBuilder
public class CollectDTO {
    private Long postId;
    private Long collectNum;
}
