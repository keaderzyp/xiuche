package com.oojunzi.app.web.model;

public class NewsDynamicType {
    private String typeId;

    private String typeName;

    private String typeIcon;

    private String typeState;

    private String param1;

    private String param2;

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public String getTypeIcon() {
        return typeIcon;
    }

    public void setTypeIcon(String typeIcon) {
        this.typeIcon = typeIcon == null ? null : typeIcon.trim();
    }

    public String getTypeState() {
        return typeState;
    }

    public void setTypeState(String typeState) {
        this.typeState = typeState == null ? null : typeState.trim();
    }

    public String getParam1() {
        return param1;
    }

    public void setParam1(String param1) {
        this.param1 = param1 == null ? null : param1.trim();
    }

    public String getParam2() {
        return param2;
    }

    public void setParam2(String param2) {
        this.param2 = param2 == null ? null : param2.trim();
    }
}