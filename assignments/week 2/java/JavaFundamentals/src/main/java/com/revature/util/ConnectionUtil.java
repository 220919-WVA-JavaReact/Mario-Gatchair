package com.revature.util;


import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

// We're going to make a Singleton Connection instances
public class ConnectionUtil {

    // TO make this class a Singleton we'll do the following

    // Private static instance of a connection
    private static Connection conn = null;

    //Private constructor

    private ConnectionUtil() {

    }

    // Public static getInstance() method

    // This method will either create a new connection or allow use to reuse the connection that exists

    public static Connection getConnection() {
        // Check to see if there is a connection instance already
        // If there is return it

        try {
            if (conn != null && !conn.isClosed()){
                System.out.println("Use a previously made connection");
                return conn;
            }
        } catch (SQLException e){
            e.printStackTrace();
            return null;
        }
        // If there isn't create a new one

        // This is the not secure method
        /*
        String url = "jdbc:postgresql://stockdatabase.ctgozxdhsnas.us-east-1.rds.amazonaws.com:5432/postgres";
        String username = "postgres";
        String password = "Revature220919";
        // Now we've labeled our credentials let's use them to create a connection
        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Established Connection to Database!");
        } catch (SQLException e) {
            System.out.println("Could not establish connection");
            e.printStackTrace();
        }
        */

        /*
        // Now let's try a more secure method!
        String url = "";
        String username = "";
        String password = "";
        // Now we stored our data in an application.properties file, how do we access it?
        Properties prop = new Properties();
        // We need to load the properties file
        try {
            prop.load(new FileReader("src/main/resources/application.properties"));
            // Now we have loaded it, let's extract the information!
            url = prop.getProperty("url");
            username = prop.getProperty("username");
            password = prop.getProperty("password");
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Established Connection to Database!");
        } catch (IOException e) {
            System.out.println("Could not find properties file!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Could not establish connection!");
            e.printStackTrace();
        }
        */

        // Most secured method

        // We're going to store our information inside environment variables

        // We need to pull those enviroment variable to get the information

        String url = System.getenv("url");
        String username = System.getenv("username");
        String password = System.getenv("password");

        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Established Connection to Database!");
        } catch (SQLException e) {
            System.out.println("Could not establish connection");
            e.printStackTrace();
        }

        return conn;
    }
}