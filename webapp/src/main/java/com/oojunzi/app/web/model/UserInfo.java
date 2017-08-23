package com.oojunzi.app.web.model;

import java.math.BigDecimal;

public class UserInfo {
    /**
     * 用户id（主键）
     */
    private BigDecimal userId;

    /**
     * 用户状态 1：已注册  2：已添加爱车  3：已经签订互助协议 0：未注册
     */
    private String status;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 昵称
     */
    private String petName;

    /**
     * 性别
     */
    private String sex;

    /**
     * 电话
     */
    private String telphone;

    /**
     * 是否有小圈
     */
    private String hasCircle;

    /**
     * 求助次数
     */
    private BigDecimal helpCount;

    /**
     * 备注
     */
    private String remark;

    /**
     * 年龄
     */
    private BigDecimal age;

    /**
     * 驾龄
     */
    private BigDecimal driveYear;

    /**
     * 身份证号
     */
    private String idNumber;

    /**
     * 微信号
     */
    private String wechatNumber;

    /**
     * 用户登录表ID
     */
    private BigDecimal syuserFid;

    /**
     * 用户评分
     */
    private BigDecimal markNumber;

    /**
     * 头像
     */
    private String userIco;

    /**
     * 地址
     */
    private String address;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 分组id(外键)
     */
    private BigDecimal groupFid;

    /**
     * 级别id(外键)
     */
    private BigDecimal levelFid;

    /**
     * null
     */
    private String param1;

    /**
     * null
     */
    private String param2;

    /**
     * null
     */
    private String param3;

    /**
     * null
     */
    private String param4;

    /**
     * null
     */
    private String param5;

    /**
     * null
     */
    private String param6;

    /**
     * null
     */
    private String param7;

    /**
     * null
     */
    private String param8;

    /**
     * null
     */
    private String param9;

    /**
     * null
     */
    private String param10;

    /**
     * 用户id（主键）
     * @return USER_ID 用户id（主键）
     */
    public BigDecimal getUserId() {
        return userId;
    }

    /**
     * 用户id（主键）
     * @param userId 用户id（主键）
     */
    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    /**
     * 用户状态 1：已注册  2：已添加爱车  3：已经签订互助协议 0：未注册
     * @return STATUS 用户状态 1：已注册  2：已添加爱车  3：已经签订互助协议 0：未注册
     */
    public String getStatus() {
        return status;
    }

    /**
     * 用户状态 1：已注册  2：已添加爱车  3：已经签订互助协议 0：未注册
     * @param status 用户状态 1：已注册  2：已添加爱车  3：已经签订互助协议 0：未注册
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 用户名
     * @return USER_NAME 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户名
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 昵称
     * @return PET_NAME 昵称
     */
    public String getPetName() {
        return petName;
    }

    /**
     * 昵称
     * @param petName 昵称
     */
    public void setPetName(String petName) {
        this.petName = petName == null ? null : petName.trim();
    }

    /**
     * 性别
     * @return SEX 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 性别
     * @param sex 性别
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * 电话
     * @return TELPHONE 电话
     */
    public String getTelphone() {
        return telphone;
    }

    /**
     * 电话
     * @param telphone 电话
     */
    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    /**
     * 是否有小圈
     * @return HAS_CIRCLE 是否有小圈
     */
    public String getHasCircle() {
        return hasCircle;
    }

    /**
     * 是否有小圈
     * @param hasCircle 是否有小圈
     */
    public void setHasCircle(String hasCircle) {
        this.hasCircle = hasCircle == null ? null : hasCircle.trim();
    }

    /**
     * 求助次数
     * @return HELP_COUNT 求助次数
     */
    public BigDecimal getHelpCount() {
        return helpCount;
    }

    /**
     * 求助次数
     * @param helpCount 求助次数
     */
    public void setHelpCount(BigDecimal helpCount) {
        this.helpCount = helpCount;
    }

    /**
     * 备注
     * @return REMARK 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 年龄
     * @return AGE 年龄
     */
    public BigDecimal getAge() {
        return age;
    }

    /**
     * 年龄
     * @param age 年龄
     */
    public void setAge(BigDecimal age) {
        this.age = age;
    }

    /**
     * 驾龄
     * @return DRIVE_YEAR 驾龄
     */
    public BigDecimal getDriveYear() {
        return driveYear;
    }

    /**
     * 驾龄
     * @param driveYear 驾龄
     */
    public void setDriveYear(BigDecimal driveYear) {
        this.driveYear = driveYear;
    }

    /**
     * 身份证号
     * @return ID_NUMBER 身份证号
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * 身份证号
     * @param idNumber 身份证号
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    /**
     * 微信号
     * @return WECHAT_NUMBER 微信号
     */
    public String getWechatNumber() {
        return wechatNumber;
    }

