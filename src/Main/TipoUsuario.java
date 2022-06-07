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

/**@author elmer */

public class TipoUsuario extends javax.swing.JInternalFrame {
    
    int id;
    String tipoReclamo;
    MtoConsultar consulta = new MtoConsultar();
    
    Locale locale;
    public TipoUsuario() {
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
        this.setTitle(bundle.getString("TipoUsuario.title"));
        btnModificar.setText(bundle.getString("TipoUsuario.btnModificar.text"));
        jMenu1.setText(bundle.getString("TipoUsuario.jMenu1.text"));
        jMenuItem1.setText(bundle.getString("TipoUsuario.jMenuItem1.text"));
        jMenu2.setText(bundle.getString("TipoUsuario.jMenu2.text"));
        jLabel2.setText(bundle.getString("TipoUsuario.jLabel2.text"));
        jMenu3.setText(bundle.getString("TipoUsuario.jMenu3.text"));
        jLabel4.setText(bundle.getString("TipoUsuario.jLabel4.text"));
        jMenuItem2.setText(bundle.getString("TipoUsuario.jMenuItem2.text"));
        jMenuItem3.setText(bundle.getString("TipoUsuario.jMenuItem3.text"));
        btnAgregarDepartamento.setText(bundle.getString("TipoUsuario.btnAgregarDepartamento.text"));
        btnAgregarEstado.setText(bundle.getString("TipoUsuario.btnAgregarEstado.text"));
        btnAgregarCasos.setText(bundle.getString("TipoUsuario.btnAgregarCasos.text"));
        btnAgregar.setText(bundle.getString("TipoUsuario.btnAgregar.text"));
        btnRefrescar.setText(bundle.getString("TipoUsuario.btnRefrescar.text"));
        btnEliminar.setText(bundle.getString("TipoUsuario.btnEliminar.text"));
    }

