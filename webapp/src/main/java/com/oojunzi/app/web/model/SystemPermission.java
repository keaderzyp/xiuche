package com.oojunzi.app.web.model;

import java.math.BigDecimal;

public class SystemPermission {
    /**
     * null
     */
    private BigDecimal id;

    /**
     * null
     */
    private String permissionName;

    /**
     * null
     */
    private String permissionSign;

    /**
     * null
     */
    private String description;

    /**
     * null
     * @return ID null
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * null
     * @param id null
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * null
     * @return PERMISSION_NAME null
     */
    public String getPermissionName() {
        return permissionName;
    }

    /**
     * null
     * @param permissionName null
     */
    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName == null ? null : permissionName.trim();
    }

    /**
     * null
     * @return PERMISSION_SIGN null
     */
    public String getPermissionSign() {
        return permissionSign;
    }

    /**
     * null
     * @param permissionSign null
     */
    public void setPermissionSign(String permissionSign) {
        this.permissionSign = permissionSign == null ? null : permissionSign.trim();
    }

    /**
     * null
     * @return DESCRIPTION null
     */
    public String getDescription() {
        return description;
    }

    /**
     * null
     * @param description null
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}