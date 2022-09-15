/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author User
 */
public class Tipo_proveedor {
    
    protected int id_tipo_proveedor;
    protected String titular;
    protected String cuil;
    protected int id_laboratorio;

    public int getId_tipo_proveedor() {
        return id_tipo_proveedor;
    }

    public void setId_tipo_proveedor(int id_tipo_proveedor) {
        this.id_tipo_proveedor = id_tipo_proveedor;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public int getId_laboratorio() {
        return id_laboratorio;
    }

    public void setId_laboratorio(int id_laboratorio) {
        this.id_laboratorio = id_laboratorio;
    }

    public Tipo_proveedor() {
    }

    public Tipo_proveedor(int id_tipo_proveedor, String titular, String cuil, int id_laboratorio) {
        this.id_tipo_proveedor = id_tipo_proveedor;
        this.titular = titular;
        this.cuil = cuil;
        this.id_laboratorio = id_laboratorio;
    }

    public Tipo_proveedor(String titular, String cuil, int id_laboratorio) {
        this.titular = titular;
        this.cuil = cuil;
        this.id_laboratorio = id_laboratorio;
    }
    
    
    
    
}
