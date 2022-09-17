/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Intervencion_historial {
    
    protected int id_ih;
    protected Intervencion intervencion;
    protected Historial_medico historial;

    public int getId_ih() {
        return id_ih;
    }

    public void setId_ih(int id_ih) {
        this.id_ih = id_ih;
    }

    public Intervencion getIntervencion() {
        return intervencion;
    }

    public void setIntervencion(Intervencion intervencion) {
        this.intervencion = intervencion;
    }

    public Historial_medico getHistorial() {
        return historial;
    }

    public void setHistorial(Historial_medico historial) {
        this.historial = historial;
    }

    public Intervencion_historial() {
    }

    public Intervencion_historial(int id_ih, Intervencion intervencion, Historial_medico historial) {
        this.id_ih = id_ih;
        this.intervencion = intervencion;
        this.historial = historial;
    }

    public Intervencion_historial(Intervencion intervencion, Historial_medico historial) {
        this.intervencion = intervencion;
        this.historial = historial;
    }
    
    
    
}
