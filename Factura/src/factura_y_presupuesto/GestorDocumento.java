/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factura_y_presupuesto;

/**
 *
 * @author garca
 */
import java.time.LocalDate;
import java.util.ArrayList;
public class GestorDocumento {
    private ArrayList<documento> documentos;
    
    public GestorDocumento (){
        documentos = new ArrayList();
    }
    public void AgregarDocumento(documento documento){
        this.documentos.add(documento);
    }
    public ArrayList<documento> getDocumentos(){
        return this.documentos;
    }
     //punto D
    public void InformeVentaRealizada(LocalDate fecha){
        int sumar=0;
        for (int i = 0;i<documentos.size();i++){
            if (documentos.get(i).getFecha_emitido().equals(fecha)){
                sumar++;
            }
        }
        System.out.println("La cantidad de ventas fueron: "+sumar);
    }
}
