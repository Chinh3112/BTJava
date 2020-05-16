/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

/**
 *
 * @author Gaara
 */
public class Admin {
    private String account;
    private String password;
    
    public Admin() {
        
    }
    public Admin(String maAdmin, String password) {
        this.account = maAdmin;
        this.password = password;
    }
    
    public String getMaAdmin() {
        return account;
    }
    public void setMaAdmin(String maAdmin) {
        this.account = maAdmin;
    }
    
    public String getPassword() {
        return password;
    }
    public void setPassword(String pass) {
        this.password = pass;
    }
}
