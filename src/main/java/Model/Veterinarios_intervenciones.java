/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Veterinarios_intervenciones {
    
    protected int id_vi;
    protected Veterinarios veterinario;
    protected Intervenciones intervencion;

    public int getId_vi() {
        return id_vi;
    }

    public void setId_vi(int id_vi) {
        this.id_vi = id_vi;
    }

    public Veterinarios getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinarios veterinario) {
        this.veterinario = veterinario;
    }

    public Intervenciones getIntervencion() {
        return intervencion;
    }

    public void setIntervencion(Intervenciones intervencion) {
        this.intervencion = intervencion;
    }

    public Veterinarios_intervenciones() {
    }

    public Veterinarios_intervenciones(int id_vi, Veterinarios veterinario, Intervenciones intervencion) {
        this.id_vi = id_vi;
        this.veterinario = veterinario;
        this.intervencion = intervencion;
    }

    public Veterinarios_intervenciones(Veterinarios veterinario, Intervenciones intervencion) {
        this.veterinario = veterinario;
        this.intervencion = intervencion;
    }
    
    
    
}
