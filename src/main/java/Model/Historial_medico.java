/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Historial_medico {
    protected int id_historial;
    protected Cliente cliente;
    protected Mascota mascota;
    protected Intervencion intervencion;
    protected Cita_medica cita;
    protected Visita_medica visita;

    public int getId_historial() {
        return id_historial;
    }

    public void setId_historial(int id_historial) {
        this.id_historial = id_historial;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Intervencion getIntervencion() {
        return intervencion;
    }

    public void setIntervencion(Intervencion intervencion) {
        this.intervencion = intervencion;
    }

    public Cita_medica getCita() {
        return cita;
    }

    public void setCita(Cita_medica cita) {
        this.cita = cita;
    }

    public Visita_medica getVisita() {
        return visita;
    }

    public void setVisita(Visita_medica visita) {
        this.visita = visita;
    }

    public Historial_medico() {
    }

    public Historial_medico(int id_historial, Cliente cliente, Mascota mascota, Intervencion intervencion, Cita_medica cita, Visita_medica visita) {
        this.id_historial = id_historial;
        this.cliente = cliente;
        this.mascota = mascota;
        this.intervencion = intervencion;
        this.cita = cita;
        this.visita = visita;
    }

    public Historial_medico(Cliente cliente, Mascota mascota, Intervencion intervencion, Cita_medica cita, Visita_medica visita) {
        this.cliente = cliente;
        this.mascota = mascota;
        this.intervencion = intervencion;
        this.cita = cita;
        this.visita = visita;
    }
    
    
    
}
