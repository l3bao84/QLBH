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
import modal.CTHoaDon;
import modal.HoaDon;
import modal.SanPham;
/**
 *
 * @author HELLO
 */
public class CTHoaDon_dao {
    public static CTHoaDon_dao getInstance() {
        return new CTHoaDon_dao();
    }
    
    public int insert(CTHoaDon cthd) {
        int result = 0;
        try {
            
            Connection connection = ConnectionDB.getConnection();
            String sql = "INSERT INTO CTHoaDon VALUES(?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, cthd.getHoaDon().getMahd());
            preparedStatement.setString(2, cthd.getSanPham().getMasp());
            preparedStatement.setInt(3, cthd.getSoluong());
            preparedStatement.setFloat(4, cthd.getTongtien());
            
            result = preparedStatement.executeUpdate();
            ConnectionDB.closeConnection(connection);
        } catch (SQLException ex) {
            Logger.getLogger(CTHoaDon_dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result;
    }
    
    public CTHoaDon selectById(String maHD) {
        CTHoaDon cthd = null;
	try {
            Connection connection = ConnectionDB.getConnection();
            String sql = "SELECT * FROM CTHoaDon WHERE mahd = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maHD);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                String mahd = resultSet.getString("mahd");
                String masp = resultSet.getString("masp");
                int sl = resultSet.getInt("soluong");
                float tongtien = resultSet.getFloat("tongtien");

                SanPham sp = SanPham_dao.getInstance().selectById(masp);
                HoaDon hd = HoaDon_dao.getInstance().selectById(mahd);
                
                cthd = new CTHoaDon(hd, sp, sl, tongtien);
            }		
            ConnectionDB.closeConnection(connection);
	} catch (SQLException e) {		
            e.printStackTrace();
	}
	return cthd;
    }
}
