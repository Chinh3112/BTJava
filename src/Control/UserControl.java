/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import static Control.AccountControl.ps;
import static Control.AccountControl.rs;
import Object.Account;
import Object.Admin;
import Object.Librarian;
import Object.User;
import java.awt.HeadlessException;
import Object.EnumAndConstant.*;
import Object.Member;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author chinh
 */
public class UserControl {
    public static PreparedStatement ps;
    public static ResultSet rs;

    public static boolean addUser(User mb) {
        if (check_account(mb.getAccount()) == false) {
            System.out.println("ok chinh");
            return false;
        }
        String sql_account = "INSERT INTO user (user, password, role, name,address, phone_number) "
          +"VALUES (?, ?, ?, ?, ?, ?)";
        try {
            ps = ConnectDB.getConnect().prepareStatement(sql_account);

            ps.setString(1, mb.getAccount());
            ps.setString(2, mb.getPassword());
            ps.setString(3, mb.getRole());
            ps.setString(4, mb.getName());
            ps.setString(5, mb.getAddress());
            ps.setString(6, mb.getPhoneNumber());
            ps.execute();
            
        } catch (HeadlessException | SQLException e) {
            return false;
        }
        return true;
    }

    public static boolean deleteMember(Member mb) {
        try {
            ps = ConnectDB.getConnect().prepareStatement("DELETE FROM member WHERE id = ?");
            ps.setString(1, mb.getId());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            return false;
        }
    }
    
    public static User login(String account, String password, String role) {
        User usr = null;
        try {
            ps = ConnectDB.getConnect().prepareStatement("SELECT * FROM user where user = ? and password = ? and role = ?");
            ps.setString(1, account);
            ps.setString(2, password);
            ps.setString(3, role);
            rs = ps.executeQuery();
            while (rs.next()) {
                usr = new User();
                usr.setAccount(rs.getString("id"));
                usr.setPassword(rs.getString("password"));
                usr.setRole(rs.getString("role"));
                usr.setName(rs.getString("name"));
                usr.setAddress(rs.getString("address"));
                usr.setPhoneNumber(rs.getString("phone_number"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountControl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return usr;
    }
    
    public static boolean check_account(String account) {
        
        try {
            ps = ConnectDB.getConnect().prepareStatement("SELECT * FROM user where user = ?");
            ps.setString(1, account);
            rs = ps.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountControl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
}
