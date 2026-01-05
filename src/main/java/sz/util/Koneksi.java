package sz.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Koneksi {

    public static Connection Go() {
        try {
            String url = "jdbc:mysql://localhost:3306/toko_shoes";
            String user = "root";
            String pass = "";

            return DriverManager.getConnection(url, user, pass);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(
                null,
                "Koneksi database GAGAL!\n" + e.getMessage()
            );
            return null;
        }
    }

    public static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}