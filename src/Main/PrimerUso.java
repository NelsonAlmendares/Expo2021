package Main;

import static java.awt.Frame.ICONIFIED;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import Controlador.*;
import java.awt.MouseInfo;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;

/* @author elmer */

public class PrimerUso extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    Locale locale;
    MtoPrimerUso consulta = new MtoPrimerUso();
    
    public PrimerUso() {
        initComponents();
        cargarDUI();
        txtPassword.setEchoChar('●');
        txtConfirmPassword.setEchoChar('●');
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
                        
    }
    
    static ResultSet res;
    
    private void Internacionalizacion(){
        ResourceBundle bundle = ResourceBundle.getBundle("Res/Bundle", locale);
        jLabel10.setText(bundle.getString("PrimerUso.jLabel10.text"));
        jLabel1.setText(bundle.getString("PrimerUso.jLabel1.text"));
        jLabel11.setText(bundle.getString("PrimerUso.jLabel11.text"));
        btnContinue.setText(bundle.getString("PrimerUso.btnContinue.text"));
        jLabel5.setText(bundle.getString("PrimerUso.jLabel5.text"));
    }                    
    
    private void cargarDUI(){
        MtoPrimerUso mtoDui = new MtoPrimerUso();
        ArrayList<MtoPrimerUso>  CargarDui = mtoDui.getDui();
        
        jCmbDui.removeAllItems();
        
        for (int i = 0; i < CargarDui.size(); i++) {
          jCmbDui.addItem(CargarDui.get(i).getDUI());  
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtConfirmPassword = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnContinue = new rojeru_san.complementos.RSButtonHover();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNewUser = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLblMostrarP1 = new javax.swing.JLabel();
        jLblMostrarP2 = new javax.swing.JLabel();
        jCmbDui = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Res/Bundle"); // NOI18N
        setTitle(bundle.getString("PrimerUso.title")); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(63, 94, 102));
        jLabel1.setText(bundle.getString("PrimerUso.jLabel1.text")); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        txtConfirmPassword.setBackground(new java.awt.Color(219, 225, 225));
        txtConfirmPassword.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtConfirmPassword.setForeground(new java.awt.Color(51, 51, 51));
        txtConfirmPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(txtConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 250, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 290, 10));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 290, 10));

        btnContinue.setBackground(new java.awt.Color(126, 204, 188));
        btnContinue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_enter_20px_1.png"))); // NOI18N
        btnContinue.setText(bundle.getString("PrimerUso.btnContinue.text")); // NOI18N
        btnContinue.setColorHover(new java.awt.Color(62, 118, 122));
        btnContinue.setColorText(new java.awt.Color(0, 0, 0));
        btnContinue.setColorTextHover(new java.awt.Color(169, 221, 210));
        btnContinue.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnContinue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnContinue.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnContinue.setIconTextGap(28);
        btnContinue.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinueActionPerformed(evt);
            }
        });
        jPanel2.add(btnContinue, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 200, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_lock_30px.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 40, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_user_30px_1.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(62, 118, 122));
        jLabel5.setText(bundle.getString("PrimerUso.jLabel5.text")); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, -1, -1));

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
        jLabel10.setText(bundle.getString("PrimerUso.jLabel10.text")); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

        txtNewUser.setBackground(new java.awt.Color(219, 225, 225));
        txtNewUser.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtNewUser.setForeground(new java.awt.Color(51, 51, 51));
        txtNewUser.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(txtNewUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 290, -1));

        txtPassword.setBackground(new java.awt.Color(219, 225, 225));
        txtPassword.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(51, 51, 51));
        txtPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 250, -1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_unlock_30px.png"))); // NOI18N
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 30, 40));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(62, 118, 122));
        jLabel11.setText(bundle.getString("PrimerUso.jLabel11.text")); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 290, 10));

        jLblMostrarP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/EyeClosed.png"))); // NOI18N
        jLblMostrarP1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLblMostrarP1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLblMostrarP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLblMostrarP1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLblMostrarP1MouseReleased(evt);
            }
        });
        jPanel2.add(jLblMostrarP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 28, 28));

        jLblMostrarP2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/EyeClosed.png"))); // NOI18N
        jLblMostrarP2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLblMostrarP2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLblMostrarP2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLblMostrarP2MouseReleased(evt);
            }
        });
        jPanel2.add(jLblMostrarP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 275, 28, 28));

        jCmbDui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCmbDuiMouseClicked(evt);
            }
        });
        jPanel2.add(jCmbDui, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 290, 30));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(62, 118, 122));
        jLabel12.setText(bundle.getString("PrimerUso.jLabel12.text")); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 290, 10));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(62, 118, 122));
        jLabel14.setText(bundle.getString("PrimerUso.jLabel14.text")); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(62, 118, 122));
        jLabel15.setText(bundle.getString("PrimerUso.jLabel15.text")); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, -1, -1));

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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 560));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/Login.fw.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 210, 560));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 350, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        System.exit(WIDTH);
    }//GEN-LAST:event_jLabel9MouseClicked
    MtoLogin log = new MtoLogin();
    private void btnContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinueActionPerformed
        String contra;
        String confirContra;
        
        contra=String.valueOf(txtPassword.getText());
        confirContra = String.valueOf(txtConfirmPassword.getText());
        
        //Primer uso incompleto, estamos trabajando en ello
        
         if (txtPassword.getText().isEmpty() || 
             txtConfirmPassword.getText().isEmpty() ||
             txtNewUser.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos y reintente.", "Campos vacíos", 1);
        }else if(txtPassword.getText().length() < 8 || txtConfirmPassword.getText().length() > 16){
            JOptionPane.showMessageDialog(null, "La contraseña debe tener entre 8 y 16 caracteres", "Advertencia", 2);
        }else if (contra.equals(confirContra)) {            
            //MtoPrimerUso obj=new MtoPrimerUso();

            /*obj.setUsuario(String.valueOf(txtNewUser.getText()));
            obj.setContraseña(String.valueOf(txtConfirmPassword.getText()));
            obj.setDUI((String)jCmbDui.getSelectedItem());*/
             RegistroUsuario.Usuario = String.valueOf(txtNewUser.getText());
             
             RegistroUsuario.Contraseña = String.valueOf(txtConfirmPassword.getText());
             RegistroUsuario.DUI = String.valueOf(jCmbDui.getSelectedItem());
             log.setUser(txtNewUser.getText());
             dispose();
             PreguntasVerficación abrir = new PreguntasVerficación();
             abrir.show(true);   
                        
        }else{
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
        }                

