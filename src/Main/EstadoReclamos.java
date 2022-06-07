/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;


import Controlador.*;
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
public class EstadoReclamos extends javax.swing.JInternalFrame {
    
    int id;
    String estadoReclamo;
    MtoConsultar consulta = new MtoConsultar();
    /**
     * Creates new form EstadoReclamos
     */
    Locale locale;
    public EstadoReclamos() {
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
        cargarDatosA();
    }
    
    private void Internacionalizacion(){
        ResourceBundle bundle = ResourceBundle.getBundle("Res/Bundle", locale);
        this.setTitle(bundle.getString("EstadoReclamos.title"));
        jMenu1.setText(bundle.getString("EstadoReclamos.jMenu1.text"));
        btnRefescar.setText(bundle.getString("EstadoReclamos.btnRefescar.text"));
        jMenuItem1.setText(bundle.getString("EstadoReclamos.jMenuItem1.text"));
        jMenu3.setText(bundle.getString("EstadoReclamos.jMenu3.text"));
        jMenuItem2.setText(bundle.getString("EstadoReclamos.jMenuItem2.text"));
        jMenuItem3.setText(bundle.getString("EstadoReclamos.jMenuItem3.text"));
        btnAgregarCasos3.setText(bundle.getString("EstadoReclamos.btnAgregarCasos3.text"));
        btnAgregarCasos.setText(bundle.getString("EstadoReclamos.btnAgregarCasos.text"));
        btnAgregarCasos5.setText(bundle.getString("EstadoReclamos.btnAgregarCasos5.text"));
        jLabel5.setText(bundle.getString("EstadoReclamos.jLabel5.text"));
        btnAgregar.setText(bundle.getString("EstadoReclamos.btnAgregar.text"));
        btnModificar.setText(bundle.getString("EstadoReclamos.btnModificar.text"));
        btnEliminar.setText(bundle.getString("EstadoReclamos.btnEliminar.text"));
        jLabel4.setText(bundle.getString("EstadoReclamos.jLabel4.text"));
        jLabel2.setText(bundle.getString("EstadoReclamos.jLabel2.text"));
    }
    
    
    static ResultSet res;
    public void cargarDatosA(){
        consulta.ConsultaTabla("SELECT * FROM dboEstadoReclamo", tableModelo);
    }
    public void limpiarCampo(){
        txtEstadoReclamo.setText(null);
    }                

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAgregarCasos3 = new rojeru_san.complementos.RSButtonHover();
        btnAgregarCasos = new rojeru_san.complementos.RSButtonHover();
        btnAgregarCasos5 = new rojeru_san.complementos.RSButtonHover();
        jPanel4 = new javax.swing.JPanel();
        txtEstadoReclamo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnAgregar = new rojeru_san.complementos.RSButtonHover();
        btnRefescar = new rojeru_san.complementos.RSButtonHover();
        btnEliminar = new rojeru_san.complementos.RSButtonHover();
        btnModificar = new rojeru_san.complementos.RSButtonHover();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableModelo = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Res/Bundle"); // NOI18N
        setTitle(bundle.getString("EstadoReclamos.title")); // NOI18N

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

