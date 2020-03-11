package sample;

import java.sql.*;


public class SqliteConnection {


    public static Connection connection(){

        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            return conn;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
}
