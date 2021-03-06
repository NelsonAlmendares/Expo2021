package Main;

import java.sql.*;
import javax.swing.*;
import Controlador.*;
import java.awt.MouseInfo;
import java.awt.Point;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author home
 */
public class RecuContraAdmin extends javax.swing.JFrame {
    
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    /**
     * Creates new form RecuperarContraseña
     */
    Locale locale;
    public RecuContraAdmin() {
        initComponents();
        txtCodigo.setEchoChar('●');
        txtContra1.setEchoChar('●');
        txtContra2.setEchoChar('●');
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
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        jLabel10.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        btnAceptar.setVisible(false);
        txtContra1.setVisible(false);
        txtContra2.setVisible(false);
    }
    
    private void Internacionalizacion(){
        ResourceBundle bundle = ResourceBundle.getBundle("Res/Bundle", locale);
        this.setTitle(bundle.getString("RecuContraAdmin.title"));
        jLabel1.setText(bundle.getString("RecuContraAdmin.jLabel1.text"));
        jLabel2.setText(bundle.getString("RecuContraAdmin.jLabel2.text"));
        jLabel4.setText(bundle.getString("RecuContraAdmin.jLabel4.text"));
        jBtnReturn.setText(bundle.getString("RecuContraAdmin.jBtnReturn.text"));
        jLabel6.setText(bundle.getString("RecuContraAdmin.jLabel6.text"));
        jLabel8.setText(bundle.getString("RecuContraAdmin.jLabel8.text"));
        jLabel9.setText(bundle.getString("RecuContraAdmin.jLabel9.text"));
        jLabel11.setText(bundle.getString("RecuContraAdmin.jLabel11.text"));
        btnVerificar.setText(bundle.getString("RecuContraAdmin.btnVerificar.text"));
        btnAceptar.setText(bundle.getString("RecuContraAdmin.btnAceptar.text"));
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jBtnReturn = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtContra1 = new javax.swing.JPasswordField();
        txtContra2 = new javax.swing.JPasswordField();
        btnVerificar = new rojeru_san.complementos.RSButtonHover();
        btnAceptar = new rojeru_san.complementos.RSButtonHover();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Res/Bundle"); // NOI18N
        setTitle(bundle.getString("RecuContraAdmin.title")); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(63, 94, 102));
        jLabel1.setText(bundle.getString("RecuContraAdmin.jLabel1.text")); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 820, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(62, 118, 122));
        jLabel2.setText(bundle.getString("RecuContraAdmin.jLabel2.text")); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_user_30px_1.png"))); // NOI18N
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 40, 40));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(62, 118, 122));
        jLabel4.setText(bundle.getString("RecuContraAdmin.jLabel4.text")); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_unlock_30px.png"))); // NOI18N
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 40, 40));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(62, 118, 122));
        jLabel6.setText(bundle.getString("RecuContraAdmin.jLabel6.text")); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_lock_30px.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 40, 40));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(62, 118, 122));
        jLabel8.setText(bundle.getString("RecuContraAdmin.jLabel8.text")); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(62, 118, 122));
        jLabel9.setText(bundle.getString("RecuContraAdmin.jLabel9.text")); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_lock_30px.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 40, 40));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText(bundle.getString("RecuContraAdmin.jLabel11.text")); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/EyeClosed.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel12MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel12MouseReleased(evt);
            }
        });
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 28, 28));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/EyeClosed.png"))); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel13MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel13MouseReleased(evt);
            }
        });
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 28, 28));

        jBtnReturn.setBackground(new java.awt.Color(204, 204, 255));
        jBtnReturn.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jBtnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_expand_arrow_25px_1.png"))); // NOI18N
        jBtnReturn.setText(bundle.getString("RecuContraAdmin.jBtnReturn.text")); // NOI18N
        jBtnReturn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnReturnMouseClicked(evt);
            }
        });
        jPanel2.add(jBtnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 100, -1));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_red_circle_22px_1.png"))); // NOI18N
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });
        jPanel2.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, -1, 20));

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_yellow_circle_22px.png"))); // NOI18N
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });
        jPanel2.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 5, -1, 20));

        txtUser.setBackground(new java.awt.Color(219, 225, 225));
        txtUser.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtUser.setForeground(new java.awt.Color(51, 51, 51));
        txtUser.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 290, -1));

        txtCodigo.setBackground(new java.awt.Color(219, 225, 225));
        txtCodigo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(51, 51, 51));
        txtCodigo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 290, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 290, 10));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 290, 10));

        txtContra1.setBackground(new java.awt.Color(219, 225, 225));
        txtContra1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtContra1.setForeground(new java.awt.Color(51, 51, 51));
        txtContra1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtContra1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContra1KeyReleased(evt);
            }
        });
        jPanel2.add(txtContra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 290, -1));

        txtContra2.setBackground(new java.awt.Color(219, 225, 225));
        txtContra2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtContra2.setForeground(new java.awt.Color(51, 51, 51));
        txtContra2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtContra2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContra2KeyReleased(evt);
            }
        });
        jPanel2.add(txtContra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 290, -1));

        btnVerificar.setBackground(new java.awt.Color(126, 204, 188));
        btnVerificar.setText(bundle.getString("RecuContraAdmin.btnVerificar.text")); // NOI18N
        btnVerificar.setColorHover(new java.awt.Color(62, 118, 122));
        btnVerificar.setColorText(new java.awt.Color(0, 0, 0));
        btnVerificar.setColorTextHover(new java.awt.Color(169, 221, 210));
        btnVerificar.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        btnVerificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVerificar.setIconTextGap(28);
        btnVerificar.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 170, -1));

        btnAceptar.setBackground(new java.awt.Color(126, 204, 188));
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_enter_20px_1.png"))); // NOI18N
        btnAceptar.setText("null");
        btnAceptar.setColorHover(new java.awt.Color(62, 118, 122));
        btnAceptar.setColorText(new java.awt.Color(0, 0, 0));
        btnAceptar.setColorTextHover(new java.awt.Color(169, 221, 210));
        btnAceptar.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        btnAceptar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAceptar.setIconTextGap(20);
        btnAceptar.setMargin(new java.awt.Insets(4, 1, 4, 1));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 170, -1));

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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 560));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/Login.fw.png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 200, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        System.exit(WIDTH);
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void jBtnReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnReturnMouseClicked
        RecuperarContraseña recu = new RecuperarContraseña();
        recu.show();
        dispose();
    }//GEN-LAST:event_jBtnReturnMouseClicked
    
    static ResultSet res;
    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        if (txtUser.getText().isEmpty() || txtCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos y reintente.", "Campos vacíos", 1);
        }else{
            MtoRecuContra recu = new MtoRecuContra();
            recu.setUser(txtUser.getText());
            if (verificarCode() && recu.verificarUsuario()) {
                jLabel2.setVisible(false);
                jLabel3.setVisible(false);
                jLabel4.setVisible(false);
                jLabel5.setVisible(false);
                txtUser.setVisible(false);
                txtCodigo.setVisible(false);
                btnVerificar.setVisible(false);
                jLabel6.setVisible(true);
                jLabel7.setVisible(true);
                jLabel8.setVisible(true);
                jLabel9.setVisible(true);
                jLabel10.setVisible(true);
                //jLabel11.setVisible(true);
                jLabel12.setVisible(true);
                jLabel13.setVisible(true);
                btnAceptar.setVisible(true);
                txtContra1.setVisible(true);
                txtContra2.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Usuario o código de administrador incorrectos, verifique y vuelva a intentar.", "Error de verificacíón", 0);
            }
        }
    }//GEN-LAST:event_btnVerificarActionPerformed

    public boolean verificarCode(){
        res = Controlador.MtoConsultar.Consulta("SELECT dl.codigo FROM dboLogin dl, dboTipoUsuario dt where dl.idTipoUsuario = dt.idTipoUsuario and dt.tipoUsuario = 'Administrador';");
        boolean val = false;
        try{
            while(res.next()){
                if (txtCodigo.getText().equals(res.getString(1))) {
                    val = true;
                }
            }
        }catch(SQLException e){}
        return val;
    }
    
    
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (txtContra1.getText().isEmpty() || txtContra2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos y reintente.", "Campos vacíos", 1);
        }else if(!txtContra1.getText().equals(txtContra2.getText())){
            jLabel11.setVisible(true);
        }else if(txtContra2.getText().length() < 8 || txtContra2.getText().length() > 16){
            JOptionPane.showMessageDialog(null, "La contraseña debe tener entre 8 y 16 caracteres", "Advertencia", 2);
        }else{
            MtoRecuContra obj = new MtoRecuContra();
            obj.setUser(txtUser.getText());
            obj.setContra(txtContra2.getText());

            //enviando guardar a  SQLServer
            if(obj.modificarUsuario()){
                JOptionPane.showMessageDialog(this, "Contraseña cambiada correctamente.");
                Login log = new Login();
                log.show();
                dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Contraseña no cambiada.");
            }
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void jLabel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MousePressed
        txtContra1.setEchoChar((char)0);
        ImageIcon eye = new ImageIcon(getClass().getResource("/Sources/EyeOpened.png"));
        jLabel12.setIcon(eye);
    }//GEN-LAST:event_jLabel12MousePressed

    private void jLabel12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseReleased
        txtContra1.setEchoChar('●');
        ImageIcon eye = new ImageIcon(getClass().getResource("/Sources/EyeClosed.png"));
        jLabel12.setIcon(eye);
    }//GEN-LAST:event_jLabel12MouseReleased

    private void jLabel13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MousePressed
        txtContra2.setEchoChar((char)0);
        ImageIcon eye = new ImageIcon(getClass().getResource("/Sources/EyeOpened.png"));
        jLabel13.setIcon(eye);
    }//GEN-LAST:event_jLabel13MousePressed

    private void jLabel13MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseReleased
        txtContra2.setEchoChar('●');
        ImageIcon eye = new ImageIcon(getClass().getResource("/Sources/EyeClosed.png"));
        jLabel13.setIcon(eye);
    }//GEN-LAST:event_jLabel13MouseReleased

    private void txtContra1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContra1KeyReleased
        if(txtContra1.getText().equals(txtContra2.getText())){
            jLabel11.setVisible(false);
        }
    }//GEN-LAST:event_txtContra1KeyReleased

    private void txtContra2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContra2KeyReleased
        if(txtContra1.getText().equals(txtContra2.getText())){
            jLabel11.setVisible(false);
        }
    }//GEN-LAST:event_txtContra2KeyReleased

    int x,y;
    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
        Point p = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(p.x-x , p.y-y);
    }//GEN-LAST:event_jPanel4MouseDragged

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel4MousePressed

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
            java.util.logging.Logger.getLogger(RecuContraAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecuContraAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecuContraAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecuContraAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecuContraAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover btnAceptar;
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JLabel btnMinimizar;
    private rojeru_san.complementos.RSButtonHover btnVerificar;
    private javax.swing.JLabel jBtnReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField txtCodigo;
    private javax.swing.JPasswordField txtContra1;
    private javax.swing.JPasswordField txtContra2;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
