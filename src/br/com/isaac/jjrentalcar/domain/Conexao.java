package br.com.isaac.jjrentalcar.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Qualidade on 14/04/2016.
 */
public class Conexao {
    public static String status = "Não conectou..."; //Método Construtor da Classe//

    public Conexao() {

    }

    public static java.sql.Connection getConexaoMySQL() {
        Connection connection = null;

        try {
            String driverName = "com.mysql.jdbc.Driver";

            Class.forName(driverName);
            String serverName = "localhost"; //caminho do servidor do BD
            String mydatabase = "jjRentaCar"; //nome do seu banco de dados
            String url = "jdbc:mysql://localhost/jjRentalcar";
            String username = "root"; //nome de um usuário de seu BD
            String password = "root"; //sua senha de acesso
            connection = DriverManager.getConnection(url, username, password);

            if (connection != null) {
                status = ("STATUS--->Conectado com sucesso!");
            } else {
                status = ("STATUS--->Não foi possivel realizar conexão");
            }
            return connection;
        } catch (ClassNotFoundException e) {
            System.out.println("O driver expecificado nao foi encontrado.");
            return null;
        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
            return null;

        }
    }

    public static String statusConection() {
        return status;
    }

    public static boolean FecharConexao() {
        try {
            Conexao.getConexaoMySQL().close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public static java.sql.Connection ReiniciarConexao() {
        FecharConexao();
        return Conexao.getConexaoMySQL();
    }
}



