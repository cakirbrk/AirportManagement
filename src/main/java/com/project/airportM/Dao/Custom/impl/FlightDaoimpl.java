package com.project.airportM.Dao.Custom.impl;

import com.project.airportM.Dao.Custom.FlightDao;
import com.project.airportM.Entity.Flight;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FlightDaoimpl implements FlightDao {
    private Session session;

    @Override
    public String findMaxFligtId() throws Exception {
        Object objects = session.createNativeQuery("SELECT flight_id from flightmanagement.flight ORDER BY flight_id DESC LIMIT 1").uniqueResult();
        return objects.toString();
    }

    @Override
    public void save(Flight entity) throws Exception {
        session.save(entity);
    }

    @Override
    public void update(Flight entity) throws Exception {
        session.merge(entity);
    }

    @Override
    public void delete(String entityId) throws Exception {
        session.delete(session.load(Flight.class,entityId));
    }

    @Override
    public Flight find(String entityId) throws Exception {
        return session.find(Flight.class,entityId);
    }

    @Override
    public List<Flight> findAll() throws Exception {
        return session.createNativeQuery("SELECT * FROM flightmanagement.flight",Flight.class).list();
    }

    @Override
    public void setSession(Session session) {
        this.session=session;
    }
}
