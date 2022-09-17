/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Artefacto {
    protected int id_artefacto;
    protected String nombre;
    protected String descripcion;

    public int getId_artefacto() {
        return id_artefacto;
    }

    public void setId_artefacto(int id_artefacto) {
        this.id_artefacto = id_artefacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Artefacto() {
    }

    public Artefacto(int id_artefacto, String nombre, String descripcion) {
        this.id_artefacto = id_artefacto;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Artefacto(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    
    
}
