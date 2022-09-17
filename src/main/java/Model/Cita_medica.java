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
public class Cita_medica {
    protected int id_cita;
    protected String tipo_cita;
    protected LocalDate fecha_cita;
    protected LocalTime hora_cita;

    public int getId_cita() {
        return id_cita;
    }

    public void setId_cita(int id_cita) {
        this.id_cita = id_cita;
    }

    public String getTipo_cita() {
        return tipo_cita;
    }

    public void setTipo_cita(String tipo_cita) {
        this.tipo_cita = tipo_cita;
    }

    public LocalDate getFecha_cita() {
        return fecha_cita;
    }

    public void setFecha_cita(LocalDate fecha_cita) {
        this.fecha_cita = fecha_cita;
    }

    public LocalTime getHora_cita() {
        return hora_cita;
    }

    public void setHora_cita(LocalTime hora_cita) {
        this.hora_cita = hora_cita;
    }

    public Cita_medica() {
    }

    public Cita_medica(int id_cita, String tipo_cita, LocalDate fecha_cita, LocalTime hora_cita) {
        this.id_cita = id_cita;
        this.tipo_cita = tipo_cita;
        this.fecha_cita = fecha_cita;
        this.hora_cita = hora_cita;
    }

    public Cita_medica(String tipo_cita, LocalDate fecha_cita, LocalTime hora_cita) {
        this.tipo_cita = tipo_cita;
        this.fecha_cita = fecha_cita;
        this.hora_cita = hora_cita;
    }

    
}
