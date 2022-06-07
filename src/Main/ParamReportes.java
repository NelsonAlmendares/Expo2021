/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Conexion.ConexionJava;
import Controlador.*;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.util.*;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author elmer
 */
public class ParamReportes extends javax.swing.JInternalFrame {
     int id;
     String DeptEmpresa;
     public static int num = 0;
     MtoConsultar consulta = new MtoConsultar();
    /**
     * Creates new form DepartamentoEmpresa
     */
    Locale locale;
    public ParamReportes() {
        initComponents();
        if (Expo.Idioma.equals("English")) {
           locale = new Locale("en","US");
           Internacionalizacion();
        }
        else{
           locale = new Locale("es","ES");
           Internacionalizacion();
        }
                jLabel7.setVisible(false);
                jLabel11.setVisible(false);
                txtInicio.setVisible(false);
                txtFin.setVisible(false);
                jDC1.setVisible(false);
                jDC2.setVisible(false);
                jLabel10.setVisible(false);
                txtEdad.setVisible(false);
                jLabel12.setVisible(false);
                jLabel13.setVisible(false);
                jCBDeptoE.setVisible(false);
                jCBUrgencia.setVisible(false);
                jLabel14.setVisible(false);
                jLabel15.setVisible(false);
                txtReclamo.setVisible(false);
                txtDUI.setVisible(false);
        switchReport();
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        cargarComboBoxDeptoE();
        if (Expo.darkMode == 1) {
            darkMood();
        }
    }
    
    public void darkMood(){
        jPanel1.setBackground(new java.awt.Color(9, 12, 16)); //Fondo
        CustomizeMenu.customizeMenuBar(jMenuBar1);
        jPanel2.setBackground(new java.awt.Color(22, 27, 34)); //Panel de arriba
        jPanel4.setBackground(new java.awt.Color(13, 17, 23)); //Panel principal
        txtInicio.setBackground(new java.awt.Color(22, 27, 34)); // TextBox
        txtFin.setBackground(new java.awt.Color(22, 27, 34));
        txtDUI.setBackground(new java.awt.Color(22, 27, 34));
        txtReclamo.setBackground(new java.awt.Color(22, 27, 34));
        txtEdad.setBackground(new java.awt.Color(22, 27, 34));
        btnRegresar.setBackground(new java.awt.Color(22, 27, 34));
    } 
    
    public void fechaInicioFin(){
        jLabel7.setVisible(true);
        jLabel11.setVisible(true);
        txtInicio.setVisible(true);
        txtFin.setVisible(true);
        jDC1.setVisible(true);
        jDC2.setVisible(true);       
    }
    
    public void switchReport(){
        switch(num){
            case 1:
                fechaInicioFin();
                if (Expo.Idioma.equals("English")) {
                    text.setText("Report N° of claims by type of \nclaim");
                } else {
                    text.setText("Reporte N° reclamos por tipo de \nreclamo");
                }              
            break;
            
            case 2:                  
                fechaInicioFin();
                jCBDeptoE.setVisible(true);
                jLabel13.setVisible(true);
                if (Expo.Idioma.equals("English")) {
                    text.setText("Report No. of claims by state and department");
                } else {
                    text.setText("Reporte N° reclamos por estado y departamento");
                }   
            break;
                
            case 3:
                jLabel12.setVisible(true);
                jCBUrgencia.setVisible(true);
                jLabel15.setVisible(true);
                txtReclamo.setVisible(true);
                if (Expo.Idioma.equals("English")) {
                    text.setText("Work order");
                } else {
                    text.setText("Orden de trabajo");
                }  
            break;
            
            case 4:
                fechaInicioFin();
                if (Expo.Idioma.equals("English")) {
                    text.setText("Report N° claims ordered by month");
                } else {
                    text.setText("Reporte N° reclamos ordenados por mes");
                }             
            break;  
            
            case 5:  
                fechaInicioFin();
                if (Expo.Idioma.equals("English")) {
                    text.setText("Report N° of queries by type of query");
                } else {
                    text.setText("Reporte N° consultas por tipo consulta");
                }  
            break;
            
            case 6:
                fechaInicioFin();
                if (Expo.Idioma.equals("English")) {
                    text.setText("Report most frequent clients of claim");
                } else {
                    text.setText("Reporte clientes más frecuentes de reclamo");
                } 
            break;
            
            case 7:
                fechaInicioFin();
                jLabel14.setVisible(true);
                txtDUI.setVisible(true);
                if (Expo.Idioma.equals("English")) {
                    text.setText("Report claims from a specific client");
                } else {
                    text.setText("Reporte reclamos de un cliente específico");
                } 
            break;
                
            case 8:            
                
            break;
            
            case 9:
                jLabel10.setVisible(true);
                txtEdad.setVisible(true);
                if (Expo.Idioma.equals("English")) {
                     text.setText("Report employees over \ncertain age");
                } else {
                    text.setText("Reporte empleados mayores de \ncierta edad");
                }               
            break;
                
            case 10:
                
            break;
                
            default:
            break;
        }
    }
    
