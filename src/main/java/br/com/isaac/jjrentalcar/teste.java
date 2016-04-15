package br.com.isaac.jjrentalcar;

import br.com.isaac.jjrentalcar.domain.DriverDao;
import br.com.isaac.jjrentalcar.server.Driver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Qualidade on 15/04/2016.
 */
public class teste {

    public static void main(String args[]){


        DriverDao driverDao = new DriverDao();

        Driver d = new Driver("Jairo", "asdas4asd", "dasdas755a4d", "Rua azul",
                "centro", "eusebio", "61760000", "CE", "085",
                "3311-1522", "999240434", true);

        driverDao.crateDriver(d);

        List<Driver> l = new ArrayList();

        l = driverDao.listDrivers();

        for (int i = 0; i < l.size() ; i++) {
            System.out.println(l.toString());
        }


    }
}
