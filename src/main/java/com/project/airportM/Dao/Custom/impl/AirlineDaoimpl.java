package com.project.airportM.Dao.Custom.impl;

import com.project.airportM.Dao.Custom.AirlineDao;
import com.project.airportM.Entity.Airline;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AirlineDaoimpl implements AirlineDao {
    private Session session;

    @Override
    public String findMaxAirId() throws Exception {
        Object objects = session.createNativeQuery("SELECT id from flightmanagement.airline ORDER BY id DESC LIMIT 1").uniqueResult();
        return objects.toString();
    }

    @Override
    public void save(Airline entity) throws Exception {
        session.save(entity);
    }

    @Override
    public void update(Airline entity) throws Exception {
        session.merge(entity);
    }

    @Override
    public void delete(String entityId) throws Exception {
        session.delete(session.load(Airline.class,entityId));
    }

    @Override
    public Airline find(String entityId) throws Exception {
        return session.find(Airline.class,entityId);
    }

    @Override
    public List<Airline> findAll() throws Exception {
        return session.createNativeQuery("SELECT * FROM flightmanagement.airline",Airline.class).list();
    }

    @Override
    public void setSession(Session session) {
        this.session=session;
    }
}
