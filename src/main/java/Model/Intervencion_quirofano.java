/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Intervencion_quirofano {
    
    protected int id_iq;
    protected Intervencion intervencion;
    protected Quirofano quirofano;

    public int getId_iq() {
        return id_iq;
    }

    public void setId_iq(int id_iq) {
        this.id_iq = id_iq;
    }

    public Intervencion getIntervencion() {
        return intervencion;
    }

    public void setIntervencion(Intervencion intervencion) {
        this.intervencion = intervencion;
    }

    public Quirofano getQuirofano() {
        return quirofano;
    }

    public void setQuirofano(Quirofano quirofano) {
        this.quirofano = quirofano;
    }

    public Intervencion_quirofano() {
    }

    public Intervencion_quirofano(int id_iq, Intervencion intervencion, Quirofano quirofano) {
        this.id_iq = id_iq;
        this.intervencion = intervencion;
        this.quirofano = quirofano;
    }

    public Intervencion_quirofano(Intervencion intervencion, Quirofano quirofano) {
        this.intervencion = intervencion;
        this.quirofano = quirofano;
    }
    
    
    
}
