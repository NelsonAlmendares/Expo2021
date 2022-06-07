package Main;

import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/** @author elmer */

public class Seleccion extends javax.swing.JInternalFrame {

    Locale locale;
    public Seleccion() {
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
        jSeparator1.setBackground(new java.awt.Color(2,103,255));
    }
    
    private void Internacionalizacion(){
        ResourceBundle bundle = ResourceBundle.getBundle("Res/Bundle", locale);
        this.setTitle(bundle.getString("Seleccion.title"));
        BtnConsultarCasos.setText(bundle.getString("Seleccion.BtnConsultarCasos.text"));
        btnAgregarCasos.setText(bundle.getString("Seleccion.btnAgregarCasos.text"));
        lblAccion.setText(bundle.getString("Seleccion.lblAccion.text"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblAccion = new javax.swing.JLabel();
        BtnConsultarCasos = new rojeru_san.complementos.RSButtonHover();
        btnAgregarCasos = new rojeru_san.complementos.RSButtonHover();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Res/Bundle"); // NOI18N
        setTitle(bundle.getString("Seleccion.title")); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAccion.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblAccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAccion.setText(bundle.getString("Seleccion.lblAccion.text")); // NOI18N
        lblAccion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblAccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 530, 50));

        BtnConsultarCasos.setBackground(new java.awt.Color(102, 153, 255));
        BtnConsultarCasos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_sort_by_modified_date_20px.png"))); // NOI18N
        BtnConsultarCasos.setText(bundle.getString("Seleccion.BtnConsultarCasos.text")); // NOI18N
        BtnConsultarCasos.setAutoscrolls(true);
        BtnConsultarCasos.setColorHover(new java.awt.Color(51, 102, 255));
        BtnConsultarCasos.setColorText(new java.awt.Color(235, 235, 235));
        BtnConsultarCasos.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        BtnConsultarCasos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BtnConsultarCasos.setIconTextGap(15);
        BtnConsultarCasos.setMargin(new java.awt.Insets(4, 14, 4, 14));
        BtnConsultarCasos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsultarCasosActionPerformed(evt);
            }
        });
        jPanel1.add(BtnConsultarCasos, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 210, 50));

        btnAgregarCasos.setBackground(new java.awt.Color(102, 153, 255));
        btnAgregarCasos.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarCasos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_add_database_25px.png"))); // NOI18N
        btnAgregarCasos.setText(bundle.getString("Seleccion.btnAgregarCasos.text")); // NOI18N
        btnAgregarCasos.setColorHover(new java.awt.Color(51, 102, 255));
        btnAgregarCasos.setColorText(new java.awt.Color(235, 235, 235));
        btnAgregarCasos.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnAgregarCasos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAgregarCasos.setIconTextGap(15);
        btnAgregarCasos.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnAgregarCasos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCasosActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarCasos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 213, 50));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setOpaque(true);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, -1, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/FondoSeleccion.fw.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnConsultarCasosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultarCasosActionPerformed
        ConsultarReclamo abrir = new ConsultarReclamo();
        this.dispose();
        Expo.DesktopPane.add(abrir);
        abrir.show(true);
        abrir.setSize(1302, 660);
        Expo.openForm = 3;
    }//GEN-LAST:event_BtnConsultarCasosActionPerformed

    private void btnAgregarCasosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCasosActionPerformed
        Reclamos abrir = new Reclamos();
        this.dispose();
        Expo.DesktopPane.add(abrir);
        abrir.show(true);
        abrir.setSize(1302, 660);
        Expo.openForm = 2;
    }//GEN-LAST:event_btnAgregarCasosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static rojeru_san.complementos.RSButtonHover BtnConsultarCasos;
    public static rojeru_san.complementos.RSButtonHover btnAgregarCasos;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAccion;
    // End of variables declaration//GEN-END:variables
}
