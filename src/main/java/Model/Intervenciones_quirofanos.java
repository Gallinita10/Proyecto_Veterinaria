/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Intervenciones_quirofanos {
    
    protected int id_iq;
    protected Intervenciones intervencion;
    protected Quirofanos quirofano;

    public int getId_iq() {
        return id_iq;
    }

    public void setId_iq(int id_iq) {
        this.id_iq = id_iq;
    }

    public Intervenciones getIntervencion() {
        return intervencion;
    }

    public void setIntervencion(Intervenciones intervencion) {
        this.intervencion = intervencion;
    }

    public Quirofanos getQuirofano() {
        return quirofano;
    }

    public void setQuirofano(Quirofanos quirofano) {
        this.quirofano = quirofano;
    }

    public Intervenciones_quirofanos() {
    }

    public Intervenciones_quirofanos(int id_iq, Intervenciones intervencion, Quirofanos quirofano) {
        this.id_iq = id_iq;
        this.intervencion = intervencion;
        this.quirofano = quirofano;
    }

    public Intervenciones_quirofanos(Intervenciones intervencion, Quirofanos quirofano) {
        this.intervencion = intervencion;
        this.quirofano = quirofano;
    }
    
    
    
}
