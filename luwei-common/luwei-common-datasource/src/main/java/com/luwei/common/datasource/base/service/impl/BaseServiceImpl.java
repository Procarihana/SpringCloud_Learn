package com.luwei.common.datasource.base.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.luwei.common.datasource.base.mapper.BaseMapper;
import com.luwei.common.datasource.base.service.BaseService;

/**
 * @Author: dengtongzi
 * @Date: 15:26 2022-01-21
 * @Version:
 * @Description:
 */
public class BaseServiceImpl<M extends BaseMapper<T>, T> extends ServiceImpl<M, T> implements BaseService<T> {

}
