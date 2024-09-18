/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factura_y_presupuesto;

/**
 *
 * @author Elba Aban
 */
public class factura extends documento {

    private String tipo_factura;

    //vendedor vendedor, cliente cliente, String fecha_emitido
    public factura(String tipo_factura, vendedor vendedor, cliente cliente, String fecha) {
        super(vendedor, cliente, fecha);
        this.tipo_factura = tipo_factura;

    }

    public String getTipo_factura() {
        return tipo_factura;
    }

    public void mostrarProductos() {
        System.out.println("producto: ");
        //for normal 
        for (int i = 0; i < getDetalles().size(); i++) {
            System.out.println("-----------------------");
            //acceder a la coleccion detalle, nos posiciona en la posicion i (ej 5)
            System.out.println("nombre: " + getDetalles().get(i).getProducto().getNombre());
            System.out.println("la cantidad es :  " + getDetalles().get(i).getCantidad());
            System.out.println("el valor por producto es: " + getDetalles().get(i).getProducto().getPrecio());
            System.out.println("el total es : " + getDetalles().get(i).getSubtotal());
            System.out.println("-----------------------");
            

        };

    }

    public void mostrarCompra() {
        System.out.println("-----------------------");

        System.out.println("tipo factura : " + getTipo_factura());
        System.out.println("el nombre del cliente es: " + getCliente().getNombre());
        System.out.println("nombre del vendedor : " + getVendedor().getNombre());
        System.out.println("la fecha de emision es : " + getFecha_emitido());

        System.out.println("---------------------------");
        mostrarProductos();
         System.out.println("la fecha de emision es : " + getFecha_emitido());
    }

}
