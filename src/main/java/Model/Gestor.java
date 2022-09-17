/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author User
 */
public class Gestor extends Usuario {
    
    protected int id_gestor;
    protected String jornada;

    public int getId_gestor() {
        return id_gestor;
    }

    public void setId_gestor(int id_gestor) {
        this.id_gestor = id_gestor;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
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

    public Gestor() {
    }

    public Gestor(int id_gestor, String jornada, int id_Usuario, int nivel_permiso, String dni, String nombre, String direccion, String telefono, String fecha_nacimiento, String genero) {
        super(id_Usuario, nivel_permiso, dni, nombre, direccion, telefono, fecha_nacimiento, genero);
        this.id_gestor = id_gestor;
        this.jornada = jornada;
    }

    public Gestor(int id_gestor, String jornada, int nivel_permiso, String dni, String nombre, String direccion, String telefono, String fecha_nacimiento, String genero) {
        super(nivel_permiso, dni, nombre, direccion, telefono, fecha_nacimiento, genero);
        this.id_gestor = id_gestor;
        this.jornada = jornada;
    }

    
    
}
