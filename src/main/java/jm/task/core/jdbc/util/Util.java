package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final  String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final  String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final  String USERNAME = "VamR";
    private static final  String PASSWORD = "2440894";
    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException | ClassNotFoundException e) {
            System.err.println("Connection ERROR");
        }
        return connection;
    }
}
