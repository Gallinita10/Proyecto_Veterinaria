/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Enzo
 */
public class Conexion {
    public static Connection getConexion(){
        
        String conexionUrl = "jdbc:sqlserver://localhost:1433;"
                +"database:DB_Veterinaria;"
                +"user:DESKTOP-1PSC1H3\\Enzo;"
                +"password: ;"
                +"loginTimeout=30;"
                +"integratedSecurity=true";
        
        
        try{
            Connection con = DriverManager.getConnection(conexionUrl);
            return con;
        }catch(SQLException ex){
            System.out.println(ex.toString());
            return null;
        }
        
    }
}
