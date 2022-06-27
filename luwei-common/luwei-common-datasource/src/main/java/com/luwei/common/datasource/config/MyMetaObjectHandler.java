package com.luwei.common.datasource.config;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.luwei.common.core.utils.SecurityUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

import static com.luwei.common.core.constant.RedisConstants.APP_TOKEN_PRE;

@Slf4j
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("start insert fill ....");
        // 起始版本 3.3.0(推荐使用)
        this.strictInsertFill(metaObject, "createTime", LocalDateTime.class, LocalDateTime.now());
        StringBuffer stringBuffer = new StringBuffer();
        if (StrUtil.isNotEmpty(SecurityUtils.getToken())) {
            if (SecurityUtils.getToken().startsWith(APP_TOKEN_PRE)) {
                stringBuffer.append(APP_TOKEN_PRE);
            } else {
                stringBuffer.append("system_");
            }
            this.strictInsertFill(metaObject, "createBy", String.class
                    , stringBuffer.append(SecurityUtils.getUserId()).toString());
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("start update fill ....");
        // 起始版本 3.3.0(推荐)
        this.strictUpdateFill(metaObject, "updateTime", LocalDateTime.class, LocalDateTime.now());
        StringBuffer stringBuffer = new StringBuffer();
        if (StrUtil.isNotEmpty(SecurityUtils.getToken())) {
            if (SecurityUtils.getToken().startsWith(APP_TOKEN_PRE)) {
                stringBuffer.append(APP_TOKEN_PRE);
            } else {
                stringBuffer.append("system_");
            }
            this.strictUpdateFill(metaObject, "updateBy",
                    String.class, stringBuffer.append(SecurityUtils.getUserId()).toString());
        }
    }
}
