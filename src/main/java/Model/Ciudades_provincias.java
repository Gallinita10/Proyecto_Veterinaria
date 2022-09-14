/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Ciudades_provincias {
    
    protected int id_cp;
    protected Ciudades ciudad;
    protected Provincias provincia;

    public int getId_cp() {
        return id_cp;
    }

    public void setId_cp(int id_cp) {
        this.id_cp = id_cp;
    }

    public Ciudades getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudades ciudad) {
        this.ciudad = ciudad;
    }

    public Provincias getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincias provincia) {
        this.provincia = provincia;
    }

    public Ciudades_provincias() {
    }

    public Ciudades_provincias(int id_cp, Ciudades ciudad, Provincias provincia) {
        this.id_cp = id_cp;
        this.ciudad = ciudad;
        this.provincia = provincia;
    }

    public Ciudades_provincias(Ciudades ciudad, Provincias provincia) {
        this.ciudad = ciudad;
        this.provincia = provincia;
    }
    
    
    
}
