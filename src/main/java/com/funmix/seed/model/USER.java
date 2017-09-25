package com.funmix.seed.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tuser")
public class USER {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer companyid;

    /**
     * 登录名
     */
    private String username;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 密码
     */
    private String password;

    /**
     * 创建时间
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * 状态
     */
    private Integer status;

    private String token;

    /**
     * 1:开启；2:关闭
     */
    @Column(name = "access_status")
    private Integer accessStatus;

    @Column(name = "web_routers")
    private String webRouters;

    @Column(name = "api_routers")
    private String apiRouters;

    @Column(name = "default_web_routers")
    private String defaultWebRouters;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return companyid
     */
    public Integer getCompanyid() {
        return companyid;
    }

    /**
     * @param companyid
     */
    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    /**
     * 获取登录名
     *
     * @return username - 登录名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置登录名
     *
     * @param username 登录名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取联系电话
     *
     * @return phone - 联系电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置联系电话
     *
     * @param phone 联系电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取创建时间
     *
     * @return created_time - 创建时间
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置创建时间
     *
     * @param createdTime 创建时间
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return token
     */
    public String getToken() {
        return token;
    }

    /**
     * @param token
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * 获取1:开启；2:关闭
     *
     * @return access_status - 1:开启；2:关闭
     */
    public Integer getAccessStatus() {
        return accessStatus;
    }

    /**
     * 设置1:开启；2:关闭
     *
     * @param accessStatus 1:开启；2:关闭
     */
    public void setAccessStatus(Integer accessStatus) {
        this.accessStatus = accessStatus;
    }

    /**
     * @return web_routers
     */
    public String getWebRouters() {
        return webRouters;
    }

    /**
     * @param webRouters
     */
    public void setWebRouters(String webRouters) {
        this.webRouters = webRouters;
    }

    /**
     * @return api_routers
     */
    public String getApiRouters() {
        return apiRouters;
    }

    /**
     * @param apiRouters
     */
    public void setApiRouters(String apiRouters) {
        this.apiRouters = apiRouters;
    }

    /**
     * @return default_web_routers
     */
    public String getDefaultWebRouters() {
        return defaultWebRouters;
    }

    /**
     * @param defaultWebRouters
     */
    public void setDefaultWebRouters(String defaultWebRouters) {
        this.defaultWebRouters = defaultWebRouters;
    }
}