package br.com.isaac.jjrentalcar.domain;

import br.com.isaac.jjrentalcar.server.Driver;

import java.sql.Connection;
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
            stmt = con.prepareStatement("insert into usuario (nome,login,senha,sexo,papel) values (?,?,?,?,?) ");

            stmt.setString(1, u.getNome());
            stmt.setString(2, u.getLogin());
            stmt.setString(3, u.getSenha());
            stmt.setString(4, u.getSexo());
            stmt.setString(5,u.getPapel());

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
