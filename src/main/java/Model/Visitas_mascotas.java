/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Visitas_mascotas {
    
    protected int id_vm;
    protected Visitas_medicas visita;
    protected Mascotas mascota;

    public int getId_vm() {
        return id_vm;
    }

    public void setId_vm(int id_vm) {
        this.id_vm = id_vm;
    }

    public Visitas_medicas getVisita() {
        return visita;
    }

    public void setVisita(Visitas_medicas visita) {
        this.visita = visita;
    }

    public Mascotas getMascota() {
        return mascota;
    }

    public void setMascota(Mascotas mascota) {
        this.mascota = mascota;
    }

    public Visitas_mascotas() {
    }

    public Visitas_mascotas(int id_vm, Visitas_medicas visita, Mascotas mascota) {
        this.id_vm = id_vm;
        this.visita = visita;
        this.mascota = mascota;
    }

    public Visitas_mascotas(Visitas_medicas visita, Mascotas mascota) {
        this.visita = visita;
        this.mascota = mascota;
    }
    
    
    
}
