package br.com.isaac.jjrentalcar.domain;

import br.com.isaac.jjrentalcar.server.Driver;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Qualidade on 14/04/2016.
 */
public class DriverDao {

    public void crateDriver(Driver d) {

        Connection con = null;
        PreparedStatement stmt = null;

        try {
            con = Conexao.getConnection();
            stmt = con.prepareStatement("insert into driver (nome,cpf,rg,endereco,bairro,cidade,estado,cep,codFone,telefone,telefone2,status) " +
                    "values (?,?,?,?,?,?,?,?,?,?,?,?) ");

            stmt.setString(1, d.getName());
            stmt.setString(2, d.getCpf());
            stmt.setString(3, d.getRg());
            stmt.setString(4, d.getAdress());
            stmt.setString(5, d.getDistrict());
            stmt.setString(6, d.getCity());
            stmt.setString(7, d.getState());
            stmt.setString(8, d.getCep());
            stmt.setString(9, d.getPhoneCode());
            stmt.setString(10, d.getPhone1());
            stmt.setString(11, d.getPhone2());
            stmt.setBoolean(12, d.isStatus());

            stmt.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();
        } finally {

            try {

                stmt.close();
                con.close();

            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }
}
