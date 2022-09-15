/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author User
 */
public class Citas_veterinarios {

    protected int id_cv;
    protected Citas_medicas cita;
    protected Veterinarios veterinario;

    public int getId_cv() {
        return id_cv;
    }

    public void setId_cv(int id_cv) {
        this.id_cv = id_cv;
    }

    public Citas_medicas getCita() {
        return cita;
    }

    public void setCita(Citas_medicas cita) {
        this.cita = cita;
    }

    public Veterinarios getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinarios veterinario) {
        this.veterinario = veterinario;
    }

    public Citas_veterinarios() {
    }

    public Citas_veterinarios(int id_cv, Citas_medicas cita, Veterinarios veterinario) {
        this.id_cv = id_cv;
        this.cita = cita;
        this.veterinario = veterinario;
    }

    public Citas_veterinarios(Citas_medicas cita, Veterinarios veterinario) {
        this.cita = cita;
        this.veterinario = veterinario;
    }
    
    
    
}
