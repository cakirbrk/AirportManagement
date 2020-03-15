package com.project.airportM.Dao.Custom;

import com.project.airportM.Dao.CrudDao;
import com.project.airportM.Entity.User;

public interface UserDao extends CrudDao<User,String> {
    String findMaxUserId() throws Exception;

}
