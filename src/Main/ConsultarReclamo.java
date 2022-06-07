package Main;

import javax.swing.*;
import Controlador.*;
import javax.swing.table.DefaultTableModel;
import java.util.Locale;
import java.util.ResourceBundle;



public class ConsultarReclamo extends javax.swing.JInternalFrame {
    
    DefaultTableModel tb;
    String datos [][] = {};
    String cabecera[] = {"N° Reclamo", "DUI" , "Descripción", "Fecha reclamo", "Estado reclamo"};
    Locale locale;
    
    public ConsultarReclamo() {
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
        tb = new DefaultTableModel(datos, cabecera);
        jTReclamo.setModel(tb);
        TableColorCellRenderer renderer =  new TableColorCellRenderer();
        jTReclamo.setDefaultRenderer(Object.class, renderer);
        MostrarDatos();
        if (Expo.darkMode == 1) {
            darkMood();
        }
    }
    
    public void darkMood(){
        jPanel4.setBackground(new java.awt.Color(9, 12, 16)); //Fondo
        CustomizeMenu.customizeMenuBar(jMenuBar1);
        jPanel1.setBackground(new java.awt.Color(22, 27, 34)); //Panel de arriba
        jPanel3.setBackground(new java.awt.Color(13, 17, 23)); //Panel principal
        jTReclamo.setGridColor(new java.awt.Color(2,103,255));
    } 
    
