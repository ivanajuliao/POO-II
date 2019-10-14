/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ivana
 */
public class ConexaoJDBC {
   
    
    /**
     * Connect to the nomeBD database
     *
     * @return the Connection object
     */
    public static synchronized Connection criaConexao() {
        Connection conexao = null; 
        if( conexao == null){
            try {  
                // Load the JDBC driver  
                String driverName = "org.postgresql.Driver"; // Postgresql driver  
                Class.forName(driverName);
               
                // Create a connection to the database   
//                String url = "jdbc:postgresql://localhost:5432/sportsEvents"; // a JDBC url 
                String url = "jdbc:postgres://motty.db.elephantsql.com:5432/hmrzilbh"; // a JDBC url
                String username = "hmrzilbh";  
                String password = "6P1apMiW1nZd13RQCZh-nfmZOFUpcsGZ";  
                conexao = DriverManager.getConnection(url, username, password); 
                System.out.println("Conexão obtida com sucesso!");
            } catch (SQLException e) {  
                System.out.println(e.getMessage());

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ConexaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
        return conexao;
    }
}
