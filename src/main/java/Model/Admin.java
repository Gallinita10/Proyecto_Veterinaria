/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author User
 */
public class Admin {
    
    protected int id_admin;
    protected String nombre_admin;
    protected String contraseña;
    protected String nombre_usuario;

    public int getId_admin() {
        return id_admin;
    }

    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
    }

    public String getNombre_admin() {
        return nombre_admin;
    }

    public void setNombre_admin(String nombre_admin) {
        this.nombre_admin = nombre_admin;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }
    
    

    public Admin() {
    }

    public Admin(int id_admin, String nombre_admin, String contraseña, String nombre_usuario) {
        this.id_admin = id_admin;
        this.nombre_admin = nombre_admin;
        this.contraseña = contraseña;
        this.nombre_usuario = nombre_usuario;
    }

    public Admin(String nombre_admin, String contraseña, String nombre_usuario) {
        this.nombre_admin = nombre_admin;
        this.contraseña = contraseña;
        this.nombre_usuario = nombre_usuario;
    }

    

    
    
}
