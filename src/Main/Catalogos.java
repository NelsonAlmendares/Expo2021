package Main;

import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.util.Locale;
import java.util.ResourceBundle;

/* @author elmer */

public class Catalogos extends javax.swing.JInternalFrame {

    Locale locale; 
    public Catalogos() {
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
    }
    
    private void Internacionalizacion(){
        ResourceBundle bundle = ResourceBundle.getBundle("Res/Bundle", locale);
        this.setTitle(bundle.getString("Catalogos.title"));
        btnTipoUsuario.setText(bundle.getString("Catalogos.btnTipoUsuario.text"));
        btnDepartamento.setText(bundle.getString("Catalogos.btnDepartamento.text"));
        btnEstadoReclamo.setText(bundle.getString("Catalogos.btnEstadoReclamo.text"));
        btnTipoReclamo.setText(bundle.getString("Catalogos.btnTipoReclamo.text"));
        jLabel2.setText(bundle.getString("Catalogos.jLabel2.text"));
        lblAccion.setText(bundle.getString("Catalogos.lblAccion.text"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        lblAccion = new javax.swing.JLabel();
        btnTipoUsuario = new rojeru_san.complementos.RSButtonHover();
        btnDepartamento = new rojeru_san.complementos.RSButtonHover();
        btnEstadoReclamo = new rojeru_san.complementos.RSButtonHover();
        btnTipoReclamo = new rojeru_san.complementos.RSButtonHover();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Res/Bundle"); // NOI18N
        setTitle(bundle.getString("Catalogos.title")); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(102, 102, 255));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAccion.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblAccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAccion.setText(bundle.getString("Catalogos.lblAccion.text")); // NOI18N
        jPanel4.add(lblAccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 450, 50));

        btnTipoUsuario.setBackground(new java.awt.Color(51, 51, 51));
        btnTipoUsuario.setForeground(new java.awt.Color(0, 0, 0));
        btnTipoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_male_user_28px.png"))); // NOI18N
        btnTipoUsuario.setText(bundle.getString("Catalogos.btnTipoUsuario.text")); // NOI18N
        btnTipoUsuario.setColorHover(new java.awt.Color(58, 136, 252));
        btnTipoUsuario.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnTipoUsuario.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnTipoUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnTipoUsuario.setIconTextGap(15);
        btnTipoUsuario.setMargin(new java.awt.Insets(4, 8, 4, 8));
        btnTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTipoUsuarioActionPerformed(evt);
            }
        });
        jPanel4.add(btnTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 290, 110));

        btnDepartamento.setBackground(new java.awt.Color(51, 51, 51));
        btnDepartamento.setForeground(new java.awt.Color(0, 0, 0));
        btnDepartamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_building_with_rooftop_terrace_27px.png"))); // NOI18N
        btnDepartamento.setText(bundle.getString("Catalogos.btnDepartamento.text")); // NOI18N
        btnDepartamento.setColorHover(new java.awt.Color(58, 136, 252));
        btnDepartamento.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnDepartamento.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnDepartamento.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnDepartamento.setIconTextGap(15);
        btnDepartamento.setMargin(new java.awt.Insets(4, 8, 4, 8));
        btnDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepartamentoActionPerformed(evt);
            }
        });
        jPanel4.add(btnDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 290, 110));

        btnEstadoReclamo.setBackground(new java.awt.Color(51, 51, 51));
        btnEstadoReclamo.setForeground(new java.awt.Color(0, 0, 0));
        btnEstadoReclamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_combo_chart_25px.png"))); // NOI18N
        btnEstadoReclamo.setText(bundle.getString("Catalogos.btnEstadoReclamo.text")); // NOI18N
        btnEstadoReclamo.setColorHover(new java.awt.Color(58, 136, 252));
        btnEstadoReclamo.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnEstadoReclamo.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnEstadoReclamo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnEstadoReclamo.setIconTextGap(15);
        btnEstadoReclamo.setMargin(new java.awt.Insets(4, 8, 4, 8));
        btnEstadoReclamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadoReclamoActionPerformed(evt);
            }
        });
        jPanel4.add(btnEstadoReclamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 290, 110));

        btnTipoReclamo.setBackground(new java.awt.Color(51, 51, 51));
        btnTipoReclamo.setForeground(new java.awt.Color(0, 0, 0));
        btnTipoReclamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_edit_property_27px.png"))); // NOI18N
        btnTipoReclamo.setText(bundle.getString("Catalogos.btnTipoReclamo.text")); // NOI18N
        btnTipoReclamo.setColorHover(new java.awt.Color(58, 136, 252));
        btnTipoReclamo.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnTipoReclamo.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnTipoReclamo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnTipoReclamo.setIconTextGap(15);
        btnTipoReclamo.setMargin(new java.awt.Insets(4, 8, 4, 8));
        btnTipoReclamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTipoReclamoActionPerformed(evt);
            }
        });
        jPanel4.add(btnTipoReclamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 290, 110));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setText(bundle.getString("Catalogos.jLabel2.text")); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setText(bundle.getString("Catalogos.jLabel3.text")); // NOI18N
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 1010, 540));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/FondoSeleccion.fw.png"))); // NOI18N
        jLabel1.setText(bundle.getString("Catalogos.jLabel1.text")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTipoUsuarioActionPerformed
        TipoUsuario abrir = new TipoUsuario();
        this.dispose();
        Expo.DesktopPane.add(abrir);
        abrir.show(true);
    }//GEN-LAST:event_btnTipoUsuarioActionPerformed

    private void btnDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepartamentoActionPerformed
        DepartamentoEmpresa abrir = new DepartamentoEmpresa();
        this.dispose();
        Expo.DesktopPane.add(abrir);
        abrir.show(true);
    }//GEN-LAST:event_btnDepartamentoActionPerformed

    private void btnEstadoReclamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadoReclamoActionPerformed
        EstadoReclamos abrir = new EstadoReclamos();
        this.dispose();
        Expo.DesktopPane.add(abrir);
        abrir.show(true);
    }//GEN-LAST:event_btnEstadoReclamoActionPerformed

    private void btnTipoReclamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTipoReclamoActionPerformed
        TipoReclamos abrir = new TipoReclamos();
        this.dispose();
        Expo.DesktopPane.add(abrir);
        abrir.show(true);
    }//GEN-LAST:event_btnTipoReclamoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover btnDepartamento;
    private rojeru_san.complementos.RSButtonHover btnEstadoReclamo;
    private rojeru_san.complementos.RSButtonHover btnTipoReclamo;
    private rojeru_san.complementos.RSButtonHover btnTipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblAccion;
    // End of variables declaration//GEN-END:variables
}
