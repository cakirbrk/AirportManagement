package com.project.airportM.Business.Custom;

import com.project.airportM.Business.SuperBO;
import com.project.airportM.Dto.UserDTO;

public interface UserBO extends SuperBO<UserDTO,String> {
    String getMaxUserId() throws Exception;
}
