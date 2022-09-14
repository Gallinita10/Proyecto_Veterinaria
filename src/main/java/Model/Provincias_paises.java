/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Provincias_paises {
    
    protected int id_pp;
    protected Provincias provincia;
    protected Paises pais;

    public int getId_pp() {
        return id_pp;
    }

    public void setId_pp(int id_pp) {
        this.id_pp = id_pp;
    }

    public Provincias getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincias provincia) {
        this.provincia = provincia;
    }

    public Paises getPais() {
        return pais;
    }

    public void setPais(Paises pais) {
        this.pais = pais;
    }

    public Provincias_paises() {
    }

    public Provincias_paises(int id_pp, Provincias provincia, Paises pais) {
        this.id_pp = id_pp;
        this.provincia = provincia;
        this.pais = pais;
    }

    public Provincias_paises(Provincias provincia, Paises pais) {
        this.provincia = provincia;
        this.pais = pais;
    }
    
    
    
}
