package com.project.airportM.Entity;

import javax.persistence.*;

@Entity
@Table(name="role")
public class Role extends SuperEntity  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long roleId;
    @Column(name = "CODE",unique = true)
    private String roleCode;

    @Column(name="DESCRIPTION")
    private String description;

    public Role() {
    }

    public Role(String roleCode, String description) {
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

    /*----------------------------------------------------------------------------------------------------------------------------*/
    public static RoleBuilder builder() {

        return new RoleBuilder();
    }
    public static class RoleBuilder{
        private Role role;

        public RoleBuilder() {
            role = new Role();
        }
        public RoleBuilder roleCode(String roleCode){
            role.setRoleCode(roleCode);
            return this;
        }
        public RoleBuilder description(String description){
            role.setDescription(description);
            return this;
        }
        public Role build() {
            return role;
        }
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", roleCode='" + roleCode + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

