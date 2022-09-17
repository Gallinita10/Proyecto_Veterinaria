/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Ciudad {
    protected int id_ciudad;
    protected String nombre;

    public int getId_ciudad() {
        return id_ciudad;
    }

    public void setId_ciudad(int id_ciudad) {
        this.id_ciudad = id_ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ciudad() {
    }

    public Ciudad(int id_ciudad, String nombre) {
        this.id_ciudad = id_ciudad;
        this.nombre = nombre;
    }

    public Ciudad(String nombre) {
        this.nombre = nombre;
    }

    
}
