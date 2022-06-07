package Main;

import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/** @author elmer */

public class SeleccionOperador extends javax.swing.JInternalFrame {

    Locale locale;
    public SeleccionOperador() {
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
        if (Expo.darkMode == 1) {
            darkMood();
        }
    }
    
     public void darkMood() {
        Icon Imagenes = new ImageIcon(getClass().getResource("/Sources/FondoDark.png"));
         jLabel1.setIcon(Imagenes);
         jLabel1.repaint();
         btnCasos.setBackground(new java.awt.Color(20, 20, 20));
         btnEnviarCorreo.setBackground(new java.awt.Color(20, 20, 20));
         btnReportes.setBackground(new java.awt.Color(20, 20, 20));
         
         btnCasos.setColorText(Color.WHITE);
         btnEnviarCorreo.setColorText(Color.WHITE);
         btnReportes.setColorText(Color.WHITE);

         btnCasos.setColorHover(new java.awt.Color(30, 30, 30));
         btnEnviarCorreo.setColorHover(new java.awt.Color(30, 30, 30));
         btnReportes.setColorHover(new java.awt.Color(30, 30, 30));
    }
    
    private void Internacionalizacion(){
        ResourceBundle bundle = ResourceBundle.getBundle("Res/Bundle", locale);
        this.setTitle(bundle.getString("SeleccionOperador.title"));
        btnCasos.setText(bundle.getString("SeleccionOperador.btnCasos.text"));
        btnEnviarCorreo.setText(bundle.getString("SeleccionOperador.btnEnviarCorreo.text"));
        btnReportes.setText(bundle.getString("SeleccionOperador.btnReportes.text"));
        lblAccion.setText(bundle.getString("SeleccionOperador.lblAccion.text"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblAccion = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnCasos = new rojeru_san.complementos.RSButtonHover();
        btnEnviarCorreo = new rojeru_san.complementos.RSButtonHover();
        btnReportes = new rojerusan.RSButtonHover();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Res/Bundle"); // NOI18N
        setTitle(bundle.getString("SeleccionOperador.title")); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAccion.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblAccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAccion.setText(bundle.getString("SeleccionOperador.lblAccion.text")); // NOI18N
        jPanel1.add(lblAccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 440, 50));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 260, 10));

        btnCasos.setBackground(new java.awt.Color(255, 255, 255));
        btnCasos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_briefcase_25px.png"))); // NOI18N
        btnCasos.setText(bundle.getString("SeleccionOperador.btnCasos.text")); // NOI18N
        btnCasos.setColorHover(new java.awt.Color(237, 249, 250));
        btnCasos.setColorText(new java.awt.Color(0, 0, 0));
        btnCasos.setColorTextHover(new java.awt.Color(23, 91, 250));
        btnCasos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCasos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCasos.setIconTextGap(15);
        btnCasos.setMargin(new java.awt.Insets(4, 10, 4, 10));
        btnCasos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasosActionPerformed(evt);
            }
        });
        jPanel1.add(btnCasos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 220, 50));

        btnEnviarCorreo.setBackground(new java.awt.Color(255, 255, 255));
        btnEnviarCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_mail_25px.png"))); // NOI18N
        btnEnviarCorreo.setText(bundle.getString("SeleccionOperador.btnEnviarCorreo.text")); // NOI18N
        btnEnviarCorreo.setColorHover(new java.awt.Color(237, 249, 250));
        btnEnviarCorreo.setColorText(new java.awt.Color(0, 0, 0));
        btnEnviarCorreo.setColorTextHover(new java.awt.Color(23, 91, 250));
        btnEnviarCorreo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEnviarCorreo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnEnviarCorreo.setIconTextGap(15);
        btnEnviarCorreo.setMargin(new java.awt.Insets(4, 10, 4, 10));
        btnEnviarCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(btnEnviarCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 220, 50));

        btnReportes.setBackground(new java.awt.Color(255, 255, 255));
        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_combo_chart_25px.png"))); // NOI18N
        btnReportes.setText(bundle.getString("SeleccionOperador.btnReportes.text")); // NOI18N
        btnReportes.setColorHover(new java.awt.Color(237, 249, 250));
        btnReportes.setColorText(new java.awt.Color(0, 0, 0));
        btnReportes.setColorTextHover(new java.awt.Color(23, 91, 250));
        btnReportes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnReportes.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnReportes.setIconTextGap(15);
        btnReportes.setMargin(new java.awt.Insets(4, 10, 4, 10));
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });
        jPanel1.add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 220, 50));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 260, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/FondoSeleccion.fw.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 671));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCasosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasosActionPerformed
        CasosDepto abrir = new CasosDepto();
        dispose();
        Expo.openForm = 7;
        Expo.DesktopPane.add(abrir);
        abrir.show(true);
        abrir.setSize(1302, 670);
    }//GEN-LAST:event_btnCasosActionPerformed

    private void btnEnviarCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarCorreoActionPerformed
        EnviarCorreos abrir = new EnviarCorreos();
        dispose();
        Expo.openForm = 8;
        Expo.DesktopPane.add(abrir);
        abrir.show(true);
        abrir.setSize(1302, 670);
    }//GEN-LAST:event_btnEnviarCorreoActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        if(Expo.DesktopPane.getAllFrames().length > 0){
            Expo.DesktopPane.remove(0);
        }
        Expo.openForm = 9;
        Reportes abrir = new Reportes();
        Expo.DesktopPane.add(abrir);
        abrir.show(true);
        abrir.setSize(1302, 670);
    }//GEN-LAST:event_btnReportesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static rojeru_san.complementos.RSButtonHover btnCasos;
    public static rojeru_san.complementos.RSButtonHover btnEnviarCorreo;
    public static rojerusan.RSButtonHover btnReportes;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAccion;
    // End of variables declaration//GEN-END:variables
}
