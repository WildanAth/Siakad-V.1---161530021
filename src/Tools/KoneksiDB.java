package Tools;

import java.sql.*;
import javax.swing.JOptionPane;

public class KoneksiDB {
    public Connection getConnection() throws SQLException{          //method koneksi DB
        Connection cnn;//deklarasi class Connection
        try{
            //String server = "jdbc:mysql://192.168.1.51/dbsiakadv1_161530021";//
            String server = "jdbc:mysql://localhost/dbsiakadv1_161530021";//nama server
            String drever = "com.mysql.jdbc.Driver";//nama driver koneksi DB MySQL
            Class.forName(drever);//eksekusi driver koneksi DB
            //cnn = DriverManager.getConnection(server, "d2rpl", "12345678");//
            cnn = DriverManager.getConnection(server, "root", "");  //Inisialisasi variabel cnn
            return cnn;
        }catch(SQLException | ClassNotFoundException se){           //Fungsi catch:menampilkan error
            JOptionPane.showMessageDialog(null, "Error koneksi database : "+se);
            return null;
        }
    }
}
