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
public class BookLending {
    private String id;
    private String id_khachhang;
    private String id_sach;
    private Date ngayMuon;
    private Date hanTra;
    private int status;
    
    public BookLending() {
        
    }
    
    public BookLending(String id, String id_khachhang, String id_sach, Date ngayMuon, Date hanTra, int status) {
        this.id = id;
        this.id_khachhang = id_khachhang;
        this.id_sach = id_sach;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId_khachhang() {
        return id_khachhang;
    }

    public void setId_khachhang(String id_khachhang) {
        this.id_khachhang = id_khachhang;
    }

    public String getId_sach() {
        return id_sach;
    }

    public void setId_sach(String id_sach) {
        this.id_sach = id_sach;
    }

    public Date getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(Date ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public Date getHanTra() {
        return hanTra;
    }

    public void setHanTra(Date hanTra) {
        this.hanTra = hanTra;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
}
