package tn.esprit.studentmanagement.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL = "jdbc:mysql://192.168.195.132:3306/maven_db?serverTimezone=UTC";
    private static final String USER = "maven_user";
    private static final String PASSWORD = "maven_pass";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void main(String[] args) {
        try (Connection conn = getConnection()) {
            System.out.println("Connected successfully to MySQL!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
