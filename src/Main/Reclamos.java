package Main;

import Controlador.*;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.*;
import java.util.Locale;
import java.util.ResourceBundle;

public class Reclamos extends javax.swing.JInternalFrame {
    
 Locale locale;
    public Reclamos() {
        initComponents();
        cmbDepto.setVisible(false);
        jLabel6.setVisible(false);
        
        if (Expo.Idioma.equals("English")) {
           locale = new Locale("en","US");
           Internacionalizacion();
        }
        else{
           locale = new Locale("es","ES");
           Internacionalizacion();
 
        }
        MtoProyecto obj = new MtoProyecto();
        cmbTipo.setModel(obj.cargarComboTipo());
        cmbDepto.setModel(obj.cargarComboDeptoEmpresa());
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null); 
        if (Expo.darkMode == 1) {
            darkMood();
        }
    }
    
    public void darkMood(){
        jPanel4.setBackground(new java.awt.Color(9, 12, 16)); //Fondo
        CustomizeMenu.customizeMenuBar(jMenuBar1);
        jPanel1.setBackground(new java.awt.Color(22, 27, 34)); //Panel de arriba
        jPanel3.setBackground(new java.awt.Color(13, 17, 23));
        txtDescripcion.setBackground(new java.awt.Color(22, 27, 34));
        txtFecha.setBackground(new java.awt.Color(22, 27, 34));
    };
    
    private void Internacionalizacion(){
        ResourceBundle bundle = ResourceBundle.getBundle("Res/Bundle", locale);
        this.setTitle(bundle.getString("Reclamos.title"));
        jLabel12.setText(bundle.getString("Reclamos.jLabel12.text"));
        jLabel2.setText(bundle.getString("Reclamos.jLabel2.text"));
        jLabel13.setText(bundle.getString("Reclamos.jLabel13.text"));
        jLabel10.setText(bundle.getString("Reclamos.jLabel10.text"));
        jLabel5.setText(bundle.getString("Reclamos.jLabel5.text"));
        jLabel6.setText(bundle.getString("Reclamos.jLabel6.text"));
        jMenu1.setText(bundle.getString("Reclamos.jMenu1.text"));
        jMenuItem2.setText(bundle.getString("Reclamos.jMenuItem2.text"));
        jMenu3.setText(bundle.getString("Reclamos.jMenu3.text"));
        jMenuItem3.setText(bundle.getString("Reclamos.jMenuItem3.text"));
        jMenuItem1.setText(bundle.getString("Reclamos.jMenuItem1.text"));
        btnAgregar.setText(bundle.getString("Reclamos.btnAgregar.text"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        fecha = new rojeru_san.RSLabelFecha();
        txtFecha = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        btnAgregar = new rojeru_san.complementos.RSButtonHover();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        cmbDepto = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
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
        setTitle(bundle.getString("Reclamos.title")); // NOI18N

        jPanel4.setBackground(new java.awt.Color(220, 220, 220));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(745, 40));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1100, 40));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setText(bundle.getString("Reclamos.jLabel3.text")); // NOI18N
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 57, -1, 30));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setText(bundle.getString("Reclamos.jLabel2.text")); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 57, -1, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText(bundle.getString("Reclamos.jLabel5.text")); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, -1, -1));

        fecha.setForeground(new java.awt.Color(2, 103, 255));
        fecha.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        fecha.setFormato("yyyy-MM-dd");
        jPanel3.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 180, 30));

        txtFecha.setEditable(false);
        txtFecha.setBackground(new java.awt.Color(224, 224, 224));
        txtFecha.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtFecha.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 160, 30));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText(bundle.getString("Reclamos.jLabel10.text")); // NOI18N
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 180, -1));

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Telefónico", "Falla Técnica", " " }));
        cmbTipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(cmbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 180, 30));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(32, 172, 191));
        jLabel12.setText(bundle.getString("Reclamos.jLabel12.text")); // NOI18N
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 600, -1));

        btnAgregar.setBackground(new java.awt.Color(51, 51, 51));
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_add_database_25px.png"))); // NOI18N
        btnAgregar.setText(bundle.getString("Reclamos.btnAgregar.text")); // NOI18N
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
        jPanel3.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 160, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_get_help_120px.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, -1, -1));

        txtDescripcion.setBackground(new java.awt.Color(227, 227, 227));
        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setRows(5);
        txtDescripcion.setBorder(null);
        txtDescripcion.setCaretColor(new java.awt.Color(10, 210, 204));
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtDescripcion);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 350, 290));

        cmbDepto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(cmbDepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 160, 30));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(bundle.getString("Reclamos.jLabel6.text")); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 270, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setText(bundle.getString("Reclamos.jLabel13.text")); // NOI18N
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 920, 500));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/Login.fw.png"))); // NOI18N
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 180, 500));

        jMenu1.setText(bundle.getString("Reclamos.jMenu1.text")); // NOI18N

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_cancel_20px.png"))); // NOI18N
        jMenuItem2.setText(bundle.getString("Reclamos.jMenuItem2.text")); // NOI18N
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText(bundle.getString("Reclamos.jMenu2.text")); // NOI18N
        jMenuBar1.add(jMenu2);

        jMenu3.setText(bundle.getString("Reclamos.jMenu3.text")); // NOI18N

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_whatsapp_20px_1.png"))); // NOI18N
        jMenuItem3.setText(bundle.getString("Reclamos.jMenuItem3.text")); // NOI18N
        jMenu3.add(jMenuItem3);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_computer_support_20px.png"))); // NOI18N
        jMenuItem1.setText(bundle.getString("Reclamos.jMenuItem1.text")); // NOI18N
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
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       
        if (Expo.Idioma.equals("English")) {
            int resp = JOptionPane.showConfirmDialog(null, "Are you sure you want to leave the Form?");
          if (JOptionPane.OK_OPTION == resp) {
              this.dispose();
          }
          else if(JOptionPane.NO_OPTION == resp){

          }
        }
        else{
            int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que quiere salir del Formulario?");
          if (JOptionPane.OK_OPTION == resp) {
              this.dispose();
          }
          else if(JOptionPane.NO_OPTION == resp){

          }
 
        }
        
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    static ResultSet res;
    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        MtoLogin client = new MtoLogin();
        
        if (txtDescripcion.getText().isEmpty()){
                if (Expo.Idioma.equals("English")) {
                    JOptionPane.showMessageDialog(null, "Please complete the description field.");
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor complete el campo de descripción.");
                }
        }else if(client.getNum() == 0){
                if (Expo.Idioma.equals("English")) {
                    JOptionPane.showMessageDialog(null, "You are not a client.");
                } else {
                    JOptionPane.showMessageDialog(null, "No eres un cliente.");
                }
            
        }else if(txtDescripcion.getText().length() >= 800){
                    if (Expo.Idioma.equals("English")) {
                     JOptionPane.showMessageDialog(null,"You have exceeded the limit number of characters allowed in the description. \nPlease shorten your response.", "Limit exceeded, error.", 0);
                 } else {
                     JOptionPane.showMessageDialog(null, "Ha sobrepasado el número límite de caracteres permitidos en la descripción. \nPor favor reduzca su respuesta.", "Límite sobrepasado, error.", 0);
                 }
        }else{
            String fechaActual = new SimpleDateFormat("yyyy/MM/dd").format(Calendar.getInstance().getTime());
            
            MtoProyecto obj = new MtoProyecto();
            obj.setDui(client.getDUI());
            obj.setTelefono(client.getNum());
            obj.setTipoReclamo(String.valueOf(cmbTipo.getSelectedItem()));
            obj.setDescripcion(txtDescripcion.getText());
            obj.setFecha(fechaActual);
            
            int tipo = cmbTipo.getSelectedIndex();
            String depto = cmbDepto.getItemAt(tipo);
            obj.setDeptoE(depto);
            
            if (obj.guadarReclamo()) {
                res = MtoConsultar.Consulta("SELECT MAX(idReclamo) FROM dboReclamo WHERE idCliente = (SELECT idCliente FROM dboCliente WHERE DUI = '" + client.getDUI() +"')");
        
                try {
                    if(res.next()) {
                        if (Expo.Idioma.equals("English")) {
                             JOptionPane.showMessageDialog(this, "Claim successfully saved, your claim number is: " + res.getString(1));
                        } else {
                             JOptionPane.showMessageDialog(this, "Reclamo guardado exitosamente, su número de reclamo es: " + res.getString(1));
                        }        
                    }
                } catch (SQLException e) {}
                LimpiarDatos();
            }
            else{
                if (Expo.Idioma.equals("English")) {
                             JOptionPane.showMessageDialog(this, "You have reached the limit of allowed claims in this time period. \n"
                       + "Please try again within 24hrs or wait for currently active claims to be completed." , "Claim error.", 0);
                        } else {
                            JOptionPane.showMessageDialog(this, "Ha alcazado el limite de reclamos permitidos, en este periodo de tiempo. \n"
                        + "Por favor intente de nuevo dentro de 24hrs o espere a que se completen los reclamos activos actualmente.", "Error de reclamo", 0);
                        }                 
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped
        //Controlador.Validaciones.SoloLetras(evt);
        if (txtDescripcion.getText().length() >= 800){ 
         evt.consume(); 
        } 
    }//GEN-LAST:event_txtDescripcionKeyTyped

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        if (jLabel6.isVisible() == true) {
            jLabel6.setVisible(false);
        }else{
            jLabel6.setVisible(true);
        }
    }//GEN-LAST:event_jLabel1MouseClicked
    
        private void LimpiarDatos(){    
            txtDescripcion.setText(null);
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
                new Reclamos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover btnAgregar;
    private javax.swing.JComboBox<String> cmbDepto;
    private javax.swing.JComboBox<String> cmbTipo;
    private rojeru_san.RSLabelFecha fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtFecha;
    // End of variables declaration//GEN-END:variables
}
