package com.revature.util;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {

    // We're going to make a singleton connection class

    // Private static instance of a connection

    private static Connection conn = null;

    //private constructor

    private ConnectionUtil(){

    }

    // Public static getInstance() Method
    public static Connection getConnection(){

        // Check to see if there is a connection, if so return it

        try {
            if (conn != null && !conn.isClosed()){
                System.out.println("Using a previously made connection!");
                return conn;
            }
        } catch (SQLException e) {
            // If we run into an error, just return null and provide some info
            System.out.println("Could not establish connection!");
            return null;
        }

        // If there is no connection we need to create one

        String url = "";
        String username = "";
        String password = "";

        // We need to load this info in from some application.properties file
        Properties prop = new Properties();

        try {
            prop.load(new FileReader("src/main/resources/application.properties"));

            // Now we can extract the values from the application.properties
            url = prop.getProperty("url");
            username = prop.getProperty("username");
            password = prop.getProperty("password");

            // Use the credentials to establish a new connection
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Established connection to database!");

        } catch (IOException e) {
            System.out.println("Property file not found!");
            throw new RuntimeException(e);
        } catch (SQLException e) {
            System.out.println("Could not establish connection");
            throw new RuntimeException(e);
        }

        return conn;
    }

    // I'm going to add in a static block which is just a piece of code that automatically gets loaded in ONE TIME
    // when I spin the actual application, whether I call a constructor or not

    static{
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Failed to load PostgreSQL Driver");
            throw new RuntimeException(e);
        }
    }
}
