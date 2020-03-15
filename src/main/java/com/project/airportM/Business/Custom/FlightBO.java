package com.project.airportM.Business.Custom;

import com.project.airportM.Business.SuperBO;
import com.project.airportM.Dto.FlightDTO;

public interface FlightBO extends SuperBO<FlightDTO,String> {
    String getMaxFlightId() throws Exception;
}
