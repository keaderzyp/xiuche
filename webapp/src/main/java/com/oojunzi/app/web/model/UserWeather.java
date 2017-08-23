package com.oojunzi.app.web.model;

import java.math.BigDecimal;

public class UserWeather {
    /**
     * 主键
     */
    private BigDecimal id;

    /**
     * 是否成功
     */
    private String succFlag;

    /**
     * 城市名
     */
    private String city;

    /**
     * 城市编码（备用）
     */
    private String cityCode;

    /**
     * 城市序号（备用）
     */
    private String cityId;

    /**
     * 预报时间
     */
    private String happydate;

    /**
     * 天气
     */
    private String weather;

    /**
     * 温度
     */
    private String temp;

    /**
     * 最高气温（备用）
     */
    private String temphigh;

    /**
     * 最低气温（备用）
     */
    private String templow;

    /**
     * 24小时PM2.5
     */
    private String pm2p5day;

    /**
     * PM2.5
     */
    private String pm2p5;

    /**
     * 心情
     */
    private String affect;

    /**
     * 图片
     */
    private String weatImg;

    /**
     * 状态（备用）
     */
    private String status;

    /**
     * 备注（备用）
     */
    private String remark;

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
    private BigDecimal param5;

    /**
     * 主键
     * @return ID 主键
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * 是否成功
     * @return SUCC_FLAG 是否成功
     */
    public String getSuccFlag() {
        return succFlag;
    }

    /**
     * 是否成功
     * @param succFlag 是否成功
     */
    public void setSuccFlag(String succFlag) {
        this.succFlag = succFlag == null ? null : succFlag.trim();
    }

    /**
     * 城市名
     * @return CITY 城市名
     */
    public String getCity() {
        return city;
    }

    /**
     * 城市名
     * @param city 城市名
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 城市编码（备用）
     * @return CITY_CODE 城市编码（备用）
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * 城市编码（备用）
     * @param cityCode 城市编码（备用）
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    /**
     * 城市序号（备用）
     * @return CITY_ID 城市序号（备用）
     */
    public String getCityId() {
        return cityId;
    }

    /**
     * 城市序号（备用）
     * @param cityId 城市序号（备用）
     */
    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }

    /**
     * 预报时间
     * @return HAPPYDATE 预报时间
     */
    public String getHappydate() {
        return happydate;
    }

    /**
     * 预报时间
     * @param happydate 预报时间
     */
    public void setHappydate(String happydate) {
        this.happydate = happydate == null ? null : happydate.trim();
    }

    /**
     * 天气
     * @return WEATHER 天气
     */
    public String getWeather() {
        return weather;
    }

    /**
     * 天气
     * @param weather 天气
     */
    public void setWeather(String weather) {
        this.weather = weather == null ? null : weather.trim();
    }

    /**
     * 温度
     * @return TEMP 温度
     */
    public String getTemp() {
        return temp;
    }

    /**
     * 温度
     * @param temp 温度
     */
    public void setTemp(String temp) {
        this.temp = temp == null ? null : temp.trim();
    }

    /**
     * 最高气温（备用）
     * @return TEMPHIGH 最高气温（备用）
     */
    public String getTemphigh() {
        return temphigh;
    }

    /**
     * 最高气温（备用）
     * @param temphigh 最高气温（备用）
     */
    public void setTemphigh(String temphigh) {
        this.temphigh = temphigh == null ? null : temphigh.trim();
    }

    /**
     * 最低气温（备用）
     * @return TEMPLOW 最低气温（备用）
     */
    public String getTemplow() {
        return templow;
    }

    /**
     * 最低气温（备用）
     * @param templow 最低气温（备用）
     */
    public void setTemplow(String templow) {
        this.templow = templow == null ? null : templow.trim();
    }

    /**
     * 24小时PM2.5
     * @return PM2P5DAY 24小时PM2.5
     */
    public String getPm2p5day() {
        return pm2p5day;
    }

    /**
     * 24小时PM2.5
     * @param pm2p5day 24小时PM2.5
     */
    public void setPm2p5day(String pm2p5day) {
        this.pm2p5day = pm2p5day == null ? null : pm2p5day.trim();
    }

    /**
     * PM2.5
     * @return PM2P5 PM2.5
     */
    public String getPm2p5() {
        return pm2p5;
    }

    /**
     * PM2.5
     * @param pm2p5 PM2.5
     */
    public void setPm2p5(String pm2p5) {
        this.pm2p5 = pm2p5 == null ? null : pm2p5.trim();
    }

    /**
     * 心情
     * @return AFFECT 心情
     */
    public String getAffect() {
        return affect;
    }

    /**
     * 心情
     * @param affect 心情
     */
    public void setAffect(String affect) {
        this.affect = affect == null ? null : affect.trim();
    }

    /**
     * 图片
     * @return WEAT_IMG 图片
     */
    public String getWeatImg() {
        return weatImg;
    }

    /**
     * 图片
     * @param weatImg 图片
     */
    public void setWeatImg(String weatImg) {
        this.weatImg = weatImg == null ? null : weatImg.trim();
    }

    /**
     * 状态（备用）
     * @return STATUS 状态（备用）
     */
    public String getStatus() {
        return status;
    }

    /**
     * 状态（备用）
     * @param status 状态（备用）
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 备注（备用）
     * @return REMARK 备注（备用）
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注（备用）
     * @param remark 备注（备用）
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
    public BigDecimal getParam5() {
        return param5;
    }

    /**
     * null
     * @param param5 null
     */
    public void setParam5(BigDecimal param5) {
        this.param5 = param5;
    }
}