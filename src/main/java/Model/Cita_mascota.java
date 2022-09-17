/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Cita_mascota {
    
    protected int id_cm;
    protected Cita_medica cita;
    protected Mascota mascota;

    public int getId_cm() {
        return id_cm;
    }

    public void setId_cm(int id_cm) {
        this.id_cm = id_cm;
    }

    public Cita_medica getCita() {
        return cita;
    }

    public void setCita(Cita_medica cita) {
        this.cita = cita;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Cita_mascota() {
    }

    public Cita_mascota(int id_cm, Cita_medica cita, Mascota mascota) {
        this.id_cm = id_cm;
        this.cita = cita;
        this.mascota = mascota;
    }

    public Cita_mascota(Cita_medica cita, Mascota mascota) {
        this.cita = cita;
        this.mascota = mascota;
    }
    
    
    
}
