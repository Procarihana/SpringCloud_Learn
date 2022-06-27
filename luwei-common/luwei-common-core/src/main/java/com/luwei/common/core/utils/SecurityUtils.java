package com.luwei.common.core.utils;

import cn.hutool.core.codec.Base64;
import cn.hutool.core.util.CharsetUtil;
import cn.hutool.crypto.symmetric.SymmetricAlgorithm;
import cn.hutool.crypto.symmetric.SymmetricCrypto;
import com.luwei.common.core.constant.CacheConstants;
import com.luwei.common.core.text.Convert;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

/**
 * 权限获取工具类
 *
 * @author luwei
 */
public class SecurityUtils {
    /**
     * 获取用户
     */
    public static String getUsername() {
        String username = ServletUtils.getRequest().getHeader(CacheConstants.DETAILS_USERNAME);
        if (Objects.isNull(username)) {
            return "";
        }
        return ServletUtils.urlDecode(username);
    }

    /**
     * 获取用户ID
     */
    public static Long getUserId() {
        return Convert.toLong(ServletUtils.getRequest().getHeader(CacheConstants.DETAILS_USER_ID));
    }

    /**
     * 获取openID
     */
    public static String getOpenId() {
        return ServletUtils.getRequest().getHeader(CacheConstants.DETAILS_USER_ID);
    }

    /**
     * 获取请求token
     */
    public static String getToken() {
        return getToken(ServletUtils.getRequest());
    }


    /**
     * 根据request获取请求token
     */
    public static String getToken(HttpServletRequest request) {
        String token = ServletUtils.getRequest().getHeader(CacheConstants.HEADER);
        if (StringUtils.isNotEmpty(token) && token.startsWith(CacheConstants.TOKEN_PREFIX)) {
            token = token.replace(CacheConstants.TOKEN_PREFIX, "");
        }
        return token;
    }

    /**
     * 是否为管理员
     *
     * @param userId 用户ID
     * @return 结果
     */
    public static boolean isAdmin(Long userId) {
        return userId != null && 1L == userId;
    }

    /**
     * 生成BCryptPasswordEncoder密码
     *
     * @param password 密码
     * @return 加密字符串
     */
    public static String encryptPassword(String password) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.encode(password);
    }

    /**
     * 判断密码是否相同
     *
     * @param rawPassword     真实密码
     * @param encodedPassword 加密后字符
     * @return 结果
     */
    public static boolean matchesPassword(String rawPassword, String encodedPassword) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.matches(rawPassword, encodedPassword);
    }

    /**
     * 身份证Id加密
     *
     * @param identityId
     * @return
     */
    public static String encryptIdentityId(String identityId) {
        // 密钥
        byte[] key = Base64.decode(Base64.encode("Bux4/SX6XmuBAF2PRf69WA=="));
        // 构建
        SymmetricCrypto ase = new SymmetricCrypto(SymmetricAlgorithm.AES, key);
        // 加密为16进制表示
        return ase.encryptHex(identityId);
    }

    /**
     * 身份证Id匹配
     *
     * @param rawIdentityId
     * @param encodeIdentityId
     * @return
     */
    public static boolean matchesIdentityId(String rawIdentityId, String encodeIdentityId) {
        // 解密
        String decodeIdentityId = decryptIdentityId(encodeIdentityId);
        if (decodeIdentityId.equals(rawIdentityId)) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    /**
     * 身份证Id解密
     *
     * @param encodeIdentityId
     * @return
     */
    public static String decryptIdentityId(String encodeIdentityId) {
        // 密钥
        byte[] key = Base64.decode(Base64.encode("Bux4/SX6XmuBAF2PRf69WA=="));
        // 构建
        SymmetricCrypto ase = new SymmetricCrypto(SymmetricAlgorithm.AES, key);
        //解密为字符串
        String decryptStr = ase.decryptStr(encodeIdentityId, CharsetUtil.CHARSET_UTF_8);
        return decryptStr;
    }
}
