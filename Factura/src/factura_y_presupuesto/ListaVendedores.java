/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factura_y_presupuesto;

/**
 *
 * @author garca
 */
import java.util.ArrayList;
public class ListaVendedores {
   private ArrayList<vendedor> vendedores;
   public ListaVendedores (){
       vendedores = new ArrayList();
   }

    public ArrayList<vendedor> getVendedores() {
        return vendedores;
    }
   public void AgregarVendedor(vendedor v){
       this.vendedores.add(v);
   }
   public void BorrarVendedor(vendedor v){
       this.vendedores.remove(v);
   }
}
