/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author User
 */
public class Veterinarios extends Usuarios {
    protected int id_veterinario;
    protected String matricula;

    public int getId_veterinario() {
        return id_veterinario;
    }

    public void setId_veterinario(int id_veterinario) {
        this.id_veterinario = id_veterinario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public int getNivel_permiso() {
        return nivel_permiso;
    }

    public void setNivel_permiso(int nivel_permiso) {
        this.nivel_permiso = nivel_permiso;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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

    public Veterinarios(int id_veterinario, String matricula, int id_Usuario, int nivel_permiso, String dni, String nombre, String direccion, String telefono, String fecha_nacimiento, String genero) {
        super(id_Usuario, nivel_permiso, dni, nombre, direccion, telefono, fecha_nacimiento, genero);
        this.id_veterinario = id_veterinario;
        this.matricula = matricula;
    }

    public Veterinarios(int id_veterinario, String matricula, int nivel_permiso, String dni, String nombre, String direccion, String telefono, String fecha_nacimiento, String genero) {
        super(nivel_permiso, dni, nombre, direccion, telefono, fecha_nacimiento, genero);
        this.id_veterinario = id_veterinario;
        this.matricula = matricula;
    }

    
}
