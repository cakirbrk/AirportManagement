package com.project.airportM.Dao.Custom;

import com.project.airportM.Dao.CrudDao;
import com.project.airportM.Entity.Airline;

public interface AirlineDao extends CrudDao<Airline,String> {
    String findMaxAirId() throws Exception;

}
