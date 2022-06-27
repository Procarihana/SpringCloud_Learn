package com.luwei.common.redis.service;

import cn.hutool.core.date.DateUtil;
import com.luwei.common.core.utils.DateUtils;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

@Slf4j
@Component
public class ReceiverRedisMessageService {
    /**
     * 注入消息接受类
     */
        private CountDownLatch latch;

    public ReceiverRedisMessageService(CountDownLatch latch) {
        this.latch = latch;
    }

    /**
         * 队列消息接收方法
         *
         * @param jsonMsg
         */
        public void receiveMessage(String jsonMsg) {
            log.info("[开始消费REDIS消息队列phone数据...]");
            try {
                System.out.println(jsonMsg);
                System.out.println("before"+DateUtil.now()+jsonMsg);
                System.out.println("after"+DateUtil.now()+jsonMsg);
                log.info("[消费REDIS消息队列phone数据成功.]");
            } catch (Exception e) {
                log.error("[消费REDIS消息队列phone数据失败，失败信息:{}]", e.getMessage());
            }
            latch.countDown();
        }

        /**
         * 队列消息接收方法
         *
         * @param jsonMsg
         */
        public void receiveMessage2(String jsonMsg) {
            log.info("[开始消费REDIS消息队列phoneTest2数据...]");
            try {
                System.out.println(jsonMsg);
                /**
                 *  此处执行自己代码逻辑 例如 插入 删除操作数据库等
                 */

                log.info("[消费REDIS消息队列phoneTest2数据成功.]");
            } catch (Exception e) {
                log.error("[消费REDIS消息队列phoneTest2数据失败，失败信息:{}]", e.getMessage());
            }
            latch.countDown();
        }
}