    static ResultSet res;
    public void cargarDatosA(){
        consulta.ConsultaTabla("SELECT * FROM dboTipoUsuario", tableModelo);
    }
    public void limpiarCampo(){
        txtTipoUsuario.setText(null);
    }        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAgregarDepartamento = new rojeru_san.complementos.RSButtonHover();
        btnAgregarEstado = new rojeru_san.complementos.RSButtonHover();
        btnAgregarCasos = new rojeru_san.complementos.RSButtonHover();
        jPanel4 = new javax.swing.JPanel();
        txtTipoUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnAgregar = new rojeru_san.complementos.RSButtonHover();
        btnRefrescar = new rojeru_san.complementos.RSButtonHover();
        btnEliminar = new rojeru_san.complementos.RSButtonHover();
        btnModificar = new rojeru_san.complementos.RSButtonHover();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableModelo = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Res/Bundle"); // NOI18N
        setTitle(bundle.getString("TipoUsuario.title")); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(745, 40));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1100, 20));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText(bundle.getString("TipoUsuario.jLabel3.text")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 45, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText(bundle.getString("TipoUsuario.jLabel2.text")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 45, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText(bundle.getString("TipoUsuario.jLabel4.text")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 45, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/account.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        btnAgregarDepartamento.setBackground(new java.awt.Color(204, 204, 204));
        btnAgregarDepartamento.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarDepartamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_city_25px.png"))); // NOI18N
        btnAgregarDepartamento.setText(bundle.getString("TipoUsuario.btnAgregarDepartamento.text")); // NOI18N
        btnAgregarDepartamento.setColorHover(new java.awt.Color(58, 136, 252));
        btnAgregarDepartamento.setColorText(new java.awt.Color(0, 0, 0));
        btnAgregarDepartamento.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnAgregarDepartamento.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAgregarDepartamento.setIconTextGap(15);
        btnAgregarDepartamento.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnAgregarDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDepartamentoActionPerformed(evt);
            }
        });
        jPanel3.add(btnAgregarDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 240, 50));

        btnAgregarEstado.setBackground(new java.awt.Color(204, 204, 204));
        btnAgregarEstado.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarEstado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_view_delivery_25px.png"))); // NOI18N
        btnAgregarEstado.setText(bundle.getString("TipoUsuario.btnAgregarEstado.text")); // NOI18N
        btnAgregarEstado.setColorHover(new java.awt.Color(58, 136, 252));
        btnAgregarEstado.setColorText(new java.awt.Color(0, 0, 0));
        btnAgregarEstado.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnAgregarEstado.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAgregarEstado.setIconTextGap(15);
        btnAgregarEstado.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnAgregarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEstadoActionPerformed(evt);
            }
        });
        jPanel3.add(btnAgregarEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 240, 50));

        btnAgregarCasos.setBackground(new java.awt.Color(204, 204, 204));
        btnAgregarCasos.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarCasos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_survey_25px.png"))); // NOI18N
        btnAgregarCasos.setText(bundle.getString("TipoUsuario.btnAgregarCasos.text")); // NOI18N
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
        jPanel3.add(btnAgregarCasos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 240, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 280, 500));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTipoUsuario.setBackground(new java.awt.Color(227, 227, 227));
        txtTipoUsuario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtTipoUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtTipoUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipoUsuarioKeyTyped(evt);
            }
        });
        jPanel4.add(txtTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 270, 30));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText(bundle.getString("TipoUsuario.jLabel5.text")); // NOI18N
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btnAgregar.setBackground(new java.awt.Color(51, 51, 51));
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_add_database_25px.png"))); // NOI18N
        btnAgregar.setText(bundle.getString("TipoUsuario.btnAgregar.text")); // NOI18N
        btnAgregar.setColorHover(new java.awt.Color(181, 238, 205));
        btnAgregar.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAgregar.setIconTextGap(15);
        btnAgregar.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel4.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 170, 50));

        btnRefrescar.setBackground(new java.awt.Color(51, 51, 51));
        btnRefrescar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_refresh_25px_1.png"))); // NOI18N
        btnRefrescar.setText(bundle.getString("TipoUsuario.btnRefrescar.text")); // NOI18N
        btnRefrescar.setColorHover(new java.awt.Color(183, 219, 243));
        btnRefrescar.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnRefrescar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnRefrescar.setIconTextGap(15);
        btnRefrescar.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrescarActionPerformed(evt);
            }
        });
        jPanel4.add(btnRefrescar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 170, 50));

        btnEliminar.setBackground(new java.awt.Color(51, 51, 51));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_delete_database_25px_1.png"))); // NOI18N
        btnEliminar.setText(bundle.getString("TipoUsuario.btnEliminar.text")); // NOI18N
        btnEliminar.setColorHover(new java.awt.Color(248, 193, 186));
        btnEliminar.setColorTextHover(new java.awt.Color(51, 51, 51));
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
        btnModificar.setText(bundle.getString("TipoUsuario.btnModificar.text")); // NOI18N
        btnModificar.setAutoscrolls(true);
        btnModificar.setColorHover(new java.awt.Color(219, 225, 225));
        btnModificar.setColorTextHover(new java.awt.Color(51, 51, 51));
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
                "Nº Tipo Usuario", "Tipo Usuario"
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

        jMenu1.setText(bundle.getString("TipoUsuario.jMenu1.text")); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_cancel_20px.png"))); // NOI18N
        jMenuItem1.setText(bundle.getString("TipoUsuario.jMenuItem1.text")); // NOI18N
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText(bundle.getString("TipoUsuario.jMenu2.text")); // NOI18N
        jMenuBar1.add(jMenu2);

        jMenu3.setText(bundle.getString("TipoUsuario.jMenu3.text")); // NOI18N

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_whatsapp_20px_1.png"))); // NOI18N
        jMenuItem2.setText(bundle.getString("TipoUsuario.jMenuItem2.text")); // NOI18N
        jMenu3.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_computer_support_20px.png"))); // NOI18N
        jMenuItem3.setText(bundle.getString("TipoUsuario.jMenuItem3.text")); // NOI18N
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

    private void btnAgregarDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDepartamentoActionPerformed
        DepartamentoEmpresa abrir = new DepartamentoEmpresa();
        this.hide();
        Expo.DesktopPane.add(abrir);
        abrir.show(true);
    }//GEN-LAST:event_btnAgregarDepartamentoActionPerformed

    private void btnAgregarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEstadoActionPerformed
        EstadoReclamos abrir = new EstadoReclamos();
        this.hide();
        Expo.DesktopPane.add(abrir);
        abrir.show(true);
    }//GEN-LAST:event_btnAgregarEstadoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        MtoTipoUsuario obj = new MtoTipoUsuario();
        obj.setTipoUsuario(txtTipoUsuario.getText());
        
        //confirmación de guardado
        if(obj.guardarTUsuario()){
            JOptionPane.showMessageDialog(this, "Tipo de usuario guardado");
        }else{
            JOptionPane.showMessageDialog(this, "Tipo de usuario no guardado");
        }
        limpiarCampo();
        cargarDatosA();     
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnAgregarCasosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCasosActionPerformed
        TipoReclamos abrir = new TipoReclamos();
        this.hide();
        Expo.DesktopPane.add(abrir);
        abrir.show(true);
    }//GEN-LAST:event_btnAgregarCasosActionPerformed

    private void tableModeloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableModeloMouseClicked
        this.id = Integer.parseInt(tableModelo.getValueAt(tableModelo.getSelectedRow(), 0).toString());
        this.tipoReclamo = (String) tableModelo.getValueAt(tableModelo.getSelectedRow(), 1);
        txtTipoUsuario.setText(tipoReclamo);
    }//GEN-LAST:event_tableModeloMouseClicked

    private void btnRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescarActionPerformed
        limpiarCampo();
        cargarDatosA();
    }//GEN-LAST:event_btnRefrescarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        MtoTipoUsuario obj = new MtoTipoUsuario();
        obj.setNTUsuario(id);
        obj.setTipoUsuario(String.valueOf(txtTipoUsuario.getText()));
        
        //confirmación de modificado
        if(obj.modificarTUsuario()){
            JOptionPane.showMessageDialog(this, "Tipo de usuario se modifico");
        }else{
            JOptionPane.showMessageDialog(this, "Tipo de usuario no se modifico");
        }
        limpiarCampo();
        cargarDatosA();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        this.id = (int) tableModelo.getValueAt(tableModelo.getSelectedRow(), 0);
        MtoTipoUsuario obj = new MtoTipoUsuario();
        obj.setNTUsuario(id);
        
        //confirmando que se quiere eliminar
        int eliminar = JOptionPane.showConfirmDialog(this, "Está seguro que desea eliminar el tipo de usuario?", "Alerta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(eliminar==0){
            //enviando el registro a eliminar en SQLServer
            if(obj.eliminarTUsuario()){
                JOptionPane.showMessageDialog(this, "Tipo de usuario eliminado");
            }else{
                JOptionPane.showMessageDialog(this, "Error al eliminar el tipo de usuario");
            }
        }
        limpiarCampo();
        cargarDatosA();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que quiere salir del Formulario?");
        if (JOptionPane.OK_OPTION == resp) {
            this.dispose();
        }
        else if(JOptionPane.NO_OPTION == resp){

        }
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void txtTipoUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoUsuarioKeyTyped
        Controlador.Validaciones.SoloLetras(evt);
    }//GEN-LAST:event_txtTipoUsuarioKeyTyped

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que quiere salir del Formulario?");
        if (JOptionPane.OK_OPTION == resp) {
            this.dispose();
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover btnAgregar;
    private rojeru_san.complementos.RSButtonHover btnAgregarCasos;
    private rojeru_san.complementos.RSButtonHover btnAgregarDepartamento;
    private rojeru_san.complementos.RSButtonHover btnAgregarEstado;
    private rojeru_san.complementos.RSButtonHover btnEliminar;
    private rojeru_san.complementos.RSButtonHover btnModificar;
    private rojeru_san.complementos.RSButtonHover btnRefrescar;
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
    private javax.swing.JTextField txtTipoUsuario;
    // End of variables declaration//GEN-END:variables
}
