/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factura_y_presupuesto;

/**
 *
 * @author Elba Aban
 */
import java.time.LocalDate;
public class presupuesto extends documento {

    private LocalDate fecha_caducidad;

    public presupuesto(  vendedor vendedor, cliente cliente, LocalDate fecha_emitido, LocalDate fecha_caducidad) {
        super(vendedor, cliente, fecha_emitido);

        this.fecha_caducidad = fecha_caducidad;
    }

    public LocalDate getFecha_caducidad() {
        return fecha_caducidad;
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

        System.out.println("tipo caducidad : " + getFecha_caducidad());
        System.out.println("el nombre del cliente es: " + getCliente().getNombre());
        System.out.println("nombre del vendedor : " + getVendedor().getNombre());
        System.out.println("la fecha de emision es : " + getFecha_emitido());

        System.out.println("---------------------------");
        mostrarProductos();
         System.out.println("la fecha de emision es : " + getFecha_emitido());
    }

}
