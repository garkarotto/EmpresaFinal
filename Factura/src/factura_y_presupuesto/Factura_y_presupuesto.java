/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factura_y_presupuesto;

/**
 *
 * @author Elba Aban
 */
import java.time.LocalDate;
import java.time.Month;
public class Factura_y_presupuesto {

    /**
     *  Ventanas

     */

    public static void main(String[] args) {
        GestorDocumento control = new GestorDocumento();
        cliente luquitasCliente = new cliente("lucas", 221, "1900", "521 ");
        cliente facuCliente = new cliente("facu", 221, "1900", "521 ");
        cliente MarianCliente = new cliente("marian", 221, "1900", "521 ");
        
        vendedor ElbaVendedor1 = new vendedor("elba", "jonas", "rexona", 2);
        vendedor MariaVendedor2 = new vendedor("maria", "aban", "motomel", 3);
         
        
        producto azucar = new producto ("azucar", 1000, "1 kilo", "ledesma");
        producto yerba = new producto ("yerba", 2000, "1 kilo", "playadito");
        producto fideo = new producto ("fideo", 1200, "1/2 kilo", "mostachol");
        
        
        //int cantidad, int codigo_barra,   double total, producto producto
        detalleproducto detalle1 = new detalleproducto (4,  1250, fideo);
        detalleproducto detalle2 = new detalleproducto (2,  1350, yerba);
        detalleproducto detalle3 = new detalleproducto (5,   900, azucar);
        
        
        //String tipo_factura, vendedor vendedor, cliente cliente, String fecha
        factura facturaA = new factura ("factura A", ElbaVendedor1, facuCliente, LocalDate.of(2024,8,18));
        factura facturaB = new factura ("factura B", MariaVendedor2, luquitasCliente, LocalDate.of(2024,8,10));
        factura facturaC = new factura ("factura C", ElbaVendedor1, MarianCliente, LocalDate.of(2023,10,15));
    
        
        facturaA.agregarProducto(detalle3);
        facturaB.agregarProducto(detalle2);
        facturaC.agregarProducto(detalle1);
        facturaA.mostrarCompra();
        
        
        presupuesto presupuesto1 = new presupuesto(  ElbaVendedor1, facuCliente, LocalDate.of(2024, 2, 20),LocalDate.of(2024,12,1));
       // presupuesto1.agregarProducto(detalle1);
       // presupuesto1.agregarProducto(detalle2);
       //presupuesto1.mostrarProductos();
      
        
       control.AgregarDocumento(facturaA);
       control.AgregarDocumento(facturaB);
       
       control.InformeVentaRealizada(LocalDate.of(2024,8,18));
    }
    
}
