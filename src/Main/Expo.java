package Main;

import Conexion.ConexionJava;
import java.awt.*;
import java.io.IOException;
import java.sql.Connection;
import javax.swing.*;
import Controlador.*;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;


/* @author nelson */
public class Expo extends javax.swing.JFrame {

    int x,y;
    public static String tipoU = "";
    public static int idDepto = 0;
    public static String Idioma = "Español";
    public static int darkMode = 0;
    public static int openForm = 0;
    private int countAviso = 1;
    
    public Expo() {
        initComponents();
        if (Expo.Idioma.equals("English")) {
           locale = new Locale("en","US");
           Internacionalizacion();
        }
        else{
           locale = new Locale("es","ES");
           Internacionalizacion();
 
        }
        if (darkMode == 1) {
            jBtnDark.setVisible(false);
            jBtnNormal.setVisible(true);
            dark();           
        }
        else{
            jBtnNormal.setVisible(false);
        }
        setLocationRelativeTo(null);
        jPanel17.setVisible(false);
        jLabel14.setVisible(false);
        jLabel16.setVisible(false);
        btnBitacoras.setVisible(false);
        btnBitacoras1.setVisible(false);
        setIconImage(new ImageIcon(getClass().getResource("/Main/Icon.png")).getImage());
//        tipoUsuario();
        MtoLogin log = new MtoLogin();
        jLabel19.setText("Hola " + log.getUser());
        
        mto.cargarEstadisticas(jLabel42, jLabel36);
        stadistic1 = Integer.parseInt(jLabel42.getText());
        stadistic2 = Integer.parseInt(jLabel36.getText());
        
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(timerTask, 0, 3000);
    }
    void tipoUsuario(){
        if (tipoU.equals("Administrador")) {
            btnUsuarios.setVisible(false);
            btnUsuarios1.setVisible(false);
        }else if (tipoU.equals("Operador")) {
            btnBitacoras.setVisible(false);
            btnCatalogos.setVisible(false);
            btnClientes.setVisible(false);
            btnEmpleados.setVisible(false);
            btnUsuarios.setVisible(false);
            
            btnBitacoras1.setVisible(false);
            btnCatalogos1.setVisible(false);
            btnClientes1.setVisible(false);
            btnEmpleados1.setVisible(false);
            btnUsuarios1.setVisible(false);
            jLabel1.setVisible(false);
        }else if (tipoU.equals("Cliente")) {
            btnBitacoras.setVisible(false);
            btnCatalogos.setVisible(false);
            btnClientes.setVisible(false);
            btnEmpleados.setVisible(false);
            btnOperador.setVisible(false);
            btnUsuarios.setVisible(false);
            
            btnBitacoras1.setVisible(false);
            btnCatalogos1.setVisible(false);
            btnClientes1.setVisible(false);
            btnEmpleados1.setVisible(false);
            btnOperador1.setVisible(false);
            btnUsuarios1.setVisible(false);
            jLabel1.setVisible(false);
            
        }
    }
    public static int stadistic1 = 0;
    public static int stadistic2 = 0;
    
    public void estadistic(){
        if (Integer.parseInt(jLabel42.getText()) >= stadistic1) {
            Icon Imagenes = new ImageIcon(getClass().getResource("/Sources/arrowup.png"));
            jLabel46.setIcon(Imagenes);
            jLabel48.setText("Subiendo");
        }else{
            Icon Imagenes = new ImageIcon(getClass().getResource("/Sources/arrowdown.png"));
            jLabel46.setIcon(Imagenes);
            jLabel48.setText("Bajando");
        }
        if (Integer.parseInt(jLabel36.getText()) >= stadistic2) {
            Icon Imagenes = new ImageIcon(getClass().getResource("/Sources/arrowup.png"));
            jLabel49.setIcon(Imagenes);
            jLabel51.setText("Subiendo");
        }else{
            Icon Imagenes = new ImageIcon(getClass().getResource("/Sources/arrowdown.png"));
            jLabel49.setIcon(Imagenes);
            jLabel51.setText("Bajando");
        }
    }
    
