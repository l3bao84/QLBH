/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import modal.NhanVien;
import java.sql.Connection;
import database.ConnectionDB;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.Date;

/**
 *
 * @author HELLO
 */
public class NhanVien_dao {
    public static NhanVien_dao getInstance() {
        return new NhanVien_dao();
    }
    
    public NhanVien selectById(NhanVien nhanVien) {
        NhanVien nv = null;
        try {
            Connection connection = ConnectionDB.getConnection();
            String sql = "SELECT * FROM NhanVien WHERE manv = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, nhanVien.getManv());
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                String manv = resultSet.getString("manv");
                String tennv = resultSet.getString("tennv");
                byte gioitinh = resultSet.getByte("gioitinh");
                String ngaysinh = resultSet.getString("ngaysinh");
                String diachi = resultSet.getString("diachi");
                String sdt = resultSet.getString("sdt");
                String url = resultSet.getString("hinhanh");
                
                nv = new NhanVien(manv, tennv, gioitinh, ngaysinh, diachi, sdt, url);
            }
            
            ConnectionDB.closeConnection(connection);
        } catch (SQLException ex) {
            Logger.getLogger(NhanVien_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nv;
    }
    
    public NhanVien selectByName(String tenNV) {
        NhanVien nv = null;
	try {
            Connection connection = ConnectionDB.getConnection();
            String sql = "SELECT * FROM NhanVien WHERE tennv = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, tenNV);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                String manv = resultSet.getString("manv");
                String tennv = resultSet.getString("tennv");
                byte gioitinh = resultSet.getByte("gioitinh");
                String ngaysinh = resultSet.getString("ngaysinh");
                String diachi = resultSet.getString("diachi");
                String sdt = resultSet.getString("sdt");
                String url = resultSet.getString("hinhanh");
                
                nv = new NhanVien(manv, tennv, gioitinh, ngaysinh, diachi, sdt, url);
            }		
	ConnectionDB.closeConnection(connection);
	} catch (SQLException e) {		
            e.printStackTrace();
	}
	return nv;
    }
}
