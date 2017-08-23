package com.oojunzi.app.web.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class CarInfo {
    /**
     * 主键
     */
    private BigDecimal id;

    /**
     * 创建人
     */
    private BigDecimal userId;

    /**
     * 车牌
     */
    private String plateNumber;

    /**
     * 所有人
     */
    private String owner;

    /**
     * 品牌型号
     */
    private String brandModel;

    /**
     * 车辆识别代码
     */
    private String vehicleIdentificationCode;

    /**
     * 发动机型号
     */
    private String engineType;

    /**
     * 行驶证主页
     */
    private String drivingLicenseHomepage;

    /**
     * 行驶证负面
     */
    private String drivingLicenseVicePage;

    /**
     * 创建时间,加入爱车时间
     */
    private Date createTime;

    /**
     * 备注
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
     * null
     */
    private String levelId;

    /**
     * 车辆识别码
     */
    private String vin;

    /**
     * 车辆识别码年份
     */
    private String vinnf;

    /**
     * 厂家名称
     */
    private String cjmc;

    /**
     * 品牌
     */
    private String pp;

    /**
     * 车型
     */
    private String cx;

    /**
     * 排量
     */
    private String pl;

    /**
     * 发动机型号
     */
    private String fdjxh;

    /**
     * 变速器类型
     */
    private String bsqlx;

    /**
     * 档位数
     */
    private String dws;

    /**
     * 排放标准
     */
    private String pfbz;

    /**
     * 车辆代码
     */
    private String cldm;

    /**
     * 上市年份
     */
    private String ssnf;

    /**
     * 推出年份
     */
    private String tcnf;

    /**
     * 指导价格
     */
    private String zdjg;

    /**
     * null
     */
    private String nLevelId;

    /**
     * 上市月份
     */
    private String ssyf;

    /**
     * 生产年份
     */
    private String scnf;

    /**
     * 年款
     */
    private String nk;

    /**
     * 车系
     */
    private String cxi;

    /**
     * 显示名称
     */
    private String xsmc;

    /**
     * 车量类型
     */
    private String cllx;

    /**
     * 级别
     */
    private String jb;

    /**
     * 车身厢数
     */
    private String csxs;

    /**
     * 车门数
     */
    private String cms;

    /**
     * 座位数
     */
    private String zws;

    /**
     * 功率
     */
    private String gl;

    /**
     * 燃油类型
     */
    private String rylx;

    /**
     * 变速器模式
     */
    private String bsqms;

    /**
     * 燃油标号
     */
    private String rybh;

    /**
     * 驱动方式
     */
    private String qdfs;

    /**
     * 发动机缸数
     */
    private String fdjgs;

    /**
     * 注册日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date registerDate;

    /**
     * 发证日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date certificateDate;

    /**
     * 现无用
     */
    private BigDecimal carId;

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
     * 状态 1、互助审核中  2 求助中 3 互助生效   0 已删除
     */
    private String status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 车昵称
     */
    private String carName;

    /**
     * 图像
     */
    private String carIco;

    /**
     * 价格
     */
    private BigDecimal carPrice;

    /**
     * 车主id（外键），重复，不填
     */
    private BigDecimal userFid;

    /**
     * 车型ID（外键），暂时不关联，先不填
     */
    private BigDecimal typeFid;

    /**
     * 分摊上限
     */
    private BigDecimal partakeMax;

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
     * 创建人
     * @return USER_ID 创建人
     */
    public BigDecimal getUserId() {
        return userId;
    }

    /**
     * 创建人
     * @param userId 创建人
     */
    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    /**
     * 车牌
     * @return PLATE_NUMBER 车牌
     */
    public String getPlateNumber() {
        return plateNumber;
    }

    /**
     * 车牌
     * @param plateNumber 车牌
     */
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber == null ? null : plateNumber.trim();
    }

    /**
     * 所有人
     * @return OWNER 所有人
     */
    public String getOwner() {
        return owner;
    }

    /**
     * 所有人
     * @param owner 所有人
     */
    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }

    /**
     * 品牌型号
     * @return BRAND_MODEL 品牌型号
     */
    public String getBrandModel() {
        return brandModel;
    }

    /**
     * 品牌型号
     * @param brandModel 品牌型号
     */
    public void setBrandModel(String brandModel) {
        this.brandModel = brandModel == null ? null : brandModel.trim();
    }

    /**
     * 车辆识别代码
     * @return VEHICLE_IDENTIFICATION_CODE 车辆识别代码
     */
    public String getVehicleIdentificationCode() {
        return vehicleIdentificationCode;
    }

    /**
     * 车辆识别代码
     * @param vehicleIdentificationCode 车辆识别代码
     */
    public void setVehicleIdentificationCode(String vehicleIdentificationCode) {
        this.vehicleIdentificationCode = vehicleIdentificationCode == null ? null : vehicleIdentificationCode.trim();
    }

    /**
     * 发动机型号
     * @return ENGINE_TYPE 发动机型号
     */
    public String getEngineType() {
        return engineType;
    }

    /**
     * 发动机型号
     * @param engineType 发动机型号
     */
    public void setEngineType(String engineType) {
        this.engineType = engineType == null ? null : engineType.trim();
    }

    /**
     * 行驶证主页
     * @return DRIVING_LICENSE_HOMEPAGE 行驶证主页
     */
    public String getDrivingLicenseHomepage() {
        return drivingLicenseHomepage;
    }

    /**
     * 行驶证主页
     * @param drivingLicenseHomepage 行驶证主页
     */
    public void setDrivingLicenseHomepage(String drivingLicenseHomepage) {
        this.drivingLicenseHomepage = drivingLicenseHomepage == null ? null : drivingLicenseHomepage.trim();
    }

    /**
     * 行驶证负面
     * @return DRIVING_LICENSE_VICE_PAGE 行驶证负面
     */
    public String getDrivingLicenseVicePage() {
        return drivingLicenseVicePage;
    }

    /**
     * 行驶证负面
     * @param drivingLicenseVicePage 行驶证负面
     */
    public void setDrivingLicenseVicePage(String drivingLicenseVicePage) {
        this.drivingLicenseVicePage = drivingLicenseVicePage == null ? null : drivingLicenseVicePage.trim();
    }

    /**
     * 创建时间,加入爱车时间
     * @return CREATE_TIME 创建时间,加入爱车时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间,加入爱车时间
     * @param createTime 创建时间,加入爱车时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 备注
     * @return PARAM1 备注
     */
    public String getParam1() {
        return param1;
    }

    /**
     * 备注
     * @param param1 备注
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

    /**
     * null
     * @return LEVEL_ID null
     */
    public String getLevelId() {
        return levelId;
    }

    /**
     * null
     * @param levelId null
     */
    public void setLevelId(String levelId) {
        this.levelId = levelId == null ? null : levelId.trim();
    }

    /**
     * 车辆识别码
     * @return VIN 车辆识别码
     */
    public String getVin() {
        return vin;
    }

    /**
     * 车辆识别码
     * @param vin 车辆识别码
     */
    public void setVin(String vin) {
        this.vin = vin == null ? null : vin.trim();
    }

    /**
     * 车辆识别码年份
     * @return VINNF 车辆识别码年份
     */
    public String getVinnf() {
        return vinnf;
    }

    /**
     * 车辆识别码年份
     * @param vinnf 车辆识别码年份
     */
    public void setVinnf(String vinnf) {
        this.vinnf = vinnf == null ? null : vinnf.trim();
    }

    /**
     * 厂家名称
     * @return CJMC 厂家名称
     */
    public String getCjmc() {
        return cjmc;
    }

    /**
     * 厂家名称
     * @param cjmc 厂家名称
     */
    public void setCjmc(String cjmc) {
        this.cjmc = cjmc == null ? null : cjmc.trim();
    }

    /**
     * 品牌
     * @return PP 品牌
     */
    public String getPp() {
        return pp;
    }

    /**
     * 品牌
     * @param pp 品牌
     */
    public void setPp(String pp) {
        this.pp = pp == null ? null : pp.trim();
    }

    /**
     * 车型
     * @return CX 车型
     */
    public String getCx() {
        return cx;
    }

    /**
     * 车型
     * @param cx 车型
     */
    public void setCx(String cx) {
        this.cx = cx == null ? null : cx.trim();
    }

    /**
     * 排量
     * @return PL 排量
     */
    public String getPl() {
        return pl;
    }

    /**
     * 排量
     * @param pl 排量
     */
    public void setPl(String pl) {
        this.pl = pl == null ? null : pl.trim();
    }

    /**
     * 发动机型号
     * @return FDJXH 发动机型号
     */
    public String getFdjxh() {
        return fdjxh;
    }

    /**
     * 发动机型号
     * @param fdjxh 发动机型号
     */
    public void setFdjxh(String fdjxh) {
        this.fdjxh = fdjxh == null ? null : fdjxh.trim();
    }

    /**
     * 变速器类型
     * @return BSQLX 变速器类型
     */
    public String getBsqlx() {
        return bsqlx;
    }

    /**
     * 变速器类型
     * @param bsqlx 变速器类型
     */
    public void setBsqlx(String bsqlx) {
        this.bsqlx = bsqlx == null ? null : bsqlx.trim();
    }

    /**
     * 档位数
     * @return DWS 档位数
     */
    public String getDws() {
        return dws;
    }

    /**
     * 档位数
     * @param dws 档位数
     */
    public void setDws(String dws) {
        this.dws = dws == null ? null : dws.trim();
    }

    /**
     * 排放标准
     * @return PFBZ 排放标准
     */
    public String getPfbz() {
        return pfbz;
    }

    /**
     * 排放标准
     * @param pfbz 排放标准
     */
    public void setPfbz(String pfbz) {
        this.pfbz = pfbz == null ? null : pfbz.trim();
    }

    /**
     * 车辆代码
     * @return CLDM 车辆代码
     */
    public String getCldm() {
        return cldm;
    }

    /**
     * 车辆代码
     * @param cldm 车辆代码
     */
    public void setCldm(String cldm) {
        this.cldm = cldm == null ? null : cldm.trim();
    }

    /**
     * 上市年份
     * @return SSNF 上市年份
     */
    public String getSsnf() {
        return ssnf;
    }

    /**
     * 上市年份
     * @param ssnf 上市年份
     */
    public void setSsnf(String ssnf) {
        this.ssnf = ssnf == null ? null : ssnf.trim();
    }

    /**
     * 推出年份
     * @return TCNF 推出年份
     */
    public String getTcnf() {
        return tcnf;
    }

    /**
     * 推出年份
     * @param tcnf 推出年份
     */
    public void setTcnf(String tcnf) {
        this.tcnf = tcnf == null ? null : tcnf.trim();
    }

    /**
     * 指导价格
     * @return ZDJG 指导价格
     */
    public String getZdjg() {
        return zdjg;
    }

    /**
     * 指导价格
     * @param zdjg 指导价格
     */
    public void setZdjg(String zdjg) {
        this.zdjg = zdjg == null ? null : zdjg.trim();
    }

    /**
     * null
     * @return N_LEVEL_ID null
     */
    public String getnLevelId() {
        return nLevelId;
    }

    /**
     * null
     * @param nLevelId null
     */
    public void setnLevelId(String nLevelId) {
        this.nLevelId = nLevelId == null ? null : nLevelId.trim();
    }

    /**
     * 上市月份
     * @return SSYF 上市月份
     */
    public String getSsyf() {
        return ssyf;
    }

    /**
     * 上市月份
     * @param ssyf 上市月份
     */
    public void setSsyf(String ssyf) {
        this.ssyf = ssyf == null ? null : ssyf.trim();
    }

    /**
     * 生产年份
     * @return SCNF 生产年份
     */
    public String getScnf() {
        return scnf;
    }

    /**
     * 生产年份
     * @param scnf 生产年份
     */
    public void setScnf(String scnf) {
        this.scnf = scnf == null ? null : scnf.trim();
    }

    /**
     * 年款
     * @return NK 年款
     */
    public String getNk() {
        return nk;
    }

    /**
     * 年款
     * @param nk 年款
     */
    public void setNk(String nk) {
        this.nk = nk == null ? null : nk.trim();
    }

    /**
     * 车系
     * @return CXI 车系
     */
    public String getCxi() {
        return cxi;
    }

    /**
     * 车系
     * @param cxi 车系
     */
    public void setCxi(String cxi) {
        this.cxi = cxi == null ? null : cxi.trim();
    }

    /**
     * 显示名称
     * @return XSMC 显示名称
     */
    public String getXsmc() {
        return xsmc;
    }

    /**
     * 显示名称
     * @param xsmc 显示名称
     */
    public void setXsmc(String xsmc) {
        this.xsmc = xsmc == null ? null : xsmc.trim();
    }

    /**
     * 车量类型
     * @return CLLX 车量类型
     */
    public String getCllx() {
        return cllx;
    }

    /**
     * 车量类型
     * @param cllx 车量类型
     */
    public void setCllx(String cllx) {
        this.cllx = cllx == null ? null : cllx.trim();
    }

    /**
     * 级别
     * @return JB 级别
     */
    public String getJb() {
        return jb;
    }

    /**
     * 级别
     * @param jb 级别
     */
    public void setJb(String jb) {
        this.jb = jb == null ? null : jb.trim();
    }

    /**
     * 车身厢数
     * @return CSXS 车身厢数
     */
    public String getCsxs() {
        return csxs;
    }

    /**
     * 车身厢数
     * @param csxs 车身厢数
     */
    public void setCsxs(String csxs) {
        this.csxs = csxs == null ? null : csxs.trim();
    }

    /**
     * 车门数
     * @return CMS 车门数
     */
    public String getCms() {
        return cms;
    }

    /**
     * 车门数
     * @param cms 车门数
     */
    public void setCms(String cms) {
        this.cms = cms == null ? null : cms.trim();
    }

    /**
     * 座位数
     * @return ZWS 座位数
     */
    public String getZws() {
        return zws;
    }

    /**
     * 座位数
     * @param zws 座位数
     */
    public void setZws(String zws) {
        this.zws = zws == null ? null : zws.trim();
    }

    /**
     * 功率
     * @return GL 功率
     */
    public String getGl() {
        return gl;
    }

    /**
     * 功率
     * @param gl 功率
     */
    public void setGl(String gl) {
        this.gl = gl == null ? null : gl.trim();
    }

    /**
     * 燃油类型
     * @return RYLX 燃油类型
     */
    public String getRylx() {
        return rylx;
    }

    /**
     * 燃油类型
     * @param rylx 燃油类型
     */
    public void setRylx(String rylx) {
        this.rylx = rylx == null ? null : rylx.trim();
    }

    /**
     * 变速器模式
     * @return BSQMS 变速器模式
     */
    public String getBsqms() {
        return bsqms;
    }

    /**
     * 变速器模式
     * @param bsqms 变速器模式
     */
    public void setBsqms(String bsqms) {
        this.bsqms = bsqms == null ? null : bsqms.trim();
    }

    /**
     * 燃油标号
     * @return RYBH 燃油标号
     */
    public String getRybh() {
        return rybh;
    }

    /**
     * 燃油标号
     * @param rybh 燃油标号
     */
    public void setRybh(String rybh) {
        this.rybh = rybh == null ? null : rybh.trim();
    }

    /**
     * 驱动方式
     * @return QDFS 驱动方式
     */
    public String getQdfs() {
        return qdfs;
    }

    /**
     * 驱动方式
     * @param qdfs 驱动方式
     */
    public void setQdfs(String qdfs) {
        this.qdfs = qdfs == null ? null : qdfs.trim();
    }

    /**
     * 发动机缸数
     * @return FDJGS 发动机缸数
     */
    public String getFdjgs() {
        return fdjgs;
    }

    /**
     * 发动机缸数
     * @param fdjgs 发动机缸数
     */
    public void setFdjgs(String fdjgs) {
        this.fdjgs = fdjgs == null ? null : fdjgs.trim();
    }

    /**
     * 注册日期
     * @return REGISTER_DATE 注册日期
     */
    public Date getRegisterDate() {
        return registerDate;
    }

    /**
     * 注册日期
     * @param registerDate 注册日期
     */
    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    /**
     * 发证日期
     * @return CERTIFICATE_DATE 发证日期
     */
    public Date getCertificateDate() {
        return certificateDate;
    }

    /**
     * 发证日期
     * @param certificateDate 发证日期
     */
    public void setCertificateDate(Date certificateDate) {
        this.certificateDate = certificateDate;
    }

    /**
     * 现无用
     * @return CAR_ID 现无用
     */
    public BigDecimal getCarId() {
        return carId;
    }

    /**
     * 现无用
     * @param carId 现无用
     */
    public void setCarId(BigDecimal carId) {
        this.carId = carId;
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
     * 状态 1、互助审核中  2 求助中 3 互助生效   0 已删除
     * @return STATUS 状态 1、互助审核中  2 求助中 3 互助生效   0 已删除
     */
    public String getStatus() {
        return status;
    }

    /**
     * 状态 1、互助审核中  2 求助中 3 互助生效   0 已删除
     * @param status 状态 1、互助审核中  2 求助中 3 互助生效   0 已删除
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
     * 车昵称
     * @return CAR_NAME 车昵称
     */
    public String getCarName() {
        return carName;
    }

    /**
     * 车昵称
     * @param carName 车昵称
     */
    public void setCarName(String carName) {
        this.carName = carName == null ? null : carName.trim();
    }

    /**
     * 图像
     * @return CAR_ICO 图像
     */
    public String getCarIco() {
        return carIco;
    }

    /**
     * 图像
     * @param carIco 图像
     */
    public void setCarIco(String carIco) {
        this.carIco = carIco == null ? null : carIco.trim();
    }

    /**
     * 价格
     * @return CAR_PRICE 价格
     */
    public BigDecimal getCarPrice() {
        return carPrice;
    }

    /**
     * 价格
     * @param carPrice 价格
     */
    public void setCarPrice(BigDecimal carPrice) {
        this.carPrice = carPrice;
    }

    /**
     * 车主id（外键），重复，不填
     * @return USER_FID 车主id（外键），重复，不填
     */
    public BigDecimal getUserFid() {
        return userFid;
    }

    /**
     * 车主id（外键），重复，不填
     * @param userFid 车主id（外键），重复，不填
     */
    public void setUserFid(BigDecimal userFid) {
        this.userFid = userFid;
    }

    /**
     * 车型ID（外键），暂时不关联，先不填
     * @return TYPE_FID 车型ID（外键），暂时不关联，先不填
     */
    public BigDecimal getTypeFid() {
        return typeFid;
    }

    /**
     * 车型ID（外键），暂时不关联，先不填
     * @param typeFid 车型ID（外键），暂时不关联，先不填
     */
    public void setTypeFid(BigDecimal typeFid) {
        this.typeFid = typeFid;
    }

    /**
     * 分摊上限
     * @return PARTAKE_MAX 分摊上限
     */
    public BigDecimal getPartakeMax() {
        return partakeMax;
    }

    /**
     * 分摊上限
     * @param partakeMax 分摊上限
     */
    public void setPartakeMax(BigDecimal partakeMax) {
        this.partakeMax = partakeMax;
    }
    
    /**
     * add lgq
     * 加入分摊详情表信息
     * */
    private List<HelpPartake> helpPartakes;

	public List<HelpPartake> getHelpPartakes() {
		return helpPartakes;
	}

	public void setHelpPartakes(List<HelpPartake> helpPartakes) {
		this.helpPartakes = helpPartakes;
	}
}