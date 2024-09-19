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
    private double cantidad;
    private double total;
    private producto producto;
    private String Descripcion;
    public detalleproducto(double cantidad,String desc,  producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
        this.Descripcion = desc;
    }
    public producto getProducto(){
        return this.producto;
      }
    
    
    public double getSubtotal(){
        total = getProducto().getPrecio()*getCantidad();
        return total;
    }
    
    public double getCantidad() {
        return cantidad;
    }
 
    public String getDescripcion(){
        return this.Descripcion;
    }

    public double getTotal() {
        return total;
    }

     
}
