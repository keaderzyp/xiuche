package com.oojunzi.app.web.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 用户模型
 * 
 * @author michael
 * @since 2016年7月5日 下午12:07:20
 **/
public class User {
    private Long id;

    private String username;

    private String password;

    private String state;

    private Date createTime;


    /**
     * null
     */
    private String petName;

    /**
     * null
     */
    private String realName;

    /**
     * null
     */
    private String sex;

    /**
     * null
     */
    private String telphone;

    /**
     * null
     */
    private String hasCircle;

    /**
     * null
     */
    private BigDecimal helpCount;

    /**
     * null
     */
    private String remark;

    /**
     * null
     */
    private String driveYear;

    /**
     * null
     */
    private String idNumber;

    /**
     * null
     */
    private String wechatNumber;

    /**
     * null
     */
    private String userIco;

    /**
     * null
     */
    private String address;

    /**
     * null
     */
    private String email;

    /**
     * null
     */
    private BigDecimal groupFid;

    /**
     * null
     */
    private BigDecimal levelFid;

    /**
     * null
     */
    private BigDecimal markNumber;

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
    
    public User() {

    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    

    /**
     * null
     * @return PET_NAME null
     */
    public String getPetName() {
        return petName;
    }

    /**
     * null
     * @param petName null
     */
    public void setPetName(String petName) {
        this.petName = petName == null ? null : petName.trim();
    }

    /**
     * null
     * @return REAL_NAME null
     */
    public String getRealName() {
        return realName;
    }

    /**
     * null
     * @param realName null
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * null
     * @return SEX null
     */
    public String getSex() {
        return sex;
    }

    /**
     * null
     * @param sex null
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * null
     * @return TELPHONE null
     */
    public String getTelphone() {
        return telphone;
    }

    /**
     * null
     * @param telphone null
     */
    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    /**
     * null
     * @return HAS_CIRCLE null
     */
    public String getHasCircle() {
        return hasCircle;
    }

    /**
     * null
     * @param hasCircle null
     */
    public void setHasCircle(String hasCircle) {
        this.hasCircle = hasCircle == null ? null : hasCircle.trim();
    }

    /**
     * null
     * @return HELP_COUNT null
     */
    public BigDecimal getHelpCount() {
        return helpCount;
    }

    /**
     * null
     * @param helpCount null
     */
    public void setHelpCount(BigDecimal helpCount) {
        this.helpCount = helpCount;
    }

    /**
     * null
     * @return REMARK null
     */
    public String getRemark() {
        return remark;
    }

    /**
     * null
     * @param remark null
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * null
     * @return DRIVE_YEAR null
     */
    public String getDriveYear() {
        return driveYear;
    }

    /**
     * null
     * @param driveYear null
     */
    public void setDriveYear(String driveYear) {
        this.driveYear = driveYear == null ? null : driveYear.trim();
    }

    /**
     * null
     * @return ID_NUMBER null
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * null
     * @param idNumber null
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    /**
     * null
     * @return WECHAT_NUMBER null
     */
    public String getWechatNumber() {
        return wechatNumber;
    }

    /**
     * null
     * @param wechatNumber null
     */
    public void setWechatNumber(String wechatNumber) {
        this.wechatNumber = wechatNumber == null ? null : wechatNumber.trim();
    }

    /**
     * null
     * @return USER_ICO null
     */
    public String getUserIco() {
        return userIco;
    }

    /**
     * null
     * @param userIco null
     */
    public void setUserIco(String userIco) {
        this.userIco = userIco == null ? null : userIco.trim();
    }

    /**
     * null
     * @return ADDRESS null
     */
    public String getAddress() {
        return address;
    }

    /**
     * null
     * @param address null
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * null
     * @return EMAIL null
     */
    public String getEmail() {
        return email;
    }

    /**
     * null
     * @param email null
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * null
     * @return GROUP_FID null
     */
    public BigDecimal getGroupFid() {
        return groupFid;
    }

    /**
     * null
     * @param groupFid null
     */
    public void setGroupFid(BigDecimal groupFid) {
        this.groupFid = groupFid;
    }

    /**
     * null
     * @return LEVEL_FID null
     */
    public BigDecimal getLevelFid() {
        return levelFid;
    }

    /**
     * null
     * @param levelFid null
     */
    public void setLevelFid(BigDecimal levelFid) {
        this.levelFid = levelFid;
    }

    /**
     * null
     * @return MARK_NUMBER null
     */
    public BigDecimal getMarkNumber() {
        return markNumber;
    }

    /**
     * null
     * @param markNumber null
     */
    public void setMarkNumber(BigDecimal markNumber) {
        this.markNumber = markNumber;
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

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", state=" + state
				+ ", createTime=" + createTime + ", petName=" + petName + ", realName=" + realName + ", sex=" + sex
				+ ", telphone=" + telphone + ", hasCircle=" + hasCircle + ", helpCount=" + helpCount + ", remark="
				+ remark + ", driveYear=" + driveYear + ", idNumber=" + idNumber + ", wechatNumber=" + wechatNumber
				+ ", userIco=" + userIco + ", address=" + address + ", email=" + email + ", groupFid=" + groupFid
				+ ", levelFid=" + levelFid + ", markNumber=" + markNumber + ", param1=" + param1 + ", param2=" + param2
				+ ", param3=" + param3 + ", param4=" + param4 + ", param5=" + param5 + ", param6=" + param6
				+ ", param7=" + param7 + ", param8=" + param8 + ", param9=" + param9 + ", param10=" + param10 + "]";
	}

/*    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", password=" + password + ", state=" + state + ", createTime=" + createTime + "]";
    }*/
    
}