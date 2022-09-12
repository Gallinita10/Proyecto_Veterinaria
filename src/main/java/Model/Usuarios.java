/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Usuarios {
    
    protected int id_Usuario;
    protected String nombre;
    protected String contraseña;
    protected String jornada;
    protected String nivel_permiso;

    public int getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public String getNivel_permiso() {
        return nivel_permiso;
    }

    public void setNivel_permiso(String nivel_permiso) {
        this.nivel_permiso = nivel_permiso;
    }

    public Usuarios() {
    }

    public Usuarios( String nombre, String contraseña, String jornada, String nivel_permiso) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.jornada = jornada;
        this.nivel_permiso = nivel_permiso;
    }

    public Usuarios(int id_Usuario, String nombre, String contraseña, String jornada, String nivel_permiso) {
        this.id_Usuario = id_Usuario;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.jornada = jornada;
        this.nivel_permiso = nivel_permiso;
    }

   
    
    
    
}
