package Main;

import Controlador.MtoConsultar;
import Controlador.Validaciones;
import java.util.Properties;
import java.util.logging.Level;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.JOptionPane;
import java.util.Locale;
import java.util.ResourceBundle;

/* @author nelson */
public class EnviarCorreos extends javax.swing.JInternalFrame {

    /**
     * Creates new form EnviarCorreos
     */
    Locale locale;
    public EnviarCorreos() {
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
        this.setSize(1120,655);
        if (Expo.darkMode == 1) {
            darkMood();
        }
        jPanel4.setVisible(false);
    }
    
    public void darkMood(){
        jPanel1.setBackground(new java.awt.Color(9, 12, 16)); //Fondo
        CustomizeMenu.customizeMenuBar(jMenuBar1);
        jPanel2.setBackground(new java.awt.Color(22, 27, 34)); //Panel de arriba
        jPanel3.setBackground(new java.awt.Color(13, 17, 23)); //Panel principal
        jPanel4.setBackground(new java.awt.Color(13, 17, 23));
        txtEmail.setBackground(new java.awt.Color(22, 27, 34)); // TextBox
        txtAsunto.setBackground(new java.awt.Color(22, 27, 34));
        txtMensaje.setBackground(new java.awt.Color(22, 27, 34));
    } 
    
