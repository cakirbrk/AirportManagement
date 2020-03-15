package com.project.airportM.Business.Custom.impl;

import com.project.airportM.Business.Custom.FlightBO;
import com.project.airportM.Dto.FlightDTO;

import java.util.List;

public class FlightBOimpl implements FlightBO {
    @Override
    public String getMaxFlightId() throws Exception {
        return null;
    }

    @Override
    public List<FlightDTO> getAll() throws Exception {
        return null;
    }

    @Override
    public boolean save(FlightDTO dto) throws Exception {
        return false;
    }

    @Override
    public boolean remove(String dtoId) throws Exception {
        return false;
    }

    @Override
    public boolean update(FlightDTO dtoId) throws Exception {
        return false;
    }

    @Override
    public FlightDTO get(String dtoId) throws Exception {
        return null;
    }
}
