package com.project.airportM.Business.Custom.impl;

import com.project.airportM.Business.Custom.AirlineBO;
import com.project.airportM.Dao.Custom.AirlineDao;
import com.project.airportM.DbMan.HibernateUtil;
import com.project.airportM.Dto.AirlineDTO;
import com.project.airportM.Entity.Airline;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AirlineBOimpl implements AirlineBO {
    @Autowired
    private AirlineDao airlineDao;

    @Override
    public List<AirlineDTO> getAirlineId() throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            airlineDao.setSession(session);
            List<AirlineDTO> collect = airlineDao.findAll().stream().map(airline -> new AirlineDTO(airline.getId(),airline.getAirlineCode(),airline.getDescription())).collect(Collectors.toList());
            session.getTransaction().commit();
            return collect;
        }
    }

    @Override
    public String getMaxCAirId() throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            airlineDao.setSession(session);
            String maxCustId = airlineDao.findMaxAirId();
            session.getTransaction().commit();
            return maxCustId;
        }
    }

    @Override
    public List<AirlineDTO> getAll() throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            airlineDao.setSession(session);
            List<AirlineDTO> collect = airlineDao.findAll().stream().map(airline -> new AirlineDTO(airline.getId(),airline.getAirlineCode(),airline.getDescription())).collect(Collectors.toList());
            session.getTransaction().commit();
            return collect;
        }
    }

    @Override
    public boolean save(AirlineDTO dto) throws Exception {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            airlineDao.setSession(session);
            airlineDao.save(new Airline(dto.getAirlineId(), dto.getAirlineCode(), dto.getDescription()));
            session.getTransaction().commit();
            return true;
        }catch (Exception ex){
            throw ex;
        }
    }

    @Override
    public boolean remove(String dtoId) throws Exception {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            airlineDao.setSession(session);
            airlineDao.delete(dtoId);
            session.getTransaction().commit();
            return true;
        }catch (Exception ex){
            throw ex;
        }
    }

    @Override
    public boolean update(AirlineDTO dtoId) throws Exception {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            airlineDao.setSession(session);
            airlineDao.update(new Airline(dtoId.getAirlineId(), dtoId.getAirlineCode(), dtoId.getDescription()));
            session.getTransaction().commit();
            return true;
        }catch (Exception ex){
            throw ex;
        }
    }

    @Override
    public AirlineDTO get(String dtoId) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            airlineDao.setSession(session);
            Airline airline = airlineDao.find(dtoId);
            session.getTransaction().commit();
            return new AirlineDTO(airline.getId(),airline.getAirlineCode(),airline.getDescription());
        }
    }
}
