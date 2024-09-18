/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factura_y_presupuesto;

/**
 *
 * @author Elba Aban
 */
public class producto {
     private String nombre;
     private double precio;
     private String unidad_medida;
     private String descripcion;

    public producto(String nombre, double precio, String unidad_medida, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.unidad_medida = unidad_medida;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getUnidad_medida() {
        return unidad_medida;
    }

    public String getDescripcion() {
        return descripcion;
    }
     
}
