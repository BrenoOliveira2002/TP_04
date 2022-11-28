/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author breno
 */
public class ConnectionFactory {
    public Connection getConnection() {
         try {
      Class.forName("com.mysql.cj.jdbc.Driver");    
         Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/aulajava", "root", "Breno@157751");
         return conexao;
        } catch(ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (SQLException ex) {
          throw new RuntimeException(ex);
        }
    }
    
}