    /**
     * 微信号
     * @param wechatNumber 微信号
     */
    public void setWechatNumber(String wechatNumber) {
        this.wechatNumber = wechatNumber == null ? null : wechatNumber.trim();
    }

    /**
     * 用户登录表ID
     * @return SYUSER_FID 用户登录表ID
     */
    public BigDecimal getSyuserFid() {
        return syuserFid;
    }

    /**
     * 用户登录表ID
     * @param syuserFid 用户登录表ID
     */
    public void setSyuserFid(BigDecimal syuserFid) {
        this.syuserFid = syuserFid;
    }

    /**
     * 用户评分
     * @return MARK_NUMBER 用户评分
     */
    public BigDecimal getMarkNumber() {
        return markNumber;
    }

    /**
     * 用户评分
     * @param markNumber 用户评分
     */
    public void setMarkNumber(BigDecimal markNumber) {
        this.markNumber = markNumber;
    }

    /**
     * 头像
     * @return USER_ICO 头像
     */
    public String getUserIco() {
        return userIco;
    }

    /**
     * 头像
     * @param userIco 头像
     */
    public void setUserIco(String userIco) {
        this.userIco = userIco == null ? null : userIco.trim();
    }

    /**
     * 地址
     * @return ADDRESS 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 地址
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 电子邮箱
     * @return EMAIL 电子邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 电子邮箱
     * @param email 电子邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 分组id(外键)
     * @return GROUP_FID 分组id(外键)
     */
    public BigDecimal getGroupFid() {
        return groupFid;
    }

    /**
     * 分组id(外键)
     * @param groupFid 分组id(外键)
     */
    public void setGroupFid(BigDecimal groupFid) {
        this.groupFid = groupFid;
    }

    /**
     * 级别id(外键)
     * @return LEVEL_FID 级别id(外键)
     */
    public BigDecimal getLevelFid() {
        return levelFid;
    }

    /**
     * 级别id(外键)
     * @param levelFid 级别id(外键)
     */
    public void setLevelFid(BigDecimal levelFid) {
        this.levelFid = levelFid;
    }

    /**
     * null
     * @return PARAM1 null
     */
    public String getParam1() {
        return param1;
    }

    /**
     * null
     * @param param1 null
     */
    public void setParam1(String param1) {
        this.param1 = param1 == null ? null : param1.trim();
    }

    /**
     * null
     * @return PARAM2 null
     */
    public String getParam2() {
        return param2;
    }

    /**
     * null
     * @param param2 null
     */
    public void setParam2(String param2) {
        this.param2 = param2 == null ? null : param2.trim();
    }

    /**
     * null
     * @return PARAM3 null
     */
    public String getParam3() {
        return param3;
    }

    /**
     * null
     * @param param3 null
     */
    public void setParam3(String param3) {
        this.param3 = param3 == null ? null : param3.trim();
    }

    /**
     * null
     * @return PARAM4 null
     */
    public String getParam4() {
        return param4;
    }

    /**
     * null
     * @param param4 null
     */
    public void setParam4(String param4) {
        this.param4 = param4 == null ? null : param4.trim();
    }

    /**
     * null
     * @return PARAM5 null
     */
    public String getParam5() {
        return param5;
    }

    /**
     * null
     * @param param5 null
     */
    public void setParam5(String param5) {
        this.param5 = param5 == null ? null : param5.trim();
    }

    /**
     * null
     * @return PARAM6 null
     */
    public String getParam6() {
        return param6;
    }

    /**
     * null
     * @param param6 null
     */
    public void setParam6(String param6) {
        this.param6 = param6 == null ? null : param6.trim();
    }

    /**
     * null
     * @return PARAM7 null
     */
    public String getParam7() {
        return param7;
    }

    /**
     * null
     * @param param7 null
     */
    public void setParam7(String param7) {
        this.param7 = param7 == null ? null : param7.trim();
    }

    /**
     * null
     * @return PARAM8 null
     */
    public String getParam8() {
        return param8;
    }

    /**
     * null
     * @param param8 null
     */
    public void setParam8(String param8) {
        this.param8 = param8 == null ? null : param8.trim();
    }

    /**
     * null
     * @return PARAM9 null
     */
    public String getParam9() {
        return param9;
    }

    /**
     * null
     * @param param9 null
     */
    public void setParam9(String param9) {
        this.param9 = param9 == null ? null : param9.trim();
    }

    /**
     * null
     * @return PARAM10 null
     */
    public String getParam10() {
        return param10;
    }

    /**
     * null
     * @param param10 null
     */
    public void setParam10(String param10) {
        this.param10 = param10 == null ? null : param10.trim();
    }
}