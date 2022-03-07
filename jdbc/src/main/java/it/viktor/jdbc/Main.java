/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.viktor.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author tss
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String url = "jdbc:mariadb://localhost:3306";
            Connection connection = DriverManager.getConnection(url, "tss", "ghiglieno");
            System.out.println("Connessione eseguita...");
            Statement cmd = connection.createStatement();
            connection.setCatalog("DBScuola");
            ResultSet rs = cmd.executeQuery("select * from t_corsi");
            while(rs.next()){
                System.out.println(rs.getString("titolo"));
            }
            rs.close();
            connection.close();
        } catch (Exception e) {
            System.err.println("errore..." + e);
        }
    }
    
}
