package com.luwei.common.sms.domain;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Sms {
    private String phone;
    private String verifyCode;
    private String message;
}
