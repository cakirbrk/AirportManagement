package com.project.airportM.Dto;

public class RoleDTO {
    private Long roleId;
    private String roleCode;
    private String description;

    public RoleDTO() {
    }

    public RoleDTO(String roleCode, String description) {
        this.roleCode = roleCode;
        this.description = description;
    }

    public RoleDTO(Long roleId, String roleCode, String description) {
        this.roleId = roleId;
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

    @Override
    public String toString() {
        return "RoleDTO{" +
                "roleId=" + roleId +
                ", roleCode='" + roleCode + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
