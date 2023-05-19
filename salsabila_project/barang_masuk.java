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

public class barang_masuk {

    private String id_barang_masuk;
    private Date tanggal_masuk;
    private int id_barang;
    private int jumlah_masuk;
    private int created_user;
    private Date created_date;

    public barang_masuk(String id_barang_masuk, Date tanggal_masuk, int id_barang, int jumlah_masuk, int created_user, Date created_date) {
        this.id_barang_masuk = id_barang_masuk;
        this.tanggal_masuk = tanggal_masuk;
        this.id_barang = id_barang;
        this.jumlah_masuk = jumlah_masuk;
        this.created_user = created_user;
        this.created_date = created_date;
    }

    public String getId_barang_masuk() {
        return id_barang_masuk;
    }

    public void setId_barang_masuk(String id_barang_masuk) {
        this.id_barang_masuk = id_barang_masuk;
    }

    public Date getTanggal_masuk() {
        return tanggal_masuk;
    }

    public void setTanggal_masuk(Date tanggal_masuk) {
        this.tanggal_masuk = tanggal_masuk;
    }

    public int getId_barang() {
        return id_barang;
    }

    public void setId_barang(int id_barang) {
        this.id_barang = id_barang;
    }

    public int getJumlah_masuk() {
        return jumlah_masuk;
    }

    public void setJumlah_masuk(int jumlah_masuk) {
        this.jumlah_masuk = jumlah_masuk;
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