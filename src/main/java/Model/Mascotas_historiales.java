/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Mascotas_historiales {
    
    protected int id_mh;
    protected Mascotas mascota;
    protected Historiales_medicos historial;

    public int getId_mh() {
        return id_mh;
    }

    public void setId_mh(int id_mh) {
        this.id_mh = id_mh;
    }

    public Mascotas getMascota() {
        return mascota;
    }

    public void setMascota(Mascotas mascota) {
        this.mascota = mascota;
    }

    public Historiales_medicos getHistorial() {
        return historial;
    }

    public void setHistorial(Historiales_medicos historial) {
        this.historial = historial;
    }

    public Mascotas_historiales() {
    }

    public Mascotas_historiales(int id_mh, Mascotas mascota, Historiales_medicos historial) {
        this.id_mh = id_mh;
        this.mascota = mascota;
        this.historial = historial;
    }

    public Mascotas_historiales(Mascotas mascota, Historiales_medicos historial) {
        this.mascota = mascota;
        this.historial = historial;
    }
    
    
    
}
