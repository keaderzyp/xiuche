package com.oojunzi.app.web.model;

import java.math.BigDecimal;

public class SystemRole {
    /**
     * null
     */
    private BigDecimal id;

    /**
     * null
     */
    private String roleName;

    /**
     * null
     */
    private String roleSign;

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
     * @return ROLE_NAME null
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * null
     * @param roleName null
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * null
     * @return ROLE_SIGN null
     */
    public String getRoleSign() {
        return roleSign;
    }

    /**
     * null
     * @param roleSign null
     */
    public void setRoleSign(String roleSign) {
        this.roleSign = roleSign == null ? null : roleSign.trim();
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