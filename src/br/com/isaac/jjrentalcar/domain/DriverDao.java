package br.com.isaac.jjrentalcar.domain;

import br.com.isaac.jjrentalcar.server.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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

    public List<Driver> listDrivers() {

        Connection con = null;
        PreparedStatement stmt = null;
        List<Driver> list = new ArrayList<Driver>();

        try {
            con = Conexao.getConnection();
            stmt = con.prepareStatement("select * from driver");

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

    private Driver getBean(ResultSet rs) throws SQLException {
        int id = rs.getInt("codigo");
        String name = rs.getString("nome");
        String cpf = rs.getString("cpf");
        String rg = rs.getString("rg");
        String adress = rs.getString("endereco");
        String district = rs.getString("bairro");
        String city = rs.getString("cidade");
        String state = rs.getString("estado");
        String cep = rs.getString("cep");
        String phoneCode = rs.getString("codFone");
        String phone1 = rs.getString("telefone");
        String phone2 = rs.getString("telefone2");
        Boolean status = rs.getBoolean("status");

        Driver d = new Driver(name, cpf, rg, adress,district,city,state,cep,phoneCode,phone1,phone2,status);

        d.setKey(id);

        return d;
    }
}
