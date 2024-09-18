/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factura_y_presupuesto;

/**
 *
 * @author Elba Aban
 */
public class Factura_y_presupuesto {

    /**
     *  Se necesita realizar un programa para manipular los datos de facturas y
presupuestos. De cada factura se conoce nombre del cliente, teléfono,
dirección, provincia, código postal, email, fecha de emisión, total y tipo de
factura. Las facturas pueden ser A, B o C. Además los datos del vendedor:
nombre y apellido o razón social, domicilio y cuit. El presupuesto consta de
nombre del cliente, teléfono, dirección, provincia, código postal, email, fecha
de emisión, fecha de caducidad y total. Tener presente que en una misma
factura o presupuesto puede haber una o varias líneas de detalle con los
siguientes datos: cantidad, descripción del producto, precio unitario e
importe, este se calcula con la cantidad y precio unitario del producto.

* 
* Realizar un programa que muestre la generación de facturas y
presupuestos a partir de las ventas realizadas.
Instanciar facturas y presupuestos.

     */
    public static void main(String[] args) {
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
        factura facturaA = new factura ("factura A", ElbaVendedor1, facuCliente, "28/11/2024");
        factura facturaB = new factura ("factura B", MariaVendedor2, luquitasCliente, "28/11/2024");
        factura facturaC = new factura ("factura C", ElbaVendedor1, MarianCliente, "28/11/2024");
    
        
        //facturaA.agregarProducto(detalle3);
        //facturaA.mostrarCompra();
        
        presupuesto presupuesto1 = new presupuesto(  ElbaVendedor1, facuCliente, "13/09/2024","21/09/2024");
       presupuesto1.agregarProducto(detalle1);
             presupuesto1.agregarProducto(detalle2);
       presupuesto1.mostrarProductos();
      
    
    
    }
    
}
