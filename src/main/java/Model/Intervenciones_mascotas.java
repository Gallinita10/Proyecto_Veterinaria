/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Intervenciones_mascotas {
    
    protected int id_im;
    protected Intervenciones intervencion;
    protected Mascotas mascota;

    public int getId_im() {
        return id_im;
    }

    public void setId_im(int id_im) {
        this.id_im = id_im;
    }

    public Intervenciones getIntervencion() {
        return intervencion;
    }

    public void setIntervencion(Intervenciones intervencion) {
        this.intervencion = intervencion;
    }

    public Mascotas getMascota() {
        return mascota;
    }

    public void setMascota(Mascotas mascota) {
        this.mascota = mascota;
    }

    public Intervenciones_mascotas() {
    }

    public Intervenciones_mascotas(int id_im, Intervenciones intervencion, Mascotas mascota) {
        this.id_im = id_im;
        this.intervencion = intervencion;
        this.mascota = mascota;
    }

    public Intervenciones_mascotas(Intervenciones intervencion, Mascotas mascota) {
        this.intervencion = intervencion;
        this.mascota = mascota;
    }
    
    
    
}
