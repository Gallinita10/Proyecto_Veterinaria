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
public class Visita_medica {
    protected int id_visita;
    protected String tipo_visita;
    protected LocalDate fecha_visita;
    protected LocalTime hora_visita;
    protected Cliente id_cliente_domicilio;

    public int getId_visita() {
        return id_visita;
    }

    public void setId_visita(int id_visita) {
        this.id_visita = id_visita;
    }

    public String getTipo_visita() {
        return tipo_visita;
    }

    public void setTipo_visita(String tipo_visita) {
        this.tipo_visita = tipo_visita;
    }

    public LocalDate getFecha_visita() {
        return fecha_visita;
    }

    public void setFecha_visita(LocalDate fecha_visita) {
        this.fecha_visita = fecha_visita;
    }

    public LocalTime getHora_visita() {
        return hora_visita;
    }

    public void setHora_visita(LocalTime hora_visita) {
        this.hora_visita = hora_visita;
    }

    public Cliente getId_cliente_domicilio() {
        return id_cliente_domicilio;
    }

    public void setId_cliente_domicilio(Cliente id_cliente_domicilio) {
        this.id_cliente_domicilio = id_cliente_domicilio;
    }

    public Visita_medica() {
    }

    public Visita_medica(int id_visita, String tipo_visita, LocalDate fecha_visita, LocalTime hora_visita, Cliente id_cliente_domicilio) {
        this.id_visita = id_visita;
        this.tipo_visita = tipo_visita;
        this.fecha_visita = fecha_visita;
        this.hora_visita = hora_visita;
        this.id_cliente_domicilio = id_cliente_domicilio;
    }

    public Visita_medica(String tipo_visita, LocalDate fecha_visita, LocalTime hora_visita, Cliente id_cliente_domicilio) {
        this.tipo_visita = tipo_visita;
        this.fecha_visita = fecha_visita;
        this.hora_visita = hora_visita;
        this.id_cliente_domicilio = id_cliente_domicilio;
    }

    
}
