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

public class barang_keluar {
    
    private String id_barang_keluar;
    private Date tanggal_keluar;
    private int id_barang;
    private int jumlah_keluar;
    private int created_user;
    private Date created_date;

    public barang_keluar(String id_barang_keluar, Date tanggal_keluar, int id_barang, int jumlah_keluar, int created_user, Date created_date) {
        this.id_barang_keluar = id_barang_keluar;
        this.tanggal_keluar = tanggal_keluar;
        this.id_barang = id_barang;
        this.jumlah_keluar = jumlah_keluar;
        this.created_user = created_user;
        this.created_date = created_date;
    }

    public String getId_barang_keluar() {
        return id_barang_keluar;
    }

    public void setId_barang_keluar(String id_barang_keluar) {
        this.id_barang_keluar = id_barang_keluar;
    }

    public Date getTanggal_keluar() {
        return tanggal_keluar;
    }

    public void setTanggal_keluar(Date tanggal_keluar) {
        this.tanggal_keluar = tanggal_keluar;
    }

    public int getId_barang() {
        return id_barang;
    }

    public void setId_barang(int id_barang) {
        this.id_barang = id_barang;
    }

    public int getJumlah_keluar() {
        return jumlah_keluar;
    }

    public void setJumlah_keluar(int jumlah_keluar) {
        this.jumlah_keluar = jumlah_keluar;
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
}
