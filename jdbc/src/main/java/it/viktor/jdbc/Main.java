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
            String url = "jdbc:mariadb://localhost:3306"; // url a cui connetersi 
            try (Connection connection = DriverManager.getConnection(url, "tss", "ghiglieno")){// connessione
                System.out.println("Connessione eseguita...");
                connection.setCatalog("DBScuola"); // selezione del database
                Statement cmd = connection.createStatement(); // Statement -> oggetto per eseguire dei comandi sul database...
                try (ResultSet rs = cmd.executeQuery("select * from t_corsi")){ // query ResultSet -> serve a memorizzare il risultato della query in memoria
             
                    while(rs.next()){
                        System.out.println(rs.getString("titolo"));
                    }
                }
            }
        } catch (Exception e) {
            System.err.println("errore..." + e);
        }
    }
    
}
