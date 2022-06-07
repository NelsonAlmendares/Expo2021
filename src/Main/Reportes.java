package Main;

import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.util.Locale;
import java.util.ResourceBundle;
import Main.ParamReportes;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/* @author elmer */

public class Reportes extends javax.swing.JInternalFrame {

    Locale locale; 
    
    public Reportes() {
        initComponents();
        if (Expo.Idioma.equals("English")) {
           locale = new Locale("en","US");
           Internacionalizacion();
        }
        else{
           locale = new Locale("es","ES");
           Internacionalizacion();
 
        }
        if (Expo.tipoU.equals("Operador")) {
            btnReporte1.setVisible(false);
            btnReporte2.setVisible(false);
            btnReporte4.setVisible(false);
            btnReporte6.setVisible(false);
            btnReporte9.setVisible(false);
        }
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        btnReporte8.setVisible(false);
        btnReporte10.setVisible(false);
        if (Expo.darkMode == 1) {
            darkMood();
        }
    }
    
    public void darkMood() {
        Icon Imagenes = new ImageIcon(getClass().getResource("/Sources/FondoDark.png"));
        jLabel1.setIcon(Imagenes);
        jLabel1.repaint();
    }
    
    private void Internacionalizacion(){
        ResourceBundle bundle = ResourceBundle.getBundle("Res/Bundle", locale);
           lblAccion.setText(bundle.getString("Reportes.lblAccion.text"));
           btnReporte1.setText(bundle.getString("Reportes.btnReporte1.text"));
           btnReporte1.setText(bundle.getString("Reportes.btnReporte1.text"));
           btnReporte2.setText(bundle.getString("Reportes.btnReporte2.text"));
           btnReporte3.setText(bundle.getString("Reportes.btnReporte3.text"));
           btnReporte4.setText(bundle.getString("Reportes.btnReporte4.text"));
           btnReporte5.setText(bundle.getString("Reportes.btnReporte5.text"));
           btnReporte6.setText(bundle.getString("Reportes.btnReporte6.text"));
           btnReporte7.setText(bundle.getString("Reportes.btnReporte7.text"));
           btnReporte9.setText(bundle.getString("Reportes.btnReporte9.text"));
           jLabel2.setText(bundle.getString("Reportes.jLabel2.text"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        lblAccion = new javax.swing.JLabel();
        btnReporte3 = new rojeru_san.complementos.RSButtonHover();
        btnReporte4 = new rojeru_san.complementos.RSButtonHover();
        btnReporte2 = new rojeru_san.complementos.RSButtonHover();
        btnReporte1 = new rojeru_san.complementos.RSButtonHover();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnReporte5 = new rojeru_san.complementos.RSButtonHover();
        btnReporte7 = new rojeru_san.complementos.RSButtonHover();
        btnReporte6 = new rojeru_san.complementos.RSButtonHover();
        btnReporte8 = new rojeru_san.complementos.RSButtonHover();
        btnReporte9 = new rojeru_san.complementos.RSButtonHover();
        btnReporte10 = new rojeru_san.complementos.RSButtonHover();
        jLabel1 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setTitle("null");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(102, 102, 255));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAccion.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblAccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Res/Bundle"); // NOI18N
        lblAccion.setText(bundle.getString("Reportes.lblAccion.text")); // NOI18N
        jPanel4.add(lblAccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 140, 870, 50));

        btnReporte3.setBackground(new java.awt.Color(51, 51, 51));
        btnReporte3.setForeground(new java.awt.Color(0, 0, 0));
        btnReporte3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_business_building_40px.png"))); // NOI18N
        btnReporte3.setText(bundle.getString("Reportes.btnReporte3.text")); // NOI18N
        btnReporte3.setColorHover(new java.awt.Color(181, 238, 205));
        btnReporte3.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnReporte3.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        btnReporte3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReporte3.setIconTextGap(15);
        btnReporte3.setMargin(new java.awt.Insets(4, 4, 4, 4));
        btnReporte3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReporte3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporte3ActionPerformed(evt);
            }
        });
        jPanel4.add(btnReporte3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 175, 165));

        btnReporte4.setBackground(new java.awt.Color(51, 51, 51));
        btnReporte4.setForeground(new java.awt.Color(0, 0, 0));
        btnReporte4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_calendar_40px.png"))); // NOI18N
        btnReporte4.setText(bundle.getString("Reportes.btnReporte4.text")); // NOI18N
        btnReporte4.setColorHover(new java.awt.Color(181, 238, 205));
        btnReporte4.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnReporte4.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnReporte4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReporte4.setIconTextGap(15);
        btnReporte4.setMargin(new java.awt.Insets(4, 4, 4, 4));
        btnReporte4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReporte4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporte4ActionPerformed(evt);
            }
        });
        jPanel4.add(btnReporte4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 230, 175, 165));

        btnReporte2.setBackground(new java.awt.Color(51, 51, 51));
        btnReporte2.setForeground(new java.awt.Color(0, 0, 0));
        btnReporte2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_building_with_rooftop_terrace_40px.png"))); // NOI18N
        btnReporte2.setText(bundle.getString("Reportes.btnReporte2.text")); // NOI18N
        btnReporte2.setColorHover(new java.awt.Color(181, 238, 205));
        btnReporte2.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnReporte2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnReporte2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReporte2.setIconTextGap(15);
        btnReporte2.setMargin(new java.awt.Insets(4, 4, 4, 4));
        btnReporte2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReporte2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporte2ActionPerformed(evt);
            }
        });
        jPanel4.add(btnReporte2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 175, 165));

        btnReporte1.setBackground(new java.awt.Color(51, 51, 51));
        btnReporte1.setForeground(new java.awt.Color(0, 0, 0));
        btnReporte1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_logs_folder_40px.png"))); // NOI18N
        btnReporte1.setText(bundle.getString("Reportes.btnReporte1.text")); // NOI18N
        btnReporte1.setColorHover(new java.awt.Color(181, 238, 205));
        btnReporte1.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnReporte1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnReporte1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReporte1.setIconTextGap(15);
        btnReporte1.setMargin(new java.awt.Insets(4, 4, 4, 4));
        btnReporte1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReporte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporte1ActionPerformed(evt);
            }
        });
        jPanel4.add(btnReporte1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 175, 165));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setText(bundle.getString("Reportes.jLabel2.text")); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setText(bundle.getString("Reportes.jLabel3.text")); // NOI18N
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        btnReporte5.setBackground(new java.awt.Color(51, 51, 51));
        btnReporte5.setForeground(new java.awt.Color(0, 0, 0));
        btnReporte5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_ask_question_40px.png"))); // NOI18N
        btnReporte5.setText(bundle.getString("Reportes.btnReporte5.text")); // NOI18N
        btnReporte5.setColorHover(new java.awt.Color(181, 238, 205));
        btnReporte5.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnReporte5.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnReporte5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReporte5.setIconTextGap(15);
        btnReporte5.setMargin(new java.awt.Insets(4, 4, 4, 4));
        btnReporte5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReporte5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporte5ActionPerformed(evt);
            }
        });
        jPanel4.add(btnReporte5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 175, 165));

        btnReporte7.setBackground(new java.awt.Color(51, 51, 51));
        btnReporte7.setForeground(new java.awt.Color(0, 0, 0));
        btnReporte7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_search_client_40px.png"))); // NOI18N
        btnReporte7.setText(bundle.getString("Reportes.btnReporte7.text")); // NOI18N
        btnReporte7.setColorHover(new java.awt.Color(181, 238, 205));
        btnReporte7.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnReporte7.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnReporte7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReporte7.setIconTextGap(15);
        btnReporte7.setMargin(new java.awt.Insets(4, 4, 4, 4));
        btnReporte7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReporte7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporte7ActionPerformed(evt);
            }
        });
        jPanel4.add(btnReporte7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 175, 165));

        btnReporte6.setBackground(new java.awt.Color(51, 51, 51));
        btnReporte6.setForeground(new java.awt.Color(0, 0, 0));
        btnReporte6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_user_40px.png"))); // NOI18N
        btnReporte6.setText(bundle.getString("Reportes.btnReporte6.text")); // NOI18N
        btnReporte6.setColorHover(new java.awt.Color(181, 238, 205));
        btnReporte6.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnReporte6.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnReporte6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReporte6.setIconTextGap(15);
        btnReporte6.setMargin(new java.awt.Insets(4, 4, 4, 4));
        btnReporte6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReporte6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporte6ActionPerformed(evt);
            }
        });
        jPanel4.add(btnReporte6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 175, 165));

        btnReporte8.setBackground(new java.awt.Color(51, 51, 51));
        btnReporte8.setForeground(new java.awt.Color(0, 0, 0));
        btnReporte8.setText(bundle.getString("Reportes.btnReporte8.text")); // NOI18N
        btnReporte8.setColorHover(new java.awt.Color(181, 238, 205));
        btnReporte8.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnReporte8.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnReporte8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnReporte8.setIconTextGap(15);
        btnReporte8.setMargin(new java.awt.Insets(4, 8, 4, 8));
        btnReporte8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporte8ActionPerformed(evt);
            }
        });
        jPanel4.add(btnReporte8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 450, 290, 60));

        btnReporte9.setBackground(new java.awt.Color(51, 51, 51));
        btnReporte9.setForeground(new java.awt.Color(0, 0, 0));
        btnReporte9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_calendar_40px.png"))); // NOI18N
        btnReporte9.setText(bundle.getString("Reportes.btnReporte9.text")); // NOI18N
        btnReporte9.setColorHover(new java.awt.Color(181, 238, 205));
        btnReporte9.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnReporte9.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        btnReporte9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReporte9.setIconTextGap(15);
        btnReporte9.setMargin(new java.awt.Insets(4, 4, 4, 4));
        btnReporte9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReporte9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporte9ActionPerformed(evt);
            }
        });
        jPanel4.add(btnReporte9, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 430, 175, 165));

        btnReporte10.setBackground(new java.awt.Color(51, 51, 51));
        btnReporte10.setForeground(new java.awt.Color(0, 0, 0));
        btnReporte10.setText(bundle.getString("Reportes.btnReporte10.text")); // NOI18N
        btnReporte10.setColorHover(new java.awt.Color(181, 238, 205));
        btnReporte10.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnReporte10.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnReporte10.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnReporte10.setIconTextGap(15);
        btnReporte10.setMargin(new java.awt.Insets(4, 8, 4, 8));
        btnReporte10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporte10ActionPerformed(evt);
            }
        });
        jPanel4.add(btnReporte10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 520, 290, 60));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 670));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/FondoSeleccion.fw.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReporte3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporte3ActionPerformed
        ParamReportes.num = 3;
        abirParamReportes();
    }//GEN-LAST:event_btnReporte3ActionPerformed

    private void btnReporte4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporte4ActionPerformed
        ParamReportes.num = 4;
        abirParamReportes();
    }//GEN-LAST:event_btnReporte4ActionPerformed

    private void btnReporte2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporte2ActionPerformed
        ParamReportes.num = 2;
        abirParamReportes();
    }//GEN-LAST:event_btnReporte2ActionPerformed

    private void btnReporte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporte1ActionPerformed
        ParamReportes.num = 1;
        abirParamReportes();
    }//GEN-LAST:event_btnReporte1ActionPerformed

    private void btnReporte5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporte5ActionPerformed
        ParamReportes.num = 5;
        abirParamReportes(); 
    }//GEN-LAST:event_btnReporte5ActionPerformed

    private void btnReporte7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporte7ActionPerformed
        ParamReportes.num = 7;
        abirParamReportes();
    }//GEN-LAST:event_btnReporte7ActionPerformed

    private void btnReporte6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporte6ActionPerformed
        ParamReportes.num = 6;
        abirParamReportes();        
    }//GEN-LAST:event_btnReporte6ActionPerformed

    private void btnReporte8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporte8ActionPerformed
        ParamReportes.num = 8;
        abirParamReportes();        
    }//GEN-LAST:event_btnReporte8ActionPerformed

    private void btnReporte9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporte9ActionPerformed
        ParamReportes.num = 9;
        abirParamReportes();      
    }//GEN-LAST:event_btnReporte9ActionPerformed

    private void btnReporte10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporte10ActionPerformed
        ParamReportes.num = 10;
        abirParamReportes();  
    }//GEN-LAST:event_btnReporte10ActionPerformed

    public void abirParamReportes(){
        ParamReportes abrir = new ParamReportes();
        this.dispose();
        Expo.DesktopPane.add(abrir);
        abrir.show(true);
        abrir.setSize(1302, 660);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover btnReporte1;
    private rojeru_san.complementos.RSButtonHover btnReporte10;
    private rojeru_san.complementos.RSButtonHover btnReporte2;
    private rojeru_san.complementos.RSButtonHover btnReporte3;
    private rojeru_san.complementos.RSButtonHover btnReporte4;
    private rojeru_san.complementos.RSButtonHover btnReporte5;
    private rojeru_san.complementos.RSButtonHover btnReporte6;
    private rojeru_san.complementos.RSButtonHover btnReporte7;
    private rojeru_san.complementos.RSButtonHover btnReporte8;
    private rojeru_san.complementos.RSButtonHover btnReporte9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblAccion;
    // End of variables declaration//GEN-END:variables
}