    MtoProyecto mto = new MtoProyecto();
    TimerTask timerTask = new TimerTask()
     {
         public void run() 
         {
             mto.cargarEstadisticas(jLabel42, jLabel36);
             estadistic();
             mto.ConsultaAviso("SELECT * FROM dboAvisos WHERE idAviso = " + countAviso, jTitulo1, jAviso1, jFecha1, img1);
             if (countAviso == 5) {countAviso = 0;}
             countAviso+=1;
             mto.ConsultaAviso("SELECT * FROM dboAvisos WHERE idAviso = " + countAviso, jTitulo2, jAviso2, jFecha2, img2);
             if (countAviso == 5) {countAviso = 0;}
             countAviso+=1;
             mto.ConsultaAviso("SELECT * FROM dboAvisos WHERE idAviso = " + countAviso, jTitulo3, jAviso3, jFecha3, img3);
             countAviso-=1;
             if (countAviso == 0) {countAviso = 5;}
         }
     };

            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jCTextField1 = new app.bolivia.swing.JCTextField();
        btnUser = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblIdioma = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jAñadirReclamo = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jBtnNormal = new javax.swing.JLabel();
        jBtnDark = new javax.swing.JLabel();
        btnConexion = new javax.swing.JLabel();
        fecha = new rojeru_san.RSLabelFecha();
        hora = new rojeru_san.RSLabelHora();
        jPanel18 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnUsuarios = new rojeru_san.complementos.RSButtonHover();
        jLabel1 = new javax.swing.JLabel();
        btnSugerencia = new rojeru_san.complementos.RSButtonHover();
        btnConsulta = new rojeru_san.complementos.RSButtonHover();
        jLabel5 = new javax.swing.JLabel();
        btnCatalogos = new rojeru_san.complementos.RSButtonHover();
        jLabel10 = new javax.swing.JLabel();
        btnReclamos = new rojeru_san.complementos.RSButtonHover();
        btnClientes = new rojeru_san.complementos.RSButtonHover();
        btnBitacoras = new rojerusan.RSButtonHover();
        btnOperador = new rojerusan.RSButtonHover();
        btnEmpleados = new rojeru_san.complementos.RSButtonHover();
        jPanel17 = new javax.swing.JPanel();
        btnEmpleados1 = new rojeru_san.complementos.RSButtonHover();
        btnSugerencia1 = new rojeru_san.complementos.RSButtonHover();
        btnConsulta1 = new rojeru_san.complementos.RSButtonHover();
        btnClientes1 = new rojeru_san.complementos.RSButtonHover();
        btnCatalogos1 = new rojeru_san.complementos.RSButtonHover();
        btnReclamos1 = new rojeru_san.complementos.RSButtonHover();
        btnOperador1 = new rojeru_san.complementos.RSButtonHover();
        btnBitacoras1 = new rojeru_san.complementos.RSButtonHover();
        btnUsuarios1 = new rojeru_san.complementos.RSButtonHover();
        jPanel5 = new javax.swing.JPanel();
        btnMaximizar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JLabel();
        DesktopPane = new javax.swing.JDesktopPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        rSButtonHover7 = new rojeru_san.complementos.RSButtonHover();
        Anuncios = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        rSButtonHover11 = new rojeru_san.complementos.RSButtonHover();
        jLabel27 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jFecha1 = new javax.swing.JLabel();
        Alerts = new rojerusan.RSButtonHover();
        img1 = new javax.swing.JLabel();
        jAviso1 = new javax.swing.JLabel();
        jTitulo1 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jFecha3 = new javax.swing.JLabel();
        rSButtonHover2 = new rojerusan.RSButtonHover();
        jLabel59 = new javax.swing.JLabel();
        img3 = new javax.swing.JLabel();
        jAviso3 = new javax.swing.JLabel();
        jTitulo3 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jFecha2 = new javax.swing.JLabel();
        rSButtonHover1 = new rojerusan.RSButtonHover();
        jLabel54 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        jAviso2 = new javax.swing.JLabel();
        jTitulo2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Res/Bundle"); // NOI18N
        setTitle(bundle.getString("Expo.title")); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(235, 235, 235));

        jPanel2.setBackground(new java.awt.Color(2, 103, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(bundle.getString("Expo.jLabel6.text")); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_menu_25px.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        jPanel3.setBackground(new java.awt.Color(246, 247, 251));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_search_25px.png"))); // NOI18N

        jCTextField1.setEditable(false);
        jCTextField1.setBackground(new java.awt.Color(227, 227, 227));
        jCTextField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_user_clock_25px_1.png"))); // NOI18N
        btnUser.setToolTipText(bundle.getString("Expo.btnUser.toolTipText")); // NOI18N
        btnUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUserMouseClicked(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_messaging_20px_1.png"))); // NOI18N

        lblIdioma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_google_translate_25px.png"))); // NOI18N
        lblIdioma.setToolTipText(bundle.getString("Expo.lblIdioma.toolTipText")); // NOI18N
        lblIdioma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblIdioma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIdiomaMouseClicked(evt);
            }
        });

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_exit_25px.png"))); // NOI18N
        jLabel22.setText(bundle.getString("Expo.jLabel22.text")); // NOI18N
        jLabel22.setToolTipText(bundle.getString("Expo.jLabel22.toolTipText")); // NOI18N
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel22.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });

        jAñadirReclamo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jAñadirReclamo.setText(bundle.getString("Expo.jAñadirReclamo.text")); // NOI18N
        jAñadirReclamo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jAñadirReclamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jAñadirReclamoMouseClicked(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_circle_10px.png"))); // NOI18N

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_circle_10px.png"))); // NOI18N

        jPanel19.setBackground(new java.awt.Color(246, 247, 251));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBtnNormal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_sun_30px_2.png"))); // NOI18N
        jBtnNormal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnNormal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnNormalMouseClicked(evt);
            }
        });
        jPanel19.add(jBtnNormal, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 0, 30, 30));

        jBtnDark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_crescent_moon_25px_6.png"))); // NOI18N
        jBtnDark.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnDark.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnDarkMouseClicked(evt);
            }
        });
        jPanel19.add(jBtnDark, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 25, 30));

        btnConexion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_wi-fi_connected_22px.png"))); // NOI18N
        btnConexion.setToolTipText(bundle.getString("Expo.btnConexion.toolTipText")); // NOI18N
        btnConexion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConexion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConexionMouseClicked(evt);
            }
        });

        fecha.setForeground(new java.awt.Color(51, 51, 51));
        fecha.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        hora.setForeground(new java.awt.Color(51, 51, 51));
        hora.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel9)
                .addGap(15, 15, 15)
                .addComponent(jCTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jAñadirReclamo)
                .addGap(35, 35, 35)
                .addComponent(lblIdioma)
                .addGap(0, 0, 0)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(0, 0, 0)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConexion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addGap(12, 12, 12))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel9))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jCTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jAñadirReclamo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(14, 14, 14)
                                    .addComponent(lblIdioma))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addComponent(jLabel17))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addComponent(jLabel16))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(17, 17, 17)
                                    .addComponent(jLabel14)))
                            .addGap(2, 2, 2))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnConexion))))
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(btnUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3))
        );

        jPanel18.setBackground(new java.awt.Color(2, 56, 89));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_more_than_30px_1.png"))); // NOI18N
        jLabel56.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel56MouseClicked(evt);
            }
        });
        jPanel18.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 11, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setMaximumSize(new java.awt.Dimension(40, 680));
        jPanel4.setMinimumSize(new java.awt.Dimension(40, 680));
        jPanel4.setPreferredSize(new java.awt.Dimension(40, 680));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_male_user_28px.png"))); // NOI18N
        btnUsuarios.setText(bundle.getString("Expo.btnUsuarios.text")); // NOI18N
        btnUsuarios.setColorHover(new java.awt.Color(237, 249, 250));
        btnUsuarios.setColorText(new java.awt.Color(0, 0, 0));
        btnUsuarios.setColorTextHover(new java.awt.Color(23, 91, 250));
        btnUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnUsuarios.setIconTextGap(15);
        btnUsuarios.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        jPanel4.add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 200, 50));
        btnUsuarios.getAccessibleContext().setAccessibleDescription(bundle.getString("Expo.btnEmpleados.AccessibleContext.accessibleDescription")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText(bundle.getString("Expo.jLabel1.text")); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        btnSugerencia.setBackground(new java.awt.Color(255, 255, 255));
        btnSugerencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_voice_recognition_27px.png"))); // NOI18N
        btnSugerencia.setText(bundle.getString("Expo.btnSugerencia.text")); // NOI18N
        btnSugerencia.setColorHover(new java.awt.Color(237, 249, 250));
        btnSugerencia.setColorText(new java.awt.Color(0, 0, 0));
        btnSugerencia.setColorTextHover(new java.awt.Color(23, 91, 250));
        btnSugerencia.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSugerencia.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSugerencia.setIconTextGap(15);
        btnSugerencia.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnSugerencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSugerenciaActionPerformed(evt);
            }
        });
        jPanel4.add(btnSugerencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 200, 50));
        btnSugerencia.getAccessibleContext().setAccessibleDescription(bundle.getString("Expo.btnSugerencia.AccessibleContext.accessibleDescription")); // NOI18N

        btnConsulta.setBackground(new java.awt.Color(255, 255, 255));
        btnConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_search_property_27px.png"))); // NOI18N
        btnConsulta.setText(bundle.getString("Expo.btnConsulta.text")); // NOI18N
        btnConsulta.setColorHover(new java.awt.Color(237, 249, 250));
        btnConsulta.setColorText(new java.awt.Color(0, 0, 0));
        btnConsulta.setColorTextHover(new java.awt.Color(23, 91, 250));
        btnConsulta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConsulta.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnConsulta.setIconTextGap(15);
        btnConsulta.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });
        jPanel4.add(btnConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 200, 50));
        btnConsulta.getAccessibleContext().setAccessibleDescription(bundle.getString("Expo.btnConsulta.AccessibleContext.accessibleDescription")); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText(bundle.getString("Expo.jLabel5.text")); // NOI18N
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        btnCatalogos.setBackground(new java.awt.Color(255, 255, 255));
        btnCatalogos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_moleskine_27px.png"))); // NOI18N
        btnCatalogos.setText(bundle.getString("Expo.btnCatalogos.text")); // NOI18N
        btnCatalogos.setColorHover(new java.awt.Color(237, 249, 250));
        btnCatalogos.setColorText(new java.awt.Color(0, 0, 0));
        btnCatalogos.setColorTextHover(new java.awt.Color(23, 91, 250));
        btnCatalogos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCatalogos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCatalogos.setIconTextGap(15);
        btnCatalogos.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnCatalogos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatalogosActionPerformed(evt);
            }
        });
        jPanel4.add(btnCatalogos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 200, 50));
        btnCatalogos.getAccessibleContext().setAccessibleDescription(bundle.getString("Expo.btnCatalogos.AccessibleContext.accessibleDescription")); // NOI18N

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/Logo.fw.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 90));

        btnReclamos.setBackground(new java.awt.Color(255, 255, 255));
        btnReclamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_requirement_27px.png"))); // NOI18N
        btnReclamos.setText(bundle.getString("Expo.btnReclamos.text")); // NOI18N
        btnReclamos.setColorHover(new java.awt.Color(237, 249, 250));
        btnReclamos.setColorText(new java.awt.Color(0, 0, 0));
        btnReclamos.setColorTextHover(new java.awt.Color(23, 91, 250));
        btnReclamos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnReclamos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnReclamos.setIconTextGap(15);
        btnReclamos.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnReclamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReclamosActionPerformed(evt);
            }
        });
        jPanel4.add(btnReclamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 200, 50));
        btnReclamos.getAccessibleContext().setAccessibleDescription(bundle.getString("Expo.btnReclamos.AccessibleContext.accessibleDescription")); // NOI18N

        btnClientes.setBackground(new java.awt.Color(255, 255, 255));
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_reception_27px.png"))); // NOI18N
        btnClientes.setText(bundle.getString("Expo.btnClientes.text")); // NOI18N
        btnClientes.setColorHover(new java.awt.Color(237, 249, 250));
        btnClientes.setColorText(new java.awt.Color(0, 0, 0));
        btnClientes.setColorTextHover(new java.awt.Color(23, 91, 250));
        btnClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnClientes.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnClientes.setIconTextGap(15);
        btnClientes.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        jPanel4.add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, 50));
        btnClientes.getAccessibleContext().setAccessibleDescription(bundle.getString("Expo.btnClientes.AccessibleContext.accessibleDescription")); // NOI18N

        btnBitacoras.setBackground(new java.awt.Color(255, 255, 255));
        btnBitacoras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_signing_a_document_27px.png"))); // NOI18N
        btnBitacoras.setText(bundle.getString("Expo.btnBitacoras.text")); // NOI18N
        btnBitacoras.setColorHover(new java.awt.Color(237, 249, 250));
        btnBitacoras.setColorText(new java.awt.Color(0, 0, 0));
        btnBitacoras.setColorTextHover(new java.awt.Color(23, 91, 250));
        btnBitacoras.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBitacoras.setIconTextGap(15);
        btnBitacoras.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnBitacoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBitacorasActionPerformed(evt);
            }
        });
        jPanel4.add(btnBitacoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 200, 50));

        btnOperador.setBackground(new java.awt.Color(255, 255, 255));
        btnOperador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_administrative_tools_27px.png"))); // NOI18N
        btnOperador.setText(bundle.getString("Expo.btnOperador.text")); // NOI18N
        btnOperador.setColorHover(new java.awt.Color(237, 249, 250));
        btnOperador.setColorText(new java.awt.Color(0, 0, 0));
        btnOperador.setColorTextHover(new java.awt.Color(23, 91, 250));
        btnOperador.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnOperador.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnOperador.setIconTextGap(15);
        btnOperador.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnOperador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOperadorActionPerformed(evt);
            }
        });
        jPanel4.add(btnOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 200, 50));

        btnEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        btnEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_employee_27px.png"))); // NOI18N
        btnEmpleados.setText(bundle.getString("Expo.btnEmpleados.text")); // NOI18N
        btnEmpleados.setColorHover(new java.awt.Color(237, 249, 250));
        btnEmpleados.setColorText(new java.awt.Color(0, 0, 0));
        btnEmpleados.setColorTextHover(new java.awt.Color(23, 91, 250));
        btnEmpleados.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEmpleados.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnEmpleados.setIconTextGap(15);
        btnEmpleados.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });
        jPanel4.add(btnEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 200, 50));

        jPanel17.setBackground(new java.awt.Color(2, 56, 89));
        jPanel17.setForeground(new java.awt.Color(255, 255, 255));
        jPanel17.setMaximumSize(new java.awt.Dimension(40, 680));
        jPanel17.setMinimumSize(new java.awt.Dimension(40, 570));
        jPanel17.setPreferredSize(new java.awt.Dimension(40, 680));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEmpleados1.setBackground(new java.awt.Color(2, 56, 89));
        btnEmpleados1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_employee_27px.png"))); // NOI18N
        btnEmpleados1.setToolTipText(bundle.getString("Expo.btnEmpleados1.toolTipText")); // NOI18N
        btnEmpleados1.setColorHover(new java.awt.Color(237, 249, 250));
        btnEmpleados1.setColorText(new java.awt.Color(0, 0, 0));
        btnEmpleados1.setColorTextHover(new java.awt.Color(23, 91, 250));
        btnEmpleados1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnEmpleados1.setIconTextGap(15);
        btnEmpleados1.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnEmpleados1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleados1ActionPerformed(evt);
            }
        });
        jPanel17.add(btnEmpleados1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 40, 50));

        btnSugerencia1.setBackground(new java.awt.Color(2, 56, 89));
        btnSugerencia1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_voice_recognition_27px.png"))); // NOI18N
        btnSugerencia1.setToolTipText(bundle.getString("Expo.btnSugerencia1.toolTipText")); // NOI18N
        btnSugerencia1.setColorHover(new java.awt.Color(237, 249, 250));
        btnSugerencia1.setColorText(new java.awt.Color(0, 0, 0));
        btnSugerencia1.setColorTextHover(new java.awt.Color(23, 91, 250));
        btnSugerencia1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSugerencia1.setIconTextGap(15);
        btnSugerencia1.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnSugerencia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSugerencia1ActionPerformed(evt);
            }
        });
        jPanel17.add(btnSugerencia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 40, 50));

        btnConsulta1.setBackground(new java.awt.Color(2, 56, 89));
        btnConsulta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_search_property_27px.png"))); // NOI18N
        btnConsulta1.setToolTipText(bundle.getString("Expo.btnConsulta1.toolTipText")); // NOI18N
        btnConsulta1.setColorHover(new java.awt.Color(237, 249, 250));
        btnConsulta1.setColorText(new java.awt.Color(0, 0, 0));
        btnConsulta1.setColorTextHover(new java.awt.Color(23, 91, 250));
        btnConsulta1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnConsulta1.setIconTextGap(15);
        btnConsulta1.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnConsulta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulta1ActionPerformed(evt);
            }
        });
        jPanel17.add(btnConsulta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 40, 50));

        btnClientes1.setBackground(new java.awt.Color(2, 56, 89));
        btnClientes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_reception_27px.png"))); // NOI18N
        btnClientes1.setToolTipText(bundle.getString("Expo.btnClientes1.toolTipText")); // NOI18N
        btnClientes1.setColorHover(new java.awt.Color(237, 249, 250));
        btnClientes1.setColorText(new java.awt.Color(0, 0, 0));
        btnClientes1.setColorTextHover(new java.awt.Color(23, 91, 250));
        btnClientes1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnClientes1.setIconTextGap(15);
        btnClientes1.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnClientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientes1ActionPerformed(evt);
            }
        });
        jPanel17.add(btnClientes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 40, 50));

        btnCatalogos1.setBackground(new java.awt.Color(2, 56, 89));
        btnCatalogos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_moleskine_27px.png"))); // NOI18N
        btnCatalogos1.setToolTipText(bundle.getString("Expo.btnCatalogos1.toolTipText")); // NOI18N
        btnCatalogos1.setColorHover(new java.awt.Color(237, 249, 250));
        btnCatalogos1.setColorText(new java.awt.Color(0, 0, 0));
        btnCatalogos1.setColorTextHover(new java.awt.Color(23, 91, 250));
        btnCatalogos1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCatalogos1.setIconTextGap(15);
        btnCatalogos1.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnCatalogos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatalogos1ActionPerformed(evt);
            }
        });
        jPanel17.add(btnCatalogos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 40, 50));

        btnReclamos1.setBackground(new java.awt.Color(2, 56, 89));
        btnReclamos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_requirement_27px.png"))); // NOI18N
        btnReclamos1.setToolTipText(bundle.getString("Expo.btnReclamos1.toolTipText")); // NOI18N
        btnReclamos1.setColorHover(new java.awt.Color(237, 249, 250));
        btnReclamos1.setColorText(new java.awt.Color(0, 0, 0));
        btnReclamos1.setColorTextHover(new java.awt.Color(23, 91, 250));
        btnReclamos1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnReclamos1.setIconTextGap(15);
        btnReclamos1.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnReclamos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReclamos1ActionPerformed(evt);
            }
        });
        jPanel17.add(btnReclamos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 40, 50));

        btnOperador1.setBackground(new java.awt.Color(2, 56, 89));
        btnOperador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_administrative_tools_27px.png"))); // NOI18N
        btnOperador1.setToolTipText(bundle.getString("Expo.btnOperador1.toolTipText")); // NOI18N
        btnOperador1.setColorHover(new java.awt.Color(237, 249, 250));
        btnOperador1.setColorText(new java.awt.Color(0, 0, 0));
        btnOperador1.setColorTextHover(new java.awt.Color(23, 91, 250));
        btnOperador1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnOperador1.setIconTextGap(15);
        btnOperador1.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnOperador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOperador1ActionPerformed(evt);
            }
        });
        jPanel17.add(btnOperador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 40, 50));

        btnBitacoras1.setBackground(new java.awt.Color(2, 56, 89));
        btnBitacoras1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_signing_a_document_27px.png"))); // NOI18N
        btnBitacoras1.setToolTipText(bundle.getString("Expo.btnBitacoras1.toolTipText")); // NOI18N
        btnBitacoras1.setColorHover(new java.awt.Color(237, 249, 250));
        btnBitacoras1.setColorText(new java.awt.Color(0, 0, 0));
        btnBitacoras1.setColorTextHover(new java.awt.Color(23, 91, 250));
        btnBitacoras1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBitacoras1.setIconTextGap(15);
        btnBitacoras1.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnBitacoras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBitacoras1ActionPerformed(evt);
            }
        });
        jPanel17.add(btnBitacoras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 40, 50));

        btnUsuarios1.setBackground(new java.awt.Color(2, 56, 89));
        btnUsuarios1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_male_user_28px.png"))); // NOI18N
        btnUsuarios1.setToolTipText(bundle.getString("Expo.btnUsuarios1.toolTipText")); // NOI18N
        btnUsuarios1.setColorHover(new java.awt.Color(237, 249, 250));
        btnUsuarios1.setColorText(new java.awt.Color(0, 0, 0));
        btnUsuarios1.setColorTextHover(new java.awt.Color(23, 91, 250));
        btnUsuarios1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnUsuarios1.setIconTextGap(15);
        btnUsuarios1.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnUsuarios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarios1ActionPerformed(evt);
            }
        });
        jPanel17.add(btnUsuarios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 40, 50));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel5MouseDragged(evt);
            }
        });
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMaximizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_green_circle_22px.png"))); // NOI18N
        btnMaximizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMaximizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMaximizarMouseClicked(evt);
            }
        });
        jPanel5.add(btnMaximizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 5, -1, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_red_circle_22px_1.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, -1, 20));

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_yellow_circle_22px.png"))); // NOI18N
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });
        jPanel5.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 5, -1, 20));

        DesktopPane.setPreferredSize(new java.awt.Dimension(1074, 640));

        jPanel6.setBackground(new java.awt.Color(246, 247, 252));
        jPanel6.setPreferredSize(new java.awt.Dimension(1072, 640));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 0));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel32.setText(bundle.getString("Expo.jLabel32.text")); // NOI18N
        jPanel6.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 159, 190, 20));

        jLabel30.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(226, 226, 226));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText(bundle.getString("Expo.jLabel30.text")); // NOI18N
        jPanel6.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 129, 190, 30));

        jPanel8.setBackground(new java.awt.Color(0, 40, 87));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 128, 70, 50));

        jLabel31.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(226, 226, 226));
        jLabel31.setText(bundle.getString("Expo.jLabel31.text")); // NOI18N
        jPanel6.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 190, 30));

        rSButtonHover7.setBackground(new java.awt.Color(0, 51, 255));
        rSButtonHover7.setText(bundle.getString("Expo.rSButtonHover7.text")); // NOI18N
        rSButtonHover7.setToolTipText(bundle.getString("Expo.rSButtonHover7.toolTipText")); // NOI18N
        rSButtonHover7.setColorHover(new java.awt.Color(0, 18, 29));
        rSButtonHover7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        rSButtonHover7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        rSButtonHover7.setIconTextGap(10);
        rSButtonHover7.setMargin(new java.awt.Insets(4, 14, 4, 14));
        jPanel6.add(rSButtonHover7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 160, 180, 40));

        Anuncios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Anuncios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/Tigo1-02.png"))); // NOI18N
        Anuncios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Anuncios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AnunciosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AnunciosMouseExited(evt);
            }
        });
        jPanel6.add(Anuncios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 1020, 126));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_alarm_60px.png"))); // NOI18N
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 60, 50));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel19.setText("Hola usuario!");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jLabel20.setText(bundle.getString("Expo.jLabel20.text")); // NOI18N
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        rSButtonHover11.setBackground(new java.awt.Color(237, 249, 250));
        rSButtonHover11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_city_20px.png"))); // NOI18N
        rSButtonHover11.setText(bundle.getString("Expo.rSButtonHover11.text")); // NOI18N
        rSButtonHover11.setToolTipText(bundle.getString("Expo.rSButtonHover11.toolTipText")); // NOI18N
        rSButtonHover11.setColorHover(new java.awt.Color(158, 166, 166));
        rSButtonHover11.setColorText(new java.awt.Color(0, 0, 0));
        rSButtonHover11.setColorTextHover(new java.awt.Color(23, 91, 250));
        rSButtonHover11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rSButtonHover11.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        rSButtonHover11.setIconTextGap(10);
        rSButtonHover11.setMargin(new java.awt.Insets(4, 14, 4, 14));
        jPanel6.add(rSButtonHover11, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 40, 180, 40));

        jLabel27.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel27.setText(bundle.getString("Expo.jLabel27.text")); // NOI18N
        jPanel6.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 40, 80, 40));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText(bundle.getString("Expo.jLabel35.text")); // NOI18N
        jPanel7.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 230, -1));

        jLabel36.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText(bundle.getString("Expo.jLabel36.text")); // NOI18N
        jPanel7.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 230, -1));

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/arrowdown.png"))); // NOI18N
        jPanel7.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText(bundle.getString("Expo.jLabel51.text")); // NOI18N
        jPanel7.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 120, 230, -1));

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 270, 230, 170));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText(bundle.getString("Expo.jLabel34.text")); // NOI18N
        jPanel10.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 20, 230, -1));

        jLabel42.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText(bundle.getString("Expo.jLabel42.text")); // NOI18N
        jPanel10.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 50, 230, -1));

        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText(bundle.getString("Expo.jLabel48.text")); // NOI18N
        jPanel10.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 120, 230, -1));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/arrowup.png"))); // NOI18N
        jPanel10.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jPanel6.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 230, 170));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(2, 103, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_notification_25px.png"))); // NOI18N
        jPanel11.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, -1, -1));

        jLabel57.setBackground(new java.awt.Color(250, 250, 250));
        jLabel57.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel57.setText(bundle.getString("Expo.jLabel57.text")); // NOI18N
        jPanel11.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jFecha1.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jFecha1.setForeground(new java.awt.Color(255, 255, 255));
        jFecha1.setText(bundle.getString("Expo.jFecha1.text")); // NOI18N
        jPanel11.add(jFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        Alerts.setBackground(new java.awt.Color(51, 51, 51));
        Alerts.setText(bundle.getString("Expo.Alerts.text")); // NOI18N
        Alerts.setColorHover(new java.awt.Color(255, 255, 255));
        Alerts.setColorTextHover(new java.awt.Color(2, 103, 255));
        Alerts.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Alerts.setMargin(new java.awt.Insets(2, 5, 2, 5));
        jPanel11.add(Alerts, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 15, 120, 30));

        jPanel13.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 60));

        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/anuncio.png"))); // NOI18N
        jPanel13.add(img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jAviso1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jAviso1.setText(bundle.getString("Expo.jAviso1.text")); // NOI18N
        jPanel13.add(jAviso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jTitulo1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTitulo1.setText("Titulo1");
        jPanel13.add(jTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        jPanel6.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 490, 170));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(2, 103, 255));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel68.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel68.setText(bundle.getString("Expo.jLabel68.text")); // NOI18N
        jPanel15.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jFecha3.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jFecha3.setForeground(new java.awt.Color(255, 255, 255));
        jFecha3.setText("Actualizado 21/08/2018");
        jPanel15.add(jFecha3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        rSButtonHover2.setBackground(new java.awt.Color(51, 51, 51));
        rSButtonHover2.setText(bundle.getString("Expo.rSButtonHover2.text")); // NOI18N
        rSButtonHover2.setColorHover(new java.awt.Color(255, 255, 255));
        rSButtonHover2.setColorTextHover(new java.awt.Color(2, 103, 255));
        rSButtonHover2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel15.add(rSButtonHover2, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 15, 120, 30));

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_notification_25px.png"))); // NOI18N
        jPanel15.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, -1, -1));

        jPanel14.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 60));

        img3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/anuncio.png"))); // NOI18N
        jPanel14.add(img3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jAviso3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jAviso3.setText("Aviso3");
        jPanel14.add(jAviso3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jTitulo3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTitulo3.setText("Titulo3");
        jPanel14.add(jTitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        jPanel6.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 490, 170));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(2, 103, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel65.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel65.setText(bundle.getString("Expo.jLabel65.text")); // NOI18N
        jPanel12.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jFecha2.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jFecha2.setForeground(new java.awt.Color(255, 255, 255));
        jFecha2.setText("Actualizado 21/08/2018");
        jPanel12.add(jFecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        rSButtonHover1.setBackground(new java.awt.Color(51, 51, 51));
        rSButtonHover1.setText(bundle.getString("Expo.rSButtonHover1.text")); // NOI18N
        rSButtonHover1.setColorHover(new java.awt.Color(255, 255, 255));
        rSButtonHover1.setColorTextHover(new java.awt.Color(2, 103, 255));
        rSButtonHover1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel12.add(rSButtonHover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 15, 120, 30));

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_notification_25px.png"))); // NOI18N
        jPanel12.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, -1, -1));

        jPanel16.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 60));

        img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/anuncio.png"))); // NOI18N
        jPanel16.add(img2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jAviso2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jAviso2.setText("Aviso2");
        jPanel16.add(jAviso2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jTitulo2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTitulo2.setText("Titulo2");
        jPanel16.add(jTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        jPanel6.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 490, 170));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_share_25px.png"))); // NOI18N
        jLabel2.setToolTipText("Comparte nuestro programa");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, -1, 40));

        jSeparator.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jSeparator.setOpaque(true);
        jPanel6.add(jSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 1019, 1));

        DesktopPane.add(jPanel6);
        jPanel6.setBounds(0, 0, 1140, 680);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DesktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1138, Short.MAX_VALUE)
                .addGap(2, 2, 2))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(DesktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Desktop browser = Desktop.getDesktop();
        try {
            browser.browse(new URI("https://nelsonalmendares.github.io/AtClient/"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(Expo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Expo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void AnunciosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnunciosMouseExited
        //Icon Imagen = new ImageIcon(getClass().getResource("/Sources/Fondo.fw.png"));
        //Anuncios.setIcon(Imagen);
        //Anuncios.repaint();
        //jLabel30.setVisible(true);
        //jLabel31.setVisible(true);
    }//GEN-LAST:event_AnunciosMouseExited

    private void AnunciosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnunciosMouseEntered
        //Icon Imagen = new ImageIcon(getClass().getResource("/Sources/Fondo2.png"));
        //Anuncios.setIcon(Imagen);
        //Anuncios.repaint();
        //jLabel30.setVisible(false);
        //jLabel31.setVisible(false);
    }//GEN-LAST:event_AnunciosMouseEntered

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
//        x = evt.getX();
//        y = evt.getY();
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseDragged
        Point p = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(p.x-x , p.y-y);
    }//GEN-LAST:event_jPanel5MouseDragged

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btnMaximizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaximizarMouseClicked
        this.setExtendedState(Expo.MAXIMIZED_BOTH);
    }//GEN-LAST:event_btnMaximizarMouseClicked

    private void btnUsuarios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarios1ActionPerformed
        if(DesktopPane.getAllFrames().length > 0){
            DesktopPane.remove(0);
        }
        openForm = 13;
        Usuarios abrir = new Usuarios();
        DesktopPane.add(abrir);
        abrir.show(true);
        abrir.setSize(1302, 660);
    }//GEN-LAST:event_btnUsuarios1ActionPerformed

    private void btnBitacoras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBitacoras1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBitacoras1ActionPerformed

    private void btnOperador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOperador1ActionPerformed
        if(DesktopPane.getAllFrames().length > 0){
            DesktopPane.remove(0);
        }
        openForm = 6;
        SeleccionOperador abrir = new SeleccionOperador();
        DesktopPane.add(abrir);
        abrir.show(true);
        //        abrir.setSize(1302, 660);
    }//GEN-LAST:event_btnOperador1ActionPerformed

    private void btnReclamos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReclamos1ActionPerformed
        if(DesktopPane.getAllFrames().length > 0){
            DesktopPane.remove(0);
        }
        openForm = 1;
        Seleccion abrir = new Seleccion();
        DesktopPane.add(abrir);
        abrir.show(true);
        abrir.setSize(1302, 660);
    }//GEN-LAST:event_btnReclamos1ActionPerformed

    private void btnCatalogos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatalogos1ActionPerformed
        JOptionPane.showMessageDialog(null, "Acceso restringido, modificar estos datos podría dañar el funcionamiento del sistema.", "Advertencia.", 2);
