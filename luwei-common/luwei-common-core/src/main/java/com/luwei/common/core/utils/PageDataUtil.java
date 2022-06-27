package com.luwei.common.core.utils;

import com.github.pagehelper.PageInfo;
import com.luwei.common.core.domain.vo.PageDataInfoVO;

import java.util.List;

/**
 * @author Nick
 * @since 2022/3/4
 */
public class PageDataUtil<T> {

    private List<T> targetList;

    public PageDataUtil(List<T> targetList) {
        this.targetList = targetList;
    }

    public PageDataInfoVO<T> response() {
        PageDataInfoVO<T> pageDataInfoVo = new PageDataInfoVO<>();
        pageDataInfoVo.setRows(targetList);
        pageDataInfoVo.setTotal(new PageInfo(targetList).getTotal());
        return pageDataInfoVo;
    }

}
