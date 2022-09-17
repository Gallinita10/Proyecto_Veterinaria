/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;

/**
 *
 * @author User
 */
public class Presupuesto {
    protected int id_factura;
    protected int punto_venta;
    protected int nro_comprobante;
    protected LocalDate fecha_emision;
    protected float precio_unitario;
    protected float precio_total;
    protected float iva;
    protected int cantidad_articulos;
    protected String tipo_de_unidades;
    protected String tipo_factura;
    protected Cliente Clientes;
    protected String emisor;
    protected String Productos[];
    protected String Servicios[];
}