//        if(DesktopPane.getAllFrames().length > 0){
//            DesktopPane.remove(0);
//        }
//
//        Catalogos abrir = new Catalogos();
//        DesktopPane.add(abrir);
//        abrir.show(true);
//        abrir.setSize(1302, 660);
    }//GEN-LAST:event_btnCatalogos1ActionPerformed

    private void btnClientes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientes1ActionPerformed
        if(DesktopPane.getAllFrames().length > 0){
            DesktopPane.remove(0);
        }
        openForm = 11;
        Clientes abrir = new Clientes();
        DesktopPane.add(abrir);
        abrir.show(true);
        abrir.setSize(1302, 660);
    }//GEN-LAST:event_btnClientes1ActionPerformed

    private void btnConsulta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulta1ActionPerformed
        if(DesktopPane.getAllFrames().length > 0){
            DesktopPane.remove(0);
        }
        openForm = 4;
        Consultas abrir = new Consultas();
        DesktopPane.add(abrir);
        abrir.show(true);
        abrir.setSize(1302, 660);
    }//GEN-LAST:event_btnConsulta1ActionPerformed

    private void btnSugerencia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSugerencia1ActionPerformed
        if(DesktopPane.getAllFrames().length > 0){
            DesktopPane.remove(0);
        }
        openForm = 5;
        Sugerencias abrir = new Sugerencias();
        DesktopPane.add(abrir);
        abrir.show(true);
        abrir.setSize(1302, 660);
    }//GEN-LAST:event_btnSugerencia1ActionPerformed

    private void btnEmpleados1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleados1ActionPerformed
        if(DesktopPane.getAllFrames().length > 0){
            DesktopPane.remove(0);
        }
        openForm = 12;
        Empleados abrir = new Empleados();
        DesktopPane.add(abrir);
        abrir.show(true);
        abrir.setSize(1302, 660);
    }//GEN-LAST:event_btnEmpleados1ActionPerformed

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        if(DesktopPane.getAllFrames().length > 0){
            DesktopPane.remove(0);
        }
        openForm = 12;
        Empleados abrir = new Empleados();
        DesktopPane.add(abrir);
        abrir.show(true);
        abrir.setSize(1302, 660);
    }//GEN-LAST:event_btnEmpleadosActionPerformed

    private void btnOperadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOperadorActionPerformed
        if(DesktopPane.getAllFrames().length > 0){
            DesktopPane.remove(0);
        }
        openForm = 6;
        SeleccionOperador abrir = new SeleccionOperador();
        DesktopPane.add(abrir);
        abrir.show(true);
        //        abrir.setSize(1302, 660);
    }//GEN-LAST:event_btnOperadorActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        if(DesktopPane.getAllFrames().length > 0){
            DesktopPane.remove(0);
        }
        openForm = 11;
        Clientes abrir = new Clientes();
        DesktopPane.add(abrir);
        abrir.show(true);
        abrir.setSize(1302, 660);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnReclamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReclamosActionPerformed
        if(DesktopPane.getAllFrames().length > 0){
            DesktopPane.remove(0);
        }
        openForm = 1;
        Seleccion abrir = new Seleccion();
        DesktopPane.add(abrir);
        abrir.show(true);
        abrir.setSize(1302, 660);
    }//GEN-LAST:event_btnReclamosActionPerformed

    private void btnCatalogosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatalogosActionPerformed
        JOptionPane.showMessageDialog(null, "Acceso restringido, modificar estos datos podría dañar el funcionamiento del sistema.", "Advertencia.", 2);