    private void Internacionalizacion(){
        ResourceBundle bundle = ResourceBundle.getBundle("Res/Bundle", locale);
        jLabel4.setText(bundle.getString("EnviarCorreos.jLabel4.text"));
        jLabel5.setText(bundle.getString("EnviarCorreos.jLabel5.text"));
        jMenu4.setText(bundle.getString("EnviarCorreos.jMenu4.text"));
        jLabel1.setText(bundle.getString("EnviarCorreos.jLabel1.text"));
        jMenuItem6.setText(bundle.getString("EnviarCorreos.jMenuItem6.text"));
        jMenu6.setText(bundle.getString("EnviarCorreos.jMenu6.text"));
        rSButtonHover1.setText(bundle.getString("EnviarCorreos.rSButtonHover1.text"));
        LimpiarCampos.setText(bundle.getString("EnviarCorreos.LimpiarCampos.text"));
        jLabel2.setText(bundle.getString("EnviarCorreos.jLabel2.text"));
        btnRegresar.setText(bundle.getString("EnviarCorreos.btnRegresar.text"));
        jLabel15.setText(bundle.getString("EnviarCorreos.jLabel15.text"));
        jLabel8.setText(bundle.getString("EnviarCorreos.jLabel8.text"));
        btnCliente.setText(bundle.getString("EnviarCorreos.btnCliente.text"));
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTClientes = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        btnRegresar = new rojeru_san.complementos.RSButtonHover();
        jLabel15 = new javax.swing.JLabel();
        txtDUI = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtAsunto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMensaje = new javax.swing.JTextArea();
        rSButtonHover1 = new rojeru_san.complementos.RSButtonHover();
        LimpiarCampos = new rojeru_san.complementos.RSButtonHover();
        jLabel16 = new javax.swing.JLabel();
        btnCliente = new rojeru_san.complementos.RSButtonHover();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jPanel1.setBackground(new java.awt.Color(220, 220, 220));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1080, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTClientes.setBackground(new java.awt.Color(74, 151, 156));
        jTClientes.setForeground(new java.awt.Color(255, 255, 255));
        jTClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "DUI", "Teléfono", "Nombre completo", "Correo", "Dirección"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTClientes.setGridColor(new java.awt.Color(255, 255, 255));
        jTClientes.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTClientes.setSelectionForeground(new java.awt.Color(74, 151, 156));
        jTClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTClientes);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Res/Bundle"); // NOI18N
        if (jTClientes.getColumnModel().getColumnCount() > 0) {
            jTClientes.getColumnModel().getColumn(0).setHeaderValue(bundle.getString("EnviarCorreos.jTClientes.columnModel.title0")); // NOI18N
            jTClientes.getColumnModel().getColumn(1).setHeaderValue(bundle.getString("EnviarCorreos.jTClientes.columnModel.title1")); // NOI18N
            jTClientes.getColumnModel().getColumn(2).setHeaderValue(bundle.getString("EnviarCorreos.jTClientes.columnModel.title2")); // NOI18N
            jTClientes.getColumnModel().getColumn(3).setHeaderValue(bundle.getString("EnviarCorreos.jTClientes.columnModel.title4")); // NOI18N
            jTClientes.getColumnModel().getColumn(4).setHeaderValue(bundle.getString("EnviarCorreos.jTClientes.columnModel.title3")); // NOI18N
        }

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 960, 300));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(62, 118, 122));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText(bundle.getString("EnviarCorreos.jLabel8.text")); // NOI18N
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 70, -1, -1));

        btnRegresar.setBackground(new java.awt.Color(51, 51, 51));
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_expand_arrow_20px.png"))); // NOI18N
        btnRegresar.setText(bundle.getString("EnviarCorreos.btnRegresar.text")); // NOI18N
        btnRegresar.setToolTipText(bundle.getString("EnviarCorreos.btnRegresar.toolTipText")); // NOI18N
        btnRegresar.setAutoscrolls(true);
        btnRegresar.setColorHover(new java.awt.Color(219, 225, 225));
        btnRegresar.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnRegresar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnRegresar.setIconTextGap(15);
        btnRegresar.setMargin(new java.awt.Insets(4, 4, 4, 4));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel4.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 170, 40));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(62, 118, 122));
        jLabel15.setText(bundle.getString("EnviarCorreos.jLabel15.text")); // NOI18N
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, -1));

        txtDUI.setBackground(new java.awt.Color(227, 227, 227));
        txtDUI.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtDUI.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtDUI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDUIKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDUIKeyTyped(evt);
            }
        });
        jPanel4.add(txtDUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, 180, 20));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 1080, 510));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel1.setText(bundle.getString("EnviarCorreos.jLabel1.text")); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel4.setText(bundle.getString("EnviarCorreos.jLabel4.text")); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel5.setText(bundle.getString("EnviarCorreos.jLabel5.text")); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        txtEmail.setBackground(new java.awt.Color(219, 225, 225));
        txtEmail.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });
        jPanel3.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 410, -1));

        txtAsunto.setBackground(new java.awt.Color(219, 225, 225));
        txtAsunto.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtAsunto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.add(txtAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 430, -1));

        txtMensaje.setBackground(new java.awt.Color(219, 225, 225));
        txtMensaje.setColumns(20);
        txtMensaje.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtMensaje.setLineWrap(true);
        txtMensaje.setRows(5);
        txtMensaje.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setViewportView(txtMensaje);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 810, 230));

        rSButtonHover1.setBackground(new java.awt.Color(51, 51, 51));
        rSButtonHover1.setForeground(new java.awt.Color(51, 51, 51));
        rSButtonHover1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_add_20px.png"))); // NOI18N
        rSButtonHover1.setText(bundle.getString("EnviarCorreos.rSButtonHover1.text")); // NOI18N
        rSButtonHover1.setColorHover(new java.awt.Color(133, 255, 170));
        rSButtonHover1.setColorTextHover(new java.awt.Color(0, 0, 0));
        rSButtonHover1.setIconTextGap(15);
        rSButtonHover1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover1ActionPerformed(evt);
            }
        });
        jPanel3.add(rSButtonHover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 200, -1));

        LimpiarCampos.setBackground(new java.awt.Color(51, 51, 51));
        LimpiarCampos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_erase_25px_1.png"))); // NOI18N
        LimpiarCampos.setText(bundle.getString("EnviarCorreos.LimpiarCampos.text")); // NOI18N
        LimpiarCampos.setColorHover(new java.awt.Color(92, 166, 255));
        LimpiarCampos.setColorTextHover(new java.awt.Color(0, 0, 0));
        LimpiarCampos.setIconTextGap(10);
        LimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarCamposActionPerformed(evt);
            }
        });
        jPanel3.add(LimpiarCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 200, -1));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/Login.fw.png"))); // NOI18N
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 180, 510));

        btnCliente.setBackground(new java.awt.Color(51, 41, 225));
        btnCliente.setForeground(new java.awt.Color(0, 0, 0));
        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_add_20px.png"))); // NOI18N
        btnCliente.setText(bundle.getString("EnviarCorreos.btnCliente.text")); // NOI18N
        btnCliente.setColorHover(new java.awt.Color(74, 151, 156));
        btnCliente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCliente.setIconTextGap(15);
        btnCliente.setMargin(new java.awt.Insets(4, 4, 4, 4));
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });
        jPanel3.add(btnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 200, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 1080, 510));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setText(bundle.getString("EstadoReclamos.jLabel3.text")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setText(bundle.getString("EnviarCorreos.jLabel2.text")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_question_mark_25px.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 50, -1, -1));

        jMenu4.setText(bundle.getString("EnviarCorreos.jMenu4.text")); // NOI18N

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_cancel_20px.png"))); // NOI18N
        jMenuItem6.setText(bundle.getString("EnviarCorreos.jMenuItem6.text")); // NOI18N
        jMenuItem6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuBar1.add(jMenu4);

        jMenu5.setText(bundle.getString("EnviarCorreos.jMenu5.text")); // NOI18N
        jMenuBar1.add(jMenu5);

        jMenu6.setText(bundle.getString("EnviarCorreos.jMenu6.text")); // NOI18N
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1120, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que quiere salir del Fromulario?");
        if (JOptionPane.OK_OPTION == resp) {
            this.dispose();
        }
        else if(JOptionPane.NO_OPTION == resp){

        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void LimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarCamposActionPerformed
        Limpiar();
    }//GEN-LAST:event_LimpiarCamposActionPerformed

    private void rSButtonHover1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover1ActionPerformed
        Properties propiedad = new Properties();
        propiedad.setProperty("mail.smtp.host","smtp.gmail.com");
        propiedad.setProperty("mail.smtp.starttls.enable","true");
        propiedad.setProperty("mail.smtp.port","587"); 
        propiedad.setProperty("mail.smtp.auth","true");
        
        Session sesion = Session.getDefaultInstance(propiedad);
        
        String correoEnviar = "AtClientSuport@gmail.com";
        String contra = "Ricaldone_2021";
        String destinatario = txtEmail.getText();
        String asunto = txtAsunto.getText();
        String mensaje = txtMensaje.getText() + "\n\n\n" + "At Client ® 2021, All Right Reserved(Derechos reservados)\n" + "Contáctanos al 548-7547";
        MimeMessage mail = new MimeMessage(sesion);
        try {
            mail.setFrom(new InternetAddress (correoEnviar));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
            mail.setSubject(asunto);
            mail.setText(mensaje);
            
            Transport transporte = sesion.getTransport("smtp");
            transporte.connect(correoEnviar,contra);
            transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
            transporte.close();
            
            JOptionPane.showMessageDialog(rootPane, "Correo enviado satisfactoriamente");
            
            
        } catch (AddressException ex) {
            java.util.logging.Logger.getLogger(EnviarCorreos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            java.util.logging.Logger.getLogger(EnviarCorreos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rSButtonHover1ActionPerformed

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        Controlador.Validaciones.SoloLetrasConArroba(evt);
    }//GEN-LAST:event_txtEmailKeyTyped

    MtoConsultar consulta = new MtoConsultar();
    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        consulta.ConsultaTabla("SELECT dc.DUI, dc.numCliente, dc.nombreCliente, dc.correoElectronico, dc.direccion FROM dboCliente dc, dboEstadoUsuario de where dc.idEstadoUsuario = de.idEstadoUsuario AND NOT de.estadoUsuario = 'Inhabilitado';", jTClientes);
        jPanel4.setVisible(true);
        jPanel3.setVisible(false);
    }//GEN-LAST:event_btnClienteActionPerformed

    private void jTClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTClientesMouseClicked
        if (jTClientes.getSelectedRowCount()>0) {
            int fila = jTClientes.getSelectedRow();
            txtEmail.setText(jTClientes.getValueAt(fila, 3).toString());
            jPanel4.setVisible(false);
            jPanel3.setVisible(true);
        }
    }//GEN-LAST:event_jTClientesMouseClicked

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        jPanel4.setVisible(false);
        jPanel3.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtDUIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDUIKeyReleased
        consulta.ConsultaTabla("SELECT dc.DUI, dc.numCliente, dc.nombreCliente, dc.correoElectronico, dc.direccion FROM dboCliente dc, dboEstadoUsuario de where dc.idEstadoUsuario = de.idEstadoUsuario AND NOT de.estadoUsuario = 'Inhabilitado' AND dc.DUI LIKE '%"+txtDUI.getText()+"%';", jTClientes);
    }//GEN-LAST:event_txtDUIKeyReleased

    private void txtDUIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDUIKeyTyped
        Validaciones.SoloNumerosConGuion(evt, txtDUI);
    }//GEN-LAST:event_txtDUIKeyTyped

    public int Limpiar(){
        txtEmail.setText(null);
        txtAsunto.setText(null);
        txtMensaje.setText(null);
        
        return 0;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover LimpiarCampos;
    private rojeru_san.complementos.RSButtonHover btnCliente;
    private rojeru_san.complementos.RSButtonHover btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTClientes;
    private rojeru_san.complementos.RSButtonHover rSButtonHover1;
    private javax.swing.JTextField txtAsunto;
    private javax.swing.JTextField txtDUI;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextArea txtMensaje;
    // End of variables declaration//GEN-END:variables
}
