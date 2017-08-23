package com.oojunzi.app.web.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class HelpInfo {
    /**
     * 求助记录ID（主键）
     */
    private BigDecimal helpId;

    /**
     * 是否出险
     */
    private String isSpot;

    /**
     * 地区1
     */
    private String area1;

    /**
     * 地区2
     */
    private String area2;

    /**
     * 地区3
     */
    private String area3;

    /**
     * 状态：1 发起求助  2：求助已解决 
     */
    private String status;

    /**
     * 实际总费用
     */
    private BigDecimal factCost;

    /**
     * 预计费用
     */
    private BigDecimal guessFee;

    /**
     * 车主承担费用
     */
    private BigDecimal ownerPay;

    /**
     * 小圈友承担费用
     */
    private BigDecimal circlePay;

    /**
     * 圈友承担费用
     */
    private BigDecimal ooPay;

    /**
     * 求助时间
     */
/*    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date helpTime;*/

    private String helpTime;
    /**
     * 事故时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date happenTime;
    //private String happenTime;
    /**
     * 求助用户名
     */
    private String helpUser;

    /**
     * 辅助客服id
     */
    private BigDecimal servicer2Fid;

    /**
     * 备用客服id
     */
    private BigDecimal servicer3Fid;

    /**
     * null
     */
    private String remark;

    /**
     * 已付费用
     */
    private BigDecimal havePay;

    /**
     * 车辆id
     */
    private BigDecimal carFid;

    /**
     * 主要客服id（外键）
     */
    private BigDecimal servicerFid;

    /**
     * 事故详细位置
     */
    private String happenPosition;

    /**
     * 预计费用
     */
    private String guessCost;

    /**
     * 用户id
     */
    private String param1;

    /**
     * 情况说明
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
     * add yuhb:存放求助照片
     */
    private String imgs;

    
    public String getImgs() {
		return imgs;
	}

	public void setImgs(String imgs) {
		this.imgs = imgs;
	}

	/**
     * 求助记录ID（主键）
     * @return HELP_ID 求助记录ID（主键）
     */
    public BigDecimal getHelpId() {
        return helpId;
    }

    /**
     * 求助记录ID（主键）
     * @param helpId 求助记录ID（主键）
     */
    public void setHelpId(BigDecimal helpId) {
        this.helpId = helpId;
    }

    /**
     * 是否出险
     * @return IS_SPOT 是否出险
     */
    public String getIsSpot() {
        return isSpot;
    }

    /**
     * 是否出险
     * @param isSpot 是否出险
     */
    public void setIsSpot(String isSpot) {
        this.isSpot = isSpot == null ? null : isSpot.trim();
    }

    /**
     * 地区1
     * @return AREA1 地区1
     */
    public String getArea1() {
        return area1;
    }

    /**
     * 地区1
     * @param area1 地区1
     */
    public void setArea1(String area1) {
        this.area1 = area1 == null ? null : area1.trim();
    }

    /**
     * 地区2
     * @return AREA2 地区2
     */
    public String getArea2() {
        return area2;
    }

    /**
     * 地区2
     * @param area2 地区2
     */
    public void setArea2(String area2) {
        this.area2 = area2 == null ? null : area2.trim();
    }

    /**
     * 地区3
     * @return AREA3 地区3
     */
    public String getArea3() {
        return area3;
    }

    /**
     * 地区3
     * @param area3 地区3
     */
    public void setArea3(String area3) {
        this.area3 = area3 == null ? null : area3.trim();
    }

    /**
     * 状态：1 发起求助  2：求助已解决 
     * @return STATUS 状态：1 发起求助  2：求助已解决 
     */
    public String getStatus() {
        return status;
    }

    /**
     * 状态：1 发起求助  2：求助已解决 
     * @param status 状态：1 发起求助  2：求助已解决 
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 实际总费用
     * @return FACT_COST 实际总费用
     */
    public BigDecimal getFactCost() {
        return factCost;
    }

    /**
     * 实际总费用
     * @param factCost 实际总费用
     */
    public void setFactCost(BigDecimal factCost) {
        this.factCost = factCost;
    }

    /**
     * 预计费用
     * @return GUESS_FEE 预计费用
     */
    public BigDecimal getGuessFee() {
        return guessFee;
    }

    /**
     * 预计费用
     * @param guessFee 预计费用
     */
    public void setGuessFee(BigDecimal guessFee) {
        this.guessFee = guessFee;
    }

    /**
     * 车主承担费用
     * @return OWNER_PAY 车主承担费用
     */
    public BigDecimal getOwnerPay() {
        return ownerPay;
    }

    /**
     * 车主承担费用
     * @param ownerPay 车主承担费用
     */
    public void setOwnerPay(BigDecimal ownerPay) {
        this.ownerPay = ownerPay;
    }

    /**
     * 小圈友承担费用
     * @return CIRCLE_PAY 小圈友承担费用
     */
    public BigDecimal getCirclePay() {
        return circlePay;
    }

    /**
     * 小圈友承担费用
     * @param circlePay 小圈友承担费用
     */
    public void setCirclePay(BigDecimal circlePay) {
        this.circlePay = circlePay;
    }

    /**
     * 圈友承担费用
     * @return OO_PAY 圈友承担费用
     */
    public BigDecimal getOoPay() {
        return ooPay;
    }

    /**
     * 圈友承担费用
     * @param ooPay 圈友承担费用
     */
    public void setOoPay(BigDecimal ooPay) {
        this.ooPay = ooPay;
    }

/*    *//**
     * 求助时间
     * @return HELP_TIME 求助时间
     *//*
    public Date getHelpTime() {
        return helpTime;
    }

    *//**
     * 求助时间
     * @param helpTime 求助时间
     *//*
    public void setHelpTime(Date helpTime) {
        this.helpTime = helpTime;
    }

    *//**
     * 事故时间
     * @return HAPPEN_TIME 事故时间
     *//*
    public Date getHappenTime() {
        return happenTime;
    }

    *//**
     * 事故时间
     * @param happenTime 事故时间
     *//*
    public void setHappenTime(Date happenTime) {
        this.happenTime = happenTime;
    }*/

    /**
     * 求助用户名
     * @return HELP_USER 求助用户名
     */
    public String getHelpUser() {
        return helpUser;
    }

    public String getHelpTime() {
		return helpTime;
	}

	public void setHelpTime(String helpTime) {
		this.helpTime = helpTime;
	}

	

	public Date getHappenTime() {
		return happenTime;
	}

	public void setHappenTime(Date happenTime) {
		this.happenTime = happenTime;
	}

	/**
     * 求助用户名
     * @param helpUser 求助用户名
     */
    public void setHelpUser(String helpUser) {
        this.helpUser = helpUser == null ? null : helpUser.trim();
    }

    /**
     * 辅助客服id
     * @return SERVICER2_FID 辅助客服id
     */
    public BigDecimal getServicer2Fid() {
        return servicer2Fid;
    }

    /**
     * 辅助客服id
     * @param servicer2Fid 辅助客服id
     */
    public void setServicer2Fid(BigDecimal servicer2Fid) {
        this.servicer2Fid = servicer2Fid;
    }

    /**
     * 备用客服id
     * @return SERVICER3_FID 备用客服id
     */
    public BigDecimal getServicer3Fid() {
        return servicer3Fid;
    }

    /**
     * 备用客服id
     * @param servicer3Fid 备用客服id
     */
    public void setServicer3Fid(BigDecimal servicer3Fid) {
        this.servicer3Fid = servicer3Fid;
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
     * 已付费用
     * @return HAVE_PAY 已付费用
     */
    public BigDecimal getHavePay() {
        return havePay;
    }

    /**
     * 已付费用
     * @param havePay 已付费用
     */
    public void setHavePay(BigDecimal havePay) {
        this.havePay = havePay;
    }

    /**
     * 车辆id
     * @return CAR_FID 车辆id
     */
    public BigDecimal getCarFid() {
        return carFid;
    }

    /**
     * 车辆id
     * @param carFid 车辆id
     */
    public void setCarFid(BigDecimal carFid) {
        this.carFid = carFid;
    }

    /**
     * 主要客服id（外键）
     * @return SERVICER_FID 主要客服id（外键）
     */
    public BigDecimal getServicerFid() {
        return servicerFid;
    }

    /**
     * 主要客服id（外键）
     * @param servicerFid 主要客服id（外键）
     */
    public void setServicerFid(BigDecimal servicerFid) {
        this.servicerFid = servicerFid;
    }

    /**
     * 事故详细位置
     * @return HAPPEN_POSITION 事故详细位置
     */
    public String getHappenPosition() {
        return happenPosition;
    }

    /**
     * 事故详细位置
     * @param happenPosition 事故详细位置
     */
    public void setHappenPosition(String happenPosition) {
        this.happenPosition = happenPosition == null ? null : happenPosition.trim();
    }

    /**
     * 预计费用
     * @return GUESS_COST 预计费用
     */
    public String getGuessCost() {
        return guessCost;
    }

    /**
     * 预计费用
     * @param guessCost 预计费用
     */
    public void setGuessCost(String guessCost) {
        this.guessCost = guessCost == null ? null : guessCost.trim();
    }

    /**
     * 用户id
     * @return PARAM1 用户id
     */
    public String getParam1() {
        return param1;
    }

    /**
     * 用户id
     * @param param1 用户id
     */
    public void setParam1(String param1) {
        this.param1 = param1 == null ? null : param1.trim();
    }

    /**
     * 情况说明
     * @return PARAM2 情况说明
     */
    public String getParam2() {
        return param2;
    }

    /**
     * 情况说明
     * @param param2 情况说明
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
    
    /*
     * lgq  add
     * 出险
     * */
    private HelpSpot helpSpot;
	public HelpSpot getHelpSpot() {
		return helpSpot;
	}

	public void setHelpSpot(HelpSpot helpSpot) {
		this.helpSpot = helpSpot;
	}
	  /*
     * lgq  add
     * 车辆信息
     * */

    private List<CarInfo> carInfo;


	public List<CarInfo> getCarInfo() {
		return carInfo;
	}

	public void setCarInfo(List<CarInfo> carInfo) {
		this.carInfo = carInfo;
	}


    
}