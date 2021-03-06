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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leonardo
 */
public class Encargos extends javax.swing.JPanel {

    /**
     * Creates new form Encargos
     */
    public Encargos() {
        initComponents();
        
            
     try {
     
         Class.forName("com.mysql.jdbc.Driver");
         Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/mercancia", "root", "");
         Statement stm = conexion.createStatement();
         ResultSet res = stm.executeQuery("SELECT * FROM encargos");
         ResultSetMetaData rsMd= res.getMetaData();
         int numeroColumnas=rsMd.getColumnCount();
         
         DefaultTableModel modelo = new DefaultTableModel();
         this.tabla.setModel(modelo);
         tabla.setEnabled(false);
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        talla1 = new javax.swing.JComboBox();
        cantidad1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        plantel1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        producto1 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        identificacion1 = new javax.swing.JTextField();
        jlabel = new javax.swing.JLabel();
        nombre1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        celular1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        saldo1 = new javax.swing.JTextField();
        abono1 = new javax.swing.JTextField();
        Aceptar = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        precio1 = new javax.swing.JTextField();
        JT1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Producto");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        talla1.setMaximumRowCount(9);
        talla1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "4", "6", "8", "10", "12", "14", "16", "S", "M", "L", "XL" }));
        add(talla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, 30));

        cantidad1.setMaximumRowCount(30);
        cantidad1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        cantidad1.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        add(cantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Plantel");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Talla");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Cantidad");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, 30));

        plantel1.setMaximumRowCount(9);
        plantel1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Agustin Nieto", "Boyaca", "San Pedro" }));
        add(plantel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 130, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Precio    $");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, -1));

        producto1.setMaximumRowCount(9);
        producto1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Camibuso", "Sudadera", "Blusa", "Pijama", "Falda" }));
        add(producto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 130, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Identificacion");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 90, 40));

        identificacion1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                identificacion1KeyReleased(evt);
            }
        });
        add(identificacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 150, 30));

        jlabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlabel.setText("Nombre");
        add(jlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 150, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Celular");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        celular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celular1ActionPerformed(evt);
            }
        });
        add(celular1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 140, 30));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Identificacion", "Celular", "Producto", "Plantel", "Talla", "Cantidad", "Precio", "Abono", "Saldo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(3).setResizable(false);
            tabla.getColumnModel().getColumn(4).setResizable(false);
            tabla.getColumnModel().getColumn(5).setResizable(false);
            tabla.getColumnModel().getColumn(6).setResizable(false);
            tabla.getColumnModel().getColumn(7).setResizable(false);
            tabla.getColumnModel().getColumn(8).setResizable(false);
            tabla.getColumnModel().getColumn(9).setResizable(false);
        }

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 750, 270));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Abono");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Saldo");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        saldo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldo1ActionPerformed(evt);
            }
        });
        saldo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                saldo1KeyPressed(evt);
            }
        });
        jPanel2.add(saldo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 150, 30));

        abono1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abono1ActionPerformed(evt);
            }
        });
        jPanel2.add(abono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 150, 30));

        Aceptar.setBackground(new java.awt.Color(120, 120, 120));
        Aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chulito.png"))); // NOI18N
        Aceptar.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chulito.png"))); // NOI18N
        Aceptar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Aceptar.setMaximumSize(new java.awt.Dimension(200, 137));
        Aceptar.setMinimumSize(new java.awt.Dimension(100, 137));
        Aceptar.setOpaque(false);
        Aceptar.setPreferredSize(new java.awt.Dimension(100, 137));
        Aceptar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chulito.png"))); // NOI18N
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });
        jPanel2.add(Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 60, 50));

        Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa.png"))); // NOI18N
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        jPanel2.add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 60, 50));

        precio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio1ActionPerformed(evt);
            }
        });
        jPanel2.add(precio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 140, 30));
        jPanel2.add(JT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 140, 40));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 750, 430));
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
       
        
        String nom=nombre1.getText();
        String id=identificacion1.getText();
        int ide =Integer.parseInt(id);
        String cel=celular1.getText();
        int celu=Integer.parseInt(cel);
        String pro= (String) producto1.getSelectedItem();
        String plan= (String) plantel1.getSelectedItem();
        String ta= (String) talla1.getSelectedItem();
        String can= (String) cantidad1.getSelectedItem();
        int canti=Integer.parseInt(can);
        String pre=  precio1.getText();
        int valor = Integer.parseInt(pre);
        String abo=abono1.getText();
        int ab=Integer.parseInt(abo);
        String sald=saldo1.getText();
        int sal=Integer.parseInt(sald);
        
        
        
        Basedatos bd1= new Basedatos();
        try {
        
        bd1.registrarEncargo( nom, ide, celu, pro, plan, ta, canti, valor , ab, sal) ;
        JOptionPane.showMessageDialog(null,"Encargo Ingresado Exitosamente");
        nombre1.setText("");
        identificacion1.setText("");
        celular1.setText("");
        producto1.setSelectedItem("");
        plantel1.setSelectedItem("");
        talla1.setSelectedItem("");
        cantidad1.setSelectedItem("");
        precio1.setText("");
        abono1.setText("");
        saldo1.setText("");
       
        
        } 
        
        catch (FileNotFoundException ex) {
            Logger.getLogger(Encargos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
     try {
     
         Class.forName("com.mysql.jdbc.Driver");
         Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/mercancia", "root", "");
         Statement stm = conexion.createStatement();
         ResultSet res = stm.executeQuery("SELECT * FROM encargos");
         ResultSetMetaData rsMd= res.getMetaData();
         int numeroColumnas=rsMd.getColumnCount();
         
         DefaultTableModel modelo = new DefaultTableModel();
         this.tabla.setModel(modelo);
         tabla.setEnabled(false);
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
     
//     //CODIGO EDITANDO
//        saldo1.setText("0");
//        int t = tabla.getRowCount();
//        int c = 0;
//
//        do {
//            try {
//                int f = c++;
//                int n1 = Integer.parseInt(tabla.getValueAt(f, 7).toString());
//                int n2 = Integer.parseInt(tabla.getValueAt(f, 8).toString());
//                int n3 = Integer.parseInt(saldo1.getText());
//                int re = n1 - n2;
//                n3 = re;
//                saldo1.setText(String.valueOf(re));
//            } catch (Exception e) {
//
//            }
//        } while (c < t);  
//     
            
        
        
    }//GEN-LAST:event_AceptarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
    
       String id=identificacion1.getText();
       int ide=Integer.parseInt(id);
       identificacion1.setText("");
       
       
       
       
        try {
     
         Class.forName("com.mysql.jdbc.Driver");
         Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/mercancia", "root", "");
         Statement stm = conexion.createStatement();
         ResultSet res = stm.executeQuery("select * from encargos where identificacion LIKE '%"+ide+"%'");
         ResultSetMetaData rsMd= res.getMetaData();
         int numeroColumnas=rsMd.getColumnCount();
         
         
         
         
         DefaultTableModel modelo = new DefaultTableModel();
         this.tabla.setModel(modelo);
         tabla.setEnabled(false);
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
       
        
    }//GEN-LAST:event_BuscarActionPerformed

    private void identificacion1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_identificacion1KeyReleased
       
    }//GEN-LAST:event_identificacion1KeyReleased

    private void precio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio1ActionPerformed
      
    
        
        
        
        String valor1 = precio1.getText();
        int v1 = Integer.parseInt(valor1);

        String can= (String) cantidad1.getSelectedItem();
        int canti=Integer.parseInt(can);
        
        int re = v1 * canti;

        precio1.setText(re+"");      
        
        
        
        
        
        
        
    }//GEN-LAST:event_precio1ActionPerformed

    private void celular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celular1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_celular1ActionPerformed

    private void saldo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldo1ActionPerformed
        
       
        
        
        
    }//GEN-LAST:event_saldo1ActionPerformed

    private void saldo1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_saldo1KeyPressed
        
        String [] dato = new String[1];
        dato [0] =saldo1.getText();
        
        
        
        
    }//GEN-LAST:event_saldo1KeyPressed

    private void abono1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abono1ActionPerformed
   
      String valor1 = precio1.getText();
        int v1 = Integer.parseInt(valor1);

        String valor2 = abono1.getText();
        int v2 = Integer.parseInt(valor2);

        int re = v1 - v2;

        saldo1.setText(re+"");  
        
    }//GEN-LAST:event_abono1ActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton Buscar;
    private javax.swing.JLabel JT1;
    private javax.swing.JTextField abono1;
    private javax.swing.JComboBox cantidad1;
    private javax.swing.JTextField celular1;
    private javax.swing.JTextField identificacion1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlabel;
    private javax.swing.JTextField nombre1;
    private javax.swing.JComboBox plantel1;
    private javax.swing.JTextField precio1;
    private javax.swing.JComboBox producto1;
    private javax.swing.JTextField saldo1;
    private javax.swing.JTable tabla;
    private javax.swing.JComboBox talla1;
    // End of variables declaration//GEN-END:variables

    private void registrarMerca(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
