package com.jdbc;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.*;

/**
 * Created by Elena on 08.06.2016.
 */
public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/mysql";
    private static final String PASSWORD = "mars";
    private static final String USERNAME = "root";

    public static void main(String[] args) throws SQLException {

       

        try {

            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
        }
        catch (SQLException ex) {
            System.out.println("Driver registration error!");
            return;
        }

        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Statement statement = connection.createStatement())
        {

        }

        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
