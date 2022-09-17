/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author User
 */
public class Cita_veterinario {

    protected int id_cv;
    protected Cita_medica cita;
    protected Veterinario veterinario;

    public int getId_cv() {
        return id_cv;
    }

    public void setId_cv(int id_cv) {
        this.id_cv = id_cv;
    }

    public Cita_medica getCita() {
        return cita;
    }

    public void setCita(Cita_medica cita) {
        this.cita = cita;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public Cita_veterinario() {
    }

    public Cita_veterinario(int id_cv, Cita_medica cita, Veterinario veterinario) {
        this.id_cv = id_cv;
        this.cita = cita;
        this.veterinario = veterinario;
    }

    public Cita_veterinario(Cita_medica cita, Veterinario veterinario) {
        this.cita = cita;
        this.veterinario = veterinario;
    }

    
    
}
