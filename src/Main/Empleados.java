/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controlador.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Mery Chavez Pacifico
 */
public class Empleados extends javax.swing.JInternalFrame {
    String idEmpleado;
    int id;
    Locale locale;
    MtoConsultar consulta = new MtoConsultar();
    
    public Empleados() {
        initComponents();
        if (Expo.Idioma.equals("English")) {
           locale = new Locale("en","US");
           Internacionalizacion();
        }
        else{
           locale = new Locale("es","ES");
           Internacionalizacion();

        }
        cargarDatos();
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        ((DefaultTableCellRenderer)jTEmpleados.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        if (Expo.darkMode == 1) {
            darkMood();
        }
    }
    public void darkMood(){
        jPanel4.setBackground(new java.awt.Color(9, 12, 16)); //Fondo
        CustomizeMenu.customizeMenuBar(jMenuBar1);
        jPanel1.setBackground(new java.awt.Color(22, 27, 34)); //Panel de arriba
        jPanel3.setBackground(new java.awt.Color(13, 17, 23)); //Panel principal
        jPanel2.setBackground(new java.awt.Color(22, 27, 34));
        txtBusqueda.setBackground(new java.awt.Color(13, 17, 23));
        txtNombre.setBackground(new java.awt.Color(22, 27, 34));
        txtDUI.setBackground(new java.awt.Color(22, 27, 34));
        txtNIT.setBackground(new java.awt.Color(22, 27, 34));
        txtDate.setBackground(new java.awt.Color(22, 27, 34));
        jTEmpleados.setGridColor(new java.awt.Color(2,103,255));
    } 
    private void Internacionalizacion(){
        ResourceBundle bundle = ResourceBundle.getBundle("Res/Bundle", locale);
        this.setTitle(bundle.getString("Empleados.title"));
        jMenu3.setText(bundle.getString("Empleados.jMenu3.text"));
        jMenuItem3.setText(bundle.getString("Empleados.jMenuItem3.text"));
        jMenuItem1.setText(bundle.getString("Empleados.jMenuItem1.text"));
        jMenu1.setText(bundle.getString("Empleados.jMenu1.text"));
        jMenuItem2.setText(bundle.getString("Empleados.jMenuItem2.text"));
        jLabel11.setText(bundle.getString("Empleados.jLabel11.text"));
        jLabel4.setText(bundle.getString("Empleados.jLabel4.text"));
        jLabel7.setText(bundle.getString("Empleados.jLabel7.text"));
        jLabel6.setText(bundle.getString("Empleados.jLabel6.text"));
        jLabel5.setText(bundle.getString("Empleados.jLabel5.text"));
        jLabel8.setText(bundle.getString("Empleados.jLabel8.text"));
        jLabel9.setText(bundle.getString("Empleados.jLabel9.text"));
        jLabel10.setText(bundle.getString("Empleados.jLabel10.text"));
        btnAgregar.setText(bundle.getString("Empleados.btnAgregar.text"));
        btnRefrescar.setText(bundle.getString("Empleados.btnRefrescar.text"));
        btnModificar.setText(bundle.getString("Empleados.btnModificar.text"));
        btnInhabilitar.setText(bundle.getString("Empleados.btnInhabilitar.text"));
    }
    
    static ResultSet res;
    private void cargarDatos(){
        consulta.ConsultaTabla("SELECT de.idEmpleado, de.nombreEmpleado, dd.departamento, de.DUI, de.NIT, de.fechaNacimiento, dde.departamentoE from dboEmpleado de, dboDepartamento dd, dboDepartamentoEmpresa dde WHERE de.idDepartamento = dd.idDepartamento AND de.idDeptoEmpresa = dde.idDeptoEmpresa;", jTEmpleados);
        cargarComboBoxDeptoE();
        cargarComboBoxDepartamento();
        jTEmpleados.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        jTEmpleados.getColumnModel().getColumn(0).setMaxWidth(0);
    }

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
    public String datosComboDepartamentoE(){
        res = Controlador.MtoEmpleados.Consulta("SELECT idDeptoEmpresa, departamentoE FROM dboDepartamentoEmpresa");
        String str = "";
        try{
            while(res.next()){
                Vector v = new Vector();
                v.addElement(res.getInt(1));
                v.addElement(res.getString(2));
                if(String.valueOf(jCBDeptoE.getSelectedItem()).equals(String.valueOf(v.elementAt(1)))){
                    str = String.valueOf(v.elementAt(0));
                }
            }
        }catch(SQLException e){
                     
                    }

        return str;
    }
    
    public void cargarComboBoxDepartamento(){
            jCBDepartamento.removeAllItems();
            res = Controlador.MtoConsultar.Consulta("SELECT * FROM dboDepartamento");

            try{
                while(res.next()){
                    Vector v = new Vector();
                    v.addElement(res.getString(2));
                    jCBDepartamento.addItem(String.valueOf(v.elementAt(0)));
                }
            }catch(SQLException e){

                        }
        }
    public String datosComboDepartamento(){
        res = Controlador.MtoConsultar.Consulta("SELECT * FROM dboDepartamento");
        String str = "";
        try{
            while(res.next()){
                Vector v = new Vector();
                v.addElement(res.getInt(1));
                v.addElement(res.getString(2));
                if(String.valueOf(jCBDepartamento.getSelectedItem()).equals(String.valueOf(v.elementAt(1)))){
                    str = String.valueOf(v.elementAt(0));
                }
            }
        }catch(SQLException e){
                     
                    }
        return str;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbFiltro = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtBusqueda = new app.bolivia.swing.JCTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnAgregar = new rojeru_san.complementos.RSButtonHover();
        btnRefrescar = new rojeru_san.complementos.RSButtonHover();
        btnModificar = new rojeru_san.complementos.RSButtonHover();
        btnInhabilitar = new rojeru_san.complementos.RSButtonHover();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jCBDeptoE = new javax.swing.JComboBox<>();
        jCBDepartamento = new javax.swing.JComboBox<>();
        txtDUI = new javax.swing.JFormattedTextField();
        txtNIT = new javax.swing.JFormattedTextField();
        txtDate = new javax.swing.JTextField();
        JDateChooser = new rojeru_san.componentes.RSDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTEmpleados = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Res/Bundle"); // NOI18N
        setTitle(bundle.getString("Empleados.title")); // NOI18N

        jPanel4.setBackground(new java.awt.Color(220, 220, 220));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_search_25px.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, -1, -1));

        cmbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DUI", "NIT", "Nombre", "Departamento", "Depto. Empresa" }));
        jPanel1.add(cmbFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 140, 30));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setText(bundle.getString("Empleados.jLabel11.text")); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, 30));

        txtBusqueda.setBackground(new java.awt.Color(227, 227, 227));
        txtBusqueda.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyReleased(evt);
            }
        });
        jPanel1.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 360, 30));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1100, 50));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/Administrar Empleados.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setIconTextGap(0);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 138, 140));

        btnAgregar.setBackground(new java.awt.Color(51, 51, 51));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_add_database_25px.png"))); // NOI18N
        btnAgregar.setText(bundle.getString("Empleados.btnAgregar.text")); // NOI18N
        btnAgregar.setColorHover(new java.awt.Color(181, 238, 205));
        btnAgregar.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnAgregar.setIconTextGap(15);
        btnAgregar.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 180, 40));

        btnRefrescar.setBackground(new java.awt.Color(51, 51, 51));
        btnRefrescar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_refresh_25px_1.png"))); // NOI18N
        btnRefrescar.setText(bundle.getString("Empleados.btnRefrescar.text")); // NOI18N
        btnRefrescar.setColorHover(new java.awt.Color(219, 225, 225));
        btnRefrescar.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnRefrescar.setIconTextGap(15);
        btnRefrescar.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrescarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRefrescar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 180, -1));

        btnModificar.setBackground(new java.awt.Color(51, 51, 51));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_edit_property_27px.png"))); // NOI18N
        btnModificar.setText(bundle.getString("Empleados.btnModificar.text")); // NOI18N
        btnModificar.setColorHover(new java.awt.Color(102, 153, 255));
        btnModificar.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnModificar.setEnabled(false);
        btnModificar.setIconTextGap(15);
        btnModificar.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 180, -1));

        btnInhabilitar.setBackground(new java.awt.Color(51, 51, 51));
        btnInhabilitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_delete_database_25px_1.png"))); // NOI18N
        btnInhabilitar.setText(bundle.getString("Empleados.btnInhabilitar.text")); // NOI18N
        btnInhabilitar.setColorHover(new java.awt.Color(255, 102, 102));
        btnInhabilitar.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnInhabilitar.setEnabled(false);
        btnInhabilitar.setIconTextGap(15);
        btnInhabilitar.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnInhabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInhabilitarActionPerformed(evt);
            }
        });
        jPanel2.add(btnInhabilitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 180, -1));

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 200, 500));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setText(bundle.getString("Empleados.jLabel3.text")); // NOI18N
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel4.setText(bundle.getString("Empleados.jLabel4.text")); // NOI18N
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText(bundle.getString("Empleados.jLabel5.text")); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, -1, -1));

        txtNombre.setBackground(new java.awt.Color(227, 227, 227));
        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 280, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setText(bundle.getString("Empleados.jLabel7.text")); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText(bundle.getString("Empleados.jLabel6.text")); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setText(bundle.getString("Empleados.jLabel8.text")); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setText(bundle.getString("Empleados.jLabel9.text")); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setText(bundle.getString("Empleados.jLabel10.text")); // NOI18N
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, -1, -1));

        jCBDeptoE.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jCBDeptoE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contabilidad", "Finaciero", "Soporte" }));
        jPanel3.add(jCBDeptoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 200, 30));

        jCBDepartamento.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jCBDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "San Salvador", "Santa Ana", "Ahuachapán", "Sonsonate", "La Libertad", "Chalatenango", "Cuscatlán", "La Paz", "San Vicente", "Cabañas", "Usulután", "San Miguel", "Morazán", "La Unión" }));
        jPanel3.add(jCBDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 200, 30));

        txtDUI.setBackground(new java.awt.Color(227, 227, 227));
        txtDUI.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        try {
            txtDUI.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDUI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDUI.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel3.add(txtDUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, 150, 30));

        txtNIT.setBackground(new java.awt.Color(227, 227, 227));
        txtNIT.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        try {
            txtNIT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-######-###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtNIT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNIT.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel3.add(txtNIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 160, 30));

        txtDate.setEditable(false);
        txtDate.setBackground(new java.awt.Color(227, 227, 227));
        txtDate.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDate.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtDate.setMargin(new java.awt.Insets(2, 4, 2, 2));
        jPanel3.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 204, 30));

        JDateChooser.setColorBackground(new java.awt.Color(2, 56, 89));
        JDateChooser.setColorForeground(new java.awt.Color(0, 0, 0));
        JDateChooser.setEnabled(false);
        JDateChooser.setFocusable(false);
        JDateChooser.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JDateChooser.setFuente(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JDateChooser.setRequestFocusEnabled(false);
        JDateChooser.setTextMayusculas(false);
        JDateChooser.setVerifyInputWhenFocusTarget(false);
        jPanel3.add(JDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, 30));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 890, 190));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseEntered(evt);
            }
        });

        jTEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre Completo", "Departamento", "DUI", "NIT", "FechaNacimiento", "Departamento Empresa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTEmpleados.getTableHeader().setReorderingAllowed(false);
        jTEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JtEmpleado(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTEmpleadosMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jTEmpleados);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 890, 300));

        jMenu1.setText(bundle.getString("Empleados.jMenu1.text")); // NOI18N

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_cancel_20px.png"))); // NOI18N
        jMenuItem1.setText(bundle.getString("Empleados.jMenuItem1.text")); // NOI18N
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText(bundle.getString("Empleados.jMenu2.text")); // NOI18N
        jMenuBar1.add(jMenu2);

        jMenu3.setText(bundle.getString("Empleados.jMenu3.text")); // NOI18N

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_whatsapp_20px_1.png"))); // NOI18N
        jMenuItem2.setText(bundle.getString("Empleados.jMenuItem2.text")); // NOI18N
        jMenu3.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_computer_support_20px.png"))); // NOI18N
        jMenuItem3.setText(bundle.getString("Empleados.jMenuItem3.text")); // NOI18N
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1120, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que quiere salir del formulario?");
        if (JOptionPane.OK_OPTION == resp) {
            this.dispose();
        }
        else if(JOptionPane.NO_OPTION == resp){

        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    
    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (txtNombre.getText().isEmpty() || txtDUI.getText().isEmpty() || txtNIT.getText().isEmpty() || txtDate.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos.", "Campos vacíos.", 1);
        }else{
            MtoEmpleados obj = new MtoEmpleados();
            obj.setNombre(txtNombre.getText());
            obj.setDepartamento(Integer.parseInt(datosComboDepartamento()));
            obj.setDui(txtDUI.getText());
            obj.setNit(txtNIT.getText());
            obj.setFechaN(txtDate.getText());
            obj.setDeptoE(Integer.parseInt(datosComboDepartamentoE()));
            
            if (obj.agregarEmpleado()) {
                JOptionPane.showMessageDialog(this, "Datos guardados exitosamente");
            }
            else{
                JOptionPane.showMessageDialog(this, "Error al subir los datos");
            }
        }
        cargarDatos();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (txtNombre.getText().isEmpty() || txtDUI.getText().isEmpty() || txtNIT.getText().isEmpty() || txtDate.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos.", "Campos vacíos.", 1);
        }else{
            MtoEmpleados obj = new MtoEmpleados();
            obj.setNombre(txtNombre.getText());
            obj.setDepartamento(Integer.parseInt(datosComboDepartamento()));
            obj.setDui(txtDUI.getText());
            obj.setNit(txtNIT.getText());
            obj.setFechaN(txtDate.getText());
            obj.setDeptoE(Integer.parseInt(datosComboDepartamentoE()));
            obj.setIdEmpleado(Integer.parseInt(jTEmpleados.getValueAt(jTEmpleados.getSelectedRow(), 0).toString()));

            
            if (obj.modificarEmpleado()) {
                JOptionPane.showMessageDialog(this, "Datos modificados");
                limpiarDatos();
                btnModificar.setEnabled(false);
            btnAgregar.setEnabled(true);
            }
            else{
                JOptionPane.showMessageDialog(this, "Error al modificar");
            }      
        }    
        cargarDatos();      
    }//GEN-LAST:event_btnModificarActionPerformed

    private void limpiarDatos(){
        txtNombre.setText(null);
        txtDUI.setText(null);
        txtNIT.setText(null);
        txtDate.setText(null);
        JDateChooser.setDatoFecha(null);
    }
    
    private void btnInhabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInhabilitarActionPerformed
