package com.project.airportM.Business.Custom;

import com.project.airportM.Business.SuperBO;
import com.project.airportM.Dto.CityDTO;

public interface CityBO extends SuperBO<CityDTO,String> {
    String getMaxCityId() throws Exception;
}