//        if(DesktopPane.getAllFrames().length > 0){
//            DesktopPane.remove(0);
//        }
//
//        Catalogos abrir = new Catalogos();
//        DesktopPane.add(abrir);
//        abrir.show(true);
//        abrir.setSize(1302, 660);
    }//GEN-LAST:event_btnCatalogosActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        if(DesktopPane.getAllFrames().length > 0){
            DesktopPane.remove(0);
        }
        openForm = 4;
        Consultas abrir = new Consultas();
        DesktopPane.add(abrir);
        abrir.show(true);
        abrir.setSize(1302, 660);
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnSugerenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSugerenciaActionPerformed
        if(DesktopPane.getAllFrames().length > 0){
            DesktopPane.remove(0);
        }
        openForm = 5;
        Sugerencias abrir = new Sugerencias();
        DesktopPane.add(abrir);
        abrir.show(true);
        abrir.setSize(1302, 660);
    }//GEN-LAST:event_btnSugerenciaActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        if(DesktopPane.getAllFrames().length > 0){
            DesktopPane.remove(0);
        }
        openForm = 13;
        Usuarios abrir = new Usuarios();
        DesktopPane.add(abrir);
        abrir.show(true);
        abrir.setSize(1302, 660);
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void jLabel56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel56MouseClicked
        jPanel2.setVisible(true);
        jPanel17.setVisible(false);
        jPanel4.setVisible(true);
        jPanel6.setSize(1130, 670);
    }//GEN-LAST:event_jLabel56MouseClicked

    private void btnConexionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConexionMouseClicked
        Connection cn;
        ConexionJava con = new ConexionJava();
        cn = con.getConexion();
        System.out.println(cn);
        try {
            if (cn!=null) {

                JOptionPane.showMessageDialog(rootPane, "La conexión con la base de datos ha sido comprobada y está en funcionamiento","Conexión Exitosa", 1);
                Icon Imagenes = new ImageIcon(getClass().getResource("/iconos/icons8_wi-fi_connected_22px.png"));
                btnConexion.setIcon(Imagenes);
                btnConexion.repaint();
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "OH no, algo falló, comunícate con el administrador :( ", "Conexión Fallida",JOptionPane.WARNING_MESSAGE);
                //ImageIcon iconobtn = new ImageIcon("icons8_wi-fi_disconnected_22px.png");

                Icon Imagenes = new ImageIcon(getClass().getResource("/iconos/icons8_wi-fi_disconnected_22px.png"));
                btnConexion.setIcon(Imagenes);
                btnConexion.repaint();
            }
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_btnConexionMouseClicked

    private void jBtnDarkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnDarkMouseClicked
        dark();
    }//GEN-LAST:event_jBtnDarkMouseClicked

    public void dark(){
        darkMode = 1;
        CustomizeMenu.UI(new java.awt.Color(0,0,10), Color.white, new java.awt.Color(30, 30, 34), new java.awt.Color(13, 17, 23), true, new java.awt.Color(13, 17, 23), Color.black);
        
        reOpenForms();
        
        jPanel1.setBackground(new java.awt.Color(9, 12, 16));
        jPanel2.setBackground(new java.awt.Color(22, 27, 34));
        jPanel3.setBackground(new java.awt.Color(22, 27, 34));
        jPanel4.setBackground(new java.awt.Color(13, 17, 23));
        jPanel5.setBackground(new java.awt.Color(9, 12, 16));
        jPanel6.setBackground(new java.awt.Color(13, 17, 23));
        jPanel19.setBackground(new  java.awt.Color(22,27,34));
        jBtnDark.setBackground(new java.awt.Color(22, 27, 34));
        jPanel10.setBackground(new java.awt.Color(33, 38, 45));
        jPanel7.setBackground(new java.awt.Color(33, 38, 45));
        jPanel13.setBackground(new java.awt.Color(48, 54, 61));
        jPanel16.setBackground(new java.awt.Color(48, 54, 61));
        jPanel14.setBackground(new java.awt.Color(48, 54, 61));
        jPanel11.setBackground(new java.awt.Color(22, 27, 34));
        jPanel12.setBackground(new java.awt.Color(22, 27, 34));
        jPanel15.setBackground(new java.awt.Color(22, 27, 34));
        jPanel17.setBackground(new java.awt.Color(13, 17, 23));
        jPanel18.setBackground(new java.awt.Color(22, 27, 34));
        //--------------------------------------------------------------------
        //Botones
        btnReclamos.setBackground(new java.awt.Color(13, 17, 23));
        btnReclamos.setColorText(Color.white);
        btnReclamos.setColorHover(new java.awt.Color(48, 54, 61));
        btnConsulta.setBackground(new java.awt.Color(13, 17, 23));
        btnConsulta.setColorText(Color.white);
        btnConsulta.setColorHover(new java.awt.Color(48, 54, 61));
        btnSugerencia.setBackground(new java.awt.Color(13, 17, 23));
        btnSugerencia.setColorText(Color.white);
        btnSugerencia.setColorHover(new java.awt.Color(48, 54, 61));
        btnCatalogos.setBackground(new java.awt.Color(13, 17, 23));
        btnCatalogos.setColorText(Color.white);
        btnCatalogos.setColorHover(new java.awt.Color(48, 54, 61));
        btnClientes.setBackground(new java.awt.Color(13, 17, 23));
        btnClientes.setColorText(Color.white);
        btnClientes.setColorHover(new java.awt.Color(48, 54, 61));
        btnEmpleados.setBackground(new java.awt.Color(13, 17, 23));
        btnEmpleados.setColorText(Color.white);
        btnEmpleados.setColorHover(new java.awt.Color(48, 54, 61));
        btnUsuarios.setBackground(new java.awt.Color(13, 17, 23));
        btnUsuarios.setColorText(Color.white);
        btnUsuarios.setColorHover(new java.awt.Color(48, 54, 61));
        btnBitacoras.setBackground(new java.awt.Color(13,17,23));
        btnBitacoras.setColorText(Color.white);
        btnBitacoras.setColorHover(new java.awt.Color(48, 54, 61));
        btnOperador.setBackground(new java.awt.Color(13,17,23));
        btnOperador.setColorText(Color.white);
        btnOperador.setColorHover(new java.awt.Color(48, 54, 61));
        
        //---------------
        btnEmpleados1.setBackground(new java.awt.Color(13, 17, 23));
        btnEmpleados1.setColorHover(new java.awt.Color(48, 54, 61));
        btnSugerencia1.setBackground(new java.awt.Color(13, 17, 23));
        btnSugerencia1.setColorHover(new java.awt.Color(48, 54, 61));
        btnConsulta1.setBackground(new java.awt.Color(13, 17, 23));
        btnConsulta1.setColorHover(new java.awt.Color(48, 54, 61));
        btnClientes1.setBackground(new java.awt.Color(13, 17, 23));
        btnClientes1.setColorHover(new java.awt.Color(48, 54, 61));
        btnCatalogos1.setBackground(new java.awt.Color(13, 17, 23));
        btnCatalogos1.setColorHover(new java.awt.Color(48, 54, 61));
        btnReclamos1.setBackground(new java.awt.Color(13, 17, 23));
        btnReclamos1.setColorHover(new java.awt.Color(48, 54, 61));
        btnBitacoras1.setBackground(new java.awt.Color(13, 17, 23));
        btnBitacoras1.setColorHover(new java.awt.Color(48, 54, 61));
        btnOperador1.setBackground(new java.awt.Color(13, 17, 23));
        btnOperador1.setColorHover(new java.awt.Color(48, 54, 61));
        btnUsuarios1.setBackground(new java.awt.Color(13, 17, 23));
        btnUsuarios1.setColorHover(new java.awt.Color(48, 54, 61));

        //--------------------------------------------------------------------
        //Labels
        jLabel5.setForeground(Color.white);
        jLabel1.setForeground(Color.white);
        jLabel19.setForeground(new java.awt.Color(227, 179, 65));
        jLabel20.setForeground(Color.white);
        jAñadirReclamo.setForeground(new java.awt.Color(166, 166, 166));
        jSeparator.setForeground(new java.awt.Color(252, 99, 0));
        jSeparator.setBackground(new java.awt.Color(252, 99, 0));
        jLabel27.setForeground(new java.awt.Color(201, 201, 201));
        jLabel34.setForeground(new java.awt.Color(201, 201, 201));
        jLabel35.setForeground(new java.awt.Color(201, 201, 201));
        jLabel42.setForeground(Color.white);
        jLabel36.setForeground(Color.white);
        jLabel48.setForeground(Color.white);
        jLabel51.setForeground(Color.white);
        jLabel57.setForeground(Color.white);
        jFecha1.setForeground(new java.awt.Color(139, 148, 158));
        jLabel65.setForeground(Color.white);
        jFecha2.setForeground(new java.awt.Color(139,148,158));
        jLabel68.setForeground(Color.white);
        jFecha3.setForeground(new java.awt.Color(139,148,158));
        jLabel54.setForeground(Color.white);
        jTitulo1.setForeground(Color.white);
        jTitulo3.setForeground(Color.white);
        jTitulo2.setForeground(Color.white);
        jAviso1.setForeground(new java.awt.Color(180,180,180));
        jAviso2.setForeground(new java.awt.Color(180,180,180));
        jAviso3.setForeground(new java.awt.Color(180,180,180));
        fecha.setForeground(new java.awt.Color(185, 185, 185));
        hora.setForeground(new java.awt.Color(185, 185, 185));
        jLabel18.setBackground(new java.awt.Color(2, 56, 89));
        //separador.setForeground(new java.awt.Color(52, 208, 88));
        //--------------------------------------------------------------------
        //Barra de busqueda
        jCTextField1.setBackground(new java.awt.Color(13, 17, 23));

        jBtnDark.setVisible(false);
        jBtnNormal.setVisible(true);
    }
    
    public void reOpenForms(){
        if(DesktopPane.getAllFrames().length > 0){
            JInternalFrame[] form = DesktopPane.getAllFrames();
            form[0].show(false);
            form[0].dispose();
            DesktopPane.repaint();
            if (openForm == 1) {
                btnReclamos.doClick();
            }else if(openForm == 2) {
                Seleccion.btnAgregarCasos.doClick();
            }else if(openForm == 3) {
                Seleccion.BtnConsultarCasos.doClick();
            }else if(openForm == 4) {
                btnConsulta.doClick();
            }else if(openForm == 5){
                btnSugerencia.doClick();
            }else if(openForm == 6){
                btnOperador.doClick();
            }else if(openForm == 7){
                SeleccionOperador.btnCasos.doClick();
            }else if(openForm == 8){
                SeleccionOperador.btnEnviarCorreo.doClick();
            }else if(openForm == 9){
                SeleccionOperador.btnReportes.doClick();
            }else if(openForm == 10){
                btnBitacoras.doClick();
            }else if(openForm == 11){
                btnClientes.doClick();
            }else if(openForm == 12){
                btnEmpleados.doClick();
            }else if(openForm == 13){
                btnUsuarios.doClick();
            }
        }
    };
    
    private void jBtnNormalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnNormalMouseClicked
        darkMode = 0;
        CustomizeMenu.UI(new java.awt.Color(169,176,190), Color.black, new java.awt.Color(214,217,223), Color.white, false, new java.awt.Color(242,242,189), new java.awt.Color(51,98,140));
        
        reOpenForms();
        
        jPanel1.setBackground(new java.awt.Color(235,235,235));
        jPanel2.setBackground(new java.awt.Color(2,103,255));
        jPanel3.setBackground(new java.awt.Color(246,247,251));
        jPanel4.setBackground(Color.white);
        jPanel5.setBackground(Color.white);
        jPanel6.setBackground(new java.awt.Color(246,247,252));
        jPanel19.setBackground(new java.awt.Color(246,247,251));
        jPanel10.setBackground(Color.white);
        jPanel7.setBackground(Color.white);
        jPanel13.setBackground(Color.white);
        jPanel14.setBackground(Color.white);
        jPanel16.setBackground(Color.white);
        jPanel11.setBackground(new java.awt.Color(2,103,255));
        jPanel12.setBackground(new java.awt.Color(2,103,255));
        jPanel15.setBackground(new java.awt.Color(2,103,255));
        jPanel17.setBackground(new java.awt.Color(2,56,89));

        //---------------------------------------------------------------------
        //Botones normales
        btnReclamos.setBackground(Color.white);
        btnReclamos.setColorText(Color.black);
        btnReclamos.setColorHover(new java.awt.Color(237,249,250));
        btnConsulta.setBackground(Color.white);
        btnConsulta.setColorText(Color.black);
        btnConsulta.setColorHover(new java.awt.Color(237,249,250));
        btnSugerencia.setBackground(Color.white);
        btnSugerencia.setColorText(Color.black);
        btnSugerencia.setColorHover(new java.awt.Color(237,249,250));
        btnCatalogos.setBackground(Color.white);
        btnCatalogos.setColorText(Color.black);
        btnCatalogos.setColorHover(new java.awt.Color(237,249,250));
        btnClientes.setBackground(Color.white);
        btnClientes.setColorText(Color.black);
        btnClientes.setColorHover(new java.awt.Color(237,249,250));
        btnEmpleados.setBackground(Color.white);
        btnEmpleados.setColorText(Color.black);
        btnEmpleados.setColorHover(new java.awt.Color(237,249,250));
        btnUsuarios.setBackground(Color.white);
        btnUsuarios.setColorText(Color.black);
        btnUsuarios.setColorHover(new java.awt.Color(237,249,250));
        btnBitacoras.setBackground(Color.white);
        btnBitacoras.setColorText(Color.black);
        btnBitacoras.setColorHover(new java.awt.Color(237,249,250));
        btnOperador.setBackground(Color.white);
        btnOperador.setColorText(Color.black);
        btnOperador.setColorHover(new java.awt.Color(237,249,250));

        btnEmpleados1.setBackground(new java.awt.Color(2,56,89));
        btnEmpleados1.setColorHover(new java.awt.Color(237,249,250));
        btnConsulta1.setBackground(new java.awt.Color(2,56,89));
        btnConsulta1.setColorHover(new java.awt.Color(237,249,250));
        btnSugerencia1.setBackground(new java.awt.Color(2,56,89));
        btnSugerencia1.setColorHover(new java.awt.Color(237,249,250));
        btnCatalogos1.setBackground(new java.awt.Color(2,56,89));
        btnCatalogos1.setColorHover(new java.awt.Color(237,249,250));
        btnClientes1.setBackground(new java.awt.Color(2,56,89));
        btnClientes1.setColorHover(new java.awt.Color(237,249,250));
        btnReclamos1.setBackground(new java.awt.Color(2,56,89));
        btnReclamos1.setColorHover(new java.awt.Color(237,249,250));
        btnBitacoras1.setBackground(new java.awt.Color(2,56,89));
        btnBitacoras1.setColorHover(new java.awt.Color(237,249,250));
        btnOperador1.setBackground(new java.awt.Color(2,56,89));
        btnOperador1.setColorHover(new java.awt.Color(237,249,250));
        btnUsuarios1.setBackground(new java.awt.Color(2,56,89));
        btnUsuarios1.setColorHover(new java.awt.Color(237,249,250));

        //--------------------------------------------------------------------
        //Labels
        jLabel5.setForeground(Color.black);
        jLabel1.setForeground(Color.black);
        jAñadirReclamo.setForeground(Color.black);
        jSeparator.setForeground(Color.black);
        jSeparator.setBackground(Color.black);
        jLabel19.setForeground(Color.black);
        jLabel20.setBackground(Color.black);
        jLabel27.setForeground(Color.black);
        jLabel34.setForeground(Color.black);
        jLabel35.setForeground(Color.black);
        jLabel42.setForeground(Color.black);
        jLabel36.setForeground(Color.black);
        jLabel48.setForeground(Color.black);
        jLabel51.setForeground(Color.black);
        jLabel57.setForeground(Color.black);
        jFecha1.setForeground(Color.white);
        jLabel65.setForeground(Color.black);
        jFecha2.setForeground(Color.white);
        jLabel68.setForeground(Color.black);
        jFecha3.setForeground(Color.white);
        jLabel54.setForeground(Color.black);
        jTitulo1.setForeground(Color.black);
        jTitulo3.setForeground(Color.black);
        jTitulo2.setForeground(Color.black);
        jAviso1.setForeground(Color.black);
        jAviso2.setForeground(Color.black);
        jAviso3.setForeground(Color.black);
        jLabel20.setForeground(Color.black);
        fecha.setForeground(Color.black);
        hora.setForeground(Color.black);
        jLabel18.setBackground(new java.awt.Color(2, 56, 89));
        jPanel18.setBackground(new java.awt.Color(2,56,89));

        //--------------------------------------------------------------------
        //Barra de busqueda
        jCTextField1.setBackground(new java.awt.Color(227,227,227));

        jBtnDark.setVisible(true);
        jBtnNormal.setVisible(false);
    }//GEN-LAST:event_jBtnNormalMouseClicked

    private void jAñadirReclamoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAñadirReclamoMouseClicked
        if(DesktopPane.getAllFrames().length > 0){
            DesktopPane.remove(0);
        }

        Reclamos abrir = new Reclamos();
        DesktopPane.add(abrir);
        abrir.show(true);
        abrir.setSize(1302, 670);
    }//GEN-LAST:event_jAñadirReclamoMouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        int resp;
        if (Expo.Idioma.equals("English")) {
           resp = JOptionPane.showConfirmDialog(null, "¿Are you sure to log out?", "Log Out", 1);
        }
        else{
           resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que quiere cerrar sesión", "Cerrar sesión", 1);
        }
        
        if (JOptionPane.OK_OPTION == resp) {
            Login log = new Login();
            this.hide();
            log.show();
        }
        else if(JOptionPane.NO_OPTION == resp){

        }
    }//GEN-LAST:event_jLabel22MouseClicked

    private void lblIdiomaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIdiomaMouseClicked
        if (Idioma.equals("Español")) {
            int resp = JOptionPane.showConfirmDialog(null, "¿Quieres cambiar el idioma a ingles? \n \n Do you want to change the language to English? ", "Change language.", 0);
            if (JOptionPane.OK_OPTION == resp) {
                Idioma="English";
                locale = new Locale("en","US");
                Internacionalizacion();
            }
        }
        else{
            int resp = JOptionPane.showConfirmDialog(null, "¿Quieres cambiar el idioma a español? \n \n Do you want to change the language to Spanish? ", "Cambio de idioma.", 0);
            if (JOptionPane.OK_OPTION == resp) {
                Idioma = "Español";
                locale = new Locale("es","ES");
                Internacionalizacion();
            }
        }
        reOpenForms();
    }//GEN-LAST:event_lblIdiomaMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        jPanel2.setVisible(false);
        jPanel17.setVisible(true);
        jPanel4.setVisible(false);
        jPanel6.setSize(1320, 670);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel5MousePressed

    private void btnBitacorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBitacorasActionPerformed
        if(DesktopPane.getAllFrames().length > 0){
            DesktopPane.remove(0);
        }
        openForm = 10;
        Bitacoras abrir = new Bitacoras();
        DesktopPane.add(abrir);
        abrir.show(true);
        abrir.setSize(1302, 670);
    }//GEN-LAST:event_btnBitacorasActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        if(DesktopPane.getAllFrames().length > 0){
            JInternalFrame[] hello = DesktopPane.getAllFrames();
            hello[0].show(false);
            hello[0].dispose();
            DesktopPane.repaint();
        }
        
    }//GEN-LAST:event_jLabel10MouseClicked

    private void btnUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMouseClicked
        if (!tipoU.equals("Cliente")) {
            if(DesktopPane.getAllFrames().length > 0){
                DesktopPane.remove(0);
            }

            ChangePassword abrir = new ChangePassword();
            DesktopPane.add(abrir);
            abrir.show(true);
            abrir.setSize(1302, 670);
        }else{
            JOptionPane.showMessageDialog(null, "No tiene acceso");
        }
    }//GEN-LAST:event_btnUserMouseClicked
                                       
    
    Locale locale;    
    private void Internacionalizacion(){
        ResourceBundle bundle = ResourceBundle.getBundle("Res/Bundle", locale);
                btnReclamos.setText(bundle.getString("Expo.btnReclamos.text"));
                jLabel6.setText(bundle.getString("Expo.jLabel6.text"));
                jLabel5.setText(bundle.getString("Expo.jLabel5.text"));
                btnConsulta.setText(bundle.getString("Expo.btnConsulta.text"));
                btnSugerencia.setText(bundle.getString("Expo.btnSugerencia.text"));
                btnBitacoras.setText(bundle.getString("Expo.btnBitacoras.text"));
                jLabel1.setText(bundle.getString("Expo.jLabel1.text"));
                jLabel20.setText(bundle.getString("Expo.jLabel20.text"));
                btnCatalogos.setText(bundle.getString("Expo.btnCatalogos.text"));
                btnClientes.setText(bundle.getString("Expo.btnClientes.text"));
                btnUsuarios.setText(bundle.getString("Expo.btnUsuarios.text"));
                Alerts.setText(bundle.getString("Expo.Alerts.text"));
                btnEmpleados.setText(bundle.getString("Expo.btnEmpleados.text"));
                btnOperador.setText(bundle.getString("Expo.btnOperador.text"));
                jAñadirReclamo.setText(bundle.getString("Expo.jAñadirReclamo.text"));
                jLabel34.setText(bundle.getString("Expo.jLabel34.text"));
                jLabel35.setText(bundle.getString("Expo.jLabel35.text"));
                rSButtonHover7.setText(bundle.getString("Expo.rSButtonHover7.text"));
                rSButtonHover2.setText(bundle.getString("Expo.rSButtonHover2.text"));
                rSButtonHover1.setText(bundle.getString("Expo.rSButtonHover1.text"));
                jLabel57.setText(bundle.getString("Expo.jLabel35.text"));
                jLabel65.setText(bundle.getString("Expo.jLabel35.text"));
                jLabel68.setText(bundle.getString("Expo.jLabel35.text"));
                jLabel30.setText(bundle.getString("Expo.jLabel30.text"));
                jLabel31.setText(bundle.getString("Expo.jLabel31.text"));
                jLabel32.setText(bundle.getString("Expo.jLabel32.text"));
    }
    
    
    /*public static Object[] anuncios(String anuncios){
        Array[] v = new Array[3];
        ConexionJava enlace = new ConexionJava();
        Connection connect = enlace.getConexion();
        Statement stm;
        ResultSet rs;
        
        try {
            stm = connect.createStatement();
            String consulta = "SELECT titulo, cuerpo, descripcion FROM dboAnuncios;";
            rs = stm.executeQuery(consulta);
            rs.next();
            
            //Asignando las variables
            String titulo = rs.getString("titulo");
            String cuerpo = rs.getString("cuerpo");
            String descripcion = rs.getString("descripcion");
            v[0] = titulo;
            v[1] = cuerpo;
            v[2] = descripcion;
            
            connect.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }   
        return (Object[]) v;
    }*/
    
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
            java.util.logging.Logger.getLogger(Expo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Expo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Expo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Expo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Expo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonHover Alerts;
    private javax.swing.JLabel Anuncios;
    public static javax.swing.JDesktopPane DesktopPane;
    private rojerusan.RSButtonHover btnBitacoras;
    private rojeru_san.complementos.RSButtonHover btnBitacoras1;
    private rojeru_san.complementos.RSButtonHover btnCatalogos;
    private rojeru_san.complementos.RSButtonHover btnCatalogos1;
    private rojeru_san.complementos.RSButtonHover btnClientes;
    private rojeru_san.complementos.RSButtonHover btnClientes1;
    private javax.swing.JLabel btnConexion;
    private rojeru_san.complementos.RSButtonHover btnConsulta;
    private rojeru_san.complementos.RSButtonHover btnConsulta1;
    public rojeru_san.complementos.RSButtonHover btnEmpleados;
    public rojeru_san.complementos.RSButtonHover btnEmpleados1;
    private javax.swing.JLabel btnMaximizar;
    private javax.swing.JLabel btnMinimizar;
    private rojerusan.RSButtonHover btnOperador;
    private rojeru_san.complementos.RSButtonHover btnOperador1;
    private rojeru_san.complementos.RSButtonHover btnReclamos;
    private rojeru_san.complementos.RSButtonHover btnReclamos1;
    private rojeru_san.complementos.RSButtonHover btnSugerencia;
    private rojeru_san.complementos.RSButtonHover btnSugerencia1;
    private javax.swing.JLabel btnUser;
    public rojeru_san.complementos.RSButtonHover btnUsuarios;
    public rojeru_san.complementos.RSButtonHover btnUsuarios1;
    private rojeru_san.RSLabelFecha fecha;
    private rojeru_san.RSLabelHora hora;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JLabel jAviso1;
    private javax.swing.JLabel jAviso2;
    private javax.swing.JLabel jAviso3;
    private javax.swing.JLabel jAñadirReclamo;
    private javax.swing.JLabel jBtnDark;
    private javax.swing.JLabel jBtnNormal;
    private app.bolivia.swing.JCTextField jCTextField1;
    private javax.swing.JLabel jFecha1;
    private javax.swing.JLabel jFecha2;
    private javax.swing.JLabel jFecha3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private static javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JLabel jTitulo1;
    private javax.swing.JLabel jTitulo2;
    private javax.swing.JLabel jTitulo3;
    private javax.swing.JLabel lblIdioma;
    private rojerusan.RSButtonHover rSButtonHover1;
    private rojeru_san.complementos.RSButtonHover rSButtonHover11;
    private rojerusan.RSButtonHover rSButtonHover2;
    private rojeru_san.complementos.RSButtonHover rSButtonHover7;
    // End of variables declaration//GEN-END:variables

    /**
     * @param Desktop the Desktop to set
     */
    public void setDesktop(javax.swing.JDesktopPane Desktop) {
        this.DesktopPane = Desktop;
    }
}
