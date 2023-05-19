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

public class satuan {
    
    private int id_satuan;
    private String nama_satuan;
    private int created_user;
    private Date created_date;
    private int updated_user;
    private Date updated_date;
    
    public satuan(int id_satuan, String nama_satuan, int created_user, Date created_date, int updated_user, Date updated_date){
        this.id_satuan = id_satuan;
        this.nama_satuan = nama_satuan;
        this.created_user = created_user;
        this.created_date = created_date;
        this.updated_user = updated_user;
        this.updated_date = updated_date;
    }
    
    public int getId_satuan() {
        return id_satuan;
    }

    public void setId_satuan(int id_satuan) {
        this.id_satuan = id_satuan;
    }
    
     public String getNama_satuan() {
        return nama_satuan;
    }

    public void setNama_satuan(String nama_satuan) {
        this.nama_satuan = nama_satuan;
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
