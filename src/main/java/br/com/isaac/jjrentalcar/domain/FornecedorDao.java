package br.com.isaac.jjrentalcar.domain;

import br.com.isaac.jjrentalcar.server.Driver;
import br.com.isaac.jjrentalcar.server.Fornecedor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Qualidade on 19/04/2016.
 */
public class FornecedorDao {

    public void crateForncedor(Fornecedor f) {

        Connection con = null;
        PreparedStatement stmt = null;

        try {
            con = Conexao.getConnection();
            stmt = con.prepareStatement("insert into user (nameReason," +
                    "  nameFantasy,  juriPerson,  fisPerson,  cpf,rg,  " +
                    "insMun,  insSufama,  cep,  adress,  district, city, " +
                    " state,  codPhone,  phone,  phone2,  email,personContact) " +
                    "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ");

            stmt.setString(1, f.getNameReason());
            stmt.setString(2, f.getNameFantasy());
            stmt.setBoolean(3, f.isJuriPerson());
            stmt.setBoolean(4, f.isFisPerson());
            stmt.setString(5, f.getCpf());
            stmt.setString(6, f.getRg());
            stmt.setString(7, f.getInsMun());
            stmt.setString(8, f.getInsSufama());
            stmt.setString(9, f.getCep());
            stmt.setString(10, f.getAdress());
            stmt.setString(11, f.getDistrict());
            stmt.setString(12, f.getCity());
            stmt.setString(13, f.getState());
            stmt.setString(14, f.getCodPhone());
            stmt.setString(15, f.getPhone());
            stmt.setString(16, f.getPhone2());
            stmt.setString(17, f.getEmail());
            stmt.setString(18, f.getPersonContact());


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

    public List<Fornecedor> listDrivers() {

        Connection con = null;
        PreparedStatement stmt = null;
        List<Fornecedor> list = new ArrayList<>();

        try {
            con = Conexao.getConnection();
            stmt = con.prepareStatement("select * from fornecedor");

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


    private Fornecedor getBean(ResultSet rs) throws SQLException {
        int id = rs.getInt("codigo");
        String nameReason = rs.getString("nomeRazao");
        String nameFantasy = rs.getString("nomeFantasia");
        Boolean juriPerson = rs.getBoolean("pessoaFisica");
        Boolean fisPerson = rs.getBoolean("pessoaJuridica");
        String rg = rs.getString("rg");
        String cpf = rs.getString("cpf");
        String insMun = rs.getString("inscMunicipal");
        String insSufama = rs.getString("inscSufama");
        String cep = rs.getString("cep");
        String adress = rs.getString("endereco")
        String district = rs.getString("bairro");
        String city = rs.getString("cidade");
        String state = rs.getString("estado");
        String codPhone = rs.getString("ddd");
        String phone = rs.getString("telefone");
        String phone2 = rs.getString("telefone2");
        String email = rs.getString("email");
        String homePAge = rs.getString("homePage");
        String personContact = rs.getString("contatoPessoal");
        Date dtCriacao = rs.getDate("dtCriacao");


        Fornecedor f = new Fornecedor(nameReason, nameFantasy, juriPerson, fisPerson, rg, cpf,
                insMun, insSufama, cep, adress, district, city, state, codPhone,
                phone, phone2, email, homePAge, personContact);

        f.setKey(id);
        f.setRegDate(dtCriacao);


        return f;
    }


}
