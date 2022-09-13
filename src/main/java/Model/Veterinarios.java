/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author User
 */
public class Veterinarios extends Personas {
    protected int id_veterinario;
    protected String Telefono;

    public int getId_veterinario() {
        return id_veterinario;
    }

    public void setId_veterinario(int id_veterinario) {
        this.id_veterinario = id_veterinario;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Veterinarios() {
    }

    public Veterinarios(String Telefono, String dni, String nombre, String direccion, String fecha_nacimiento, String genero) {
        super(dni, nombre, direccion, fecha_nacimiento, genero);
        this.Telefono = Telefono;
    }

    public Veterinarios(int id_veterinario, String Telefono, String dni, String nombre, String direccion, String fecha_nacimiento, String genero) {
        super(dni, nombre, direccion, fecha_nacimiento, genero);
        this.id_veterinario = id_veterinario;
        this.Telefono = Telefono;
    }
    
    
    
}
