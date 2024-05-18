/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author ASUS
 */
public class modeltabeldatarental extends AbstractTableModel{

    List<datarental> dp;
    public modeltabeldatarental(List<datarental>dp){
        this.dp = dp;
    }
    
    @Override
    public int getRowCount() {
        return dp.size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "Kode Rental";
            case 1:
                return "Nama Customer";
            case 2:
                return "No.HP Customer";
            case 3:
                return "Tipe Kendaraan";
            case 4:
                return "Nama Kendaraan";
            case 5:
                return "Biaya (/jam)";
            case 6:
                return "Lama Rental(/jam)";
            case 7:
                return "Total Biaya";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 0:
                return dp.get(row).getKode_rental();
            case 1:
                return dp.get(row).getNama_customer();
            case 2:
                return dp.get(row).getNo_telp_customer();
            case 3:
                return dp.get(row).getTipe_kendaraan();
            case 4:
                return dp.get(row).getNama_kendaraan();
            case 5:
                return dp.get(row).getBiaya_perjam();
            case 6:
                return dp.get(row).getLama_waktu_sewa();
            case 7:
                return dp.get(row).getTotal_biaya();
            default:
                return null;
        }
    }
    
}
