package Main;

import static java.awt.Frame.ICONIFIED;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import Controlador.MtoLogin;
import java.awt.MouseInfo;
import java.awt.Point;
import java.util.Locale;
import java.util.ResourceBundle;

/* @author nelson */

public class Login extends javax.swing.JFrame {
    
    
    public Login() {
        initComponents();
        txtContra.setEchoChar('●');
        if (Expo.Idioma.equals("English")) {
           locale = new Locale("en","US");
           Internacionalizacion();
        }
        else{
           locale = new Locale("es","ES");
           Internacionalizacion();
 
        }
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Main/Icon.png")).getImage());
        txtNumero.setVisible(false);
        txtDUI.setVisible(false);
        btnLoginC.setVisible(false);
        jLabel11.setVisible(false);
        jLabel6.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtContra = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnLogin = new rojeru_san.complementos.RSButtonHover();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBtnPassword = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        lblIdioma = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        txtDUI = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnLoginC = new rojeru_san.complementos.RSButtonHover();
        btnSwitch = new rojeru_san.complementos.RSButtonHover();
        btnSwitch1 = new rojeru_san.complementos.RSButtonHover();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Res/Bundle"); // NOI18N
        setTitle(bundle.getString("Login.title")); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(63, 94, 102));
        jLabel1.setText(bundle.getString("Login.jLabel1.text")); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        txtContra.setBackground(new java.awt.Color(219, 225, 225));
        txtContra.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtContra.setForeground(new java.awt.Color(51, 51, 51));
        txtContra.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 290, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 290, 10));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 290, 10));

        btnLogin.setBackground(new java.awt.Color(126, 204, 188));
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_enter_20px_1.png"))); // NOI18N
        btnLogin.setText(bundle.getString("Login.btnLogin.text")); // NOI18N
        btnLogin.setColorHover(new java.awt.Color(62, 118, 122));
        btnLogin.setColorText(new java.awt.Color(0, 0, 0));
        btnLogin.setColorTextHover(new java.awt.Color(169, 221, 210));
        btnLogin.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnLogin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLogin.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLogin.setIconTextGap(28);
        btnLogin.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, 170, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_unlock_30px.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 30, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_user_30px_1.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(62, 118, 122));
        jLabel5.setText(bundle.getString("Login.jLabel5.text")); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, -1));

        jBtnPassword.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jBtnPassword.setForeground(new java.awt.Color(63, 94, 102));
        jBtnPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jBtnPassword.setText(bundle.getString("Login.jBtnPassword.text")); // NOI18N
        jBtnPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnPassword.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jBtnPassword.setRequestFocusEnabled(false);
        jBtnPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnPasswordMouseClicked(evt);
            }
        });
        jPanel2.add(jBtnPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 340, 180, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_red_circle_22px_1.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, -1, 20));

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_yellow_circle_22px.png"))); // NOI18N
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });
        jPanel2.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 5, -1, 20));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(62, 118, 122));
        jLabel10.setText(bundle.getString("Login.jLabel10.text")); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        txtUser.setBackground(new java.awt.Color(219, 225, 225));
        txtUser.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtUser.setForeground(new java.awt.Color(51, 51, 51));
        txtUser.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 290, -1));

        lblIdioma.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblIdioma.setForeground(new java.awt.Color(62, 118, 122));
        lblIdioma.setText(bundle.getString("Login.lblIdioma.text")); // NOI18N
        lblIdioma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblIdioma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIdiomaMouseClicked(evt);
            }
        });
        jPanel2.add(lblIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, -1, -1));

        txtNumero.setBackground(new java.awt.Color(219, 225, 225));
        txtNumero.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtNumero.setForeground(new java.awt.Color(51, 51, 51));
        txtNumero.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });
        jPanel2.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 290, -1));

        txtDUI.setBackground(new java.awt.Color(227, 227, 227));
        txtDUI.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtDUI.setForeground(new java.awt.Color(51, 51, 51));
        try {
            txtDUI.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDUI.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jPanel2.add(txtDUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 290, 25));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(62, 118, 122));
        jLabel11.setText(bundle.getString("Login.jLabel11.text")); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(62, 118, 122));
        jLabel6.setText(bundle.getString("Login.jLabel6.text")); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, -1));

        btnLoginC.setBackground(new java.awt.Color(126, 204, 188));
        btnLoginC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_enter_20px_1.png"))); // NOI18N
        btnLoginC.setText(bundle.getString("Login.btnLoginC.text")); // NOI18N
        btnLoginC.setColorHover(new java.awt.Color(62, 118, 122));
        btnLoginC.setColorText(new java.awt.Color(0, 0, 0));
        btnLoginC.setColorTextHover(new java.awt.Color(169, 221, 210));
        btnLoginC.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnLoginC.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLoginC.setIconTextGap(20);
        btnLoginC.setMargin(new java.awt.Insets(4, 4, 4, 4));
        btnLoginC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginCActionPerformed(evt);
            }
        });
        jPanel2.add(btnLoginC, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 380, 170, -1));

        btnSwitch.setBackground(new java.awt.Color(255, 255, 255));
        btnSwitch.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSwitch.setForeground(new java.awt.Color(126, 204, 188));
        btnSwitch.setText(bundle.getString("Login.btnSwitch.text")); // NOI18N
        btnSwitch.setColorHover(new java.awt.Color(62, 118, 122));
        btnSwitch.setColorText(new java.awt.Color(39, 156, 143));
        btnSwitch.setColorTextHover(new java.awt.Color(169, 221, 210));
        btnSwitch.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        btnSwitch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSwitchActionPerformed(evt);
            }
        });
        jPanel2.add(btnSwitch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 160, 40));

        btnSwitch1.setBackground(new java.awt.Color(255, 255, 255));
        btnSwitch1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSwitch1.setForeground(new java.awt.Color(126, 204, 188));
        btnSwitch1.setText(bundle.getString("Login.btnSwitch1.text")); // NOI18N
        btnSwitch1.setColorHover(new java.awt.Color(62, 118, 122));
        btnSwitch1.setColorText(new java.awt.Color(39, 156, 143));
        btnSwitch1.setColorTextHover(new java.awt.Color(169, 221, 210));
        btnSwitch1.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        btnSwitch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSwitch1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSwitch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 160, 40));

        jPanel4.setOpaque(false);
        jPanel4.setRequestFocusEnabled(false);
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4MouseDragged(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 560));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/Login.fw.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 560));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 350, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        System.exit(WIDTH);
    }//GEN-LAST:event_jLabel9MouseClicked
    
    MtoLogin login = new MtoLogin();
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if (txtUser.getText().isEmpty() || txtContra.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos.", "Campos vacíos", 1);
        }else{
            login.setUser(txtUser.getText());
            login.setContrasena(txtContra.getText());
            login.setNum(0);

            if (login.accesoUsuario()) {
                if (txtContra.getText().equals("12345678")) {
                    JOptionPane.showMessageDialog(null, "Hemos detectado una clave por defecto, le recomendamos que cambie su contraseña.");
                }
                    dispose();
                    Expo abrir = new Expo();
                    abrir.tipoU = login.getTipoU();
                    abrir.idDepto = login.getIdDepto();
                    abrir.tipoUsuario();
                    abrir.show();
            }else{
                LimpiarDatos();
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed
    
    public int LimpiarDatos(){
        txtUser.setText(null);
        txtContra.setText(null);
        return 0;
    }
    
    public int borrarNumero(){
        txtNumero.setText(null);
        return 0;
    }
    
    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void jBtnPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnPasswordMouseClicked
        RecuperarContraseña recover = new RecuperarContraseña();
        recover.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBtnPasswordMouseClicked
    Locale locale;
    private void lblIdiomaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIdiomaMouseClicked
        if (Expo.Idioma.equals("Español")) {
            Expo.Idioma= "English";
           locale = new Locale("en","US");
           Internacionalizacion();
        }
        else{
            Expo.Idioma= "Español";
           locale = new Locale("es","ES");
           Internacionalizacion();
 
        }
    }//GEN-LAST:event_lblIdiomaMouseClicked

    private void btnLoginCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginCActionPerformed
        if (txtNumero.getText().isEmpty() || txtDUI.getText().isEmpty()) {
            
        }else{
            login.setNum(Integer.parseInt(txtNumero.getText()));
            login.setDUI(txtDUI.getText());
            if (login.accesoCliente()) {
                dispose();
                Expo abrir = new Expo();
                abrir.tipoU = "Cliente";
                abrir.tipoUsuario();
                abrir.show();
            }
        }
    }//GEN-LAST:event_btnLoginCActionPerformed

    private void btnSwitchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSwitchActionPerformed
        btnSwitch.setVisible(false);
        btnSwitch1.setVisible(true);
        
        txtNumero.setVisible(true);
        txtDUI.setVisible(true);
        btnLoginC.setVisible(true);
        jLabel11.setVisible(true);
        jLabel6.setVisible(true);

        jLabel10.setVisible(false);
        jLabel5.setVisible(false);
        txtUser.setVisible(false);
        txtContra.setVisible(false);
        btnLogin.setVisible(false);
        jBtnPassword.setVisible(false);
    }//GEN-LAST:event_btnSwitchActionPerformed

    private void btnSwitch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSwitch1ActionPerformed
        btnSwitch.setVisible(true);
        btnSwitch1.setVisible(false);
        
        txtNumero.setVisible(false);    
        txtDUI.setVisible(false);
        btnLoginC.setVisible(false);  
        jLabel11.setVisible(false);   
        jLabel6.setVisible(false);
  
        jLabel10.setVisible(true); 
        jLabel5.setVisible(true);   
        txtUser.setVisible(true);   
        txtContra.setVisible(true);  
        btnLogin.setVisible(true); 
        jBtnPassword.setVisible(true);
    }//GEN-LAST:event_btnSwitch1ActionPerformed

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
        Controlador.Validaciones.SoloNumerosLimite(evt, txtNumero);
    }//GEN-LAST:event_txtNumeroKeyTyped

    int x,y;
    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
        Point p = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(p.x-x , p.y-y);
    }//GEN-LAST:event_jPanel4MouseDragged

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel4MousePressed
    
    private void Internacionalizacion(){
        ResourceBundle bundle = ResourceBundle.getBundle("Res/Bundle", locale);
        jLabel1.setText(bundle.getString("Login.jLabel1.text"));
        jLabel10.setText(bundle.getString("Login.jLabel10.text"));
        jLabel11.setText(bundle.getString("Login.jLabel11.text"));
        btnLogin.setText(bundle.getString("Login.btnLogin.text"));
        btnLoginC.setText(bundle.getString("Login.btnLoginC.text"));
        jLabel5.setText(bundle.getString("Login.jLabel5.text"));
        jLabel6.setText(bundle.getString("Login.jLabel6.text"));
        jBtnPassword.setText(bundle.getString("Login.jBtnPassword.text"));
        lblIdioma.setText(bundle.getString("Login.lblIdioma.text"));
        btnSwitch.setText(bundle.getString("Login.btnSwitch.text"));
        btnSwitch1.setText(bundle.getString("Login.btnSwitch1.text"));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Grupo1;
    private rojeru_san.complementos.RSButtonHover btnLogin;
    private rojeru_san.complementos.RSButtonHover btnLoginC;
    private javax.swing.JLabel btnMinimizar;
    private rojeru_san.complementos.RSButtonHover btnSwitch;
    private rojeru_san.complementos.RSButtonHover btnSwitch1;
    private javax.swing.JLabel jBtnPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblIdioma;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JFormattedTextField txtDUI;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
