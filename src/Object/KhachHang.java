/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

import java.sql.Date;

/**
 *
 * @author Gaara
 */
public class KhachHang {
    
    private String id;
    private String password;
    private String name;
    private Date birth;
    private String diaChi;
    private String phoneNumber;
    
    public KhachHang() {
        
    }
    
    public KhachHang(String maKH, String password, String name, Date birth, String diaChi, String phone) {
        this.id = maKH;
        this.password = password;
        this.name = name;
        this.birth = birth;
        this.diaChi = diaChi;
        this.phoneNumber = phone;
    }
    public String getMaKH() {
        return id;
    }
    public void setMaKH(String maKH) {
        this.id = maKH;
    }
    
    public String getPass() {
        return password;
    }
    public void setPass(String pass) {
        this.password = pass;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name1) {
        this.name = name1;
    }
    
    public Date getBirth() {
        return birth;
    }
    public void setBirth(Date birth) {
        this.birth = birth;
    }
    
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diachi) {
        this.diaChi = diachi;
    }
    
    public String getPhone() {
        return phoneNumber;
    }
    public void setPhone(String phone) {
        this.phoneNumber = phone;
    }
}
