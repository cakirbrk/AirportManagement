package com.project.airportM.Business.Custom;

import com.project.airportM.Business.SuperBO;
import com.project.airportM.Dto.AirlineDTO;

import java.util.List;

public interface AirlineBO extends SuperBO<AirlineDTO,String> {
    List<AirlineDTO> getAirlineId() throws Exception;

    String getMaxCAirId() throws Exception;
}
