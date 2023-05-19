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

public class barang {
    
    private String id_barang;
    private String nama_barang;
    private int id_jenis;
    private int id_satuan;
    private int stok;
    private int created_user;
    private Date created_date;
    private int updated_user;
    private Date updated_date;
    
    public barang(String id_barang, String nama_barang, int id_jenis, int id_satuan, int stok, int created_user, Date created_date, int updated_user, Date updated_date){
        this.id_barang = id_barang;
        this.nama_barang = nama_barang;
        this.id_jenis = id_jenis;
        this.id_satuan = id_satuan;
        this.stok = stok;
        this.created_user = created_user;
        this.created_date = created_date;
        this.updated_user = updated_user;
        this.updated_date = updated_date;      
    }
    
    public String getId_barang() {
        return id_barang;
    }

    public void setId_barang(String id_barang) {
        this.id_barang = id_barang;
    }
    
    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }
    
    public int getId_jenis() {
        return id_jenis;
    }

    public void setId_jenis(int id_jenis) {
        this.id_jenis = id_jenis;
    }
    
    public int getId_satuan() {
        return id_satuan;
    }

    public void setId_satuan(int id_satuan) {
        this.id_satuan = id_satuan;
    }
    
    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
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

    public void setUpdate_user(int updated_user) {
        this.updated_user = updated_user;
    }
    
     public Date getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(Date updated_date) {
        this.updated_date = updated_date;
    }
}

