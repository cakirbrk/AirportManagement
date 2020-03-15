package com.project.airportM.Dao.Custom;

import com.project.airportM.Dao.CrudDao;
import com.project.airportM.Entity.Flight;

public interface FlightDao extends CrudDao<Flight,String> {
    String findMaxFligtId() throws Exception;

}
