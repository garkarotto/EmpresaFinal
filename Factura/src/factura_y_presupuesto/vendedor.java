 
package factura_y_presupuesto;

/**
 *
 * @author Elba Aban
 */
public class vendedor {
     private String nombre;
    private String apellido;
    private String razonsocial;
    private int cuit;

    public vendedor(String nombre, String apellido, String razonsocial, int cuit) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.razonsocial = razonsocial;
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

     

    public String getApellido() {
        return apellido;
    }

     

    public String getRazonsocial() {
        return razonsocial;
    }

     
    public int getCuit() {
        return cuit;
    }

     
}
