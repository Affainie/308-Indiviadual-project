package controllers;
import java.sql.*;

public class MySqlConnector {

    public static  Connection getConnection()  throws SQLException {
        String url = "jdbc:mysql://localhost:5500/inventory";//"jdbc:mysql://localhost:5500/struct";
//        String username ="maame akua";
//        String password ="12345";

//        Connection connection = DriverManager.getConnection(url, username, password);
        Connection connection = DriverManager.getConnection(url);

        return  connection;
    }
}
