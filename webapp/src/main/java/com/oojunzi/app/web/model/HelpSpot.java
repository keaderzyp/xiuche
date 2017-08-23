package com.oojunzi.app.web.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class HelpSpot {
    /**
     * 出险id
     */
    private BigDecimal spotId;

    /**
     * null
     */
    private String status;

    /**
     * 出险时间
     */
    private Date spotTime;

    /**
     * 辅助车管家id
     */
    private BigDecimal butler2Ftid;

    /**
     * 出险情况记录
     */
    private String spotRecord;

    /**
     * 现场证明人
     */
    private String reterence;

    /**
     * 证明人电话
     */
    private String reterenceTel;

    /**
     * 对方负责人
     */
    private String otherSide;

    /**
     * 对方电话
     */
    private String otherSideTel;

    /**
     * 责任情况（用户责任与对方责任占比）
     */
    private String dutyPrecent;

    /**
     * 备用车管家id
     */
    private BigDecimal butler3Ftid;

    /**
     * null
     */
    private String remark;

    /**
     * 车管家id（外键）
     */
    private BigDecimal butlerFid;

    /**
     * 求助id（外键）
     */
    private BigDecimal helpFid;

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
     * By Lgq
     * */
    private List<HelpSpotimg> helpSpotimg;
    

    /**
     * 出险id
     * @return SPOT_ID 出险id
     */
    public BigDecimal getSpotId() {
        return spotId;
    }

    /**
     * 出险id
     * @param spotId 出险id
     */
    public void setSpotId(BigDecimal spotId) {
        this.spotId = spotId;
    }

    /**
     * null
     * @return STATUS null
     */
    public String getStatus() {
        return status;
    }

    /**
     * null
     * @param status null
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 出险时间
     * @return SPOT_TIME 出险时间
     */
    public Date getSpotTime() {
        return spotTime;
    }

    /**
     * 出险时间
     * @param spotTime 出险时间
     */
    public void setSpotTime(Date spotTime) {
        this.spotTime = spotTime;
    }

    /**
     * 辅助车管家id
     * @return BUTLER2_FTID 辅助车管家id
     */
    public BigDecimal getButler2Ftid() {
        return butler2Ftid;
    }

    /**
     * 辅助车管家id
     * @param butler2Ftid 辅助车管家id
     */
    public void setButler2Ftid(BigDecimal butler2Ftid) {
        this.butler2Ftid = butler2Ftid;
    }

    /**
     * 出险情况记录
     * @return SPOT_RECORD 出险情况记录
     */
    public String getSpotRecord() {
        return spotRecord;
    }

    /**
     * 出险情况记录
     * @param spotRecord 出险情况记录
     */
    public void setSpotRecord(String spotRecord) {
        this.spotRecord = spotRecord == null ? null : spotRecord.trim();
    }

    /**
     * 现场证明人
     * @return RETERENCE 现场证明人
     */
    public String getReterence() {
        return reterence;
    }

    /**
     * 现场证明人
     * @param reterence 现场证明人
     */
    public void setReterence(String reterence) {
        this.reterence = reterence == null ? null : reterence.trim();
    }

    /**
     * 证明人电话
     * @return RETERENCE_TEL 证明人电话
     */
    public String getReterenceTel() {
        return reterenceTel;
    }

    /**
     * 证明人电话
     * @param reterenceTel 证明人电话
     */
    public void setReterenceTel(String reterenceTel) {
        this.reterenceTel = reterenceTel == null ? null : reterenceTel.trim();
    }

    /**
     * 对方负责人
     * @return OTHER_SIDE 对方负责人
     */
    public String getOtherSide() {
        return otherSide;
    }

    /**
     * 对方负责人
     * @param otherSide 对方负责人
     */
    public void setOtherSide(String otherSide) {
        this.otherSide = otherSide == null ? null : otherSide.trim();
    }

    /**
     * 对方电话
     * @return OTHER_SIDE_TEL 对方电话
     */
    public String getOtherSideTel() {
        return otherSideTel;
    }

    /**
     * 对方电话
     * @param otherSideTel 对方电话
     */
    public void setOtherSideTel(String otherSideTel) {
        this.otherSideTel = otherSideTel == null ? null : otherSideTel.trim();
    }

    /**
     * 责任情况（用户责任与对方责任占比）
     * @return DUTY_PRECENT 责任情况（用户责任与对方责任占比）
     */
    public String getDutyPrecent() {
        return dutyPrecent;
    }

    /**
     * 责任情况（用户责任与对方责任占比）
     * @param dutyPrecent 责任情况（用户责任与对方责任占比）
     */
    public void setDutyPrecent(String dutyPrecent) {
        this.dutyPrecent = dutyPrecent == null ? null : dutyPrecent.trim();
    }

    /**
     * 备用车管家id
     * @return BUTLER3_FTID 备用车管家id
     */
    public BigDecimal getButler3Ftid() {
        return butler3Ftid;
    }

    /**
     * 备用车管家id
     * @param butler3Ftid 备用车管家id
     */
    public void setButler3Ftid(BigDecimal butler3Ftid) {
        this.butler3Ftid = butler3Ftid;
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
     * 车管家id（外键）
     * @return BUTLER_FID 车管家id（外键）
     */
    public BigDecimal getButlerFid() {
        return butlerFid;
    }

    /**
     * 车管家id（外键）
     * @param butlerFid 车管家id（外键）
     */
    public void setButlerFid(BigDecimal butlerFid) {
        this.butlerFid = butlerFid;
    }

    /**
     * 求助id（外键）
     * @return HELP_FID 求助id（外键）
     */
    public BigDecimal getHelpFid() {
        return helpFid;
    }

    /**
     * 求助id（外键）
     * @param helpFid 求助id（外键）
     */
    public void setHelpFid(BigDecimal helpFid) {
        this.helpFid = helpFid;
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

	public List<HelpSpotimg> getHelpSpotimg() {
		return helpSpotimg;
	}

	public void setHelpSpotimg(List<HelpSpotimg> helpSpotimg) {
		this.helpSpotimg = helpSpotimg;
	}
    
    
}