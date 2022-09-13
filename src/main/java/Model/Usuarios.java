/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Usuarios extends Personas {
    
    protected int id_Usuario;
    protected String nombre_usuario;
    protected String contraseña;
    protected String jornada;
    protected String nivel_permiso;

    public int getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public String getNivel_permiso() {
        return nivel_permiso;
    }

    public void setNivel_permiso(String nivel_permiso) {
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

    public Usuarios() {
    }

    public Usuarios(int id_Usuario, String nombre_usuario, String contraseña, String jornada, String nivel_permiso, String dni, String nombre, String direccion, String fecha_nacimiento, String genero) {
        super(dni, nombre, direccion, fecha_nacimiento, genero);
        this.id_Usuario = id_Usuario;
        this.nombre_usuario = nombre_usuario;
        this.contraseña = contraseña;
        this.jornada = jornada;
        this.nivel_permiso = nivel_permiso;
    }

    public Usuarios(String nombre_usuario, String contraseña, String jornada, String nivel_permiso, String dni, String nombre, String direccion, String fecha_nacimiento, String genero) {
        super(dni, nombre, direccion, fecha_nacimiento, genero);
        this.nombre_usuario = nombre_usuario;
        this.contraseña = contraseña;
        this.jornada = jornada;
        this.nivel_permiso = nivel_permiso;
    }

    
    
}
