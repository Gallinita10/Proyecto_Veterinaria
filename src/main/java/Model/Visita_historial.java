/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Visita_historial {
    
    protected int id_vh;
    protected Visita_medica visita;
    protected Historial_medico historial;

    public int getId_vh() {
        return id_vh;
    }

    public void setId_vh(int id_vh) {
        this.id_vh = id_vh;
    }

    public Visita_medica getVisita() {
        return visita;
    }

    public void setVisita(Visita_medica visita) {
        this.visita = visita;
    }

    public Historial_medico getHistorial() {
        return historial;
    }

    public void setHistorial(Historial_medico historial) {
        this.historial = historial;
    }

    public Visita_historial() {
    }

    public Visita_historial(int id_vh, Visita_medica visita, Historial_medico historial) {
        this.id_vh = id_vh;
        this.visita = visita;
        this.historial = historial;
    }

    public Visita_historial(Visita_medica visita, Historial_medico historial) {
        this.visita = visita;
        this.historial = historial;
    }
    
    
    
}
