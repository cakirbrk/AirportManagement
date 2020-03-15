package com.project.airportM.Dao.Custom;

import com.project.airportM.Dao.CrudDao;
import com.project.airportM.Entity.Role;

public interface RoleDao extends CrudDao<Role,String> {
    String findMaxRoleId() throws Exception;

}
