package com.project.airportM.Dao.Custom.impl;

import com.project.airportM.Dao.Custom.CityDao;
import com.project.airportM.Entity.City;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CityDaoimpl implements CityDao {
    private Session session;

    @Override
    public String findMaxCityId() throws Exception {
        Object objects = session.createNativeQuery("SELECT id from flightmanagement.city ORDER BY id DESC LIMIT 1").uniqueResult();
        return objects.toString();
    }

    @Override
    public void save(City entity) throws Exception {
        session.save(entity);
    }

    @Override
    public void update(City entity) throws Exception {
        session.merge(entity);
    }

    @Override
    public void delete(String entityId) throws Exception {
        session.delete(session.load(City.class,entityId));
    }

    @Override
    public City find(String entityId) throws Exception {
        return session.find(City.class,entityId);
    }

    @Override
    public List<City> findAll() throws Exception {
        return session.createNativeQuery("SELECT * FROM flightmanagement.city",City.class).list();
    }

    @Override
    public void setSession(Session session) {
        this.session=session;
    }
}
