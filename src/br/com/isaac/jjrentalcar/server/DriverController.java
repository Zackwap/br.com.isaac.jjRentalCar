package br.com.isaac.jjrentalcar.server;

import br.com.isaac.jjrentalcar.domain.DriverDao;

import java.io.IOException;
import java.util.List;

/**
 * Created by Qualidade on 14/04/2016.
 */
public class DriverController {

    Driver driver = new Driver();
    DriverDao driverDao = new DriverDao();


    public DriverController() {
        super();
    }

    public void createDriver(String name, String cpf, String rg, String adress, String district, String city,
                             String cep, String state, String phoneCode, String phone1, String phone2, boolean status) {
        try {
            driver = new Driver(name, cpf, rg, adress, district, city, cep, state, phoneCode, phone1, phone2, status);


        } catch (Exception e) {
            System.out.printf("Drive are not created");
        }
    }


    /*public List<Driver> searchDriver(String name) {
        return driverList;
    }*/

    public Driver editDriver() {
        return driver;
    }


}
