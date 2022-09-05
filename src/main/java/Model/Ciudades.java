/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Ciudades {
    protected int id_ciudad;
    protected String nombre;
    protected Provincias provincia;

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

    public Provincias getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincias provincia) {
        this.provincia = provincia;
    }

    public Ciudades() {
    }

    public Ciudades(int id_ciudad, String nombre, Provincias provincia) {
        this.id_ciudad = id_ciudad;
        this.nombre = nombre;
        this.provincia = provincia;
    }

    public Ciudades(String nombre, Provincias provincia) {
        this.nombre = nombre;
        this.provincia = provincia;
    }
    
    
    
}
