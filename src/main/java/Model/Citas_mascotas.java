/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Citas_mascotas {
    
    protected int id_cm;
    protected Citas_medicas cita;
    protected Mascotas mascota;

    public int getId_cm() {
        return id_cm;
    }

    public void setId_cm(int id_cm) {
        this.id_cm = id_cm;
    }

    public Citas_medicas getCita() {
        return cita;
    }

    public void setCita(Citas_medicas cita) {
        this.cita = cita;
    }

    public Mascotas getMascota() {
        return mascota;
    }

    public void setMascota(Mascotas mascota) {
        this.mascota = mascota;
    }

    public Citas_mascotas() {
    }

    public Citas_mascotas(int id_cm, Citas_medicas cita, Mascotas mascota) {
        this.id_cm = id_cm;
        this.cita = cita;
        this.mascota = mascota;
    }

    public Citas_mascotas(Citas_medicas cita, Mascotas mascota) {
        this.cita = cita;
        this.mascota = mascota;
    }
    
    
    
}
