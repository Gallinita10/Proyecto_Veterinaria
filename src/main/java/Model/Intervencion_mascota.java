/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Intervencion_mascota {
    
    protected int id_im;
    protected Intervencion intervencion;
    protected Mascota mascota;

    public int getId_im() {
        return id_im;
    }

    public void setId_im(int id_im) {
        this.id_im = id_im;
    }

    public Intervencion getIntervencion() {
        return intervencion;
    }

    public void setIntervencion(Intervencion intervencion) {
        this.intervencion = intervencion;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Intervencion_mascota() {
    }

    public Intervencion_mascota(int id_im, Intervencion intervencion, Mascota mascota) {
        this.id_im = id_im;
        this.intervencion = intervencion;
        this.mascota = mascota;
    }

    public Intervencion_mascota(Intervencion intervencion, Mascota mascota) {
        this.intervencion = intervencion;
        this.mascota = mascota;
    }
    
    
    
}