    private void Internacionalizacion(){
        ResourceBundle bundle = ResourceBundle.getBundle("Res/Bundle", locale);
        this.setTitle(bundle.getString("ConsultarReclamo.title"));
        jMenu3.setText(bundle.getString("ConsultarReclamo.jMenu3.text"));
        jMenuItem3.setText(bundle.getString("ConsultarReclamo.jMenuItem3.text"));
        jMenuItem1.setText(bundle.getString("ConsultarReclamo.jMenuItem1.text"));
        jLabel2.setText(bundle.getString("ConsultarReclamo.jLabel2.text"));
        jMenu1.setText(bundle.getString("ConsultarReclamo.jMenu1.text"));
        btnConsultar.setText(bundle.getString("ConsultarReclamo.btnConsultar.text"));
        btnCompletado.setText(bundle.getString("ConsultarReclamo.btnCompletado.text"));
        btnCancelar.setText(bundle.getString("ConsultarReclamo.btnCancelar.text"));
        btnMostrar.setText(bundle.getString("ConsultarReclamo.btnMostrar.text"));
        jMenuItem2.setText(bundle.getString("ConsultarReclamo.jMenuItem2.text"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnConsultar = new rojeru_san.complementos.RSButtonHover();
        jLabel1 = new javax.swing.JLabel();
        btnCompletado = new rojeru_san.complementos.RSButtonHover();
        btnCancelar = new rojeru_san.complementos.RSButtonHover();
        btnMostrar = new rojeru_san.complementos.RSButtonHover();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTReclamo = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Res/Bundle"); // NOI18N
        setTitle(bundle.getString("ConsultarReclamo.title")); // NOI18N

        jPanel4.setBackground(new java.awt.Color(220, 220, 220));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(745, 40));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1080, 20));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setText(bundle.getString("ConsultarReclamo.jLabel3.text")); // NOI18N
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setText(bundle.getString("ConsultarReclamo.jLabel2.text")); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConsultar.setBackground(new java.awt.Color(51, 51, 51));
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_refresh_25px_1.png"))); // NOI18N
        btnConsultar.setText(bundle.getString("ConsultarReclamo.btnConsultar.text")); // NOI18N
        btnConsultar.setColorHover(new java.awt.Color(183, 219, 243));
        btnConsultar.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnConsultar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnConsultar.setIconTextGap(15);
        btnConsultar.setMargin(new java.awt.Insets(4, 30, 4, 4));
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel3.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 230, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_get_help_120px.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 140, 140));

        btnCompletado.setBackground(new java.awt.Color(74, 151, 156));
        btnCompletado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_add_database_25px.png"))); // NOI18N
        btnCompletado.setText(bundle.getString("ConsultarReclamo.btnCompletado.text")); // NOI18N
        btnCompletado.setColorHover(new java.awt.Color(183, 219, 243));
        btnCompletado.setColorText(new java.awt.Color(240, 240, 240));
        btnCompletado.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnCompletado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCompletado.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCompletado.setIconTextGap(10);
        btnCompletado.setMargin(new java.awt.Insets(4, 30, 4, 4));
        btnCompletado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompletadoActionPerformed(evt);
            }
        });
        jPanel3.add(btnCompletado, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 310, -1));

        btnCancelar.setBackground(new java.awt.Color(255, 79, 79));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_delete_database_25px_1.png"))); // NOI18N
        btnCancelar.setText(bundle.getString("ConsultarReclamo.btnCancelar.text")); // NOI18N
        btnCancelar.setColorHover(new java.awt.Color(255, 102, 102));
        btnCancelar.setColorText(new java.awt.Color(51, 51, 51));
        btnCancelar.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnCancelar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCancelar.setIconTextGap(20);
        btnCancelar.setMargin(new java.awt.Insets(4, 30, 4, 4));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel3.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 230, -1));

        btnMostrar.setBackground(new java.awt.Color(219, 225, 225));
        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/EyeOpened.png"))); // NOI18N
        btnMostrar.setText(bundle.getString("ConsultarReclamo.btnMostrar.text")); // NOI18N
        btnMostrar.setColorHover(new java.awt.Color(102, 102, 102));
        btnMostrar.setColorText(new java.awt.Color(0, 0, 0));
        btnMostrar.setColorTextHover(new java.awt.Color(235, 235, 235));
        btnMostrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMostrar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnMostrar.setIconTextGap(15);
        btnMostrar.setMargin(new java.awt.Insets(4, 30, 4, 4));
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        jPanel3.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 310, -1));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 890, 210));

        jTReclamo.setForeground(new java.awt.Color(74, 151, 156));
        jTReclamo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nº Reclamo", "DUI", "Descripción", "Fecha", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTReclamo.setSelectionBackground(new java.awt.Color(74, 151, 156));
        jScrollPane1.setViewportView(jTReclamo);
        if (jTReclamo.getColumnModel().getColumnCount() > 0) {
            jTReclamo.getColumnModel().getColumn(0).setHeaderValue(bundle.getString("ConsultarReclamo.jTReclamo.columnModel.title0")); // NOI18N
            jTReclamo.getColumnModel().getColumn(1).setHeaderValue(bundle.getString("ConsultarReclamo.jTReclamo.columnModel.title1")); // NOI18N
            jTReclamo.getColumnModel().getColumn(2).setHeaderValue(bundle.getString("ConsultarReclamo.jTReclamo.columnModel.title2")); // NOI18N
            jTReclamo.getColumnModel().getColumn(3).setResizable(false);
            jTReclamo.getColumnModel().getColumn(3).setHeaderValue(bundle.getString("ConsultarReclamo.jTReclamo.columnModel.title3")); // NOI18N
            jTReclamo.getColumnModel().getColumn(4).setResizable(false);
            jTReclamo.getColumnModel().getColumn(4).setHeaderValue(bundle.getString("ConsultarReclamo.jTReclamo.columnModel.title4")); // NOI18N
        }

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 890, 300));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/Login.fw.png"))); // NOI18N
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 70, 200, 520));

        jMenu1.setText(bundle.getString("ConsultarReclamo.jMenu1.text")); // NOI18N

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_cancel_20px.png"))); // NOI18N
        jMenuItem2.setText(bundle.getString("ConsultarReclamo.jMenuItem2.text")); // NOI18N
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseClicked(evt);
            }
        });
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText(bundle.getString("ConsultarReclamo.jMenu2.text")); // NOI18N
        jMenuBar1.add(jMenu2);

        jMenu3.setText(bundle.getString("ConsultarReclamo.jMenu3.text")); // NOI18N

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_whatsapp_20px_1.png"))); // NOI18N
        jMenuItem3.setText(bundle.getString("ConsultarReclamo.jMenuItem3.text")); // NOI18N
        jMenu3.add(jMenuItem3);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_computer_support_20px.png"))); // NOI18N
        jMenuItem1.setText(bundle.getString("ConsultarReclamo.jMenuItem1.text")); // NOI18N
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1120, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseClicked

    }//GEN-LAST:event_jMenuItem2MouseClicked
    
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que quiere salir del Fromulario?");
        if (JOptionPane.OK_OPTION == resp) {
            this.dispose();
        }
        else if(JOptionPane.NO_OPTION == resp){

        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        MostrarDatos();
    }//GEN-LAST:event_btnConsultarActionPerformed

    public void MostrarDatos(){
        MtoConsultar consulta = new MtoConsultar();
        MtoLogin client = new MtoLogin();
        consulta.ConsultaTabla("SELECT dr.idReclamo, dc.DUI, dr.descripcion, dr.fecha, de.estadoReclamo FROM dboReclamo dr, dboEstadoReclamo de, dboCliente dc WHERE dc.DUI = '" + client.getDUI() + "' AND dr.idCliente = dc.idCliente AND dr.idEstadoReclamo = de.idEstadoReclamo AND NOT de.estadoReclamo = 'Completado' AND NOT de.estadoReclamo = 'Inhabilitado' ", jTReclamo);
    }
    
    public void MostrarDatos2(){
        MtoConsultar consulta = new MtoConsultar();
        MtoLogin client = new MtoLogin();
        consulta.ConsultaTabla("SELECT dr.idReclamo, dc.DUI, dr.descripcion, dr.fecha, de.estadoReclamo FROM dboReclamo dr, dboEstadoReclamo de, dboCliente dc WHERE dc.DUI = '" + client.getDUI() + "' AND dr.idCliente = dc.idCliente AND dr.idEstadoReclamo = de.idEstadoReclamo", jTReclamo);
    }
    private void btnCompletadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompletadoActionPerformed
        if (jTReclamo.getSelectedRowCount()==1){
            int fila = jTReclamo.getSelectedRow();
            MtoProyecto obj = new MtoProyecto();
            obj.setIdReclamo(Integer.parseInt(jTReclamo.getValueAt(fila, 0).toString()));     
            obj.setEstado("Completado");

            if (obj.actualizarEstadoReclamo()) {
                JOptionPane.showMessageDialog(this, "Reclamo completado exitosamente");
                MostrarDatos();
            } else {
                JOptionPane.showMessageDialog(this, "Error al completar reclamo, intente de nuevo más tarde");
            }
        }
    }//GEN-LAST:event_btnCompletadoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if (jTReclamo.getSelectedRowCount()==1){
            int fila = jTReclamo.getSelectedRow();
            MtoProyecto obj = new MtoProyecto();
            obj.setIdReclamo(Integer.parseInt(jTReclamo.getValueAt(fila, 0).toString()));     
            obj.setEstado("Inhabilitado");

            if (obj.actualizarEstadoReclamo()) {
                JOptionPane.showMessageDialog(this, "Reclamo cancelado exitosamente");
                MostrarDatos();
            } else {
                JOptionPane.showMessageDialog(this, "Error al cancelar reclamo, intente de nuevo más tarde");
            }
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        if (btnMostrar.getText().equals("Mostrar completados e inhab.")) {
            btnMostrar.setText("Ocultar completados e inhab.");
            ImageIcon eye = new ImageIcon(getClass().getResource("/Sources/EyeClosed.png"));
            btnMostrar.setIcon(eye);
            MostrarDatos2();
        }else{
            btnMostrar.setText("Mostrar completados e inhab.");
            ImageIcon eye = new ImageIcon(getClass().getResource("/Sources/EyeOpened.png"));
            btnMostrar.setIcon(eye);
            MostrarDatos();
        }
    }//GEN-LAST:event_btnMostrarActionPerformed

    public int LimpiarCampos(){
        return 0;
    }
         
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel * /
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarReclamo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover btnCancelar;
    private rojeru_san.complementos.RSButtonHover btnCompletado;
    private rojeru_san.complementos.RSButtonHover btnConsultar;
    private rojeru_san.complementos.RSButtonHover btnMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTReclamo;
    // End of variables declaration//GEN-END:variables
}
