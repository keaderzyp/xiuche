package com.oojunzi.app.web.model;

import java.math.BigDecimal;
import java.util.Date;

public class CircleInfo {
	/**
	 * 小圈id（主键）
	 */
	private BigDecimal circleId;

	/**
	 * 圈名
	 */
	private String circleName;

	/**
	 * 人数上限
	 */
	private BigDecimal maxNumber;

	/**
	 * 状态 ：1 正常 0 已删除
	 */
	private String status;

	/**
	 * null
	 */
	private Date creatTime;

	/**
	 * 创建人id(T_USER_INFO 外键）
	 */
	private BigDecimal userFid;

	/**
	 * 描述
	 */
	private String circleDesc;

	/**
	 * 累计求助次数
	 */
	private BigDecimal helpCount;

	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 头像
	 */
	private String circleIco;

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
	 * 分摊上限 以下字段为我的圈数据展示添加
	 */
	private BigDecimal partakeMax; // 分摊上限
	private Date nearly_time; // 最近互助时间
	private String driver_year; // 平均驾龄
	private String avg_price; // 平均车价
	private String all_count; // 圈内总车数
	private String help_count; // 互助生效车数

	public Date getNearly_time() {
		return nearly_time;
	}

	public void setNearly_time(Date nearly_time) {
		this.nearly_time = nearly_time;
	}

	public String getDriver_year() {
		return driver_year;
	}

	public void setDriver_year(String driver_year) {
		this.driver_year = driver_year;
	}

	public String getAvg_price() {
		return avg_price;
	}

	public void setAvg_price(String avg_price) {
		this.avg_price = avg_price;
	}

	public String getAll_count() {
		return all_count;
	}

	public void setAll_count(String all_count) {
		this.all_count = all_count;
	}

	public String getHelp_count() {
		return help_count;
	}

	public void setHelp_count(String help_count) {
		this.help_count = help_count;
	}

	/**
	 * 小圈id（主键）
	 * 
	 * @return CIRCLE_ID 小圈id（主键）
	 */
	public BigDecimal getCircleId() {
		return circleId;
	}

	/**
	 * 小圈id（主键）
	 * 
	 * @param circleId
	 *            小圈id（主键）
	 */
	public void setCircleId(BigDecimal circleId) {
		this.circleId = circleId;
	}

	/**
	 * 圈名
	 * 
	 * @return CIRCLE_NAME 圈名
	 */
	public String getCircleName() {
		return circleName;
	}

	/**
	 * 圈名
	 * 
	 * @param circleName
	 *            圈名
	 */
	public void setCircleName(String circleName) {
		this.circleName = circleName == null ? null : circleName.trim();
	}

	/**
	 * 人数上限
	 * 
	 * @return MAX_NUMBER 人数上限
	 */
	public BigDecimal getMaxNumber() {
		return maxNumber;
	}

	/**
	 * 人数上限
	 * 
	 * @param maxNumber
	 *            人数上限
	 */
	public void setMaxNumber(BigDecimal maxNumber) {
		this.maxNumber = maxNumber;
	}

	/**
	 * 状态 ：1 正常 0 已删除
	 * 
	 * @return STATUS 状态 ：1 正常 0 已删除
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * 状态 ：1 正常 0 已删除
	 * 
	 * @param status
	 *            状态 ：1 正常 0 已删除
	 */
	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	/**
	 * null
	 * 
	 * @return CREAT_TIME null
	 */
	public Date getCreatTime() {
		return creatTime;
	}

