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
public class documento {
    private ListaVendedores vendedores;
    private cliente cliente;
   
    private Carrito Carrito;
    private LocalDate fecha_emitido;
    
    public documento(){
        vendedores = new ListaVendedores();
        Carrito = new Carrito();
    }
    
    
    public cliente getCliente() {
        return cliente;
    }

    public void setCliente(cliente cliente) {
        this.cliente = cliente;
    }

    public Carrito getCarrito() {
        return Carrito;
    }

    public void setCarrito(Carrito Carrito) {
        this.Carrito = Carrito;
    }

    public LocalDate getFecha_emitido() {
        return fecha_emitido;
    }

    public void setFecha_emitido(LocalDate fecha_emitido) {
        this.fecha_emitido = fecha_emitido;
    }

    public ListaVendedores getVendedores() {
        return vendedores;
    }

    public void setVendedores(ListaVendedores vendedores) {
        this.vendedores = vendedores;
    }

    

   
   
    
}
