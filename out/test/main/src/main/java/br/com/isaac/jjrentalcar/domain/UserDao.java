package br.com.isaac.jjrentalcar.domain;


import br.com.isaac.jjrentalcar.server.Driver;
import br.com.isaac.jjrentalcar.server.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Qualidade on 18/04/2016.
 */
public class UserDao {

    public void crateUser(User d) {

        Connection con = null;
        PreparedStatement stmt = null;

        try {
            con = Conexao.getConnection();
            stmt = con.prepareStatement("insert into user (login,nome,endereco,bairro,cidade,estado,cep,codFone,telefone,status) " +
                    "values (?,?,?,?,?,?,?,?,?,?) ");

            stmt.setString(1, d.getLogin());
            stmt.setString(2, d.getName());
            stmt.setString(3, d.getAdress());
            stmt.setString(4, d.getDistrict());
            stmt.setString(5, d.getCity());
            stmt.setString(6, d.getState());
            stmt.setString(7, d.getCep());
            stmt.setString(8, d.getPhoneCode());
            stmt.setString(9, d.getPhone());
            stmt.setBoolean(10, d.getStatus());

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


    public List<User> listUsers() {
        Connection con = null;
        PreparedStatement stmt = null;
        List<User> list = new ArrayList<>();

        try {
            con = Conexao.getConnection();
            stmt = con.prepareStatement("select * from user");

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                list.add(getBean(rs));
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
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
        return list;
    }

    private User getBean(ResultSet rs) throws SQLException {
        int id = rs.getInt("codigo");
        String login = rs.getString("login");
        String name = rs.getString("nome");
        String adress = rs.getString("endereco");
        String district = rs.getString("bairro");
        String city = rs.getString("cidade");
        String state = rs.getString("estado");
        String cep = rs.getString("cep");
        String phoneCode = rs.getString("codFone");
        String phone1 = rs.getString("telefone");

        Boolean status = rs.getBoolean("status");

        User u = new User(login,name,adress,district,city,state,cep,phoneCode,phone1,status);

        u.setKey(id);

        return u;
    }
}