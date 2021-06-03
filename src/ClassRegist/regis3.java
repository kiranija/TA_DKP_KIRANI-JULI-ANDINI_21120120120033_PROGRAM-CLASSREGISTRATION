/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassRegist;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author User
 */
public class regis3 implements regis {
     @Override
    public void insert(regis1 ClassRegistration) {
        regis2.listClassRegistration.add(ClassRegistration);
        JOptionPane.showMessageDialog(null, "Data Pendaftar tersimpan!");
    }
    @Override
    public void update(int index, regis1 ClassRegistration) {
        regis2.listClassRegistration.set(index, ClassRegistration);
        JOptionPane.showMessageDialog(null, "Data Pendaftar Berhasil diubah!");
    }
    @Override
    public void delete(int index) {
        regis2.listClassRegistration.remove(index);
        JOptionPane.showMessageDialog(null, "Data Berhasil dihapus!");
    }
    @Override
    public DefaultTableModel view() {
        String[] kolom = { "Nama", "No HP", "Alamat", "Jenis Kelamin", "Status", "Kelas", "Tatap Muka 1 Kali", "Jumlah Tatap Muka", "Pengajar", "Hari", "Waktu", "Total" };
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        for (regis1 a : regis2.listClassRegistration) {
            Object[] o = new Object[12];
            double total = 0, tp, jumlah;
            o[0] = a.getnama();
            o[1] = a.gethp();
            o[2] = a.getalamat();
            o[3] = a.getjk();
            o[4] = a.getstatus();
            o[5] = a.getkelas();
            o[6] = a.gettp();
            tp = a.gettp();
            o[7] = a.getjumlah();
            jumlah = a.getjumlah();
            total = tp*jumlah;
            o[8] = a.getinstruktur();
            o[9] = a.gethari();
            o[10] = a.getwaktu();
            o[11] = total;
            dtm.addRow(o);
        }
        return dtm;
    }
}
