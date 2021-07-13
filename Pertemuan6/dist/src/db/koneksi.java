/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author fadil
 */
public class koneksi {
    Connection conn;

    public static Connection koneksi() throws SQLException{
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/db_mhs?user=root&password=");
        return conn;
    }

}
