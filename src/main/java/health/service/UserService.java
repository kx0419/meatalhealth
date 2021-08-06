package health.service;


import health.dao.UserDao;

import health.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.sql.SQLException;


@Service
public class Userservice {
    @Autowired
    private UserDao userDao;

    public void insertuser(User user) throws SQLException, IOException, ClassNotFoundException {
            userDao.insert(user);
    }


}
