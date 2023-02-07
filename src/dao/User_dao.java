/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import database.ConnectionDB;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modal.Users;
import java.sql.ResultSet;
import modal.NhanVien;

/**
 *
 * @author HELLO
 */
public class User_dao {
    public static User_dao getInstance() {
        return new User_dao();
    }
    
    public Users selectByUsername(String usernamed) {
        Users users = null;
        
        try {
            Connection connection = ConnectionDB.getConnection();
            String sql = "SELECT * FROM Users WHERE username = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, usernamed);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                String manv = resultSet.getString("manv");
                NhanVien nv = new NhanVien();
                nv.setManv(manv);
                
                NhanVien nhanVien = NhanVien_dao.getInstance().selectById(nv);
                
                users = new Users(username, password, nhanVien);
            }
            
            ConnectionDB.closeConnection(connection);
        } catch (SQLException ex) {
            Logger.getLogger(User_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return users;
    }
}
