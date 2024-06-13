package com.alilopez.application.conectors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnector {

    private static final String URL = "jdbc:mysql://localhost:3306/cafebalam";
    private static final String USER = "root";
    private static final String PASSWORD = "max123";

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void closeConnection(Connection connection) {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Conexión cerrada.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void executeQuery(String query) {
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                System.out.println(resultSet.getString("client_id") + " " + resultSet.getString("name") + " " + resultSet.getString("lastname") + " " + resultSet.getString("mail") + " " + resultSet.getString("spent") + " " + resultSet.getString("bought"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DatabaseConnector dbConnector = new DatabaseConnector();
        dbConnector.executeQuery("SELECT * FROM client"); // Ajusta según tu consulta
    }
}
