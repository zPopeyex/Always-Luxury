/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leonardo
 */
public class Ventas extends javax.swing.JPanel {
    public int re;
    public int e;
    public Ventas() {
        initComponents();
         
      try {
     
         Class.forName("com.mysql.jdbc.Driver");
         Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/mercancia", "root", "");
         Statement stm = conexion.createStatement();
         ResultSet res = stm.executeQuery("SELECT * FROM ventas");
         ResultSetMetaData rsMd= res.getMetaData();
         int numeroColumnas=rsMd.getColumnCount();
         
         DefaultTableModel modelo = new DefaultTableModel();
         this.tabla12.setModel(modelo);
         tabla12.setEnabled(false);
         for(int x=1;x<=numeroColumnas; x++){
             modelo.addColumn(rsMd.getColumnLabel(x));
             
         }
         
         while (res.next()){
             Object [] fila = new Object [numeroColumnas];
             
             for(int y=0; y<numeroColumnas; y++){
                 fila [y]=res.getObject(y+1);
                 
             }
             
             modelo.addRow(fila);
         
         }
         
         
         
     
     }
     
     catch(ClassNotFoundException in){
     in.printStackTrace();
     
      }
     
     catch(SQLException se){
     se.printStackTrace();
     
     }  
        
        
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cantidad = new javax.swing.JComboBox();
        valor = new javax.swing.JTextField();
        talla = new javax.swing.JComboBox();
        producto = new javax.swing.JComboBox();
        plantel = new javax.swing.JComboBox();
        Aceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla12 = new javax.swing.JTable();
        gastos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        labelSIgno = new javax.swing.JLabel();
        labelTotal2 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(770, 370));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Cantidad");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Plantel");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Gastos");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Talla");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Valor");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        cantidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadActionPerformed(evt);
            }
        });
        add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 40, 30));
        add(valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 60, 30));

        talla.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "6", "8", "10", "12", "14", "16", "S", "M", "L", "XL" }));
        add(talla, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 50, 30));

        producto.setMaximumRowCount(9);
        producto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Camibuso", "Sudadera", "Blusa", "Pijama", "Falda" }));
        add(producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 130, 30));

        plantel.setMaximumRowCount(9);
        plantel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Agustin Nieto", "Boyaca", "San Pedro" }));
        add(plantel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 130, 30));

        Aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chulito.png"))); // NOI18N
        Aceptar.setBorder(null);
        Aceptar.setBorderPainted(false);
        Aceptar.setHideActionText(true);
        Aceptar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Aceptar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AceptarMouseClicked(evt);
            }
        });
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });
        add(Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 70, 40));

        tabla12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tabla12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cantidad", "Producto", "Plantel", "Talla", "Valor", "Gastos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla12);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 540, 170));
        add(gastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 130, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Producto");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        txtTotal.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        txtTotal.setText("TOTAL");
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 90, 60));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 120, 10));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 120, 10));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 120, 10));

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 10, 80));

        labelSIgno.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 20)); // NOI18N
        labelSIgno.setForeground(new java.awt.Color(51, 153, 0));
        labelSIgno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSIgno.setText("$");
        add(labelSIgno, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, -1, -1));

        labelTotal2.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        labelTotal2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTotal2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                labelTotal2KeyTyped(evt);
            }
        });
        add(labelTotal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 100, 60));

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 10, 80));
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AceptarMouseClicked

        

    }//GEN-LAST:event_AceptarMouseClicked

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        
        String can= (String) cantidad.getSelectedItem();
        int canti=Integer.parseInt(can);
        String pro=(String) producto.getSelectedItem();
        String pla=(String) plantel.getSelectedItem();
        String ta=(String) talla.getSelectedItem();
        String val=(String) valor.getText();
        int valo=Integer.parseInt(val);
        String gas=(String) gastos.getText();
        int gast=Integer.parseInt(gas);
        
        
        Basedatos bd2= new Basedatos();
        try {
        
        bd2.registrarVenta( canti,  pro, pla, ta, valo,gast) ;
        JOptionPane.showMessageDialog(null,"Venta Ingresada Exitosamente");
        cantidad.setSelectedItem("");
        producto.setSelectedItem("");
        plantel.setSelectedItem("");
        talla.setSelectedItem("");
        valor.setText("");
        gastos.setText("");
        
        } 
        
        catch (FileNotFoundException ex) {
            Logger.getLogger(Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        try {
     
         Class.forName("com.mysql.jdbc.Driver");
         Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/mercancia", "root", "");
         Statement stm = conexion.createStatement();
         ResultSet res = stm.executeQuery("SELECT * FROM ventas");
         ResultSetMetaData rsMd= res.getMetaData();
         int numeroColumnas=rsMd.getColumnCount();
         
         DefaultTableModel modelo = new DefaultTableModel();
         this.tabla12.setModel(modelo);
         tabla12.setEnabled(false);
         for(int x=1;x<=numeroColumnas; x++){
             modelo.addColumn(rsMd.getColumnLabel(x));
             
         }
         
         while (res.next()){
             Object [] fila = new Object [numeroColumnas];
             
             for(int y=0; y<numeroColumnas; y++){
                 fila [y]=res.getObject(y+1);
                 
             }
             
             modelo.addRow(fila);
         
         }
         
         
         
     
     }
     
     catch(ClassNotFoundException in){
     in.printStackTrace();
     
      }
     
     catch(SQLException se){
     se.printStackTrace();
     
     }
        
            
     
        
        
    }//GEN-LAST:event_AceptarActionPerformed

    private void cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed

       labelTotal2.setText("0");
        int t = tabla12.getRowCount();
        int c = 0;

        do {
            try {
                
                int f = c++;
                int n1 = Integer.parseInt(tabla12.getValueAt(f, 4).toString());
                int n2 = Integer.parseInt(labelTotal2.getText());
                int re = n1 + n2;
                labelTotal2.setText(String.valueOf(re));
               
               
            } catch (Exception e) {
 
               
            }
        } while (c < t);
        
       
    }//GEN-LAST:event_txtTotalActionPerformed

    public int getE() {
        return e;
    }

    public JLabel getLabelTotal2() {
        return labelTotal2;
    }

    private void labelTotal2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_labelTotal2KeyTyped

    }//GEN-LAST:event_labelTotal2KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JComboBox cantidad;
    private javax.swing.JTextField gastos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel labelSIgno;
    private javax.swing.JLabel labelTotal2;
    private javax.swing.JComboBox plantel;
    private javax.swing.JComboBox producto;
    private javax.swing.JTable tabla12;
    private javax.swing.JComboBox talla;
    private javax.swing.JButton txtTotal;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables
}
