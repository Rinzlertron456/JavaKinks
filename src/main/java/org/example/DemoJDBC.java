package org.example;

import java.sql.*;
public class DemoJDBC {
    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:5432/dummy";
        String username="postgres";
        String password="devine143";
        Connection connection=DriverManager.getConnection(url,username,password);
    }
}
