package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
    private static final String URL = "jdbc:mysql://localhost:3306/Padaria";
    private static final String USUARIO = "root";
    private static final String SENHA = "123456";

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }
}
