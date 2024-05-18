/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOimplement;
import java.util.List;
import model.*;
/**
 *
 * @author ASUS
 */
public interface datarentalimplement {
    public void insert(datarental p);
    public void update(datarental p);
    public void delete(int kode);
    public List<datarental> getAll();
}
