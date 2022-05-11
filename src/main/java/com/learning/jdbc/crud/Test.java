package com.learning.jdbc.crud;

import java.sql.*;
import java.io.*;
import java.util.*;

public class Test {

    public static void main(String[] ss) {
        try {
            FileInputStream fn = new FileInputStream("D:\\MyLearningProject\\src\\main\\java\\com\\learning\\jdbc\\crud\\db.properties");
            Properties pr = new Properties();
            pr.load(fn);
            String driver = pr.getProperty("driver");
            String url = pr.getProperty("url");
            String user = pr.getProperty("user");
            String password = pr.getProperty("password");

            Class.forName(driver);

            Connection c = DriverManager.getConnection(url, user, password);
            Statement s = c.createStatement();

            ResultSet result1 = s.executeQuery("select * from emp101");

            while (result1.next()) {
                System.out.println(result1.getString("name") + "=" + result1.getString(2));
            }
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception i) {
            System.out.println(i);
        }
    }
}

//C:\oraclexe\app\oracle\product\10.2.0\server\jdbc\lib\ojdbc14.jar

