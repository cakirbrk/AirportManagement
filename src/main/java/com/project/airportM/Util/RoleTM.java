package com.project.airportM.Util;

public class RoleTM {
    private Long roleId;
    private String roleCode;
    private String description;

    public RoleTM() {
    }

    public RoleTM(Long roleId, String roleCode, String description) {
        this.roleId = roleId;
        this.roleCode = roleCode;
        this.description = description;
    }

    public RoleTM(String roleCode, String description) {
        this.roleCode = roleCode;
        this.description = description;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
