package com.example.lambdaaws;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection con = null;
        String hostname = null;
        String username = null;
        String password = null;
        String url = null;

        String jdbcDriver = null;
        String dataBaseName = null;
        String dataBasePrefix = null;
        String dataBasePort = null;

        hostname = "database-1.cjrriz7oygwx.us-west-2.rds.amazonaws.com";
        username = "admin";
        password = "12345678";
        jdbcDriver = "com.mysql.cj.jdbc.Driver";
        dataBaseName = "dblambda";
        dataBasePrefix = "jdbc:mysql://";
        dataBasePort = "3306";

        url = dataBasePrefix + hostname + ":" + dataBasePort + "/" + dataBaseName + "/";
        Class.forName(jdbcDriver);
        con = DriverManager.getConnection(url, username, password);

        con.close();
    }
}
