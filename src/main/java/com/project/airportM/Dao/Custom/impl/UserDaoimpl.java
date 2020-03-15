package com.project.airportM.Dao.Custom.impl;

import com.project.airportM.Dao.Custom.UserDao;
import com.project.airportM.Entity.Role;
import com.project.airportM.Entity.User;
import org.hibernate.Session;

import java.util.List;

public class UserDaoimpl implements UserDao {
    private Session session;

    @Override
    public String findMaxUserId() throws Exception {
        Object objects = session.createNativeQuery("SELECT id from flightmanagement.user ORDER BY id DESC LIMIT 1").uniqueResult();
        return objects.toString();
    }

    @Override
    public void save(User entity) throws Exception {
        session.save(entity);
    }

    @Override
    public void update(User entity) throws Exception {
        session.merge(entity);
    }

    @Override
    public void delete(String entityId) throws Exception {
        session.delete(session.load(Role.class,entityId));
    }

    @Override
    public User find(String entityId) throws Exception {
        return session.find(User.class,entityId);
    }

    @Override
    public List<User> findAll() throws Exception {
        return session.createNativeQuery("SELECT * FROM flightmanagement.user;",User.class).list();
    }

    @Override
    public void setSession(Session session) {
        this.session=session;
    }
}
