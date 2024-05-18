/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOdatarental;
import java.sql.*;
import java.util.*;
import koneksi.connector;
import model.*;
import DAOimplement.datarentalimplement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ASUS
 */
public class datarentalDAO implements datarentalimplement {
    Connection connection;
    
    final String select = "SELECT * FROM datarental";
    final String insert = "INSERT INTO datarental (nama_customer, no_telp_customer, tipe_kendaraan, nama_kendaraan, biaya_perjam, lama_waktu_sewa, total_biaya) VALUES (?, ?, ?, ?, ?, ?, ?)";

    
    public datarentalDAO(){
        connection = connector.connection();
    }

    @Override
    public void insert(datarental p) {
        try {
            PreparedStatement ps = connection.prepareStatement(insert);
            ps.setString(1, p.getNama_customer());
            ps.setString(2, p.getNo_telp_customer());
            ps.setString(3, p.getTipe_kendaraan());
            ps.setString(4, p.getNama_kendaraan());
            ps.setInt(5, p.getBiaya_perjam());
            ps.setInt(6, p.getLama_waktu_sewa());
            ps.setInt(7, p.getTotal_biaya());
            
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(datarentalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(datarental p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int kode) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<datarental> getAll() {
        List<datarental> dp = null;
        try{
            dp = new ArrayList<datarental>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while(rs.next()){
                datarental rental = new datarental();
                rental.setKode_rental(rs.getInt("kode_rental"));
                rental.setNama_customer(rs.getString("nama_customer"));
                rental.setNo_telp_customer(rs.getString("no_telp_customer"));
                rental.setTipe_kendaraan(rs.getString("tipe_kendaraan"));
                rental.setNama_kendaraan(rs.getString("nama_kendaraan"));
                rental.setBiaya_perjam(rs.getInt("biaya_perjam"));
                rental.setLama_waktu_sewa(rs.getInt("lama_waktu_sewa"));
                rental.setTotal_biaya(rs.getInt("total_biaya"));
                
                dp.add(rental);
                
            }
            
        }catch(SQLException ex){
            Logger.getLogger(datarentalDAO.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        return dp;
    }

}
