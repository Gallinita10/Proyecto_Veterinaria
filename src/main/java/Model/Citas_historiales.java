/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Citas_historiales {
    
    protected int id_ch;
    protected Citas_medicas cita;
    protected Historiales_medicos historial;

    public int getId_ch() {
        return id_ch;
    }

    public void setId_ch(int id_ch) {
        this.id_ch = id_ch;
    }

    public Citas_medicas getCita() {
        return cita;
    }

    public void setCita(Citas_medicas cita) {
        this.cita = cita;
    }

    public Historiales_medicos getHistorial() {
        return historial;
    }

    public void setHistorial(Historiales_medicos historial) {
        this.historial = historial;
    }

    public Citas_historiales() {
    }

    public Citas_historiales(int id_ch, Citas_medicas cita, Historiales_medicos historial) {
        this.id_ch = id_ch;
        this.cita = cita;
        this.historial = historial;
    }

    public Citas_historiales(Citas_medicas cita, Historiales_medicos historial) {
        this.cita = cita;
        this.historial = historial;
    }
    
    
    
}
