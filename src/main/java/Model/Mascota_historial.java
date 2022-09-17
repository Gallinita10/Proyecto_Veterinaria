/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Mascota_historial {
    
    protected int id_mh;
    protected Mascota mascota;
    protected Historial_medico historial;

    public int getId_mh() {
        return id_mh;
    }

    public void setId_mh(int id_mh) {
        this.id_mh = id_mh;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Historial_medico getHistorial() {
        return historial;
    }

    public void setHistorial(Historial_medico historial) {
        this.historial = historial;
    }

    public Mascota_historial() {
    }

    public Mascota_historial(int id_mh, Mascota mascota, Historial_medico historial) {
        this.id_mh = id_mh;
        this.mascota = mascota;
        this.historial = historial;
    }

    public Mascota_historial(Mascota mascota, Historial_medico historial) {
        this.mascota = mascota;
        this.historial = historial;
    }
    
    
    
}
