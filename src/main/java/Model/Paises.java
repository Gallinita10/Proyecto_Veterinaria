/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Paises {
    
    protected int id_pais;
    protected String nombre;

    public int getId_pais() {
        return id_pais;
    }

    public void setId_pais(int id_pais) {
        this.id_pais = id_pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Paises() {
    }

    public Paises(int id_pais, String nombre) {
        this.id_pais = id_pais;
        this.nombre = nombre;
    }

    public Paises(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
