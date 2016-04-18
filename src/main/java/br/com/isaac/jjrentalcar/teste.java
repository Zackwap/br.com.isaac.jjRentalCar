package br.com.isaac.jjrentalcar;

import br.com.isaac.jjrentalcar.domain.DriverDao;
import br.com.isaac.jjrentalcar.domain.UserDao;
import br.com.isaac.jjrentalcar.server.Driver;
import br.com.isaac.jjrentalcar.server.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Qualidade on 15/04/2016.
 */
public class teste {

    public static void main(String args[]){


        DriverDao driverDao = new DriverDao();
        UserDao userDao = new UserDao();

        Driver d = new Driver("Jairo", "asdas4asd", "dasdas755a4d", "Rua azul",
                "centro", "eusebio", "61760000", "CE", "085",
                "3311-1522", "999240434", true);

        User u =  new User("isaac","isaac", "rua verde","cor","lapis", "cores","6011722","085","32245-4552", true);


        driverDao.crateDriver(d);

        userDao.crateUser(u);


        List<Driver> l = driverDao.listDrivers();

        for (int i = 0; i < l.size() ; i++) {
            System.out.println(l.toString());
        }

        List<User> lu = userDao.listUsers();

        for (int i = 0; i < lu.size() ; i++) {
            System.out.println(lu.toString());
        }



    }
}
