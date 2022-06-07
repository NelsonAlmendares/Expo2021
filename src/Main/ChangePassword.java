/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controlador.*;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import java.util.*;
/**
 *
 * @author elmer
 */
public class ChangePassword extends javax.swing.JInternalFrame {
     int id;
     String DeptEmpresa;
     public static int num = 0;
     MtoConsultar consulta = new MtoConsultar();
    /**
     * Creates new form DepartamentoEmpresa
     */
    Locale locale;
    public ChangePassword() {
        initComponents();
        txtContraActual.setEchoChar('●');
        txtContraNueva.setEchoChar('●');
        txtContraNuevaConfirm.setEchoChar('●');
        txtContraActual1.setEchoChar('●');
        jLabel11.setVisible(false);
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
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

    public void darkMood(){
        jPanel1.setBackground(new java.awt.Color(9, 12, 16)); //Fondo
        CustomizeMenu.customizeMenuBar(jMenuBar1);
        jPanel2.setBackground(new java.awt.Color(22, 27, 34)); //Panel de arriba
        jPanel6.setBackground(new java.awt.Color(13, 17, 23)); //Panel principal
        jPanel5.setBackground(new java.awt.Color(13, 17, 23));
        jPanel4.setBackground(new java.awt.Color(13, 17, 23));
        btnContra.setBackground(new java.awt.Color(13, 17, 23));
        btnPreguntas.setBackground(new java.awt.Color(13, 17, 23));
        
        btnContra.setColorText(Color.white);
        btnPreguntas.setColorText(Color.white);
        
        btnContra.setColorHover(new java.awt.Color(48, 54, 61));
        btnPreguntas.setColorHover(new java.awt.Color(48, 54, 61));
        
        txtAnswer1.setBackground(new java.awt.Color(40, 40, 40)); // TextBox
        txtAnswer2.setBackground(new java.awt.Color(40, 40, 40));
        txtAnswer3.setBackground(new java.awt.Color(40, 40, 40));
        txtContraActual.setBackground(new java.awt.Color(40, 40, 40));
        txtContraActual1.setBackground(new java.awt.Color(40, 40, 40));
        txtContraNueva.setBackground(new java.awt.Color(40, 40, 40));
        txtContraNuevaConfirm.setBackground(new java.awt.Color(40, 40, 40));
        
        jSeparator4.setForeground(new java.awt.Color(2,103,255));
        jSeparator4.setBackground(new java.awt.Color(2,103,255));
        jSeparator5.setForeground(new java.awt.Color(2,103,255));
        jSeparator5.setBackground(new java.awt.Color(2,103,255));
        jSeparator6.setForeground(new java.awt.Color(2,103,255));
        jSeparator6.setBackground(new java.awt.Color(2,103,255));
        jSeparator8.setForeground(new java.awt.Color(2,103,255));
        jSeparator8.setBackground(new java.awt.Color(2,103,255));
        
        jSeparator1.setForeground(new java.awt.Color(2,103,255));
        jSeparator1.setBackground(new java.awt.Color(2,103,255));
        jSeparator2.setForeground(new java.awt.Color(2,103,255));
        jSeparator2.setBackground(new java.awt.Color(2,103,255));
        jSeparator3.setForeground(new java.awt.Color(2,103,255));
        jSeparator3.setBackground(new java.awt.Color(2,103,255));
        
        jSeparator7.setForeground(new java.awt.Color(2,103,255));
        jSeparator7.setBackground(new java.awt.Color(2,103,255));
        
        jPanel3.setBackground(new java.awt.Color(2,103,255));
        jPanel7.setBackground(new java.awt.Color(2,103,255));
    } 
    
    private void Internacionalizacion(){
        ResourceBundle bundle = ResourceBundle.getBundle("Res/Bundle", locale);    
            this.setTitle(bundle.getString("ChangePassword.title"));
            btnActualizar.setText(bundle.getString("ChangePassword.btnActualizar.text"));
            btnContra.setText(bundle.getString("ChangePassword.btnContra.text"));
            btnModificar.setText(bundle.getString("ChangePassword.btnModificar.text"));
            btnPreguntas.setText(bundle.getString("ChangePassword.btnPreguntas.text"));
            jLabel11.setText(bundle.getString("ChangePassword.jLabel11.text"));
            jLabel14.setText(bundle.getString("ChangePassword.jLabel14.text"));
            jLabel16.setText(bundle.getString("ChangePassword.jLabel16.text"));
            jLabel19.setText(bundle.getString("ChangePassword.jLabel19.text"));
            jLabel21.setText(bundle.getString("ChangePassword.jLabel21.text"));
            jLabel4.setText(bundle.getString("ChangePassword.jLabel4.text"));
            jLabel8.setText(bundle.getString("ChangePassword.jLabel8.text"));
            jLabel9.setText(bundle.getString("ChangePassword.jLabel9.text"));
            jMenu2.setText(bundle.getString("ChangePassword.jMenu2.text"));
            jMenu1.setText(bundle.getString("ChangePassword.jMenu1.text"));
            jMenu3.setText(bundle.getString("ChangePassword.jMenu3.text"));
            jMenuItem1.setText(bundle.getString("ChangePassword.jMenuItem1.text"));
            jMenuItem2.setText(bundle.getString("ChangePassword.jMenuItem2.text"));
            jMenuItem3.setText(bundle.getString("ChangePassword.jMenuItem3.text"));
            lblAccion.setText(bundle.getString("ChangePassword.lblAccion.text"));
            
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btnContra = new rojeru_san.complementos.RSButtonHover();
        lblAccion = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        btnPreguntas = new rojeru_san.complementos.RSButtonHover();
        jPanel5 = new javax.swing.JPanel();
        jCmbPregunta1 = new javax.swing.JComboBox<>();
        txtAnswer1 = new javax.swing.JTextField();
        jCmbPregunta2 = new javax.swing.JComboBox<>();
        txtAnswer2 = new javax.swing.JTextField();
        jCmbPregunta3 = new javax.swing.JComboBox<>();
        txtAnswer3 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        btnActualizar = new rojeru_san.complementos.RSButtonHover();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        txtContraActual1 = new javax.swing.JPasswordField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtContraActual = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnModificar = new rojeru_san.complementos.RSButtonHover();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        txtContraNueva = new javax.swing.JPasswordField();
        txtContraNuevaConfirm = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Res/Bundle"); // NOI18N
        setTitle(bundle.getString("ChangePassword.title")); // NOI18N
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(2, 103, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(745, 40));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1280, 20));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnContra.setBackground(new java.awt.Color(255, 255, 255));
        btnContra.setForeground(new java.awt.Color(0, 0, 0));
        btnContra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_unlock_30px.png"))); // NOI18N
        btnContra.setText(bundle.getString("ChangePassword.btnContra.text")); // NOI18N
        btnContra.setColorHover(new java.awt.Color(237, 249, 250));
        btnContra.setColorText(new java.awt.Color(0, 0, 0));
        btnContra.setColorTextHover(new java.awt.Color(23, 91, 250));
        btnContra.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnContra.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnContra.setIconTextGap(10);
        btnContra.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContraActionPerformed(evt);
            }
        });
        jPanel6.add(btnContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 160, 400, 50));

        lblAccion.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblAccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAccion.setText(bundle.getString("ChangePassword.lblAccion.text")); // NOI18N
        jPanel6.add(lblAccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 70, 500, 60));

        jSeparator7.setOpaque(true);
        jPanel6.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 230, 400, -1));

        btnPreguntas.setBackground(new java.awt.Color(255, 255, 255));
        btnPreguntas.setForeground(new java.awt.Color(0, 0, 0));
        btnPreguntas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_question_mark_25px.png"))); // NOI18N
        btnPreguntas.setText(bundle.getString("ChangePassword.btnPreguntas.text")); // NOI18N
        btnPreguntas.setColorHover(new java.awt.Color(237, 249, 250));
        btnPreguntas.setColorText(new java.awt.Color(0, 0, 0));
        btnPreguntas.setColorTextHover(new java.awt.Color(23, 91, 250));
        btnPreguntas.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnPreguntas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnPreguntas.setIconTextGap(10);
        btnPreguntas.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnPreguntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreguntasActionPerformed(evt);
            }
        });
        jPanel6.add(btnPreguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 250, 400, 50));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 940, 410));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCmbPregunta1.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jCmbPregunta1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "¿Cuál era el nombre de tu primera mascota?", "¿En qué ciudad naciste?", "¿Cuál fue a la primera escuela que asististe?", "¿Cuál fue tu mejor amigo de la infancia?", "¿Nombre de algún personaje favorito?" }));
        jPanel5.add(jCmbPregunta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 410, 30));

        txtAnswer1.setBackground(new java.awt.Color(219, 225, 225));
        txtAnswer1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtAnswer1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel5.add(txtAnswer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 410, -1));

        jCmbPregunta2.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jCmbPregunta2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "¿Cuál era el nombre de tu primera mascota?", "¿En qué ciudad naciste?", "¿Cuál fue a la primera escuela que asististe?", "¿Cuál fue tu mejor amigo de la infancia?", "¿Nombre de algún personaje favorito?" }));
        jPanel5.add(jCmbPregunta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 410, 30));

        txtAnswer2.setBackground(new java.awt.Color(219, 225, 225));
        txtAnswer2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtAnswer2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel5.add(txtAnswer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 410, -1));

        jCmbPregunta3.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jCmbPregunta3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "¿Cuál era el nombre de tu primera mascota?", "¿En qué ciudad naciste?", "¿Cuál fue a la primera escuela que asististe?", "¿Cuál fue tu mejor amigo de la infancia?", "¿Nombre de algún personaje favorito?" }));
        jPanel5.add(jCmbPregunta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 410, 30));

        txtAnswer3.setBackground(new java.awt.Color(219, 225, 225));
        txtAnswer3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtAnswer3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel5.add(txtAnswer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 410, -1));

        jSeparator4.setOpaque(true);
        jPanel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 410, -1));

        jSeparator5.setOpaque(true);
        jPanel5.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 410, -1));

        jSeparator6.setOpaque(true);
        jPanel5.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 410, -1));

        btnActualizar.setBackground(new java.awt.Color(51, 51, 51));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_edit_property_27px.png"))); // NOI18N
        btnActualizar.setText(bundle.getString("ChangePassword.btnActualizar.text")); // NOI18N
        btnActualizar.setColorHover(new java.awt.Color(62, 118, 122));
        btnActualizar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnActualizar.setIconTextGap(10);
        btnActualizar.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel5.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 200, 50));

        jSeparator8.setOpaque(true);
        jPanel5.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 290, -1));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_unlock_30px.png"))); // NOI18N
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 40, 40));

        txtContraActual1.setBackground(new java.awt.Color(219, 225, 225));
        txtContraActual1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtContraActual1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel5.add(txtContraActual1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 290, -1));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(69, 167, 174));
        jLabel19.setText(bundle.getString("ChangePassword.jLabel19.text")); // NOI18N
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/EyeClosed.png"))); // NOI18N
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel20MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel20MouseReleased(evt);
            }
        });
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 120, 28, 30));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(69, 167, 174));
        jLabel21.setText(bundle.getString("ChangePassword.jLabel21.text")); // NOI18N
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 940, 410));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(69, 167, 174));
        jLabel9.setText(bundle.getString("ChangePassword.jLabel9.text")); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        txtContraActual.setBackground(new java.awt.Color(219, 225, 225));
        txtContraActual.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtContraActual.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel4.add(txtContraActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 290, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(69, 167, 174));
        jLabel4.setText(bundle.getString("ChangePassword.jLabel4.text")); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText(bundle.getString("ChangePassword.jLabel11.text")); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, -1));

        btnModificar.setBackground(new java.awt.Color(51, 51, 51));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_edit_property_27px.png"))); // NOI18N
        btnModificar.setText(bundle.getString("ChangePassword.btnModificar.text")); // NOI18N
        btnModificar.setColorHover(new java.awt.Color(62, 118, 122));
        btnModificar.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnModificar.setIconTextGap(10);
        btnModificar.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel4.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 200, 50));

        jSeparator2.setOpaque(true);
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 290, -1));

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
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 28, 40));

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
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 58, 28, 30));

        jSeparator1.setOpaque(true);
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 290, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(62, 118, 122));
        jLabel14.setText(bundle.getString("ChangePassword.jLabel14.text")); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_unlock_30px.png"))); // NOI18N
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 40, 40));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(69, 167, 174));
        jLabel16.setText(bundle.getString("ChangePassword.jLabel16.text")); // NOI18N
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        jSeparator3.setOpaque(true);
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 290, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/EyeClosed.png"))); // NOI18N
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel17MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel17MouseReleased(evt);
            }
        });
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 28, 40));

        txtContraNueva.setBackground(new java.awt.Color(219, 225, 225));
        txtContraNueva.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtContraNueva.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtContraNueva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraNuevaKeyTyped(evt);
            }
        });
        jPanel4.add(txtContraNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 290, -1));

        txtContraNuevaConfirm.setBackground(new java.awt.Color(219, 225, 225));
        txtContraNuevaConfirm.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtContraNuevaConfirm.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtContraNuevaConfirm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraNuevaConfirmKeyTyped(evt);
            }
        });
        jPanel4.add(txtContraNuevaConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 290, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_lock_30px.png"))); // NOI18N
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 140, 30, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 140, 40, 40));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_lock_30px.png"))); // NOI18N
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 230, 30, 40));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 230, 40, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 940, 410));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(bundle.getString("ChangePassword.jLabel6.text")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(bundle.getString("ChangePassword.jLabel8.text")); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 200, -1));

        jMenu1.setText(bundle.getString("ChangePassword.jMenu1.text")); // NOI18N

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_cancel_20px.png"))); // NOI18N
        jMenuItem1.setText(bundle.getString("ChangePassword.jMenuItem1.text")); // NOI18N
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText(bundle.getString("ChangePassword.jMenu2.text")); // NOI18N
        jMenuBar1.add(jMenu2);

        jMenu3.setText(bundle.getString("ChangePassword.jMenu3.text")); // NOI18N

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_whatsapp_20px_1.png"))); // NOI18N
        jMenuItem2.setText(bundle.getString("ChangePassword.jMenuItem2.text")); // NOI18N
        jMenu3.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_computer_support_20px.png"))); // NOI18N
        jMenuItem3.setText(bundle.getString("ChangePassword.jMenuItem3.text")); // NOI18N
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1346, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que quiere salir del Formulario?");
        if (JOptionPane.OK_OPTION == resp) {
            this.dispose();
        }
        else if(JOptionPane.NO_OPTION == resp){

        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    MtoRecuContra obj = new MtoRecuContra();
    MtoLogin user = new MtoLogin();
    
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        jLabel11.setVisible(false);
        if (txtContraActual.getText().isEmpty() || txtContraNueva.getText().isEmpty() || txtContraNuevaConfirm.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos y reintente.", "Campos vacíos", 1);
        }else if(!txtContraNueva.getText().equals(txtContraNuevaConfirm.getText())){
            jLabel11.setVisible(true);
        }else if(txtContraNuevaConfirm.getText().length() < 8 || txtContraNuevaConfirm.getText().length() > 16){
            JOptionPane.showMessageDialog(null, "La contraseña debe tener entre 8 y 16 caracteres", "Advertencia", 2);
        }else{
            user.setContrasena(txtContraActual.getText());
            
            if (user.accesoUsuario()) {
                obj.setUser(user.getUser());
                obj.setContra(txtContraNuevaConfirm.getText());
                if(obj.modificarUsuario()){
                    JOptionPane.showMessageDialog(this, "Contraseña cambiada correctamente.");
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(this, "Contraseña no cambiada.");
                }
            }else{
                JOptionPane.showMessageDialog(null, "La contraseña actual no coincide.", "Error", 1);
            } 
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void jLabel13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MousePressed
        txtContraNueva.setEchoChar((char)0);
        ImageIcon eye = new ImageIcon(getClass().getResource("/Sources/EyeOpened.png"));
        jLabel13.setIcon(eye);
    }//GEN-LAST:event_jLabel13MousePressed

    private void jLabel13MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseReleased
        txtContraNueva.setEchoChar('●');
        ImageIcon eye = new ImageIcon(getClass().getResource("/Sources/EyeClosed.png"));
        jLabel13.setIcon(eye);
    }//GEN-LAST:event_jLabel13MouseReleased

    private void jLabel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MousePressed
        txtContraActual.setEchoChar((char)0);
        ImageIcon eye = new ImageIcon(getClass().getResource("/Sources/EyeOpened.png"));
        jLabel12.setIcon(eye);
    }//GEN-LAST:event_jLabel12MousePressed

    private void jLabel12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseReleased
        txtContraActual.setEchoChar('●');
        ImageIcon eye = new ImageIcon(getClass().getResource("/Sources/EyeClosed.png"));
        jLabel12.setIcon(eye);
    }//GEN-LAST:event_jLabel12MouseReleased

    private void jLabel17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MousePressed
        txtContraNuevaConfirm.setEchoChar((char)0);
        ImageIcon eye = new ImageIcon(getClass().getResource("/Sources/EyeOpened.png"));
        jLabel17.setIcon(eye);
    }//GEN-LAST:event_jLabel17MousePressed

    private void jLabel17MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseReleased
        txtContraNuevaConfirm.setEchoChar('●');
        ImageIcon eye = new ImageIcon(getClass().getResource("/Sources/EyeClosed.png"));
        jLabel17.setIcon(eye);
    }//GEN-LAST:event_jLabel17MouseReleased

    private void txtContraNuevaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraNuevaKeyTyped
        if(txtContraNueva.getText().equals(txtContraNuevaConfirm.getText())){
            jLabel11.setVisible(false);
        }
    }//GEN-LAST:event_txtContraNuevaKeyTyped

    private void txtContraNuevaConfirmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraNuevaConfirmKeyTyped
        if(txtContraNueva.getText().equals(txtContraNuevaConfirm.getText())){
            jLabel11.setVisible(false);
        }
    }//GEN-LAST:event_txtContraNuevaConfirmKeyTyped

    static ResultSet res;
    MtoPrimerUso obj1 = new MtoPrimerUso();
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (txtContraActual1.getText().isEmpty() || txtAnswer1.getText().isEmpty() || txtAnswer2.getText().isEmpty() || txtAnswer3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campos vacíos");
        }else if ((String) jCmbPregunta1.getSelectedItem() != (String) jCmbPregunta2.getSelectedItem()
            && (String) jCmbPregunta1.getSelectedItem() != (String) jCmbPregunta3.getSelectedItem()
            && (String) jCmbPregunta2.getSelectedItem() != (String) jCmbPregunta3.getSelectedItem()) {
            
            user.setContrasena(txtContraActual1.getText());
            
            if (user.accesoUsuario()) {
                res = MtoConsultar.Consulta("SELECT * FROM dboPreguntasSeguridad WHERE idUsuario = (SELECT idUsuario FROM dboLogin WHERE usuario = '" + user.getUser() + "')");
                System.out.println(res);
                obj1.setUsuario(user.getUser());
                obj1.setPregunta1((String) jCmbPregunta1.getSelectedItem());
                obj1.setPregunta2((String) jCmbPregunta2.getSelectedItem());
                obj1.setPregunta3((String) jCmbPregunta3.getSelectedItem());
                obj1.setRespuesta1(String.valueOf(txtAnswer1.getText()));
                obj1.setRespuesta2(String.valueOf(txtAnswer2.getText()));
                obj1.setRespuesta3(String.valueOf(txtAnswer3.getText()));
                
                try{
                    if (res.next()) {
                        if (obj1.actualizarPreguntas()) {
                            JOptionPane.showMessageDialog(this, "Preguntas actualizadas");
                            dispose();
                        } else {
                            JOptionPane.showMessageDialog(this, "Preguntas no actualizadas. Error");
                        }
                    } else {
                        if (obj1.guardarPreguntas()) {
                            JOptionPane.showMessageDialog(this, "Preguntas guardadas");
                            dispose();
                        } else {
                            JOptionPane.showMessageDialog(this, "Preguntas no guardadas. Error");
                        }
                    }
                } catch (SQLException e) {

                }               
            }else{
                JOptionPane.showMessageDialog(null, "La contraseña actual no coincide.", "Error", 1);
            }   
        } else {
            JOptionPane.showMessageDialog(this, "No se pueden elegir las mismas preguntas", "Error", 2);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContraActionPerformed
        jPanel6.setVisible(false);
        jPanel4.setVisible(true);
    }//GEN-LAST:event_btnContraActionPerformed

    private void btnPreguntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreguntasActionPerformed
        jPanel6.setVisible(false);
        jPanel5.setVisible(true);
    }//GEN-LAST:event_btnPreguntasActionPerformed

    private void jLabel20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MousePressed
        txtContraActual1.setEchoChar((char)0);
        ImageIcon eye = new ImageIcon(getClass().getResource("/Sources/EyeOpened.png"));
        jLabel20.setIcon(eye);
    }//GEN-LAST:event_jLabel20MousePressed

    private void jLabel20MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseReleased
        txtContraActual1.setEchoChar('●');
        ImageIcon eye = new ImageIcon(getClass().getResource("/Sources/EyeClosed.png"));
        jLabel20.setIcon(eye);
    }//GEN-LAST:event_jLabel20MouseReleased

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover btnActualizar;
    private rojeru_san.complementos.RSButtonHover btnContra;
    private rojeru_san.complementos.RSButtonHover btnModificar;
    private rojeru_san.complementos.RSButtonHover btnPreguntas;
    private javax.swing.JComboBox<String> jCmbPregunta1;
    private javax.swing.JComboBox<String> jCmbPregunta2;
    private javax.swing.JComboBox<String> jCmbPregunta3;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblAccion;
    private javax.swing.JTextField txtAnswer1;
    private javax.swing.JTextField txtAnswer2;
    private javax.swing.JTextField txtAnswer3;
    private javax.swing.JPasswordField txtContraActual;
    private javax.swing.JPasswordField txtContraActual1;
    private javax.swing.JPasswordField txtContraNueva;
    private javax.swing.JPasswordField txtContraNuevaConfirm;
    // End of variables declaration//GEN-END:variables
}