        btnAgregarCasos3.setBackground(new java.awt.Color(204, 204, 204));
        btnAgregarCasos3.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarCasos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_building_with_rooftop_terrace_27px.png"))); // NOI18N
        btnAgregarCasos3.setText(bundle.getString("EstadoReclamos.btnAgregarCasos3.text")); // NOI18N
        btnAgregarCasos3.setColorHover(new java.awt.Color(58, 136, 252));
        btnAgregarCasos3.setColorText(new java.awt.Color(0, 0, 0));
        btnAgregarCasos3.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnAgregarCasos3.setIconTextGap(15);
        btnAgregarCasos3.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnAgregarCasos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCasos3ActionPerformed(evt);
            }
        });
        jPanel3.add(btnAgregarCasos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 240, 50));

        btnAgregarCasos.setBackground(new java.awt.Color(204, 204, 204));
        btnAgregarCasos.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarCasos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_male_user_28px.png"))); // NOI18N
        btnAgregarCasos.setText(bundle.getString("EstadoReclamos.btnAgregarCasos.text")); // NOI18N
        btnAgregarCasos.setColorHover(new java.awt.Color(58, 136, 252));
        btnAgregarCasos.setColorText(new java.awt.Color(0, 0, 0));
        btnAgregarCasos.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnAgregarCasos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAgregarCasos.setIconTextGap(15);
        btnAgregarCasos.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnAgregarCasos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCasosActionPerformed(evt);
            }
        });
        jPanel3.add(btnAgregarCasos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 240, 50));

        btnAgregarCasos5.setBackground(new java.awt.Color(204, 204, 204));
        btnAgregarCasos5.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarCasos5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_edit_property_27px.png"))); // NOI18N
        btnAgregarCasos5.setText(bundle.getString("EstadoReclamos.btnAgregarCasos5.text")); // NOI18N
        btnAgregarCasos5.setColorHover(new java.awt.Color(58, 136, 252));
        btnAgregarCasos5.setColorText(new java.awt.Color(0, 0, 0));
        btnAgregarCasos5.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnAgregarCasos5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAgregarCasos5.setIconTextGap(15);
        btnAgregarCasos5.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnAgregarCasos5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCasos5ActionPerformed(evt);
            }
        });
        jPanel3.add(btnAgregarCasos5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 240, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 280, 500));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEstadoReclamo.setBackground(new java.awt.Color(227, 227, 227));
        txtEstadoReclamo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtEstadoReclamo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtEstadoReclamo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEstadoReclamoKeyTyped(evt);
            }
        });
        jPanel4.add(txtEstadoReclamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 270, 30));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText(bundle.getString("EstadoReclamos.jLabel5.text")); // NOI18N
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btnAgregar.setBackground(new java.awt.Color(51, 51, 51));
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_add_database_25px.png"))); // NOI18N
        btnAgregar.setText(bundle.getString("EstadoReclamos.btnAgregar.text")); // NOI18N
        btnAgregar.setColorHover(new java.awt.Color(181, 238, 205));
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAgregar.setIconTextGap(15);
        btnAgregar.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel4.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 170, 50));

        btnRefescar.setBackground(new java.awt.Color(51, 51, 51));
        btnRefescar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_refresh_25px_1.png"))); // NOI18N
        btnRefescar.setText(bundle.getString("EstadoReclamos.btnRefescar.text")); // NOI18N
        btnRefescar.setColorHover(new java.awt.Color(183, 219, 243));
        btnRefescar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnRefescar.setIconTextGap(15);
        btnRefescar.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnRefescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefescarActionPerformed(evt);
            }
        });
        jPanel4.add(btnRefescar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 170, 50));

        btnEliminar.setBackground(new java.awt.Color(51, 51, 51));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_delete_database_25px_1.png"))); // NOI18N
        btnEliminar.setText(bundle.getString("EstadoReclamos.btnEliminar.text")); // NOI18N
        btnEliminar.setColorHover(new java.awt.Color(248, 193, 186));
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnEliminar.setIconTextGap(15);
        btnEliminar.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel4.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 170, 50));

        btnModificar.setBackground(new java.awt.Color(51, 51, 51));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_edit_property_25px.png"))); // NOI18N
        btnModificar.setText(bundle.getString("EstadoReclamos.btnModificar.text")); // NOI18N
        btnModificar.setAutoscrolls(true);
        btnModificar.setColorHover(new java.awt.Color(219, 225, 225));
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnModificar.setIconTextGap(15);
        btnModificar.setMargin(new java.awt.Insets(4, 14, 4, 14));
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
                "Nº Estado Reclamo", "Estado Reclamo"
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

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setText(bundle.getString("EstadoReclamos.jLabel3.text")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 45, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel4.setText(bundle.getString("EstadoReclamos.jLabel4.text")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 45, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setText(bundle.getString("EstadoReclamos.jLabel2.text")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 45, 170, -1));

        jMenu1.setText(bundle.getString("EstadoReclamos.jMenu1.text")); // NOI18N

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_cancel_20px.png"))); // NOI18N
        jMenuItem1.setText(bundle.getString("EstadoReclamos.jMenuItem1.text")); // NOI18N
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText(bundle.getString("EstadoReclamos.jMenu2.text")); // NOI18N
        jMenuBar1.add(jMenu2);

        jMenu3.setText(bundle.getString("EstadoReclamos.jMenu3.text")); // NOI18N

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_whatsapp_20px_1.png"))); // NOI18N
        jMenuItem2.setText(bundle.getString("EstadoReclamos.jMenuItem2.text")); // NOI18N
        jMenu3.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_computer_support_20px.png"))); // NOI18N
        jMenuItem3.setText(bundle.getString("EstadoReclamos.jMenuItem3.text")); // NOI18N
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

    private void btnAgregarCasos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCasos3ActionPerformed
        DepartamentoEmpresa abrir = new DepartamentoEmpresa();
        this.hide();
        Expo.DesktopPane.add(abrir);
        abrir.show(true);
    }//GEN-LAST:event_btnAgregarCasos3ActionPerformed

    private void btnAgregarCasosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCasosActionPerformed
        TipoUsuario abrir = new TipoUsuario();
        this.hide();
        Expo.DesktopPane.add(abrir);
        abrir.show(true);
    }//GEN-LAST:event_btnAgregarCasosActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        MtoEstadoReclamo obj = new MtoEstadoReclamo();
        obj.setEstadoReclamo(txtEstadoReclamo.getText());
        
        //confirmación de guardado
        if(obj.guardarEReclamo()){
            JOptionPane.showMessageDialog(this, "Estado de reclamo guardado");
        }else{
            JOptionPane.showMessageDialog(this, "Estado de reclamo no guardado");
        }
        limpiarCampo();
        cargarDatosA();       
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnAgregarCasos5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCasos5ActionPerformed
        TipoReclamos abrir = new TipoReclamos();
        this.hide();
        Expo.DesktopPane.add(abrir);
        abrir.show(true);
    }//GEN-LAST:event_btnAgregarCasos5ActionPerformed

    private void btnRefescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefescarActionPerformed
        limpiarCampo();
        cargarDatosA();
    }//GEN-LAST:event_btnRefescarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        this.id = (int) tableModelo.getValueAt(tableModelo.getSelectedRow(), 0);
        MtoEstadoReclamo obj = new MtoEstadoReclamo();
        obj.setNEReclamo(id);
        
        //confirmando que se quiere eliminar
        int eliminar = JOptionPane.showConfirmDialog(this, "Está seguro que desea eliminar el estado de reclamo?", "Alerta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(eliminar==0){
            //enviando el registro a eliminar en SQLServer
            if(obj.eliminarEReclamo()){
                JOptionPane.showMessageDialog(this, "Estado de reclamo eliminado");
            }else{
                JOptionPane.showMessageDialog(this, "Error al eliminar el estado de reclamo");
            }
        }
        limpiarCampo();
        cargarDatosA();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        MtoEstadoReclamo obj = new MtoEstadoReclamo();
        obj.setNEReclamo(id);
        obj.setEstadoReclamo(String.valueOf(txtEstadoReclamo.getText()));
        
        //confirmación de modificado
        if(obj.modificarEReclamo()){
            JOptionPane.showMessageDialog(this, "Estado de reclamo se modifico");
        }else{
            JOptionPane.showMessageDialog(this, "Estado de reclamo no se modifico");
        }
        limpiarCampo();
        cargarDatosA();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void tableModeloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableModeloMouseClicked
        this.id = Integer.parseInt(tableModelo.getValueAt(tableModelo.getSelectedRow(), 0).toString());
        this.estadoReclamo = (String) tableModelo.getValueAt(tableModelo.getSelectedRow(), 1);
        txtEstadoReclamo.setText(estadoReclamo);
    }//GEN-LAST:event_tableModeloMouseClicked

    private void txtEstadoReclamoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEstadoReclamoKeyTyped
        Controlador.Validaciones.SoloLetras(evt);
    }//GEN-LAST:event_txtEstadoReclamoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover btnAgregar;
    private rojeru_san.complementos.RSButtonHover btnAgregarCasos;
    private rojeru_san.complementos.RSButtonHover btnAgregarCasos3;
    private rojeru_san.complementos.RSButtonHover btnAgregarCasos5;
    private rojeru_san.complementos.RSButtonHover btnEliminar;
    private rojeru_san.complementos.RSButtonHover btnModificar;
    private rojeru_san.complementos.RSButtonHover btnRefescar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JTextField txtEstadoReclamo;
    // End of variables declaration//GEN-END:variables
}
