/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Intervenciones_historiales {
    
    protected int id_ih;
    protected Intervenciones intervencion;
    protected Historiales_medicos historial;

    public int getId_ih() {
        return id_ih;
    }

    public void setId_ih(int id_ih) {
        this.id_ih = id_ih;
    }

    public Intervenciones getIntervencion() {
        return intervencion;
    }

    public void setIntervencion(Intervenciones intervencion) {
        this.intervencion = intervencion;
    }

    public Historiales_medicos getHistorial() {
        return historial;
    }

    public void setHistorial(Historiales_medicos historial) {
        this.historial = historial;
    }

    public Intervenciones_historiales() {
    }

    public Intervenciones_historiales(int id_ih, Intervenciones intervencion, Historiales_medicos historial) {
        this.id_ih = id_ih;
        this.intervencion = intervencion;
        this.historial = historial;
    }

    public Intervenciones_historiales(Intervenciones intervencion, Historiales_medicos historial) {
        this.intervencion = intervencion;
        this.historial = historial;
    }
    
    
    
}
