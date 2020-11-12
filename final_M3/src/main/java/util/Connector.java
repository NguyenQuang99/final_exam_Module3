package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Connector {
    public static final String DB_URL = "jdbc:mysql://localhost:3306/m3_finalexam";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "123456789";

    private Connector() {
    }

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
