package health.service;

import health.dao.MangerDao;
import health.dao.UserDao;
import health.entity.Manager;
import health.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.sql.SQLException;

@Service
public class Mangerservice {
   @Autowired
    private MangerDao mangerDao;
    public String findpasswordById(int i) throws SQLException, IOException, ClassNotFoundException {
       return mangerDao.select(i);
    }

    public void increase(){

    }
}
