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
import java.util.Locale;
import java.util.ResourceBundle;

/* @author elmer */

public class PreguntasVerficación extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    Locale locale;
    public PreguntasVerficación() {
        initComponents();
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
    
    private void Internacionalizacion(){
        ResourceBundle bundle = ResourceBundle.getBundle("Res/Bundle", locale);
        jLabel1.setText(bundle.getString("PreguntasVerficación.jLabel1.text"));
        btnRegister.setText(bundle.getString("PreguntasVerficación.btnRegister.text"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnRegister = new rojeru_san.complementos.RSButtonHover();
        jLabel9 = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtAnswer1 = new javax.swing.JTextField();
        txtAnswer2 = new javax.swing.JTextField();
        txtAnswer3 = new javax.swing.JTextField();
        jCmbPregunta3 = new javax.swing.JComboBox<>();
        jCmbPregunta1 = new javax.swing.JComboBox<>();
        jCmbPregunta2 = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Res/Bundle"); // NOI18N
        setTitle(bundle.getString("PreguntasVerficación.title")); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(63, 94, 102));
        jLabel1.setText(bundle.getString("PreguntasVerficación.jLabel1.text")); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 410, 10));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 410, 10));

        btnRegister.setBackground(new java.awt.Color(126, 204, 188));
        btnRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_enter_20px_1.png"))); // NOI18N
        btnRegister.setText(bundle.getString("PreguntasVerficación.btnRegister.text")); // NOI18N
        btnRegister.setColorHover(new java.awt.Color(62, 118, 122));
        btnRegister.setColorText(new java.awt.Color(0, 0, 0));
        btnRegister.setColorTextHover(new java.awt.Color(169, 221, 210));
        btnRegister.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnRegister.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegister.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnRegister.setIconTextGap(28);
        btnRegister.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 200, -1));

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
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 410, 10));

        txtAnswer1.setBackground(new java.awt.Color(219, 225, 225));
        txtAnswer1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtAnswer1.setForeground(new java.awt.Color(51, 51, 51));
        txtAnswer1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(txtAnswer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 410, -1));

        txtAnswer2.setBackground(new java.awt.Color(219, 225, 225));
        txtAnswer2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtAnswer2.setForeground(new java.awt.Color(51, 51, 51));
        txtAnswer2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(txtAnswer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 410, -1));

        txtAnswer3.setBackground(new java.awt.Color(219, 225, 225));
        txtAnswer3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtAnswer3.setForeground(new java.awt.Color(51, 51, 51));
        txtAnswer3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(txtAnswer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 410, -1));

        jCmbPregunta3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "¿Cuál era el nombre de tu primera mascota?", "¿En qué ciudad naciste?", "¿Cuál fue a la primera escuela que asististe?", "¿Cuál fue tu mejor amigo de la infancia?", "¿Nombre de algún personaje favorito?" }));
        jPanel2.add(jCmbPregunta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 410, 30));

        jCmbPregunta1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "¿Cuál era el nombre de tu primera mascota?", "¿En qué ciudad naciste?", "¿Cuál fue a la primera escuela que asististe?", "¿Cuál fue tu mejor amigo de la infancia?", "¿Nombre de algún personaje favorito?" }));
        jPanel2.add(jCmbPregunta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 410, 30));

        jCmbPregunta2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "¿Cuál era el nombre de tu primera mascota?", "¿En qué ciudad naciste?", "¿Cuál fue a la primera escuela que asististe?", "¿Cuál fue tu mejor amigo de la infancia?", "¿Nombre de algún personaje favorito?" }));
        jPanel2.add(jCmbPregunta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 410, 30));

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
    
    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        //Se valida que las preguntas no se repitan
        if ((String) jCmbPregunta1.getSelectedItem() != (String) jCmbPregunta2.getSelectedItem()
                && (String) jCmbPregunta1.getSelectedItem() != (String) jCmbPregunta3.getSelectedItem()
                && (String) jCmbPregunta2.getSelectedItem() != (String) jCmbPregunta3.getSelectedItem()) {
            MtoPrimerUso obj = new MtoPrimerUso();

            obj.setUsuario(RegistroUsuario.Usuario);
            obj.setContraseña(RegistroUsuario.Contraseña);
            obj.setDUI(RegistroUsuario.DUI);
            obj.setPregunta1((String) jCmbPregunta1.getSelectedItem());
            obj.setPregunta2((String) jCmbPregunta2.getSelectedItem());
            obj.setPregunta3((String) jCmbPregunta3.getSelectedItem());
            obj.setRespuesta1(String.valueOf(txtAnswer1.getText()));
            obj.setRespuesta2(String.valueOf(txtAnswer2.getText()));
            obj.setRespuesta3(String.valueOf(txtAnswer3.getText()));

            if (obj.guardarUsuario()) {
                JOptionPane.showMessageDialog(this, "Usuario registrado");
                if (obj.guardarPreguntas()) {
                    JOptionPane.showMessageDialog(this, "Preguntas guardadas");
                    dispose();
                    Expo abrir = new Expo();
                    abrir.show();
                } else {
                    JOptionPane.showMessageDialog(this, "Preguntas no guardadas");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Usuario no registrado");
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se pueden elegir las mismas preguntas", "Error", 2);
        }
    }//GEN-LAST:event_btnRegisterActionPerformed
    
    public void limpiarCampo(){
        txtAnswer3.setText(null);
        txtAnswer2.setText(null);
        txtAnswer3.setText(null);
    }      
    
    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

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
            java.util.logging.Logger.getLogger(PreguntasVerficación.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PreguntasVerficación.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PreguntasVerficación.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PreguntasVerficación.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PreguntasVerficación().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnMinimizar;
    private rojeru_san.complementos.RSButtonHover btnRegister;
    private javax.swing.JComboBox<String> jCmbPregunta1;
    private javax.swing.JComboBox<String> jCmbPregunta2;
    private javax.swing.JComboBox<String> jCmbPregunta3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtAnswer1;
    private javax.swing.JTextField txtAnswer2;
    private javax.swing.JTextField txtAnswer3;
    // End of variables declaration//GEN-END:variables
}
