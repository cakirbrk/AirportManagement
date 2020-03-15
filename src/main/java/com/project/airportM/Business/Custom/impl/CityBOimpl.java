package com.project.airportM.Business.Custom.impl;

import com.project.airportM.Business.Custom.CityBO;
import com.project.airportM.Dao.Custom.CityDao;
import com.project.airportM.DbMan.HibernateUtil;
import com.project.airportM.Dto.CityDTO;
import com.project.airportM.Entity.City;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CityBOimpl implements CityBO {
    @Autowired
    private CityDao cityDao;

    @Override
    public String getMaxCityId() throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            cityDao.setSession(session);
            String maxCustId = cityDao.findMaxCityId();
            session.getTransaction().commit();
            return maxCustId;
        }
    }

    @Override
    public List<CityDTO> getAll() throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            cityDao.setSession(session);
            List<CityDTO> collect = cityDao.findAll().stream().map(city -> new CityDTO(city.getCityId(),city.getCityCode(),city.getDescription())).collect(Collectors.toList());
            session.getTransaction().commit();
            return collect;
        }
    }

    @Override
    public boolean save(CityDTO dto) throws Exception {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            cityDao.setSession(session);
            cityDao.save(new City(dto.getCityId(), dto.getCityCode(), dto.getDescription()));
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
            cityDao.setSession(session);
            cityDao.delete(dtoId);
            session.getTransaction().commit();
            return true;
        }catch (Exception ex){
            throw ex;
        }
    }

    @Override
    public boolean update(CityDTO dtoId) throws Exception {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            cityDao.setSession(session);
            cityDao.update(new City(dtoId.getCityId(), dtoId.getCityCode(), dtoId.getDescription()));
            session.getTransaction().commit();
            return true;
        }catch (Exception ex){
            throw ex;
        }
    }

    @Override
    public CityDTO get(String dtoId) throws Exception {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            cityDao.setSession(session);
            City city = cityDao.find(dtoId);
            session.getTransaction().commit();
            return new CityDTO(city.getCityId(),city.getCityCode(),city.getDescription());
        }
    }
}
