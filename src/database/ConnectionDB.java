/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author HELLO
 */
public class ConnectionDB {
    public static Connection getConnection() {
        Connection connection = null;
        try {
            
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            String url = "jdbc:sqlserver://DESKTOP-EH689S2\\SQLEXPRESS:1433; databaseName = QLBH; integratedSecurity=true; encrypt=true; trustServerCertificate=true;";
            connection = DriverManager.getConnection(url);
            //System.out.println("Successfull connection!");
        } catch (SQLException ex) {
            //System.out.println("Successfull connection!");
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
    
    
    public static void closeConnection(Connection connection) {
        try {
            if(connection != null) {
                connection.close();
                //System.out.println("Successfull stop connection!");
            }
        } catch (SQLException ex) {
            //System.out.println("Failed stop connection!");
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
