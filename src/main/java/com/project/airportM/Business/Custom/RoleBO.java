package com.project.airportM.Business.Custom;

import com.project.airportM.Business.SuperBO;
import com.project.airportM.Dto.RoleDTO;

public interface RoleBO extends SuperBO<RoleDTO,String> {
    String getMaxRoleId() throws Exception;

}
