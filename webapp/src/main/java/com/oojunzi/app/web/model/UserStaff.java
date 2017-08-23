package com.oojunzi.app.web.model;

import java.math.BigDecimal;

public class UserStaff {
    /**
     * 员工id（主键）
     */
    private BigDecimal staffId;

    /**
     * 员工姓名
     */
    private String staffName;

    /**
     * 电话
     */
    private String telphone;

    /**
     * null
     */
    private String sex;

    /**
     * null
     */
    private String address;

    /**
     * 联系人
     */
    private String contact;

    /**
     * 联系人电话
     */
    private String contactTel;

    /**
     * null
     */
    private BigDecimal age;

    /**
     * 身份证
     */
    private String idNumber;

    /**
     * null
     */
    private String status;

    /**
     * null
     */
    private String remark;

    /**
     * 昵称
     */
    private String petName;

    /**
     * 头像
     */
    private String staffIco;

    /**
     * null
     */
    private String email;

    /**
     * 地址
     */
    private String position;

    /**
     * 部门id(外键)
     */
    private BigDecimal departFid;

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
     * 员工id（主键）
     * @return STAFF_ID 员工id（主键）
     */
    public BigDecimal getStaffId() {
        return staffId;
    }

    /**
     * 员工id（主键）
     * @param staffId 员工id（主键）
     */
    public void setStaffId(BigDecimal staffId) {
        this.staffId = staffId;
    }

    /**
     * 员工姓名
     * @return STAFF_NAME 员工姓名
     */
    public String getStaffName() {
        return staffName;
    }

    /**
     * 员工姓名
     * @param staffName 员工姓名
     */
    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
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
     * 联系人
     * @return CONTACT 联系人
     */
    public String getContact() {
        return contact;
    }

    /**
     * 联系人
     * @param contact 联系人
     */
    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    /**
     * 联系人电话
     * @return CONTACT_TEL 联系人电话
     */
    public String getContactTel() {
        return contactTel;
    }

    /**
     * 联系人电话
     * @param contactTel 联系人电话
     */
    public void setContactTel(String contactTel) {
        this.contactTel = contactTel == null ? null : contactTel.trim();
    }

    /**
     * null
     * @return AGE null
     */
    public BigDecimal getAge() {
        return age;
    }

    /**
     * null
     * @param age null
     */
    public void setAge(BigDecimal age) {
        this.age = age;
    }

    /**
     * 身份证
     * @return ID_NUMBER 身份证
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * 身份证
     * @param idNumber 身份证
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
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
     * 头像
     * @return STAFF_ICO 头像
     */
    public String getStaffIco() {
        return staffIco;
    }

    /**
     * 头像
     * @param staffIco 头像
     */
    public void setStaffIco(String staffIco) {
        this.staffIco = staffIco == null ? null : staffIco.trim();
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
     * 地址
     * @return POSITION 地址
     */
    public String getPosition() {
        return position;
    }

    /**
     * 地址
     * @param position 地址
     */
    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    /**
     * 部门id(外键)
     * @return DEPART_FID 部门id(外键)
     */
    public BigDecimal getDepartFid() {
        return departFid;
    }

    /**
     * 部门id(外键)
     * @param departFid 部门id(外键)
     */
    public void setDepartFid(BigDecimal departFid) {
        this.departFid = departFid;
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