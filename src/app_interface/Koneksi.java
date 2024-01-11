/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
// */
package app_interface;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Asus
 */
public interface Koneksi {
    String DB_URL = "jdbc:mysql://localhost:3306/lesprivate";
    String DB_USERNAME = "root";
    String DB_PASSWORD = "";
    
    void connect();
}