//        limpiarCampo();
    }//GEN-LAST:event_btnContinueActionPerformed
    
    public void limpiarCampo(){
        txtNewUser.setText(null);
        txtPassword.setText(null);
        txtConfirmPassword.setText(null);
    }
    
    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void jLblMostrarP1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblMostrarP1MousePressed
        txtPassword.setEchoChar((char)0);
        ImageIcon eye = new ImageIcon(getClass().getResource("/Sources/EyeOpened.png"));
        jLblMostrarP1.setIcon(eye);
    }//GEN-LAST:event_jLblMostrarP1MousePressed

    private void jLblMostrarP1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblMostrarP1MouseReleased
        txtPassword.setEchoChar('●');
        ImageIcon eye = new ImageIcon(getClass().getResource("/Sources/EyeClosed.png"));
        jLblMostrarP1.setIcon(eye);
    }//GEN-LAST:event_jLblMostrarP1MouseReleased

    private void jLblMostrarP2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblMostrarP2MousePressed
        txtConfirmPassword.setEchoChar((char)0);
        ImageIcon eye = new ImageIcon(getClass().getResource("/Sources/EyeOpened.png"));
        jLblMostrarP2.setIcon(eye);
    }//GEN-LAST:event_jLblMostrarP2MousePressed

    private void jLblMostrarP2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblMostrarP2MouseReleased
        txtConfirmPassword.setEchoChar('●');
        ImageIcon eye = new ImageIcon(getClass().getResource("/Sources/EyeClosed.png"));
        jLblMostrarP2.setIcon(eye);
    }//GEN-LAST:event_jLblMostrarP2MouseReleased

    private void jCmbDuiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCmbDuiMouseClicked
        cargarDUI();
    }//GEN-LAST:event_jCmbDuiMouseClicked

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
            java.util.logging.Logger.getLogger(PrimerUso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrimerUso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrimerUso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrimerUso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrimerUso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover btnContinue;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JComboBox<String> jCmbDui;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLblMostrarP1;
    private javax.swing.JLabel jLblMostrarP2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtNewUser;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
