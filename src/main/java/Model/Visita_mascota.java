/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Visita_mascota {
    
    protected int id_vm;
    protected Visita_medica visita;
    protected Mascota mascota;

    public int getId_vm() {
        return id_vm;
    }

    public void setId_vm(int id_vm) {
        this.id_vm = id_vm;
    }

    public Visita_medica getVisita() {
        return visita;
    }

    public void setVisita(Visita_medica visita) {
        this.visita = visita;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Visita_mascota() {
    }

    public Visita_mascota(int id_vm, Visita_medica visita, Mascota mascota) {
        this.id_vm = id_vm;
        this.visita = visita;
        this.mascota = mascota;
    }

    public Visita_mascota(Visita_medica visita, Mascota mascota) {
        this.visita = visita;
        this.mascota = mascota;
    }
    
    
    
}
