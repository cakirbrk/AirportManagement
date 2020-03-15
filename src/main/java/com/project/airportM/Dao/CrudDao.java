package com.project.airportM.Dao;

import java.util.List;

public interface CrudDao<T,ID> extends SuperDao {
    void save(T entity) throws Exception;

    void update(T entity) throws Exception;

    void delete(ID entityId) throws Exception;

    T find(ID entityId) throws Exception;

    List<T> findAll() throws Exception;
}
