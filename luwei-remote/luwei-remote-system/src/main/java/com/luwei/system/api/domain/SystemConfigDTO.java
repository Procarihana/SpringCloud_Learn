package com.luwei.system.api.domain;

import lombok.Data;

/**
 * @author Nick
 * @since 2022/3/11
 */
@Data
public class SystemConfigDTO {

    private Long configId;

    private String configName;

    private String configKey;

    private String configValue;

}
