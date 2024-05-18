/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class datarental {
     private int kode_rental;
     private String nama_customer;
     private String no_telp_customer;
     private String tipe_kendaraan;
     private String nama_kendaraan;
     private int biaya_perjam;
     private int lama_waktu_sewa;
     private int total_biaya;

    public int getKode_rental() {
        return kode_rental;
    }

    public void setKode_rental(int kode_rental) {
        this.kode_rental = kode_rental;
    }

    public String getNama_customer() {
        return nama_customer;
    }

    public void setNama_customer(String nama_customer) {
        this.nama_customer = nama_customer;
    }

    public String getNo_telp_customer() {
        return no_telp_customer;
    }

    public void setNo_telp_customer(String no_telp_customer) {
        this.no_telp_customer = no_telp_customer;
    }

    public String getTipe_kendaraan() {
        return tipe_kendaraan;
    }

    public void setTipe_kendaraan(String tipe_kendaraan) {
        this.tipe_kendaraan = tipe_kendaraan;
    }

    public String getNama_kendaraan() {
        return nama_kendaraan;
    }

    public void setNama_kendaraan(String nama_kendaraan) {
        this.nama_kendaraan = nama_kendaraan;
    }

    public int getBiaya_perjam() {
        return biaya_perjam;
    }

    public void setBiaya_perjam(int biaya_perjam) {
        this.biaya_perjam = biaya_perjam;
    }

    public int getLama_waktu_sewa() {
        return lama_waktu_sewa;
    }

    public void setLama_waktu_sewa(int lama_waktu_sewa) {
        this.lama_waktu_sewa = lama_waktu_sewa;
    }

    public int getTotal_biaya() {
        return total_biaya;
    }

    public void setTotal_biaya(int total_biaya) {
        this.total_biaya = total_biaya;
    }
     
}
