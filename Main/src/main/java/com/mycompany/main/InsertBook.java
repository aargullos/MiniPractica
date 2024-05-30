/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minipractica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InsertBook {
    public static void main(String[] args) {
        Connection conn = DatabaseConnection.getConnection();
        if (conn != null) {
            try {
                String sql = "INSERT INTO Book (id, titol, autor, descripcio) VALUES (?, ?, ?, ?)";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, "Pro Git");
                pstmt.setString(2, "Un animal salvaje");
                pstmt.setString(3, "La mala costumbre");
                
                pstmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

