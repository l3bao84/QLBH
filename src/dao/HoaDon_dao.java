/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
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
import modal.HoaDon;
import modal.KhanhHang;
import modal.NhanVien;
/**
 *
 * @author HELLO
 */
public class HoaDon_dao {
    public static HoaDon_dao getInstance() {
        return new HoaDon_dao();
    }
    
    public int insert(HoaDon hoaDon) {
        int result = 0;
        try {
            
            Connection connection = ConnectionDB.getConnection();
            String sql = "INSERT INTO HoaDon VALUES(?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, hoaDon.getMahd());
            preparedStatement.setString(2, hoaDon.getKhanhHang().getMakh());
            preparedStatement.setString(3, hoaDon.getNhanVien().getManv());
            preparedStatement.setString(4, hoaDon.getNgaylap());
            
            result = preparedStatement.executeUpdate();
            ConnectionDB.closeConnection(connection);
        } catch (SQLException ex) {
            Logger.getLogger(CTHoaDon_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result;
    }
    
    public ArrayList<HoaDon> selectAll() {
        ArrayList<HoaDon> listHD = new ArrayList<HoaDon>();
        try {
            Connection connection = ConnectionDB.getConnection();
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM HoaDon";
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()) {
                String mahd = resultSet.getString("mahd");
                String makh = resultSet.getString("makh");
                String manv = resultSet.getString("manv");
                String ngaylap = resultSet.getString("ngaylap");
                
                KhanhHang kh = KhanhHang_dao.getInstance().selectById(makh);
                        
                NhanVien nhanVien = new NhanVien(); nhanVien.setManv(manv);
                NhanVien nv = NhanVien_dao.getInstance().selectById(nhanVien);
                
                HoaDon hd = new HoaDon(mahd, kh, nv, ngaylap);
                
                listHD.add(hd);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SanPham_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listHD;
    }
    
    public HoaDon selectById(String maHD) {
        HoaDon hd = null;
	try {
            Connection connection = ConnectionDB.getConnection();
            String sql = "SELECT * FROM HoaDon WHERE mahd = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maHD);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                String mahd = resultSet.getString("mahd");
                String makh = resultSet.getString("makh");
                String manv = resultSet.getString("manv");
                String ngaylap = resultSet.getString("ngaylap");

                KhanhHang kh = KhanhHang_dao.getInstance().selectById(makh);
                        
                NhanVien nhanVien = new NhanVien(); nhanVien.setManv(manv);
                NhanVien nv = NhanVien_dao.getInstance().selectById(nhanVien);
                
                hd = new HoaDon(mahd, kh, nv, ngaylap);
            }		
	ConnectionDB.closeConnection(connection);
	} catch (SQLException e) {		
            e.printStackTrace();
	}
	return hd;
    }
    
}
