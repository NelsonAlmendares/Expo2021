/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Conexion.ConexionJava;
import Controlador.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import java.util.Locale;
import java.util.ResourceBundle;
/**
 *
 * @author elmer
 */
public class DepartamentoEmpresa extends javax.swing.JInternalFrame {
     int id;
     String DeptEmpresa;
     MtoConsultar consulta = new MtoConsultar();
    /**
     * Creates new form DepartamentoEmpresa
     */
    Locale locale;
    public DepartamentoEmpresa() {
        initComponents();
        if (Expo.Idioma.equals("English")) {
           locale = new Locale("en","US");
           Internacionalizacion();
        }
        else{
           locale = new Locale("es","ES");
           Internacionalizacion();
 
        }
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        CargarDatos();
    }
    
    private void Internacionalizacion(){
        ResourceBundle bundle = ResourceBundle.getBundle("Res/Bundle", locale);    
        this.setTitle(bundle.getString("DepartamentoEmpresa.title"));
        jLabel7.setText(bundle.getString("DepartamentoEmpresa.jLabel7.text"));
        jLabel8.setText(bundle.getString("DepartamentoEmpresa.jLabel8.text"));
        btnActualizar.setText(bundle.getString("DepartamentoEmpresa.btnActualizar.text"));
        btnEliminar.setText(bundle.getString("DepartamentoEmpresa.btnEliminar.text"));
        btnModificar.setText(bundle.getString("DepartamentoEmpresa.btnModificar.text"));
        jMenu3.setText(bundle.getString("DepartamentoEmpresa.jMenu3.text"));
        btnAgregarCasos4.setText(bundle.getString("DepartamentoEmpresa.btnAgregarCasos4.text"));
        jMenuItem2.setText(bundle.getString("DepartamentoEmpresa.jMenuItem2.text"));
        btnAgregarCasos5.setText(bundle.getString("DepartamentoEmpresa.btnAgregarCasos5.text"));
        jMenuItem3.setText(bundle.getString("DepartamentoEmpresa.jMenuItem3.text"));
        btnAgregarCasos.setText(bundle.getString("DepartamentoEmpresa.btnAgregarCasos.text"));
        jLabel5.setText(bundle.getString("DepartamentoEmpresa.jLabel5.text"));
        btnAgregar.setText(bundle.getString("DepartamentoEmpresa.btnAgregar.text"));
        jMenu1.setText(bundle.getString("DepartamentoEmpresa.jMenu1.text"));
        jMenuItem1.setText(bundle.getString("DepartamentoEmpresa.jMenuItem1.text"));
    }

    private void CargarDatos(){
        consulta.ConsultaTabla("SELECT * FROM dboDepartamentoEmpresa", tableModelo);
    }
    
