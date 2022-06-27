package com.luwei.common.core.enums;

import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 第三方登录平台枚举类
 *
 * @author JinhuaPeng
 */

@Getter
@NoArgsConstructor
public enum ThirdEnums {
    WE_CHAT(0,"WeChat_"),
    QQ(1,"QQ_"),
    WEIBO(2,"Weibo_"),
    PHONE(3,"Phone_")
    ;
    private Integer openIDCode;
    private String thirdType;

    ThirdEnums(Integer openIDCode, String thirdType) {
        this.openIDCode = openIDCode;
        this.thirdType = thirdType;
    }

    /**
     * 根据第三方登录openIdCode获取枚举类
     *
     * @param openIDCode
     * @return
     */
    public static ThirdEnums getByOpenIdCode(Integer openIDCode){
       for (ThirdEnums thirdEnums:values()){
           if (thirdEnums.getOpenIDCode().equals(openIDCode)){
               return thirdEnums;
           }
       }
       return null;
    }

    /**
     * 根据第三方登录openIdCode获取前缀
     *
     * @param openIDCode
     * @return
     */
    public static String getThirdPreByOpenIdCode(Integer openIDCode){
        for (ThirdEnums thirdEnums:values()){
            if (thirdEnums.getOpenIDCode().equals(openIDCode)){
                return thirdEnums.getThirdType();
            }
        }
        return null;
    }
}
