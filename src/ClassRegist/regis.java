/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassRegist;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public interface regis {
    public void insert(regis1 Aplikasi_ClassRegistration);

    public void update(int index, regis1 Aplikasi_ClassRegistration);

    public void delete(int index);

    public DefaultTableModel view();
}
