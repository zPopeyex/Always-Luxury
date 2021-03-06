/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo
 */
public class IngresoMercancia extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public IngresoMercancia() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        plantel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        talla = new javax.swing.JComboBox();
        cantidad = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel7.setText("Todos Los Derechos Reservados (c) TM");

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Nombre");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 86, 59, -1));

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 107, 191, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Plantel");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 138, 46, -1));
        add(plantel, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 164, 191, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Talla");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 195, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Cantidad");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 195, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Precio    $");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 260, -1, -1));
        add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 131, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chulito.png"))); // NOI18N
        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, 34));

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Ingreso Mercancia");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 4, 272, 45));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel8.setText("Todos Los Derechos Reservados (c) TM");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, -1, 27));

        talla.setMaximumRowCount(9);
        talla.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "4", "6", "8", "10", "12", "14", "16", "S", "M", "L", "XL" }));
        add(talla, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 221, -1, 24));

        cantidad.setMaximumRowCount(30);
        cantidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        cantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 221, -1, 24));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 700, 10));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel9.setText("Todos Los Derechos Reservados (c) TM");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 510, -1, 27));
        add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, 30));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setOpaque(true);
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 370));

        jScrollPane1.setViewportView(jTextPane1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 280, 170));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //funcion del boton,en este caso registrar//
        String nombrep=nombre.getText();
        String plan=plantel.getText();
        String ta= (String) talla.getSelectedItem();
        String can= (String) cantidad.getSelectedItem();
        int cant=Integer.parseInt(can);
        String valor= precio.getText();
        int va=Integer.parseInt(valor);
       
        //conectar con la base de Datos//
        Basedatos bd= new Basedatos();
        try {
            bd.registrarMerca(nombrep, plan, ta, cant, va);
            JOptionPane.showMessageDialog(null,"Registro exitoso");
            precio.setText("");
            nombre.setText("");
            plantel.setText("");
            talla.setSelectedItem("");
            cantidad.setSelectedItem("");
            
           }
        
        
        catch (FileNotFoundException ex) {
        Logger.getLogger(IngresoMercancia.class.getName()).log(Level.SEVERE, null, ex);
        }
        String [] dato = new String[1];
        dato [0] =precio.getText();
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cantidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField plantel;
    private javax.swing.JTextField precio;
    private javax.swing.JComboBox talla;
    // End of variables declaration//GEN-END:variables
}
