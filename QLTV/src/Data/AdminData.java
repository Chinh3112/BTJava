/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import static Data.KhachHangData.ps;
import Object.Admin;
import Object.Member;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Gaara
 */
public class AdminData {
    public static PreparedStatement ps;
    public static ResultSet rs;
    
    public Admin dangNhap(String taiKhoan, String pass) {
        Admin ad = null;
        try{
            ps = Connect.getConnect().prepareStatement("SELECT * FROM admin where account = 'chinhnv' and password = '123456'");
            ps.setString(1, taiKhoan);
            ps.setString(2, pass);
            System.out.println(taiKhoan);
            rs = ps.executeQuery();
            while(rs.next()) {
                ad = new Admin();
                
            }
        }
        catch(Exception e) {
            return ad = null;
        }
        return ad;
    }
    
    public static ResultSet showTextfield(String sql) {
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            return ps.executeQuery();
        } catch (Exception e) {
            return null;
        }
        
    }
    
    public boolean UpdateAdmin(Admin ad) {
        try {
            ps = Connect.getConnect().prepareStatement("UPDATE QUAN_TRI SET Password = ? where Ma_Admin = ?");
            ps.setString(2, ad.getMaAdmin());
            ps.setString(1, ad.getPassword());
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean DeleteAdmin(String maAd) {
        try {
            ps = Connect.getConnect().prepareStatement("DELETE FROM QUAN_TRI WHERE Ma_Admin = ?");
            ps.setString(1, maAd);
            return ps.executeUpdate() >0;
        } catch(Exception e) {
            return false;
        }
    }
}
