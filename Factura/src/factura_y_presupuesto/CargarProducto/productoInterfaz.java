

import javax.swing.*;
import javax.swing.text.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class productoInterfaz extends javax.swing.JFrame {

   private ArrayList<producto> productos = new ArrayList<>();

    public productoInterfaz() {
        initComponents();
        productos = new ArrayList<>();
    }

    public ArrayList<producto> getProductos() {
        return productos;
    }


   
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1_nombreproducto = new javax.swing.JTextField();
        jTextField2_precio = new javax.swing.JTextField();
        jTextField3_unidademedida = new javax.swing.JTextField();
        jTextField4_descripcion = new javax.swing.JTextField();
        jButton1_guardar = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jButton2_abrirdetalle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setText("Nombre de Producto");

        jLabel2.setText("Precio");

        jLabel3.setText("Unidad de Medida");

        jLabel4.setText("Descripcion");

        jTextField1_nombreproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_nombreproductoActionPerformed(evt);
            }
        });

        jTextField2_precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_precioActionPerformed(evt);
            }
        });

        jTextField3_unidademedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3_unidademedidaActionPerformed(evt);
            }
        });

        jTextField4_descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4_descripcionActionPerformed(evt);
            }
        });

        jButton1_guardar.setText("Guardar");
        jButton1_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_guardarActionPerformed(evt);
            }
        });

        jTextField6.setText("Ingrese su producto");

        jButton2_abrirdetalle.setText("abrir detalle");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3_unidademedida, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 24, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1_nombreproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1_guardar)
                .addGap(49, 49, 49)
                .addComponent(jButton2_abrirdetalle)
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1_nombreproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3_unidademedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_guardar)
                    .addComponent(jButton2_abrirdetalle))
                .addGap(94, 94, 94))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4_descripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4_descripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4_descripcionActionPerformed

    private void jTextField2_precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_precioActionPerformed

    private void jTextField1_nombreproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_nombreproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_nombreproductoActionPerformed

    private void jTextField3_unidademedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3_unidademedidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3_unidademedidaActionPerformed

    private void jButton1_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_guardarActionPerformed
        try {
            // Recoger los valores de los campos de texto
            String nombre = jTextField1_nombreproducto.getText();
            double precio = Double.parseDouble(jTextField2_precio.getText());
            String unidadMedida = jTextField3_unidademedida.getText();
            String descripcion = jTextField4_descripcion.getText();

            // Crear un nuevo objeto producto
            producto nuevoProducto = new producto(nombre, precio, unidadMedida, descripcion);

            // Añadir el producto al ArrayList
            productos.add(nuevoProducto);

            // Confirmación de que el producto se ha guardado
            System.out.println("el nombre del Producto es : " + nuevoProducto.getNombre());
            System.out.println("el precio del Producto es:  " + nuevoProducto.getPrecio());
            System.out.println("la unidad de medida es  " + nuevoProducto.getUnidaddeMedida());
            System.out.println("la descripcion es   " + nuevoProducto.getDescripcion());

        } catch (NumberFormatException e) {
            // Manejo de errores en caso de que el precio no sea un número válido
            System.out.println("Error: El campo de precio debe ser un número.");
        }
    }//GEN-LAST:event_jButton1_guardarActionPerformed

        public class producto {

        private String nombre;
        private double precio;
        private String unidadMedida;
        private String descripcion;

        public producto(String nombre, double precio, String unidadMedida, String descripcion) {
            this.nombre = nombre;
            this.precio = precio;
            this.unidadMedida = unidadMedida;
            this.descripcion = descripcion;
        }

        public String getNombre() {
            return nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public String getUnidaddeMedida() {
            return unidadMedida;
        }

        public String getDescripcion() {
            return descripcion;
        }
    }
    private producto obtenerProductoSeleccionado() {
        if (!productos.isEmpty()) {
            return productos.get(0); // Cambia esta lógica según cómo estés seleccionando el producto
        } else {
            return null;
        }
     
}

 
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(productoInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(productoInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(productoInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(productoInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new productoInterfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_guardar;
    private javax.swing.JButton jButton2_abrirdetalle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1_nombreproducto;
    private javax.swing.JTextField jTextField2_precio;
    private javax.swing.JTextField jTextField3_unidademedida;
    private javax.swing.JTextField jTextField4_descripcion;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
