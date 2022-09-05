/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Historiales_medicos {
    protected int id_historial;
    protected Clientes cliente;
    protected Mascotas mascota;
    protected Intervenciones intervencion;
    protected Citas_medicas cita;
    protected Visitas_medicas visita;

    public int getId_historial() {
        return id_historial;
    }

    public void setId_historial(int id_historial) {
        this.id_historial = id_historial;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Mascotas getMascota() {
        return mascota;
    }

    public void setMascota(Mascotas mascota) {
        this.mascota = mascota;
    }

    public Intervenciones getIntervencion() {
        return intervencion;
    }

    public void setIntervencion(Intervenciones intervencion) {
        this.intervencion = intervencion;
    }

    public Citas_medicas getCita() {
        return cita;
    }

    public void setCita(Citas_medicas cita) {
        this.cita = cita;
    }

    public Visitas_medicas getVisita() {
        return visita;
    }

    public void setVisita(Visitas_medicas visita) {
        this.visita = visita;
    }

    public Historiales_medicos() {
    }

    public Historiales_medicos(int id_historial, Clientes cliente, Mascotas mascota, Intervenciones intervencion, Citas_medicas cita, Visitas_medicas visita) {
        this.id_historial = id_historial;
        this.cliente = cliente;
        this.mascota = mascota;
        this.intervencion = intervencion;
        this.cita = cita;
        this.visita = visita;
    }

    public Historiales_medicos(Clientes cliente, Mascotas mascota, Intervenciones intervencion, Citas_medicas cita, Visitas_medicas visita) {
        this.cliente = cliente;
        this.mascota = mascota;
        this.intervencion = intervencion;
        this.cita = cita;
        this.visita = visita;
    }
    
    
    
}
