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
    private int codigo_barra;
   
    private double total;
    private producto producto;

    public detalleproducto(double cantidad, int codigo_barra,  producto producto) {
        this.cantidad = cantidad;
        
       this.codigo_barra= codigo_barra;
       
        this.producto = producto;
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
  public int getCodigo_barra(){
      return codigo_barra;
  }
    

    

    public double getTotal() {
        return total;
    }

     
}
