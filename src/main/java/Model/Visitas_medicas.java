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
public class Visitas_medicas {
    protected int id_visita;
    protected Clientes cliente;
    protected Mascotas mascota;
    protected Veterinarios veterinario;
    protected String tipo_visita;
    protected LocalDate fecha_visita;
    protected LocalTime hora_visita;
    protected String domicilio_visita;

    public int getId_visita() {
        return id_visita;
    }

    public void setId_visita(int id_visita) {
        this.id_visita = id_visita;
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

    public String getDomicilio_visita() {
        return domicilio_visita;
    }

    public void setDomicilio_visita(String domicilio_visita) {
        this.domicilio_visita = domicilio_visita;
    }

    public Visitas_medicas() {
    }

    public Visitas_medicas(int id_visita, Clientes cliente, Mascotas mascota, Veterinarios veterinario, String tipo_visita, LocalDate fecha_visita, LocalTime hora_visita, String domicilio_visita) {
        this.id_visita = id_visita;
        this.cliente = cliente;
        this.mascota = mascota;
        this.veterinario = veterinario;
        this.tipo_visita = tipo_visita;
        this.fecha_visita = fecha_visita;
        this.hora_visita = hora_visita;
        this.domicilio_visita = domicilio_visita;
    }

    public Visitas_medicas(Clientes cliente, Mascotas mascota, Veterinarios veterinario, String tipo_visita, LocalDate fecha_visita, LocalTime hora_visita, String domicilio_visita) {
        this.cliente = cliente;
        this.mascota = mascota;
        this.veterinario = veterinario;
        this.tipo_visita = tipo_visita;
        this.fecha_visita = fecha_visita;
        this.hora_visita = hora_visita;
        this.domicilio_visita = domicilio_visita;
    }
    
    
    
}
