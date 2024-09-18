/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factura_y_presupuesto;

/**
 *
 * @author Elba Aban
 */
public class cliente {
    private String nombre;
    private int telefono;
    private String codigo_postal;
    private String direccion;
   

    public cliente(String nombre, int telefono, String codigo_postal, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.codigo_postal = codigo_postal;
        this.direccion = direccion;
       
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public String getDireccion() {
        return direccion;
    }

}
