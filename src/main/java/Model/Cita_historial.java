/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Cita_historial {
    
    protected int id_ch;
    protected Cita_medica cita;
    protected Historial_medico historial;

    public int getId_ch() {
        return id_ch;
    }

    public void setId_ch(int id_ch) {
        this.id_ch = id_ch;
    }

    public Cita_medica getCita() {
        return cita;
    }

    public void setCita(Cita_medica cita) {
        this.cita = cita;
    }

    public Historial_medico getHistorial() {
        return historial;
    }

    public void setHistorial(Historial_medico historial) {
        this.historial = historial;
    }

    public Cita_historial() {
    }

    public Cita_historial(int id_ch, Cita_medica cita, Historial_medico historial) {
        this.id_ch = id_ch;
        this.cita = cita;
        this.historial = historial;
    }

    public Cita_historial(Cita_medica cita, Historial_medico historial) {
        this.cita = cita;
        this.historial = historial;
    }
    
    
    
}
