package com.project.airportM.Dao.Custom;

import com.project.airportM.Dao.CrudDao;
import com.project.airportM.Entity.City;

public interface CityDao extends CrudDao<City,String> {
    String findMaxCityId() throws Exception;

}
