/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author fadil
 */
public class koneksi {
    Connection kon;
    public static Connection koneksi() throws SQLException{
        Connection kon = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db_mhs?user=root&pass=");
  return kon;
    }

}
