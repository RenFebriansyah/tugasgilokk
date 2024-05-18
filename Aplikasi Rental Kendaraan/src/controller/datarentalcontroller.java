/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import DAOdatarental.datarentalDAO;
import DAOimplement.datarentalimplement;
import model.*;
import view.*;

public class datarentalcontroller {
    private frameTampilData frame1;
    private frameInputData frame2;
    private datarentalimplement impldatarental;

    // Constructor untuk frameTampilData
    public datarentalcontroller(frameTampilData frame1) {
        this.frame1 = frame1;
        this.impldatarental = new datarentalDAO();
        isitabel();
    }

    // Constructor untuk frameInputData
    public datarentalcontroller(frameInputData frame2) {
        this.frame2 = frame2;
        this.impldatarental = new datarentalDAO();
        insert();
    }

    public void isitabel() {
        List<datarental> dp = impldatarental.getAll();
        modeltabeldatarental mp = new modeltabeldatarental(dp);
        frame1.getTabelDatarental().setModel(mp);
    }

    public void insert() {
        // Pastikan frame2 sudah diinisialisasi sebelum digunakan
        if (frame2 != null) {
            datarental dp = new datarental();
            dp.setNama_customer(frame2.getJTxtNamaCustomer().getText());
            dp.setNo_telp_customer(frame2.getJTxtnoHp().getText());

            if (frame2.getJradiobtn1().isSelected()) {
                dp.setTipe_kendaraan("Mobil");
            } else {
                dp.setTipe_kendaraan("Motor");
            }

            dp.setNama_kendaraan(frame2.getJDropKendaraan().getSelectedItem().toString());

            // Mengambil nilai biaya per jam dan lama waktu sewa dari frameInputData
            try {
                int biayaPerJam = Integer.parseInt(frame2.getJFieldBiayaPerjam().getText());
                int lamaSewa = Integer.parseInt(frame2.getJFieldLamaSewa().getText());

                dp.setBiaya_perjam(biayaPerJam);
                dp.setLama_waktu_sewa(lamaSewa);

                // Menghitung total biaya
                int totalBiaya = biayaPerJam * lamaSewa;
                dp.setTotal_biaya(totalBiaya);

                // Insert data ke database menggunakan DAO
                impldatarental.insert(dp);

                // Refresh tabel setelah insert
                isitabel();

            } catch (NumberFormatException e) {
                // Handle jika input tidak valid (misalnya, input tidak berupa angka)
                System.err.println("Error: " + e.getMessage());
                // Tambahkan tindakan lain sesuai kebutuhan, misalnya memberi peringatan kepada pengguna
            }
        } else {
            System.err.println("Error: frame2 is null");
            // Tindakan jika frame2 belum diinisialisasi
        }
    }
}


