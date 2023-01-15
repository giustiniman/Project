package com.example.pcb;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String databaseName = "logindb";
    private static final String databaseUser = "root";
    private static final String databasePassword = "pierfrancesco";
    private static final String url = "jdbc:mysql://localhost/"+ databaseName;
    private static Connection connection;

    private DBConnection(){

    }

    public static Connection getDBConnection(){

        try{
            if(connection==null){
                connection = DriverManager.getConnection(url, databaseUser, databasePassword);

            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }







}
