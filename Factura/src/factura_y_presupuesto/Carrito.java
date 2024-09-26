/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factura_y_presupuesto;
import java.util.ArrayList;
/**
 *
 * @author garca
 */
public class Carrito {
    ArrayList<detalleproducto> detalle;
    
    public Carrito (){
        detalle = new ArrayList();
    }
    
    public ArrayList<detalleproducto> getDetalle(){
        return this.detalle;
    }
    public void AgregarDetalle(detalleproducto detalle){
        getDetalle().add(detalle);
    }
    public void BorrarDetalle(detalleproducto detalle){
        getDetalle().remove(detalle);
    }
    
}
