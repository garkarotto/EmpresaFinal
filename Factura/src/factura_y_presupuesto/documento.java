/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factura_y_presupuesto;

import java.util.ArrayList;

/**
 *
 * @author Elba Aban
 */
public class documento {
    private vendedor vendedor;
    private cliente cliente;
    private ArrayList<detalleproducto> detalleproducto;
    private String fecha_emitido;
    
    
/*public factura(String tipo_factura, factura_y_presupuesto.vendedor vendedor,
            factura_y_presupuesto.cliente cliente, String fecha_emitido) {
        super(vendedor, cliente, fecha_emitido);
        this.tipo_factura = tipo_factura;
    }
*/

    public documento(vendedor vendedor, cliente cliente, String fecha_emitido) {
        this.vendedor = vendedor;
        this.cliente = cliente;
         detalleproducto = new ArrayList();
        this.fecha_emitido = fecha_emitido;
    }

    public vendedor getVendedor() {
        return vendedor;
    }

    public cliente getCliente() {
        return cliente;
    }

    public ArrayList<detalleproducto> getDetalles() {
        return detalleproducto;
    }
    
    //agregar detalle producto
    public void agregarProducto(detalleproducto detalle){
     getDetalles().add(detalle);
    
    }
    //borrar  detalle producto
    public void borrarProducto (detalleproducto detalle){
     getDetalles().remove(detalle);
    
    }
    public String getFecha_emitido() {
        return fecha_emitido;
    }
    
    
    
}
