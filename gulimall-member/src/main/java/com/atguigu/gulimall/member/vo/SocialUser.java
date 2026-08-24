package com.atguigu.gulimall.member.vo;

import lombok.Data;

/**
 * 这个是针对gitee开发的
 */
@Data
public class SocialUser {

    //访问令牌
    private String access_token;

    //令牌类型
    private String token_type;

    //剩余有效期
    private long expires_in;

    //刷新令牌
    private String refresh_token;

    //本次授权允许访问的资源范围，空格分隔的字符串列表
    /**
     * 本次授权允许访问的资源范围，空格分隔的字符串列表：
     * user_info：用户基本信息
     * projects：仓库/项目
     * pull_requests：PR
     * issues：Issue
     * notes：评论/动态
     * keys：公钥
     * hook：WebHook
     * groups：组织/团队
     * gists：代码片段
     * enterprises：企业
     * emails：邮箱（较敏感）
     * 调 API 时若超出 scope，会报 403/无权限。
     */
    private String scope;

    // token 颁发时间，Unix 时间戳（秒）
    private String created_at;
}
