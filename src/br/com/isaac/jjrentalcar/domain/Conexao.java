package br.com.isaac.jjrentalcar.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Qualidade on 14/04/2016.
 */
public class Conexao {
    static{

        try {

            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {



            e.printStackTrace();
        }


    }

    public static Connection getConnection() throws SQLException{

        return DriverManager.getConnection("jdbc:mysql://localhost/jjrentalcar", "root","root");

    }
}



