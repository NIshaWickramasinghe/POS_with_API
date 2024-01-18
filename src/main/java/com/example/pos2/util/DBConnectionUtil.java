package com.example.pos2.util;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtil {
    private final static String URL = "jdbc:mysql://localhost:3306/pos";
    private final static String user = "root";
    private final static String password = "1234";

    private static DBConnectionUtil dbConnectionUtil;
    private Connection con;

    private DBConnectionUtil() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(URL , user , password);

    }

    public static DBConnectionUtil getInstance() throws SQLException, ClassNotFoundException {
        if (dbConnectionUtil == null) {
            return dbConnectionUtil = new DBConnectionUtil();
        } else {
            return dbConnectionUtil;
        }

    }

    public Connection getConnection() {
        return con;
    }

}