	/**
	 * null
	 * 
	 * @param creatTime
	 *            null
	 */
	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}

	/**
	 * 创建人id(T_USER_INFO 外键）
	 * 
	 * @return USER_FID 创建人id(T_USER_INFO 外键）
	 */
	public BigDecimal getUserFid() {
		return userFid;
	}

	/**
	 * 创建人id(T_USER_INFO 外键）
	 * 
	 * @param userFid
	 *            创建人id(T_USER_INFO 外键）
	 */
	public void setUserFid(BigDecimal userFid) {
		this.userFid = userFid;
	}

	/**
	 * 描述
	 * 
	 * @return CIRCLE_DESC 描述
	 */
	public String getCircleDesc() {
		return circleDesc;
	}

	/**
	 * 描述
	 * 
	 * @param circleDesc
	 *            描述
	 */
	public void setCircleDesc(String circleDesc) {
		this.circleDesc = circleDesc == null ? null : circleDesc.trim();
	}

	/**
	 * 累计求助次数
	 * 
	 * @return HELP_COUNT 累计求助次数
	 */
	public BigDecimal getHelpCount() {
		return helpCount;
	}

	/**
	 * 累计求助次数
	 * 
	 * @param helpCount
	 *            累计求助次数
	 */
	public void setHelpCount(BigDecimal helpCount) {
		this.helpCount = helpCount;
	}

	/**
	 * 备注
	 * 
	 * @return REMARK 备注
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * 备注
	 * 
	 * @param remark
	 *            备注
	 */
	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}

	/**
	 * 头像
	 * 
	 * @return CIRCLE_ICO 头像
	 */
	public String getCircleIco() {
		return circleIco;
	}

	/**
	 * 头像
	 * 
	 * @param circleIco
	 *            头像
	 */
	public void setCircleIco(String circleIco) {
		this.circleIco = circleIco == null ? null : circleIco.trim();
	}

	/**
	 * null
	 * 
	 * @return PARAM1 null
	 */
	public String getParam1() {
		return param1;
	}

	/**
	 * null
	 * 
	 * @param param1
	 *            null
	 */
	public void setParam1(String param1) {
		this.param1 = param1 == null ? null : param1.trim();
	}

	/**
	 * null
	 * 
	 * @return PARAM2 null
	 */
	public String getParam2() {
		return param2;
	}

	/**
	 * null
	 * 
	 * @param param2
	 *            null
	 */
	public void setParam2(String param2) {
		this.param2 = param2 == null ? null : param2.trim();
	}

	/**
	 * null
	 * 
	 * @return PARAM3 null
	 */
	public String getParam3() {
		return param3;
	}

	/**
	 * null
	 * 
	 * @param param3
	 *            null
	 */
	public void setParam3(String param3) {
		this.param3 = param3 == null ? null : param3.trim();
	}

	/**
	 * null
	 * 
	 * @return PARAM4 null
	 */
	public String getParam4() {
		return param4;
	}

	/**
	 * null
	 * 
	 * @param param4
	 *            null
	 */
	public void setParam4(String param4) {
		this.param4 = param4 == null ? null : param4.trim();
	}

	/**
	 * null
	 * 
	 * @return PARAM5 null
	 */
	public String getParam5() {
		return param5;
	}

	/**
	 * null
	 * 
	 * @param param5
	 *            null
	 */
	public void setParam5(String param5) {
		this.param5 = param5 == null ? null : param5.trim();
	}

	/**
	 * null
	 * 
	 * @return PARAM6 null
	 */
	public String getParam6() {
		return param6;
	}

	/**
	 * null
	 * 
	 * @param param6
	 *            null
	 */
	public void setParam6(String param6) {
		this.param6 = param6 == null ? null : param6.trim();
	}

	/**
	 * null
	 * 
	 * @return PARAM7 null
	 */
	public String getParam7() {
		return param7;
	}

	/**
	 * null
	 * 
	 * @param param7
	 *            null
	 */
	public void setParam7(String param7) {
		this.param7 = param7 == null ? null : param7.trim();
	}

	/**
	 * null
	 * 
	 * @return PARAM8 null
	 */
	public String getParam8() {
		return param8;
	}

	/**
	 * null
	 * 
	 * @param param8
	 *            null
	 */
	public void setParam8(String param8) {
		this.param8 = param8 == null ? null : param8.trim();
	}

	/**
	 * null
	 * 
	 * @return PARAM9 null
	 */
	public String getParam9() {
		return param9;
	}

	/**
	 * null
	 * 
	 * @param param9
	 *            null
	 */
	public void setParam9(String param9) {
		this.param9 = param9 == null ? null : param9.trim();
	}

	/**
	 * null
	 * 
	 * @return PARAM10 null
	 */
	public String getParam10() {
		return param10;
	}

	/**
	 * null
	 * 
	 * @param param10
	 *            null
	 */
	public void setParam10(String param10) {
		this.param10 = param10 == null ? null : param10.trim();
	}

	/**
	 * 分摊上限
	 * 
	 * @return PARTAKE_MAX 分摊上限
	 */
	public BigDecimal getPartakeMax() {
		return partakeMax;
	}

	/**
	 * 分摊上限
	 * 
	 * @param partakeMax
	 *            分摊上限
	 */
	public void setPartakeMax(BigDecimal partakeMax) {
		this.partakeMax = partakeMax;
	}
}