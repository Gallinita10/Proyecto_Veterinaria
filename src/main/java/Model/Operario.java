/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Operario {
    
    protected int id_operario;
    protected String nombre;
    protected String contraseña;
    protected String jornada;
    protected String nivel_permiso;

    public int getId_operario() {
        return id_operario;
    }

    public void setId_operario(int id_operario) {
        this.id_operario = id_operario;
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

    public Operario() {
    }

    public Operario( String nombre, String contraseña, String jornada, String nivel_permiso) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.jornada = jornada;
        this.nivel_permiso = nivel_permiso;
    }

    public Operario(int id_operario, String nombre, String contraseña, String jornada, String nivel_permiso) {
        this.id_operario = id_operario;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.jornada = jornada;
        this.nivel_permiso = nivel_permiso;
    }
    
    
    
}
