/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import modal.SanPham;
import modal.NhanVien;
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
public class SanPham_dao {
    public static SanPham_dao getInstance() {
        return new SanPham_dao();
    }
    
    public int insert(SanPham sanPham) {
        int result = 0;
        try {
            
            Connection connection = ConnectionDB.getConnection();
            String sql = "INSERT INTO SanPham VALUES(?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, sanPham.getMasp());
            preparedStatement.setString(2, sanPham.getTensp());
            preparedStatement.setString(3, sanPham.getDonvitinh());
            preparedStatement.setFloat(4, sanPham.getDongia());
            preparedStatement.setInt(5, sanPham.getSoluong());
            preparedStatement.setString(6, sanPham.getUrl());
            
            result = preparedStatement.executeUpdate();
            ConnectionDB.closeConnection(connection);
        } catch (SQLException ex) {
            Logger.getLogger(SanPham_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result;
    }
    
    
    public ArrayList<SanPham> selectAll() {
        ArrayList<SanPham> listSP = new ArrayList<SanPham>();
        try {
            Connection connection = ConnectionDB.getConnection();
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM SanPham ORDER BY tensp ASC";
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()) {
                String masp = resultSet.getString("masp");
                String tensp = resultSet.getString("tensp");
                String dvt = resultSet.getString("donvitinh");
                float dongia = resultSet.getFloat("dongia");
                int soluong = resultSet.getInt("soluong");
                String url = resultSet.getString("hinhanh");
                
                SanPham sanPham = new SanPham(masp, tensp, dvt, dongia, soluong, url);
                listSP.add(sanPham);
            }
            ConnectionDB.closeConnection(connection);
        } catch (SQLException ex) {
            Logger.getLogger(SanPham_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listSP;
    }
    
    
    public int update(SanPham sp) {
        int result = 0;
        try {
            
            Connection connection = ConnectionDB.getConnection();
            String sql = "UPDATE SanPham SET tensp = ?, donvitinh = ?, dongia = ?, soluong = ?, hinhanh = ? WHERE masp = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, sp.getTensp());
            preparedStatement.setString(2, sp.getDonvitinh());
            preparedStatement.setFloat(3, sp.getDongia());
            preparedStatement.setInt(4, sp.getSoluong());
            preparedStatement.setString(5, sp.getUrl());
            preparedStatement.setString(6, sp.getMasp());
            
            result = preparedStatement.executeUpdate();
            ConnectionDB.closeConnection(connection);
        } catch (SQLException ex) {
            Logger.getLogger(SanPham_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    
    public int del(SanPham sp) {
        int result = 0;
        try {
            
            Connection connection = ConnectionDB.getConnection();
            String sql = "DELETE FROM SanPham WHERE masp = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, sp.getMasp());
            
            result = preparedStatement.executeUpdate();
            ConnectionDB.closeConnection(connection);
        } catch (SQLException ex) {
            Logger.getLogger(SanPham_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    
    public ArrayList<SanPham> selectByNames(SanPham sp) {
        ArrayList<SanPham> listSP = new ArrayList<>();
        try {
            Connection connection = ConnectionDB.getConnection();
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM SanPham WHERE tensp LIKE N'%"+sp.getTensp()+"%'";
            
            
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()) {
                String masp = resultSet.getString("masp");
                String tensp = resultSet.getString("tensp");
                String dvt = resultSet.getString("donvitinh");
                float dongia = resultSet.getFloat("dongia");
                int soluong = resultSet.getInt("soluong");
                String url = resultSet.getString("hinhanh");
                
                SanPham sanPham = new SanPham(masp, tensp, dvt, dongia, soluong, url);
                listSP.add(sanPham);
            }
            
            ConnectionDB.closeConnection(connection);
        } catch (SQLException ex) {
            Logger.getLogger(SanPham_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listSP;
    }
    
    
    public SanPham selectById(String maSP) {
        SanPham sanPham = null;
	try {
            Connection connection = ConnectionDB.getConnection();
            String sql = "SELECT * FROM SanPham WHERE masp = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maSP);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                String masp = resultSet.getString("masp");
                String tensp = resultSet.getString("tensp");
                String dvt = resultSet.getString("donvitinh");
                float dongia = resultSet.getFloat("dongia");
                int soluong = resultSet.getInt("soluong");
                String url = resultSet.getString("hinhanh");

                sanPham = new SanPham(masp, tensp, dvt, dongia, soluong, url);
            }		
	ConnectionDB.closeConnection(connection);
	} catch (SQLException e) {		
            e.printStackTrace();
	}
	return sanPham;
    }
    
    
}
