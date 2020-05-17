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
    private String address;
    private String phoneNumber;
    
    public KhachHang() {
        
    }
    
    public KhachHang(String id, String password, String name, Date birth, String address, String phone) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.birth = birth;
        this.address = address;
        this.phoneNumber = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
