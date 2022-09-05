/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Provincias {
    protected int id_provincia;
    protected String nombre;

    public int getId_provincia() {
        return id_provincia;
    }

    public void setId_provincia(int id_provincia) {
        this.id_provincia = id_provincia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Provincias() {
    }

    public Provincias(int id_provincia, String nombre) {
        this.id_provincia = id_provincia;
        this.nombre = nombre;
    }

    public Provincias(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
