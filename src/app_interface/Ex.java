///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
// */
//package main.images;
//
//import com.mysql.cj.jdbc.MysqlDataSource;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//
///**
// *
// * @author Asus
// */
//public class Ex {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        MysqlDataSource dataSource = new MysqlDataSource();
//        String DB_URL = "jdbc:mysql://localhost:3306/lesprivate";
//        String DB_USERNAME = "root";
//        String DB_PASSWORD = "";
//        
//        dataSource.setUrl(DB_URL);
//        dataSource.setUser(DB_USERNAME);
//        dataSource.setPassword(DB_PASSWORD);
//        
//        try {
//            Connection conn = dataSource.getConnection();
//            System.out.println("Koneksi Berhasil");
//            
//            String kueriInsert = "INSERT INTO user (nama, kelas, alamat, kontak, jenis_kelamin) "
//                    + "VALUES (?, ?, ?, ?, ?)";
//            
//            PreparedStatement ps = conn.prepareStatement(kueriInsert);
//            ps.setString(1, "Dzikri");
//            ps.setInt(2, 12);
//            ps.setString(3, "Bandung");
//            ps.setString(4, "123");
//            ps.setInt(5, 0);
//            
//            int rowAffected = ps.executeUpdate();
//            
//            if (rowAffected > 0) {
//                System.out.println("Insert data berhasil");
//            }
//            
//            String kueriSelect = "SELECT * FROM user WHERE alamat = ?";
//            ps = conn.prepareStatement(kueriSelect);
//            ps.setString(1, "Bandung");
//            
//            ResultSet rs = ps.executeQuery();
//            
//            while (rs.next()) {
//                String nama = rs.getString("nama");
//                String alamat = rs.getString("alamat");
//                
//                System.out.println(nama + " tinggal di kota " + alamat);
//            }
//            
//            
//            String kueriDelete = "DELETE FROM user WHERE alamat = ?";
//            ps = conn.prepareStatement(kueriDelete);
//            ps.setString(1, "Bandung");
//            
//            rowAffected = ps.executeUpdate();
//            
//            if (rowAffected > 0) {
//                System.out.println("Delete data berhasil");
//            }
//                    
//            rs.close();
//            ps.close();
//            conn.close();
//            
//        } catch (SQLException ex) {
//            System.out.println("Eksepsi akses data: " + ex.getMessage());
//        }
//    }
//    
//}
