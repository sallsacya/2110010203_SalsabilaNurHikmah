/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salsabila_project;

/**
 *
 * @author LENOVO
 */
import java.util.Date;

public class jenis_barang {
    
    private int id_jenis;
    private String nama_jenis;
    private int created_user;
    private Date created_date;
    private int updated_user;
    private Date updated_date;
    
    public jenis_barang(int id_jenis, String nama_jenis, int created_user, Date created_date, int updated_user, Date updated_date ){
        this.id_jenis = id_jenis;
        this.nama_jenis = nama_jenis;
        this.created_user = created_user;
        this.created_date = created_date;
        this.updated_user = updated_user;
        this.updated_date = updated_date;       
    }
    
    public int getId_jenis() {
        return id_jenis;
    }

    public void setId_jenis(int id_jenis) {
        this.id_jenis = id_jenis;
    }
    
     public String getNama_jenis() {
        return nama_jenis;
    }

    public void setNama_jenis(String nama_jenis) {
        this.nama_jenis= nama_jenis;
    }
    
    public int getCreated_user() {
        return created_user;
    }

    public void setCreated_user(int created_user) {
        this.created_user = created_user;
    }
    
    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }
    
    public int getUpdated_user() {
        return updated_user;
    }

    public void setUpdated_user(int updated_user) {
        this.updated_user = updated_user;
    }
    
    public Date getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(Date updated_date) {
        this.updated_date = updated_date;
    }
}
