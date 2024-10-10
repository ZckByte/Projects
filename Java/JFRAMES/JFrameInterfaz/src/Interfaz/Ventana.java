
package Interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Alan
 */
public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("JFrameInterfaz");
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jLabelFondo = new javax.swing.JLabel();
        jComboFondo = new javax.swing.JComboBox<>();
        jLabelColor = new javax.swing.JLabel();
        jComboColor = new javax.swing.JComboBox<>();
        jButtonBorrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jText = new javax.swing.JLabel();
        jTexto = new javax.swing.JTextField();
        jSize = new javax.swing.JLabel();
        jComboSize = new javax.swing.JComboBox<>();
        jButtonAplicar = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 500));
        setResizable(false);

        jLabelFondo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFondo.setText("Color de fondo");

        jComboFondo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Azul", "Amarillo" }));
        jComboFondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboFondo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboFondoActionPerformed(evt);
            }
        });

        jLabelColor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelColor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelColor.setText("Color de letras");

        jComboColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Azul", "Blanco", "Negro" }));

        jButtonBorrar.setText("Predeterminado");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Texto..");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
        );

        jText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jText.setText("Texto");

        jSize.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jSize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jSize.setText("Tamaño");

        jComboSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3", "5", "8", "10", "12", "14", "18", "24" }));
        jComboSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboSizeActionPerformed(evt);
            }
        });

        jButtonAplicar.setText("Aplicar");
        jButtonAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAplicarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jText, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTexto)
                            .addComponent(jComboFondo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboColor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboSize, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelColor, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(jSize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(67, 67, 67))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jButtonAplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFondo)
                    .addComponent(jLabelColor))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText)
                    .addComponent(jSize))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboSize, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
    // Cambiar el fondo del jPanel1 a blanco
    jPanel1.setBackground(Color.WHITE);

    // Restablecer el texto de jLabel3 a "Texto.."
    jLabel3.setText("Texto..");

    // Cambiar el tamaño de la fuente de jLabel3 a 12 puntos
    Font fuentepredeterminada = jLabel3.getFont();
    Font nuevaFuentePredeterminada = fuentepredeterminada.deriveFont(12f);
    jLabel3.setFont(nuevaFuentePredeterminada);
    
    //Color de fuente
    jLabel3.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButtonBorrarActionPerformed

    private void jButtonAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAplicarActionPerformed
        
    ActionListener accion = (ActionEvent e) -> {
        // Obtener la opción seleccionada del JComboBox
        String col = (String) jComboFondo.getSelectedItem();
        String letras = (String) jComboColor.getSelectedItem();
        // Cambiar el fondo del JPanel según la selección
        switch (col) {
            case "Azul": jPanel1.setBackground(Color.BLUE);
                break;
            case "Amarillo": jPanel1.setBackground(Color.YELLOW);
                break;
            case "Rojo": jPanel1.setBackground(Color.red);
                break;
        }
        
        switch (letras) {
            case "Blanco": jLabel3.setForeground(Color.WHITE);
            break;
            case "Azul": jLabel3.setForeground(Color.BLUE);
            break;
            case "Negro": jLabel3.setForeground(Color.BLACK);
            break;
            case "Rojo": jLabel3.setForeground(Color.RED);
            break;
        }
        
        String tex = jTexto.getText();
        jLabel3.setText(tex);
        Font fuenteActual = jLabel3.getFont();
        String combotama = (String) jComboSize.getSelectedItem();
        switch (combotama){
            case "3":
                Font nuevaFuente = fuenteActual.deriveFont(3f);
                jLabel3.setFont(nuevaFuente);
                break;
            case "5":
                nuevaFuente = fuenteActual.deriveFont(5f);
                jLabel3.setFont(nuevaFuente);
                break;

            case "8":
                nuevaFuente = fuenteActual.deriveFont(8f);
                jLabel3.setFont(nuevaFuente);
                break;
            case "10":
                nuevaFuente = fuenteActual.deriveFont(10f);
                jLabel3.setFont(nuevaFuente);
                break;
            case "12":
                nuevaFuente = fuenteActual.deriveFont(12f);
                jLabel3.setFont(nuevaFuente);
                break;
            case "14":
                nuevaFuente = fuenteActual.deriveFont(14f);
                jLabel3.setFont(nuevaFuente);
                break;
            case "18":
                nuevaFuente = fuenteActual.deriveFont(18f);
                jLabel3.setFont(nuevaFuente);
                break;  
            case "24":
                nuevaFuente = fuenteActual.deriveFont(24f);
                jLabel3.setFont(nuevaFuente);
                break;
        }
    };

// Agregar el ActionListener al botón
jButtonAplicar.addActionListener(accion);
    }//GEN-LAST:event_jButtonAplicarActionPerformed

    
    private void jComboFondoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboFondoActionPerformed

    }//GEN-LAST:event_jComboFondoActionPerformed

    private void jComboSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboSizeActionPerformed
    
    
    public static void main(String[] args) {
        Ventana interfaz = new Ventana();
        interfaz.setVisible(true);
        interfaz.setLocationRelativeTo(null);
        interfaz.setTitle("JFrame Interfaz");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAplicar;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JComboBox<String> jComboColor;
    private javax.swing.JComboBox<String> jComboFondo;
    private javax.swing.JComboBox<String> jComboSize;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelColor;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel jSize;
    private javax.swing.JLabel jText;
    private javax.swing.JTextField jTexto;
    // End of variables declaration//GEN-END:variables
}