//         MtoEmpleados obj = new MtoEmpleados();
//            obj.setIdEmpleado(Integer.parseInt(JTableEmpleados.getValueAt(JTableEmpleados.getSelectedRow(), 0).toString()));       
//            obj.setNombre(txtNombre.getText());
//
//            obj.setEstadoU(2);
//            obj.setDeptoE(Integer.parseInt(datosComboDepartamento()));
//
//            
//            if (obj.modificarEmpleado()) {
//                JOptionPane.showMessageDialog(this, "Datos modificados");
//
//            }
//            else{
//                JOptionPane.showMessageDialog(this, "Error al modificar");
//            }
//
//         
//        cargarDatos();
    }//GEN-LAST:event_btnInhabilitarActionPerformed

    private void btnRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescarActionPerformed
        cargarDatos();
        limpiarDatos();
        btnModificar.setEnabled(false);
        btnAgregar.setEnabled(true);
    }//GEN-LAST:event_btnRefrescarActionPerformed

    private void JtEmpleado(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtEmpleado
        if (jTEmpleados.getSelectedRowCount()>0) {
            JDateChooser.setDatoFecha(null);
            txtNombre.setText(jTEmpleados.getValueAt(jTEmpleados.getSelectedRow(), 1).toString());
            String value = jTEmpleados.getValueAt(jTEmpleados.getSelectedRow(), 2).toString();
            jCBDepartamento.setSelectedItem(value);
            txtDUI.setText(jTEmpleados.getValueAt(jTEmpleados.getSelectedRow(), 3).toString());
            txtNIT.setText(jTEmpleados.getValueAt(jTEmpleados.getSelectedRow(), 4).toString());
            txtDate.setText(jTEmpleados.getValueAt(jTEmpleados.getSelectedRow(), 5).toString());
            value = jTEmpleados.getValueAt(jTEmpleados.getSelectedRow(), 6).toString();
            jCBDeptoE.setSelectedItem(value);

            btnAgregar.setEnabled(false);
            btnModificar.setEnabled(true);
        //    btnInhabilitar.setEnabled(true);
        }
    }//GEN-LAST:event_JtEmpleado

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
        MtoEmpleados obj = new MtoEmpleados();
        obj.Buscar(txtBusqueda.getText(), String.valueOf(cmbFiltro.getSelectedItem()), jTEmpleados);
        jTEmpleados.getColumnModel().getColumn(0).setMaxWidth(0);
        jTEmpleados.getColumnModel().getColumn(0).setMinWidth(0);
        jTEmpleados.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        jTEmpleados.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        jTEmpleados.getColumnModel().getColumn(0).setResizable(false);
    }//GEN-LAST:event_txtBusquedaKeyReleased

    private void jTEmpleadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTEmpleadosMouseEntered
        if (JDateChooser.getDatoFecha() != null) {
            String formatoFecha = "yyyy-MM-dd";
            Date fecha = JDateChooser.getDatoFecha();
            SimpleDateFormat obj = new SimpleDateFormat(formatoFecha);

            txtDate.setText(obj.format(fecha));
        }
    }//GEN-LAST:event_jTEmpleadosMouseEntered

    private void jScrollPane1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseEntered
        if (JDateChooser.getDatoFecha() != null) {
            String formatoFecha = "yyyy-MM-dd";
            Date fecha = JDateChooser.getDatoFecha();
            SimpleDateFormat obj = new SimpleDateFormat(formatoFecha);

            txtDate.setText(obj.format(fecha));
        }
    }//GEN-LAST:event_jScrollPane1MouseEntered

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        Controlador.Validaciones.SoloLetras(evt);
    }//GEN-LAST:event_txtNombreKeyTyped

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.componentes.RSDateChooser JDateChooser;
    private rojeru_san.complementos.RSButtonHover btnAgregar;
    private rojeru_san.complementos.RSButtonHover btnInhabilitar;
    private rojeru_san.complementos.RSButtonHover btnModificar;
    private rojeru_san.complementos.RSButtonHover btnRefrescar;
    private javax.swing.JComboBox<String> cmbFiltro;
    private javax.swing.JComboBox<String> jCBDepartamento;
    private javax.swing.JComboBox<String> jCBDeptoE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTEmpleados;
    private app.bolivia.swing.JCTextField txtBusqueda;
    private javax.swing.JFormattedTextField txtDUI;
    private javax.swing.JTextField txtDate;
    private javax.swing.JFormattedTextField txtNIT;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
