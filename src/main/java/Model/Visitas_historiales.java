/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Visitas_historiales {
    
    protected int id_vh;
    protected Visitas_medicas visita;
    protected Historiales_medicos historial;

    public int getId_vh() {
        return id_vh;
    }

    public void setId_vh(int id_vh) {
        this.id_vh = id_vh;
    }

    public Visitas_medicas getVisita() {
        return visita;
    }

    public void setVisita(Visitas_medicas visita) {
        this.visita = visita;
    }

    public Historiales_medicos getHistorial() {
        return historial;
    }

    public void setHistorial(Historiales_medicos historial) {
        this.historial = historial;
    }

    public Visitas_historiales() {
    }

    public Visitas_historiales(int id_vh, Visitas_medicas visita, Historiales_medicos historial) {
        this.id_vh = id_vh;
        this.visita = visita;
        this.historial = historial;
    }

    public Visitas_historiales(Visitas_medicas visita, Historiales_medicos historial) {
        this.visita = visita;
        this.historial = historial;
    }
    
    
    
}
