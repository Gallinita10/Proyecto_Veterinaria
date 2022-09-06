/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Enzo
 */
public class Intervenciones {
    protected int id_intervencion;
    protected Mascotas mascota;
    protected Veterinarios veterinario;
    protected LocalDate fecha_intervencion;
    protected LocalTime hora_intervencion;
    protected Quirofanos quirofano;
    protected String descripcion;

    public int getId_intervencion() {
        return id_intervencion;
    }

    public void setId_intervencion(int id_intervencion) {
        this.id_intervencion = id_intervencion;
    }

    public Mascotas getMascota() {
        return mascota;
    }

    public void setMascota(Mascotas mascota) {
        this.mascota = mascota;
    }

    public Veterinarios getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinarios veterinario) {
        this.veterinario = veterinario;
    }

    public LocalDate getFecha_intervencion() {
        return fecha_intervencion;
    }

    public void setFecha_intervencion(LocalDate fecha_intervencion) {
        this.fecha_intervencion = fecha_intervencion;
    }

    public LocalTime getHora_intervencion() {
        return hora_intervencion;
    }

    public void setHora_intervencion(LocalTime hora_intervencion) {
        this.hora_intervencion = hora_intervencion;
    }

    public Quirofanos getQuirofano() {
        return quirofano;
    }

    public void setQuirofano(Quirofanos quirofano) {
        this.quirofano = quirofano;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    
    public Intervenciones() {
    }

    public Intervenciones(int id_intervencion, Mascotas mascota, Veterinarios veterinario, LocalDate fecha_intervencion, LocalTime hora_intervencion, Quirofanos quirofano, String descripcion) {
        this.id_intervencion = id_intervencion;
        this.mascota = mascota;
        this.veterinario = veterinario;
        this.fecha_intervencion = fecha_intervencion;
        this.hora_intervencion = hora_intervencion;
        this.quirofano = quirofano;
        this.descripcion = descripcion;
    }

    public Intervenciones(Mascotas mascota, Veterinarios veterinario, LocalDate fecha_intervencion, LocalTime hora_intervencion, Quirofanos quirofano, String descripcion) {
        this.mascota = mascota;
        this.veterinario = veterinario;
        this.fecha_intervencion = fecha_intervencion;
        this.hora_intervencion = hora_intervencion;
        this.quirofano = quirofano;
        this.descripcion = descripcion;
    }

    
    
    
}
