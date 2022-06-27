package com.luwei.system.domain.dto;

import lombok.Data;

/**
 * @Author: dengtz
 * @Date: 16:13 2022-03-14
 * @Version:
 * @Description:
 */
@Data
public class UpdatePasswordDTO {
    private String oldPassword;
    private String newPassword;
}