    static ResultSet res;
    ConexionJava enlace = new ConexionJava();
    Connection connect = enlace.getConexion();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAgregarCasos4 = new rojeru_san.complementos.RSButtonHover();
        btnAgregarCasos5 = new rojeru_san.complementos.RSButtonHover();
        btnAgregarCasos = new rojeru_san.complementos.RSButtonHover();
        jPanel4 = new javax.swing.JPanel();
        txtDepartamento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnAgregar = new rojeru_san.complementos.RSButtonHover();
        btnActualizar = new rojeru_san.complementos.RSButtonHover();
        btnEliminar = new rojeru_san.complementos.RSButtonHover();
        btnModificar = new rojeru_san.complementos.RSButtonHover();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableModelo = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Res/Bundle"); // NOI18N
        setTitle(bundle.getString("DepartamentoEmpresa.title")); // NOI18N
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(745, 40));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1100, 20));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/account.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        btnAgregarCasos4.setBackground(new java.awt.Color(204, 204, 204));
        btnAgregarCasos4.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarCasos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_combo_chart_25px.png"))); // NOI18N
        btnAgregarCasos4.setText(bundle.getString("DepartamentoEmpresa.btnAgregarCasos4.text")); // NOI18N
        btnAgregarCasos4.setColorHover(new java.awt.Color(58, 136, 252));
        btnAgregarCasos4.setColorText(new java.awt.Color(0, 0, 0));
        btnAgregarCasos4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAgregarCasos4.setIconTextGap(15);
        btnAgregarCasos4.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnAgregarCasos4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCasos4ActionPerformed(evt);
            }
        });
        jPanel3.add(btnAgregarCasos4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 240, 50));

        btnAgregarCasos5.setBackground(new java.awt.Color(204, 204, 204));
        btnAgregarCasos5.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarCasos5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_edit_property_27px.png"))); // NOI18N
        btnAgregarCasos5.setText(bundle.getString("DepartamentoEmpresa.btnAgregarCasos5.text")); // NOI18N
        btnAgregarCasos5.setColorHover(new java.awt.Color(58, 136, 252));
        btnAgregarCasos5.setColorText(new java.awt.Color(0, 0, 0));
        btnAgregarCasos5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAgregarCasos5.setIconTextGap(15);
        btnAgregarCasos5.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnAgregarCasos5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCasos5ActionPerformed(evt);
            }
        });
        jPanel3.add(btnAgregarCasos5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 240, 50));

        btnAgregarCasos.setBackground(new java.awt.Color(204, 204, 204));
        btnAgregarCasos.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarCasos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_male_user_28px.png"))); // NOI18N
        btnAgregarCasos.setText(bundle.getString("DepartamentoEmpresa.btnAgregarCasos.text")); // NOI18N
        btnAgregarCasos.setColorHover(new java.awt.Color(58, 136, 252));
        btnAgregarCasos.setColorText(new java.awt.Color(0, 0, 0));
        btnAgregarCasos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAgregarCasos.setIconTextGap(15);
        btnAgregarCasos.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnAgregarCasos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCasosActionPerformed(evt);
            }
        });
        jPanel3.add(btnAgregarCasos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 240, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 280, 500));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDepartamento.setBackground(new java.awt.Color(227, 227, 227));
        txtDepartamento.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtDepartamento.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtDepartamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDepartamentoKeyTyped(evt);
            }
        });
        jPanel4.add(txtDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 270, 30));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText(bundle.getString("DepartamentoEmpresa.jLabel5.text")); // NOI18N
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btnAgregar.setBackground(new java.awt.Color(51, 51, 51));
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_add_database_25px.png"))); // NOI18N
        btnAgregar.setText(bundle.getString("DepartamentoEmpresa.btnAgregar.text")); // NOI18N
        btnAgregar.setColorHover(new java.awt.Color(181, 238, 205));
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAgregar.setIconTextGap(15);
        btnAgregar.setMargin(new java.awt.Insets(4, 4, 4, 4));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel4.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 170, 50));

        btnActualizar.setBackground(new java.awt.Color(51, 51, 51));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_refresh_25px_1.png"))); // NOI18N
        btnActualizar.setText(bundle.getString("DepartamentoEmpresa.btnActualizar.text")); // NOI18N
        btnActualizar.setColorHover(new java.awt.Color(183, 219, 243));
        btnActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnActualizar.setIconTextGap(15);
        btnActualizar.setMargin(new java.awt.Insets(4, 4, 4, 4));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel4.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 170, 50));

        btnEliminar.setBackground(new java.awt.Color(51, 51, 51));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_delete_database_25px_1.png"))); // NOI18N
        btnEliminar.setText(bundle.getString("DepartamentoEmpresa.btnEliminar.text")); // NOI18N
        btnEliminar.setColorHover(new java.awt.Color(248, 193, 186));
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnEliminar.setIconTextGap(15);
        btnEliminar.setMargin(new java.awt.Insets(4, 4, 4, 4));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel4.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 170, 50));

        btnModificar.setBackground(new java.awt.Color(51, 51, 51));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_edit_property_25px.png"))); // NOI18N
        btnModificar.setText(bundle.getString("DepartamentoEmpresa.btnModificar.text")); // NOI18N
        btnModificar.setAutoscrolls(true);
        btnModificar.setColorHover(new java.awt.Color(219, 225, 225));
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnModificar.setIconTextGap(15);
        btnModificar.setMargin(new java.awt.Insets(4, 4, 4, 4));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel4.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 170, 50));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 800, 180));

        tableModelo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nº Departamento Empresa", "Departamento de empresa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableModelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableModeloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableModelo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 800, 310));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel6.setText(bundle.getString("DepartamentoEmpresa.jLabel6.text")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 45, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel7.setText(bundle.getString("DepartamentoEmpresa.jLabel7.text")); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 45, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel8.setText(bundle.getString("DepartamentoEmpresa.jLabel8.text")); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 45, 200, -1));

        jMenu1.setText(bundle.getString("DepartamentoEmpresa.jMenu1.text")); // NOI18N

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_cancel_20px.png"))); // NOI18N
        jMenuItem1.setText(bundle.getString("DepartamentoEmpresa.jMenuItem1.text")); // NOI18N
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText(bundle.getString("DepartamentoEmpresa.jMenu2.text")); // NOI18N
        jMenuBar1.add(jMenu2);

        jMenu3.setText(bundle.getString("DepartamentoEmpresa.jMenu3.text")); // NOI18N

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_whatsapp_20px_1.png"))); // NOI18N
        jMenuItem2.setText(bundle.getString("DepartamentoEmpresa.jMenuItem2.text")); // NOI18N
        jMenu3.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_computer_support_20px.png"))); // NOI18N
        jMenuItem3.setText(bundle.getString("DepartamentoEmpresa.jMenuItem3.text")); // NOI18N
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que quiere salir del Formulario?");
        if (JOptionPane.OK_OPTION == resp) {
            this.dispose();
        }
        else if(JOptionPane.NO_OPTION == resp){

        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnAgregarCasos4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCasos4ActionPerformed
        EstadoReclamos abrir = new EstadoReclamos();
        this.hide();
        Expo.DesktopPane.add(abrir);
        abrir.show(true);
    }//GEN-LAST:event_btnAgregarCasos4ActionPerformed

    private void btnAgregarCasos5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCasos5ActionPerformed
        TipoReclamos abrir = new TipoReclamos();
        this.hide();
        Expo.DesktopPane.add(abrir);
        abrir.show(true);
    }//GEN-LAST:event_btnAgregarCasos5ActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
           if (txtDepartamento.getText().isEmpty()) {
     JOptionPane.showMessageDialog(this, "Todos los campos deben estar llenos");
    }

        else {
            MtoDeptEmpresa obj = new MtoDeptEmpresa();
            obj.setDepartamento(txtDepartamento.getText());
        
            if (obj.agregarDepartamento()) {
                JOptionPane.showMessageDialog(this, "Datos guardados exitosamente");
            }
            else{
                JOptionPane.showMessageDialog(this, "Error al subir los datos");
            }

        }
           CargarDatos();  
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnAgregarCasosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCasosActionPerformed
        TipoUsuario abrir = new TipoUsuario();
        this.hide();
        Expo.DesktopPane.add(abrir);
        abrir.show(true);
    }//GEN-LAST:event_btnAgregarCasosActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
             MtoDeptEmpresa obj = new MtoDeptEmpresa();
             obj.setIdDepartamento(Integer.parseInt(tableModelo.getValueAt(tableModelo.getSelectedRow(), 0).toString()));
            obj.setDepartamento(txtDepartamento.getText());
            
        
            if (obj.modificarDepartamento()) {
                JOptionPane.showMessageDialog(this, "Departamento modificado.");
            }
            else{
                JOptionPane.showMessageDialog(this, "Error al modificar");
            }

           
        CargarDatos();  
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        CargarDatos();  
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        MtoDeptEmpresa obj = new MtoDeptEmpresa();
        obj.setDepartamento(txtDepartamento.getText());
        obj.setIdDepartamento(Integer.parseInt(tableModelo.getValueAt(tableModelo.getSelectedRow(), 0).toString()));
        
        int eliminar = JOptionPane.showConfirmDialog(this, "Está seguro que desea eliminar?", "Atencion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(eliminar==0){
            
            if(obj.eliminarDepartamento()){
                JOptionPane.showMessageDialog(this, "Registro eliminado");
            }else{
                JOptionPane.showMessageDialog(this, "Error al eliminar");
            }
        }
        CargarDatos();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tableModeloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableModeloMouseClicked
        // TODO add your handling code here:
        if (tableModelo.getSelectedRowCount()>0) {        
        txtDepartamento.setText(tableModelo.getValueAt(tableModelo.getSelectedRow(), 1).toString());
            
        }
    }//GEN-LAST:event_tableModeloMouseClicked

    private void txtDepartamentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDepartamentoKeyTyped
        Controlador.Validaciones.SoloLetras(evt);
    }//GEN-LAST:event_txtDepartamentoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover btnActualizar;
    private rojeru_san.complementos.RSButtonHover btnAgregar;
    private rojeru_san.complementos.RSButtonHover btnAgregarCasos;
    private rojeru_san.complementos.RSButtonHover btnAgregarCasos4;
    private rojeru_san.complementos.RSButtonHover btnAgregarCasos5;
    private rojeru_san.complementos.RSButtonHover btnEliminar;
    private rojeru_san.complementos.RSButtonHover btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableModelo;
    private javax.swing.JTextField txtDepartamento;
    // End of variables declaration//GEN-END:variables
}
