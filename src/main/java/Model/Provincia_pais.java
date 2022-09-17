/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Provincia_pais {
    
    protected int id_pp;
    protected Provincia provincia;
    protected Pais pais;

    public int getId_pp() {
        return id_pp;
    }

    public void setId_pp(int id_pp) {
        this.id_pp = id_pp;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Provincia_pais() {
    }

    public Provincia_pais(int id_pp, Provincia provincia, Pais pais) {
        this.id_pp = id_pp;
        this.provincia = provincia;
        this.pais = pais;
    }

    public Provincia_pais(Provincia provincia, Pais pais) {
        this.provincia = provincia;
        this.pais = pais;
    }
    
    
    
}
