package com.nhnacademy.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtils {
    public DbUtils(){
        throw new IllegalStateException("Utility class");
    }

    public static Connection getConnection() {
        Connection connection = null;
        try {
            //todo connection.
            connection = DriverManager.getConnection("jdbc:mysql://133.186.241.167:3306/nhn_academy_42","nhn_academy_42","Yw1nRF9M.*[8NKLi");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
        return connection;
    }

}