package com.project.airportM.Business.Custom.impl;

import com.project.airportM.Business.Custom.UserBO;
import com.project.airportM.Dto.UserDTO;

import java.util.List;

public class UserBOimpl implements UserBO {
    @Override
    public String getMaxUserId() throws Exception {
        return null;
    }

    @Override
    public List<UserDTO> getAll() throws Exception {
        return null;
    }

    @Override
    public boolean save(UserDTO dto) throws Exception {
        return false;
    }

    @Override
    public boolean remove(String dtoId) throws Exception {
        return false;
    }

    @Override
    public boolean update(UserDTO dtoId) throws Exception {
        return false;
    }

    @Override
    public UserDTO get(String dtoId) throws Exception {
        return null;
    }
}
