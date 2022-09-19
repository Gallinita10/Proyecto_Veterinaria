/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

/**
 *
 * @author Enzo
 */
public class Conexion {
    public static Connection getConexion() throws ClassNotFoundException{
        
        String conexionUrl = "jdbc:sqlserver://DESKTOP-1PSC1H3\\SQLEXPRESS:1433;"
                +"DB_Name:Veterinaria;"
                +"user:SuperU;"
                +"password:123456;"
                +"loginTimeout=30;"
                +"integratedSecurity=true;";
        
        
        try{
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");     
       System.out.println("Driver funciona correctamente.");
            
            Connection con = DriverManager.getConnection(conexionUrl);
            return con;
        }catch(SQLException ex){
            System.out.println(ex.toString());
            return null;
        }
        
    }
}
