package com.example.pcb;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection connection;

    public static Connection getConnectionInstance(){

        String databaseName = "logindb";
        String databaseUser = "root";
        String databasePassword = "ciao";
        String url = "jdbc:mysql://localhost/"+ databaseName;

        try{
            //Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, databaseUser, databasePassword);

        }catch (Exception e){
            e.printStackTrace();
        }
        return (Connection) connection;
    }


}
