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
public class Citas_medicas {
    protected int id_cita;
    protected Clientes cliente;
    protected Mascotas mascota;
    protected Veterinarios veterinario;
    protected String tipo_cita;
    protected LocalDate fecha_cita;
    protected LocalTime hora_cita;

    public int getId_cita() {
        return id_cita;
    }

    public void setId_cita(int id_cita) {
        this.id_cita = id_cita;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
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

    public Citas_medicas() {
    }

    public Citas_medicas(int id_cita, Clientes cliente, Mascotas mascota, Veterinarios veterinario, String tipo_cita, LocalDate fecha_cita, LocalTime hora_cita) {
        this.id_cita = id_cita;
        this.cliente = cliente;
        this.mascota = mascota;
        this.veterinario = veterinario;
        this.tipo_cita = tipo_cita;
        this.fecha_cita = fecha_cita;
        this.hora_cita = hora_cita;
    }

    public Citas_medicas(Clientes cliente, Mascotas mascota, Veterinarios veterinario, String tipo_cita, LocalDate fecha_cita, LocalTime hora_cita) {
        this.cliente = cliente;
        this.mascota = mascota;
        this.veterinario = veterinario;
        this.tipo_cita = tipo_cita;
        this.fecha_cita = fecha_cita;
        this.hora_cita = hora_cita;
    }
    
    
    
}
