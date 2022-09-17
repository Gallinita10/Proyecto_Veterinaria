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
public class Intervencion {
    protected int id_intervencion;
    protected LocalDate fecha_intervencion;
    protected LocalTime hora_intervencion;
    protected String descripcion;

    public int getId_intervencion() {
        return id_intervencion;
    }

    public void setId_intervencion(int id_intervencion) {
        this.id_intervencion = id_intervencion;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Intervencion() {
    }

    public Intervencion(int id_intervencion, LocalDate fecha_intervencion, LocalTime hora_intervencion, String descripcion) {
        this.id_intervencion = id_intervencion;
        this.fecha_intervencion = fecha_intervencion;
        this.hora_intervencion = hora_intervencion;
        this.descripcion = descripcion;
    }

    public Intervencion(LocalDate fecha_intervencion, LocalTime hora_intervencion, String descripcion) {
        this.fecha_intervencion = fecha_intervencion;
        this.hora_intervencion = hora_intervencion;
        this.descripcion = descripcion;
    }

    
    
}
