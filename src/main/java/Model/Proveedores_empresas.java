/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Enzo
 */
public class Proveedores_empresas extends Proveedores {
    protected String marca;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
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

    public Proveedores_empresas() {
    }

    public Proveedores_empresas(String marca, int id_proveedor, String nombre, String direccion, String telefono) {
        super(id_proveedor, nombre, direccion, telefono);
        this.marca = marca;
    }

    public Proveedores_empresas(String marca, String nombre, String direccion, String telefono) {
        super(nombre, direccion, telefono);
        this.marca = marca;
    }
    
    
    
}