    static ResultSet res;
    public void cargarComboBoxDeptoE(){
        jCBDeptoE.removeAllItems();
        MtoEmpleados clase = new MtoEmpleados();
        res = clase.Consulta("SELECT departamentoE FROM dboDepartamentoEmpresa");
        
        try{
            while(res.next()){
                Vector v = new Vector();
                v.addElement(res.getString(1));
                jCBDeptoE.addItem(String.valueOf(v.elementAt(0)));
            }
        }catch(SQLException e){
                     
        }
    }
    
    private void Internacionalizacion(){
        ResourceBundle bundle = ResourceBundle.getBundle("Res/Bundle", locale);    
        this.setTitle(bundle.getString("ParamReportes.title"));
        jMenu1.setText(bundle.getString("ParamReportes.jMenu1.text"));
        jMenu2.setText(bundle.getString("ParamReportes.jMenu2.text"));
        jMenu3.setText(bundle.getString("ParamReportes.jMenu3.text"));
        jMenuItem1.setText(bundle.getString("ParamReportes.jMenuItem1.text"));
        jMenuItem2.setText(bundle.getString("ParamReportes.jMenuItem2.text"));
        jMenuItem3.setText(bundle.getString("ParamReportes.jMenuItem3.text"));
        jLabel7.setText(bundle.getString("ParamReportes.jLabel7.text"));
        jLabel8.setText(bundle.getString("ParamReportes.jLabel8.text"));
        btnGenerar.setText(bundle.getString("ParamReportes.btnGenerar.text"));
        btnRegresar.setText(bundle.getString("ParamReportes.btnRegresar.text"));
        jLabel10.setText(bundle.getString("ParamReportes.jLabel10.text"));
        jLabel11.setText(bundle.getString("ParamReportes.jLabel11.text"));
        jLabel12.setText(bundle.getString("ParamReportes.jLabel12.text"));
        jLabel13.setText(bundle.getString("ParamReportes.jLabel13.text"));
        jLabel14.setText(bundle.getString("ParamReportes.jLabel14.text"));
        jLabel15.setText(bundle.getString("ParamReportes.jLabel15.text"));
        text.setText(bundle.getString("ParamReportes.text.text"));
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnGenerar = new rojeru_san.complementos.RSButtonHover();
        jLabel7 = new javax.swing.JLabel();
        txtInicio = new javax.swing.JTextField();
        txtFin = new javax.swing.JTextField();
        txtDUI = new javax.swing.JFormattedTextField();
        jDC1 = new rojeru_san.componentes.RSDateChooser();
        jDC2 = new rojeru_san.componentes.RSDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jCBDeptoE = new javax.swing.JComboBox<>();
        txtReclamo = new javax.swing.JTextField();
        jCBUrgencia = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        text = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnRegresar = new rsbuttoncustom.RSButtonCustom();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Res/Bundle"); // NOI18N
        setTitle(bundle.getString("ParamReportes.title")); // NOI18N
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(2, 103, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(745, 40));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1280, 20));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGenerar.setBackground(new java.awt.Color(51, 51, 51));
        btnGenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_edit_property_27px.png"))); // NOI18N
        btnGenerar.setText(bundle.getString("ParamReportes.btnGenerar.text")); // NOI18N
        btnGenerar.setAutoscrolls(true);
        btnGenerar.setColorHover(new java.awt.Color(219, 225, 225));
        btnGenerar.setColorTextHover(new java.awt.Color(0, 0, 0));
        btnGenerar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnGenerar.setIconTextGap(15);
        btnGenerar.setMargin(new java.awt.Insets(4, 4, 4, 4));
        btnGenerar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGenerarMouseEntered(evt);
            }
        });
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        jPanel4.add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 275, 220, 50));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setText(bundle.getString("ParamReportes.jLabel7.text")); // NOI18N
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, -1, -1));

        txtInicio.setEditable(false);
        txtInicio.setBackground(new java.awt.Color(227, 227, 227));
        txtInicio.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtInicio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtInicio.setText(bundle.getString("ParamReportes.txtInicio.text")); // NOI18N
        txtInicio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel4.add(txtInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 204, 30));

        txtFin.setEditable(false);
        txtFin.setBackground(new java.awt.Color(227, 227, 227));
        txtFin.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtFin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtFin.setMargin(new java.awt.Insets(2, 4, 2, 2));
        jPanel4.add(txtFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 204, 30));

        txtDUI.setBackground(new java.awt.Color(227, 227, 227));
        txtDUI.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        try {
            txtDUI.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDUI.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel4.add(txtDUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 200, 30));

        jDC1.setColorBackground(new java.awt.Color(2, 56, 89));
        jDC1.setColorForeground(new java.awt.Color(0, 0, 0));
        jDC1.setEnabled(false);
        jDC1.setFocusable(false);
        jDC1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jDC1.setFormatoFecha(bundle.getString("ParamReportes.jDC1.formatoFecha")); // NOI18N
        jDC1.setFuente(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jDC1.setRequestFocusEnabled(false);
        jDC1.setTextMayusculas(false);
        jDC1.setVerifyInputWhenFocusTarget(false);
        jPanel4.add(jDC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, 30));

        jDC2.setColorBackground(new java.awt.Color(2, 56, 89));
        jDC2.setColorForeground(new java.awt.Color(0, 0, 0));
        jDC2.setEnabled(false);
        jDC2.setFocusable(false);
        jDC2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jDC2.setFormatoFecha(bundle.getString("ParamReportes.jDC2.formatoFecha")); // NOI18N
        jDC2.setFuente(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jDC2.setRequestFocusEnabled(false);
        jDC2.setTextMayusculas(false);
        jDC2.setVerifyInputWhenFocusTarget(false);
        jPanel4.add(jDC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, -1, 30));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setText(bundle.getString("ParamReportes.jLabel10.text")); // NOI18N
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setText(bundle.getString("ParamReportes.jLabel11.text")); // NOI18N
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        jCBDeptoE.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jCBDeptoE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contabilidad", "Finaciero", "Soporte" }));
        jPanel4.add(jCBDeptoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 200, 30));

        txtReclamo.setBackground(new java.awt.Color(227, 227, 227));
        txtReclamo.setText(bundle.getString("ParamReportes.txtReclamo.text")); // NOI18N
        txtReclamo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtReclamoKeyTyped(evt);
            }
        });
        jPanel4.add(txtReclamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 200, 30));

        jCBUrgencia.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jCBUrgencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Poco", "Moderado", "Mucho", "URGENTE!!!" }));
        jPanel4.add(jCBUrgencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 200, 30));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setText(bundle.getString("ParamReportes.jLabel12.text")); // NOI18N
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setText(bundle.getString("ParamReportes.jLabel13.text")); // NOI18N
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel14.setText(bundle.getString("ParamReportes.jLabel14.text")); // NOI18N
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, -1, -1));

        txtEdad.setBackground(new java.awt.Color(227, 227, 227));
        txtEdad.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtEdad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEdad.setText(bundle.getString("ParamReportes.txtEdad.text")); // NOI18N
        txtEdad.setMargin(new java.awt.Insets(2, 10, 2, 2));
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });
        jPanel4.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 200, 30));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel15.setText(bundle.getString("ParamReportes.jLabel15.text")); // NOI18N
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, -1));

        text.setFont(new java.awt.Font("Century Gothic", 0, 22)); // NOI18N
        text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text.setText(bundle.getString("ParamReportes.text.text")); // NOI18N
        jPanel4.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 800, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 800, 370));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(bundle.getString("ParamReportes.jLabel6.text")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(bundle.getString("ParamReportes.jLabel8.text")); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 200, -1));

        btnRegresar.setText(bundle.getString("ParamReportes.btnRegresar.text")); // NOI18N
        btnRegresar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, -1, -1));

        jMenu1.setText(bundle.getString("ParamReportes.jMenu1.text")); // NOI18N

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_cancel_20px.png"))); // NOI18N
        jMenuItem1.setText(bundle.getString("ParamReportes.jMenuItem1.text")); // NOI18N
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText(bundle.getString("ParamReportes.jMenu2.text")); // NOI18N
        jMenuBar1.add(jMenu2);

        jMenu3.setText(bundle.getString("ParamReportes.jMenu3.text")); // NOI18N

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_whatsapp_20px_1.png"))); // NOI18N
        jMenuItem2.setText(bundle.getString("ParamReportes.jMenuItem2.text")); // NOI18N
        jMenu3.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_computer_support_20px.png"))); // NOI18N
        jMenuItem3.setText(bundle.getString("ParamReportes.jMenuItem3.text")); // NOI18N
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
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

    private void report(String ruta, HashMap parametros) {
        String path = "";
        try{
            //Ruta donde esta el reporte
            path = getClass().getResource(ruta).getPath();
            //Se decodifica por algún caracter especial
            path = URLDecoder.decode(path, "UTF-8");
            //Se crea la conexion
            Connection cn = new ConexionJava().getConexion();
            //Objeto de reporte
            JasperReport reporte = JasperCompileManager.compileReport(path);                  //(JasperReport)JRLoader.loadObject(path);
            //Objeto impresión del reporte
            JasperPrint imprimir = JasperFillManager.fillReport(reporte, parametros, cn);
            //Visor para mostrar el reporte
            JasperViewer visor = new JasperViewer(imprimir, false); //false es para dispose
            visor.setTitle("Reporte");
            visor.setVisible(true);
            path = "";
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        HashMap parametros = new HashMap();
        MtoLogin log = new MtoLogin();
        String usuario = log.getUser();
        
        switch(num){
            case 1:
                if (txtInicio.getText().isEmpty() || txtFin.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Campos vacíos");
                } else {
                    parametros.put("USUARIO", usuario);
                    parametros.put("FECHA_INICIO", jDC1.getDatoFecha());
                    parametros.put("FECHA_FINAL", jDC2.getDatoFecha());
                    report("/Reportes/AtClientReport1.jrxml",parametros);
                }
            break;
            
            case 2:
                if (txtInicio.getText().isEmpty() || txtFin.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Campos vacíos");
                }else{
                    parametros.clear();
                    parametros.put("usuario", usuario);
                    parametros.put("departamento", jCBDeptoE.getSelectedItem());
                    parametros.put("fechaInicio", jDC1.getDatoFecha());
                    parametros.put("fechaFin", jDC2.getDatoFecha());
                    report("/Reportes/AtClientReport2.jrxml", parametros);
                }               

            break;
                
            case 3:
                if (txtReclamo.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Campos vacíos");
                }else{
                    parametros.put("param_user", usuario);
                    parametros.put("param_reclamo", Integer.parseInt(txtReclamo.getText()));
                    parametros.put("param_nivel", jCBUrgencia.getSelectedIndex()+1);
                    report("/Reportes/AtClientReport3.jrxml", parametros);
                }
            break;
            
            case 4:
                if (txtInicio.getText().isEmpty() || txtFin.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Campos vacíos");
                } else {
                    parametros.put("USUARIO", usuario);
                    parametros.put("FECHA_INICIO", jDC1.getDatoFecha());
                    parametros.put("FECHA_FINAL", jDC2.getDatoFecha());
                    report("/Reportes/AtClientReport4.jrxml",parametros);
                }
            break;  
            
            case 5:  
                if (txtInicio.getText().isEmpty() || txtFin.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Campos vacíos");   
                }else{
                    parametros.put("FechaInicio", jDC1.getDatoFecha());
                    parametros.put("FechaFinal", jDC2.getDatoFecha());
                    parametros.put("Usuario", usuario);
                    report("/Reportes/AtClientReport5.jrxml", parametros);
                }
            break;
            
            case 6:
                if (txtInicio.getText().isEmpty() || txtFin.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Campos vacíos");   
                }
                else{
                    parametros.put("param_user", usuario);
                    parametros.put("fecha_inicio", jDC1.getDatoFecha());
                    parametros.put("fecha_fin", jDC2.getDatoFecha());
                    report("/reportes/AtClientReport6.jrxml", parametros);
                }
            break;
            
            case 7:
                if (txtDUI.getText().trim().length() <10 || txtInicio.getText().isEmpty() || txtFin.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this,"Campos vacíos");
                }
                else{
                    parametros.put("param_user", usuario);                    
                    parametros.put("fecha_inicio", jDC1.getDatoFecha());
                    parametros.put("fecha_fin", jDC2.getDatoFecha());
                    parametros.put("dui_cliente", txtDUI.getText());
                    report("/reportes/AtClientReport7.jrxml", parametros);
                }
            break;
                
            case 8:            
                parametros.put("Usuario", usuario);
                report("/Reportes/AtClientReport8.jrxml", parametros);
            break;
            
            case 9:
                if (txtEdad.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Campos vacíos");
                }
                else{
                    parametros.put("param_user", usuario);
                    parametros.put("param_edad", Integer.parseInt(txtEdad.getText()));
                    report("/Reportes/AtClientReport9.jrxml", parametros);
                }
            break;
                
            case 10:
                parametros.put("usuario", usuario);
                report("/Reportes/AtClientReport10.jrxml", parametros);
                break;
                
            default:
            break;
        }
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
        Reportes abrir = new Reportes();
        Expo.DesktopPane.add(abrir);
        abrir.show(true);
        abrir.setSize(1302, 660);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        fecha();
    }//GEN-LAST:event_jPanel4MouseEntered

    private void txtReclamoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtReclamoKeyTyped
        Controlador.Validaciones.SoloNumerosLimite(evt, txtReclamo);
    }//GEN-LAST:event_txtReclamoKeyTyped

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        fecha();
    }//GEN-LAST:event_jPanel1MouseEntered

    private void btnGenerarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarMouseEntered
        fecha();
    }//GEN-LAST:event_btnGenerarMouseEntered

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        Controlador.Validaciones.SoloNumerosLimite(evt, txtReclamo);
    }//GEN-LAST:event_txtEdadKeyTyped
    
    public void fecha(){
        String formatoFecha = "EEE dd/MM/y";
        if (jDC1.getDatoFecha() != null) {
            Date fecha = jDC1.getDatoFecha();
            SimpleDateFormat obj = new SimpleDateFormat(formatoFecha);
            txtInicio.setText(obj.format(fecha));
        }
        if (jDC2.getDatoFecha() != null) {
            Date fecha = jDC2.getDatoFecha();
            SimpleDateFormat obj = new SimpleDateFormat(formatoFecha);
            txtFin.setText(obj.format(fecha));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover btnGenerar;
    private rsbuttoncustom.RSButtonCustom btnRegresar;
    private javax.swing.JComboBox<String> jCBDeptoE;
    private javax.swing.JComboBox<String> jCBUrgencia;
    private rojeru_san.componentes.RSDateChooser jDC1;
    private rojeru_san.componentes.RSDateChooser jDC2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel text;
    private javax.swing.JFormattedTextField txtDUI;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtFin;
    private javax.swing.JTextField txtInicio;
    private javax.swing.JTextField txtReclamo;
    // End of variables declaration//GEN-END:variables
}
