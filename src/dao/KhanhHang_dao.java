/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import modal.KhanhHang;
import java.sql.Connection;
import database.ConnectionDB;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.Date;
import java.util.ArrayList;
/**
 *
 * @author HELLO
 */
public class KhanhHang_dao {
    public static KhanhHang_dao getInstance() {
        return new KhanhHang_dao();
    }
    
    public int insert(KhanhHang kh) {
        int result = 0;
        try {
            
            Connection connection = ConnectionDB.getConnection();
            String sql = "INSERT INTO KhanhHang VALUES(?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, kh.getMakh());
            preparedStatement.setString(2, kh.getTenkh());
            preparedStatement.setString(3, kh.getDiachi());
            preparedStatement.setString(4, kh.getSdt());

            
            result = preparedStatement.executeUpdate();
            ConnectionDB.closeConnection(connection);
        } catch (SQLException ex) {
            Logger.getLogger(SanPham_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result;
    }
    
    public KhanhHang selectByName(String tenKH) {
        KhanhHang kh = null;
	try {
            Connection connection = ConnectionDB.getConnection();
            String sql = "SELECT * FROM KhanhHang WHERE tenkh = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, tenKH);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                String makh = resultSet.getString("makh");
                String tenkh = resultSet.getString("tenkh");
                String diachi = resultSet.getString("diachi");
                String sdt = resultSet.getString("sdt");

                kh = new KhanhHang(makh, tenkh, diachi, sdt);
            }		
	ConnectionDB.closeConnection(connection);
	} catch (SQLException e) {		
            e.printStackTrace();
	}
	return kh;
    }
    
    public KhanhHang selectById(String maKH) {
        KhanhHang kh = null;
	try {
            Connection connection = ConnectionDB.getConnection();
            String sql = "SELECT * FROM KhanhHang WHERE makh = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maKH);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                String makh = resultSet.getString("makh");
                String tenkh = resultSet.getString("tenkh");
                String diachi = resultSet.getString("diachi");
                String sdt = resultSet.getString("sdt");

                kh = new KhanhHang(makh, tenkh, diachi, sdt);
            }		
	ConnectionDB.closeConnection(connection);
	} catch (SQLException e) {		
            e.printStackTrace();
	}
	return kh;
    }
}
