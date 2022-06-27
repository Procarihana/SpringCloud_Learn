package com.luwei.common.sms.util;

import com.alibaba.fastjson.JSON;
import com.aliyun.dysmsapi20170525.Client;
import com.aliyun.dysmsapi20170525.models.SendSmsRequest;
import com.aliyun.dysmsapi20170525.models.SendSmsResponse;
import com.aliyun.teaopenapi.models.Config;
import com.luwei.common.sms.domain.Sms;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * 阿里云短信发送
 */
@Component
public class AliSmsUtil {

    @Value("${ali.sms.access-key-id}")
    private String accessKeyId;

    @Value("${ali.sms.access-key-secret}")
    private String accessKeySecret;

    @Value("${ali.sms.endpoint}")
    private String endpoint;

    @Value("${ali.sms.sign-name}")
    private String signName;

    @Value("${ali.sms.template-code}")
    private String templateCode;

    public Sms sendVerifyCode(String phone, String verifyCode) throws Exception {

        Config config = new Config()
                .setAccessKeyId(accessKeyId)
                .setAccessKeySecret(accessKeySecret);
        // 访问的域名
        config.endpoint = endpoint;
        Client client = new Client(config);

        Map<String, String> postMap = new HashMap<>(1);
        postMap.put("code", verifyCode);
        String contextJson = JSON.toJSONString(postMap);

        SendSmsRequest sendSmsRequest = new SendSmsRequest()
                .setPhoneNumbers(phone)
                .setSignName(signName)
                .setTemplateCode(templateCode)
                .setTemplateParam(contextJson);

        SendSmsResponse sendSmsResponse = client.sendSms(sendSmsRequest);
        return Sms.builder().phone(phone).message(JSON.toJSONString(sendSmsResponse)).build();
    }
}
