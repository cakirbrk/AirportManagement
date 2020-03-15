package com.project.airportM.Dao.Custom.impl;

import com.project.airportM.Dao.Custom.RoleDao;
import com.project.airportM.Entity.Flight;
import com.project.airportM.Entity.Role;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RoleDaoimpl implements RoleDao {
    private Session session;

    @Override
    public String findMaxRoleId() throws Exception {
        Object objects = session.createNativeQuery("SELECT id from flightmanagement.role ORDER BY id DESC LIMIT 1").uniqueResult();
        return objects.toString();
    }

    @Override
    public void save(Role entity) throws Exception {
        session.save(entity);
    }

    @Override
    public void update(Role entity) throws Exception {
        session.merge(entity);
    }

    @Override
    public void delete(String entityId) throws Exception {
        session.delete(session.load(Role.class,entityId));
    }

    @Override
    public Role find(String entityId) throws Exception {
        return session.find(Role.class,entityId);
    }

    @Override
    public List<Role> findAll() throws Exception {
        return session.createNativeQuery("SELECT * FROM flightmanagement.role;",Role.class).list();
    }

    @Override
    public void setSession(Session session) {
        this.session=session;
    }
}
