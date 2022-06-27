package com.luwei.auth.serivce;

import cn.hutool.core.util.NumberUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SessionCallback;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class RedisTranscationService {
    @Autowired
    private RedisTemplate redisTemplate;
    public static final String REDIS_TEST_KEY_V1 = "REDIS_TEST_KEY_V1";
    public static final String REDIS_TEST_KEY_V2 = "REDIS_TEST_KEY_V2";


    /**
     * 一开始种地
     */
    public void v1(){
        try {
            redisTemplate.setEnableTransactionSupport(true);
            redisTemplate.multi();
            redisTemplate.opsForList().range(REDIS_TEST_KEY_V1,0,-1);
            redisTemplate.opsForList().leftPush(REDIS_TEST_KEY_V1, "v1_1");
            redisTemplate.opsForValue().set(REDIS_TEST_KEY_V1,"ssas");
            redisTemplate.opsForList().leftPush(REDIS_TEST_KEY_V1, "v1_2");
            redisTemplate.opsForValue().set(REDIS_TEST_KEY_V1,"111111");
            redisTemplate.exec();
        } catch (Exception e) {
            redisTemplate.discard();
            log.error(e.getMessage());
        }
    }

//    @Transactional(rollbackFor = Exception.class)
//    public void v2() throws Exception {
//        System.out.println(redisTemplate.opsForList().range(REDIS_TEST_KEY_V2,0,-1).size());
//        redisTemplate.opsForList().leftPush(REDIS_TEST_KEY_V2, "v2_1");
//        redisTemplate.opsForList().leftPush(REDIS_TEST_KEY_V2, "v2_2");
//        redisTemplate.opsForList().leftPush(REDIS_TEST_KEY_V2, "v2_3");
//        System.out.println(redisTemplate.opsForList().range(REDIS_TEST_KEY_V2,0,-1).size());
//    }

    public void v2() throws Exception {
        List<Object> txResult = (List<Object>) redisTemplate.execute(new SessionCallback<List<Object>>() {
            @Override
            public List<Object> execute(RedisOperations operations) throws DataAccessException {
                operations.multi();
                System.out.println(operations.opsForList().range(REDIS_TEST_KEY_V2,0,-1).size());
                operations.opsForList().leftPush(REDIS_TEST_KEY_V2, "v2_1");
                operations.opsForList().leftPush(REDIS_TEST_KEY_V2, "v2_2");
//                operations.opsForValue().set(REDIS_TEST_KEY_V2,"ssas");
                operations.opsForList().leftPush(REDIS_TEST_KEY_V2, "v2_3");
                 return operations.exec();
            }
        });
        System.out.println(txResult.stream().map(result -> String.valueOf(result)).collect(Collectors.toList()));
    }
}
