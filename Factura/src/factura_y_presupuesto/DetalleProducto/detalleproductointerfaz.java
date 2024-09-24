package factura_y_presupuesto.DetalleProducto;

//import factura_y_presupuesto.CargarProducto.productoInterfaz;
import factura_y_presupuesto.detalleproducto;
import factura_y_presupuesto.producto;
import java.util.ArrayList;

public class detalleproductointerfaz extends javax.swing.JFrame {

    private ArrayList<detalleproducto> listaDetalles = new ArrayList<>();
    private producto productoSeleccionado;

    // Constructor que recibe productoForm
    public detalleproductointerfaz() {
        /*initComponents();
        this.productoSeleccionado = productoSeleccionado; // Almacena el producto seleccionado
        ArrayList<productoInterfaz.producto> productos = productoInterfaz.getProductos(); // Asegúrate de que este método exista
        mostrarProductos(productoSeleccionado);*/
    }

   

    /*// Método para mostrar los productos en el TextArea
    private void mostrarProductos(ArrayList<producto> productos) {
        StringBuilder sb = new StringBuilder();
        for (producto prod : productos) {
            sb.append("Nombre: ").append(prod.getNombre())
                    .append(", Precio: ").append(prod.getPrecio())
                    .append("\n");
        }
        jTextArea1mostrarproducto.setText(sb.toString());
    }*/

    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lblCantidad = new javax.swing.JLabel();
        lblCodigoBarra = new javax.swing.JLabel();
        jpreciounnitario = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        txtCodigoBarra = new javax.swing.JTextField();
        txtpreciounitario = new javax.swing.JTextField();
        jButtonregistrarproducto = new javax.swing.JButton();
        jButtonverdetalle = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1mostrarproducto = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCantidad.setText("Cantidad");

        lblCodigoBarra.setText("Codigo de Barra");

        jpreciounnitario.setText("precio unitario");

        jButtonregistrarproducto.setText("Registrar Detalle");

        jButtonverdetalle.setText("ver detalle");

        jTextArea1mostrarproducto.setColumns(20);
        jTextArea1mostrarproducto.setRows(5);
        jScrollPane1.setViewportView(jTextArea1mostrarproducto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCantidad)
                            .addComponent(lblCodigoBarra)
                            .addComponent(jpreciounnitario))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCodigoBarra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(txtpreciounitario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCantidad)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonregistrarproducto)
                        .addGap(62, 62, 62)
                        .addComponent(jButtonverdetalle))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantidad)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoBarra)
                    .addComponent(txtCodigoBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpreciounnitario)
                    .addComponent(txtpreciounitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonregistrarproducto)
                    .addComponent(jButtonverdetalle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new detalleproductointerfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonregistrarproducto;
    private javax.swing.JButton jButtonverdetalle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea1mostrarproducto;
    private javax.swing.JLabel jpreciounnitario;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCodigoBarra;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigoBarra;
    private javax.swing.JTextField txtpreciounitario;
    // End of variables declaration//GEN-END:variables
}
