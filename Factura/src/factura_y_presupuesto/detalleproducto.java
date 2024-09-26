/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factura_y_presupuesto;

/**
 *
 * @author Elba Aban
 */
public class detalleproducto {
    private int cantidad; //stock
    private double subtotal; // ventana factura/presupuesto
    private producto producto; 
    private String Descripcion_detallada; //agregar una descripcion
    public detalleproducto(int cantidad,String desc,  producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
        this.Descripcion_detallada = desc;
    }
    public producto getProducto(){
        return this.producto;
      }
    
    
    public double getSubtotal(){
        subtotal = getProducto().getPrecio()*getCantidad();
        return subtotal;
    }
    
    public double getCantidad() {
        return cantidad;
    }
 
    public String getDescripcion(){
        return this.Descripcion_detallada;
    }

  

     
}
