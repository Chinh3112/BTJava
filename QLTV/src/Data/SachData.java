/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Object.Book;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Gaara
 */
public class SachData {
    
    public static PreparedStatement ps;
    public static ResultSet rs;
    
    public static ResultSet showTextfield(String sql) {
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            return ps.executeQuery();
        } catch (Exception e) {
            return null;
        }
    }
    
     public static void InsertSach(Book s) {
        String sql = "insert into SACH values(?,?,?,?,?,?,?)";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            ps.setString(1, s.getId());
            ps.setString(2, s.getTenSach());
            ps.setString(3, s.getTenTacGia());
            ps.setString(4, s.getNhaXB());
            ps.setInt(5, s.getGiaTien());
            ps.setInt(6, s.getStatus());
            ps.setString(7, "");
            ps.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm sách thành công!" , "Thông báo", 1);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Sach không được thêm" , "Thông báo", 1);
        }
    }
    
    public boolean UpdateSach(Book s) {
        try {
            ps = Connect.getConnect().prepareStatement("UPDATE book_item SET  name = ?, author = ?,"
                    + "publisher = ? where id = ?");
            ps.setString(4, s.getId());
            ps.setString(1, s.getTenSach());
            ps.setString(2, s.getTenTacGia());
            ps.setString(3, s.getNhaXB());
//            ps.setInt(4, s.getGiaTien());
//            ps.setInt(5, s.getStatus());
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean DeleteSach(String ms) {
        try {
            ps = Connect.getConnect().prepareStatement("DELETE FROM book_item WHERE id = ?");
            ps.setString(1, ms);
            return ps.executeUpdate() >0;
        } catch(Exception e) {
            return false;
        }
    }
}
