/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Conexion.ConexionJava;
import Controlador.MtoConsultar;
import Controlador.MtoUsuarios;
import java.awt.Toolkit;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Mery Chavez Pacifico
 */
public class Usuarios extends javax.swing.JInternalFrame {
    int id, empleado;
    Locale locale;
    MtoConsultar consulta = new MtoConsultar();
    
    public Usuarios() {
        initComponents();
        panelEmpleados.setVisible(false);
        cargarDatos();
        if (Expo.Idioma.equals("English")) {
           locale = new Locale("en","US");
           Internacionalizacion();
        }
        else{
           locale = new Locale("es","ES");
           Internacionalizacion();

        }
        txtId.setVisible(false);
        txtIdEmpleado.setVisible(false);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        ((DefaultTableCellRenderer)jTUsuarios.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        if (Expo.darkMode == 1) {
            darkMood();
        }
    }
    
    public void darkMood(){
        jPanel4.setBackground(new java.awt.Color(9, 12, 16)); //Fondo
        CustomizeMenu.customizeMenuBar(jMenuBar1);
        jPanel1.setBackground(new java.awt.Color(22, 27, 34)); //Panel de arriba
        jPanel3.setBackground(new java.awt.Color(13, 17, 23)); //Panel principal
        panelEmpleados.setBackground(new java.awt.Color(13, 17, 23));
        jPanel2.setBackground(new java.awt.Color(22, 27, 34));
        txtBusqueda.setBackground(new java.awt.Color(13, 17, 23));
        txtUsuario.setBackground(new java.awt.Color(22, 27, 34)); // TextBox
        txtContra.setBackground(new java.awt.Color(22, 27, 34));
        txtCodigo.setBackground(new java.awt.Color(22, 27, 34));
        txtEmpleado.setBackground(new java.awt.Color(60, 60, 60));
        jTUsuarios.setGridColor(new java.awt.Color(2,103,255));
        jTEmpleados.setGridColor(new java.awt.Color(2,103,255));
    } 
   
    private void Internacionalizacion(){
        ResourceBundle bundle = ResourceBundle.getBundle("Res/Bundle", locale);
        this.setTitle(bundle.getString("Usuarios.title"));
        jMenu3.setText(bundle.getString("Usuarios.jMenu3.text"));
        jMenuItem3.setText(bundle.getString("Usuarios.jMenuItem3.text"));
        jMenuItem1.setText(bundle.getString("Usuarios.jMenuItem1.text"));
        jMenu1.setText(bundle.getString("Usuarios.jMenu1.text"));
        jMenuItem2.setText(bundle.getString("Usuarios.jMenuItem2.text"));
        jLabel11.setText(bundle.getString("Usuarios.jLabel11.text"));
        jLabel12.setText(bundle.getString("Usuarios.jLabel12.text"));
        btnSeleccionarEmpleado.setText(bundle.getString("Usuarios.btnSeleccionarEmpleado.text"));
        btnActualizar.setText(bundle.getString("Usuarios.btnActualizar.text"));
        btnAgregar.setText(bundle.getString("Usuarios.btnAgregar.text"));
        btnEliminar.setText(bundle.getString("Usuarios.btnEliminar.text"));
        btnEmpleado.setText(bundle.getString("Usuarios.btnEmpleado.text"));
        btnModificar.setText(bundle.getString("Usuarios.btnModificar.text"));
        btnSeleccionarEmpleado.setText(bundle.getString("Usuarios.btnSeleccionarEmpleado.text"));
        jLabel10.setText(bundle.getString("Usuarios.jLabel10.text"));
        jLabel3.setText(bundle.getString("Usuarios.jLabel3.text"));
        jLabel4.setText(bundle.getString("Usuarios.jLabel4.text"));
        jLabel5.setText(bundle.getString("Usuarios.jLabel5.text"));
        jLabel6.setText(bundle.getString("Usuarios.jLabel6.text"));
        jLabel7.setText(bundle.getString("Usuarios.jLabel7.text"));
        jLabel8.setText(bundle.getString("Usuarios.jLabel8.text"));
        jLabel9.setText(bundle.getString("Usuarios.jLabel9.text"));
    }
    
    private void cargarDatos(){
        consulta.ConsultaTabla("Select idUsuario, usuario, contrasena, codigo, tu.tipoUsuario, eu.estadoUsuario, e.DUI from dboLogin l, dboTipoUsuario tu, dboEstadoUsuario eu, dboEmpleado e where l.idTipoUsuario = tu.idTipoUsuario and l.idEstadoUsuario = eu.idEstadoUsuario and l.idEmpleado = e.idEmpleado and not l.idEstadoUsuario = 2", jTUsuarios);
        consulta.ConsultaTabla("SELECT idEmpleado, nombreEmpleado, DUI, NIT, fechaNacimiento, dd.departamento, de.departamentoE FROM dboEmpleado, dboDepartamentoEmpresa de, dboDepartamento dd WHERE dboEmpleado.idDeptoEmpresa = de.idDeptoEmpresa AND dboEmpleado.idDepartamento = dd.idDepartamento", jTEmpleados);
        cargarComboBoxEstado();
        cargarComboBoxTipo();
        
        jTUsuarios.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        jTUsuarios.getColumnModel().getColumn(0).setMaxWidth(0);
        
        jTUsuarios.getTableHeader().getColumnModel().getColumn(2).setMinWidth(0);
        jTUsuarios.getColumnModel().getColumn(2).setMaxWidth(0);
    }
       
    public void cargarComboBoxTipo(){
        MtoUsuarios obj = new MtoUsuarios();
        cmbTipo.setModel(obj.cargarComboTipoUser());
        if (jTUsuarios.getRowCount() > 0) {
            cmbTipo.removeItem("Root");
        }
    }
     public void cargarComboBoxEstado(){
         MtoUsuarios obj = new MtoUsuarios();
         cmbEstado.setModel(obj.comboEstadoUser());
    }
     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        panelEmpleados = new javax.swing.JPanel();
        btnSeleccionarEmpleado = new rojeru_san.complementos.RSButtonHover();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTEmpleados = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        txtEmpleado = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbFiltro = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtBusqueda = new app.bolivia.swing.JCTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtContra = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnEmpleado = new rojeru_san.complementos.RSButtonHover();
        txtIdEmpleado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTUsuarios = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnAgregar = new rojeru_san.complementos.RSButtonHover();
        btnActualizar = new rojeru_san.complementos.RSButtonHover();
        btnModificar = new rojeru_san.complementos.RSButtonHover();
        btnEliminar = new rojeru_san.complementos.RSButtonHover();
        jLabel2 = new javax.swing.JLabel();
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
        setTitle(bundle.getString("Usuarios.title")); // NOI18N

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelEmpleados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSeleccionarEmpleado.setBackground(new java.awt.Color(2, 56, 89));
        btnSeleccionarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_male_user_28px.png"))); // NOI18N
        btnSeleccionarEmpleado.setText(bundle.getString("Usuarios.btnSeleccionarEmpleado.text")); // NOI18N
        btnSeleccionarEmpleado.setColorHover(new java.awt.Color(108, 108, 108));
        btnSeleccionarEmpleado.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnSeleccionarEmpleado.setIconTextGap(15);
        btnSeleccionarEmpleado.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnSeleccionarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarEmpleadoActionPerformed(evt);
            }
        });
        panelEmpleados.add(btnSeleccionarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 180, -1));

        jTEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "DUI", "NIT", "Fecha nacimiento", "Departamento", "Departamento empresa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTEmpleados);

        panelEmpleados.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 1100, 310));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setText(bundle.getString("Usuarios.jLabel12.text")); // NOI18N
        panelEmpleados.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));
        panelEmpleados.add(txtEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 90, -1));

        jPanel4.add(panelEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1100, 530));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_search_25px.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, -1, -1));

        cmbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Tipo usuario", "Estado usuario", "DUI" }));
        cmbFiltro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbFiltroMouseClicked(evt);
            }
        });
        jPanel1.add(cmbFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 140, 30));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setText(bundle.getString("Usuarios.jLabel11.text")); // NOI18N
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

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setText(bundle.getString("Usuarios.jLabel3.text")); // NOI18N
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel4.setText(bundle.getString("Usuarios.jLabel4.text")); // NOI18N
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText(bundle.getString("Usuarios.jLabel5.text")); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(227, 227, 227));
        txtUsuario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        jPanel3.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 230, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setText(bundle.getString("Usuarios.jLabel7.text")); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 19, -1, -1));

        txtContra.setBackground(new java.awt.Color(227, 227, 227));
        txtContra.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtContra.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtContra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraKeyTyped(evt);
            }
        });
        jPanel3.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 230, 30));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText(bundle.getString("Usuarios.jLabel6.text")); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        txtCodigo.setBackground(new java.awt.Color(227, 227, 227));
        txtCodigo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCodigo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtCodigo.setEnabled(false);
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });
        jPanel3.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 190, 30));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setText(bundle.getString("Usuarios.jLabel8.text")); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        cmbTipo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Operador", "Administrador" }));
        cmbTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTipoItemStateChanged(evt);
            }
        });
        jPanel3.add(cmbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 180, 30));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setText(bundle.getString("Usuarios.jLabel9.text")); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        cmbEstado.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo", "Inactivo Temporalmente" }));
        cmbEstado.setEnabled(false);
        jPanel3.add(cmbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 180, 30));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setText(bundle.getString("Usuarios.jLabel10.text")); // NOI18N
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, -1, -1));

        txtId.setBackground(new java.awt.Color(227, 227, 227));
        txtId.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtId.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 50, 30));

        btnEmpleado.setBackground(new java.awt.Color(2, 56, 89));
        btnEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_male_user_28px.png"))); // NOI18N
        btnEmpleado.setText(bundle.getString("Usuarios.btnEmpleado.text")); // NOI18N
        btnEmpleado.setColorHover(new java.awt.Color(108, 108, 108));
        btnEmpleado.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEmpleado.setIconTextGap(15);
        btnEmpleado.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadoActionPerformed(evt);
            }
        });
        jPanel3.add(btnEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 190, 30));

        txtIdEmpleado.setBackground(new java.awt.Color(227, 227, 227));
        txtIdEmpleado.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtIdEmpleado.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.add(txtIdEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 50, 30));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 890, 190));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Usuario", "Contraseña", "Código", "TipoUsuario", "EstadoUsuario", "DUI Empleado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTUsuarios.getTableHeader().setReorderingAllowed(false);
        jTUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTUsuarios);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 890, 300));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregar.setBackground(new java.awt.Color(51, 51, 51));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_add_database_25px.png"))); // NOI18N
        btnAgregar.setText(bundle.getString("Usuarios.btnAgregar.text")); // NOI18N
        btnAgregar.setColorHover(new java.awt.Color(181, 238, 205));
        btnAgregar.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnAgregar.setIconTextGap(15);
        btnAgregar.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 180, -1));

        btnActualizar.setBackground(new java.awt.Color(51, 51, 51));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_refresh_25px_1.png"))); // NOI18N
        btnActualizar.setText(bundle.getString("Usuarios.btnActualizar.text")); // NOI18N
        btnActualizar.setColorHover(new java.awt.Color(219, 225, 225));
        btnActualizar.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnActualizar.setIconTextGap(15);
        btnActualizar.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 180, -1));

        btnModificar.setBackground(new java.awt.Color(51, 51, 51));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_edit_property_27px.png"))); // NOI18N
        btnModificar.setText(bundle.getString("Usuarios.btnModificar.text")); // NOI18N
        btnModificar.setColorHover(new java.awt.Color(102, 153, 255));
        btnModificar.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnModificar.setIconTextGap(15);
        btnModificar.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 180, -1));

        btnEliminar.setBackground(new java.awt.Color(51, 51, 51));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_delete_database_25px_1.png"))); // NOI18N
        btnEliminar.setText(bundle.getString("Usuarios.btnEliminar.text")); // NOI18N
        btnEliminar.setColorHover(new java.awt.Color(255, 102, 102));
        btnEliminar.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnEliminar.setIconTextGap(15);
        btnEliminar.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 180, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/account.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setIconTextGap(0);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 138, 140));

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 200, 500));

        jMenu1.setText(bundle.getString("Usuarios.jMenu1.text")); // NOI18N

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_cancel_20px.png"))); // NOI18N
        jMenuItem1.setText(bundle.getString("Usuarios.jMenuItem1.text")); // NOI18N
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText(bundle.getString("Usuarios.jMenu2.text")); // NOI18N
        jMenuBar1.add(jMenu2);

        jMenu3.setText(bundle.getString("Usuarios.jMenu3.text")); // NOI18N

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_whatsapp_20px_1.png"))); // NOI18N
        jMenuItem2.setText(bundle.getString("Usuarios.jMenuItem2.text")); // NOI18N
        jMenu3.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_computer_support_20px.png"))); // NOI18N
        jMenuItem3.setText(bundle.getString("Usuarios.jMenuItem3.text")); // NOI18N
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1118, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
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
    
    public boolean comprobarCode(){
        boolean bool = false;
        for (int i = 0; i < jTUsuarios.getRowCount(); i++) {
            if (jTUsuarios.getValueAt(i, 3) != null) {
                if (txtCodigo.getText().equals(jTUsuarios.getValueAt(i, 3).toString())) {
                    bool = true;
                }
            }
        }
        return bool;
    }
    
    public boolean comprobarCode2(){
        boolean bool = false;
        for (int i = 0; i < jTUsuarios.getRowCount(); i++) {
            if (jTUsuarios.getValueAt(i, 3) != null) {
                if (i != fila) {
                    if (txtCodigo.getText().equals(jTUsuarios.getValueAt(i, 3).toString())) {
                        bool = true;
                    }
                }
            }
        }
        return bool;
    }
    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (txtUsuario.getText().isEmpty() || txtContra.getText().isEmpty() || txtIdEmpleado.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Campos vacíos");
        } else if (cmbTipo.getSelectedItem().toString().equals("Administrador") && txtCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Campos vacíos, llene el código de administrador");
        } else if(comprobarCode()){
            JOptionPane.showMessageDialog(null, "Error. El código de administrador no se puede repetir");
        }else{
            MtoUsuarios obj = new MtoUsuarios();
            obj.setUser(txtUsuario.getText());
            obj.setContrasena(txtContra.getText());
            if (cmbTipo.getSelectedItem().toString().equals("Administrador")) {
                obj.setCodigo(txtCodigo.getText());
            } else {
//                    obj.setCodigo(0);
            }

            obj.setTipoUsuario(cmbTipo.getSelectedItem().toString());
            obj.setEstadoUsuario(cmbEstado.getSelectedItem().toString());
            obj.setEmpleado(empleado);

            if (obj.guadarUsuario()) {
                JOptionPane.showMessageDialog(this, "Datos guardados exitosamente");
                limpiarCampos();
                cargarDatos();
            } else {
                JOptionPane.showMessageDialog(this, "Error al subir los datos");
            }
        }
        cargarDatos();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (txtUsuario.getText().isEmpty()||txtContra.getText().isEmpty()||txtIdEmpleado.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Campos vacíos");
        }else if(cmbTipo.getSelectedItem().toString().equals("Administrador") && txtCodigo.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Campos vacíos, llene el código de administrador");
        }else if(comprobarCode2()){
            JOptionPane.showMessageDialog(null, "Error. El código de administrador no se puede repetir");
        }else{
             MtoUsuarios obj = new MtoUsuarios();
            obj.setId(Integer.parseInt(txtId.getText()));
            obj.setUser(txtUsuario.getText());
            obj.setContrasena(txtContra.getText());
            if(cmbTipo.getSelectedItem().toString().equals("Administrador")){
                obj.setCodigo(txtCodigo.getText());
            }else{
//                obj.setCodigo(0);
            }
            obj.setTipoUsuario(cmbTipo.getSelectedItem().toString());
            obj.setEstadoUsuario(cmbEstado.getSelectedItem().toString());
            obj.setEmpleado(Integer.parseInt(txtIdEmpleado.getText()));
            
            if (obj.actualizarUsuario()) {
                JOptionPane.showMessageDialog(this, "Datos modificados");
                limpiarCampos();
                cargarDatos();
                txtBusqueda.setText(null);
            }
            else{
                JOptionPane.showMessageDialog(this, "Error al modificar");
            }
        }
         
        cargarDatos();
    }//GEN-LAST:event_btnModificarActionPerformed

    void limpiarCampos(){
        txtUsuario.setText(null);
        txtContra.setText(null);
        txtCodigo.setText(null);
        txtIdEmpleado.setText(null);
        txtId.setText(null);
        txtEmpleado.setText(null);
        btnEmpleado.setText("Seleccionar");
        cmbEstado.setEnabled(false);
        btnAgregar.setEnabled(true);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
            MtoUsuarios obj = new MtoUsuarios();            
            int eliminar = JOptionPane.showConfirmDialog(this, "Está seguro que desea deshabilitar este usuario?", "Atención", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if(eliminar==0){
            //enviando el registro a eliminar en SQLServer
            obj.setId(Integer.parseInt(txtId.getText()));
            obj.setUser(txtUsuario.getText());
            obj.setContrasena(txtContra.getText());
            if(cmbTipo.getSelectedItem().toString().equals("Administrador")){
                obj.setCodigo(txtCodigo.getText());
            }else{
//                obj.setCodigo(0);
            }
            obj.setTipoUsuario(cmbTipo.getSelectedItem().toString());
            obj.setEstadoUsuario("Inhabilitado");
            obj.setEmpleado(Integer.parseInt(txtIdEmpleado.getText()));
            
            if (obj.actualizarUsuario()) {
                JOptionPane.showMessageDialog(this, "Usuario inhabilitado satisfactoriamente");
                limpiarCampos();
                cargarDatos();
                txtBusqueda.setText(null);
            }
            else{
                JOptionPane.showMessageDialog(this, "Error al modificar");
            }
        }else{
            limpiarCampos();
            cargarDatos();
        }

         
        cargarDatos();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
        cargarDatos();
        btnAgregar.setEnabled(true);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
        MtoUsuarios obj = new MtoUsuarios();
        obj.Buscar(txtBusqueda.getText(), String.valueOf(cmbFiltro.getSelectedItem()), jTUsuarios);
        jTUsuarios.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        jTUsuarios.getColumnModel().getColumn(0).setMaxWidth(0);
        
        jTUsuarios.getTableHeader().getColumnModel().getColumn(2).setMinWidth(0);
        jTUsuarios.getColumnModel().getColumn(2).setMaxWidth(0);
    }//GEN-LAST:event_txtBusquedaKeyReleased

    private void btnEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadoActionPerformed
        panelEmpleados.setVisible(true);
        jPanel3.setVisible(false);
        jScrollPane1.setVisible(false);
    }//GEN-LAST:event_btnEmpleadoActionPerformed

    private void btnSeleccionarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarEmpleadoActionPerformed
        if (txtEmpleado.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay ningún empleado seleccionado");
        }
        else{
        panelEmpleados.setVisible(false);
        jPanel3.setVisible(true);
        jScrollPane1.setVisible(true);
        }
    }//GEN-LAST:event_btnSeleccionarEmpleadoActionPerformed
    
    int fila;
    
    private void jTUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTUsuariosMouseClicked
        MtoUsuarios obj = new MtoUsuarios();
        try{
            
            fila = jTUsuarios.getSelectedRow();
            int id = Integer.parseInt(jTUsuarios.getValueAt(fila, 0).toString());// Esta forma funciona cuando en la tabla se muestra el id también
            obj.consultarUsuario(id);
            //obj.obtenerEmpleado(Integer.parseInt(txtIdEmpleado.getText()));
            
            txtId.setText(String.valueOf(id));
            txtUsuario.setText(obj.getUser());
            txtContra.setText(obj.getContrasena());
            txtCodigo.setText(String.valueOf(obj.getCodigo()));
            cmbTipo.setSelectedItem(jTUsuarios.getValueAt(fila, 4).toString());
            cmbEstado.setSelectedItem(jTUsuarios.getValueAt(fila, 5).toString());
            txtIdEmpleado.setText(String.valueOf(obj.getEmpleado()));
            btnEmpleado.setText(String.valueOf(jTUsuarios.getValueAt(fila, 6)));
            btnAgregar.setEnabled(false);
            btnModificar.setEnabled(true);
            btnEliminar.setEnabled(true);
            cmbEstado.setEnabled(true);
        }
        catch(Exception e){
        }
    }//GEN-LAST:event_jTUsuariosMouseClicked

    private void jTEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTEmpleadosMouseClicked
        MtoUsuarios obj = new MtoUsuarios();
        try{
            
            int fila = jTEmpleados.getSelectedRow(); //inutilizado por el momento....
            empleado = Integer.parseInt(jTEmpleados.getValueAt(fila, 0).toString());// Esta forma funciona cuando en la tabla se muestra el id también

            obj.obtenerEmpleado(empleado);
            txtIdEmpleado.setText(String.valueOf(obj.getEmpleado()));
            txtEmpleado.setText(obj.getDui());
            btnEmpleado.setText(obj.getDui());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jTEmpleadosMouseClicked

    //------------------------------------------------------------Validaciones------------------------------------------------------------
    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        if (txtUsuario.getText().length()== 20) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void txtContraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraKeyTyped
        if (txtContra.getText().length()== 16) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtContraKeyTyped

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
         }
        if (txtCodigo.getText().length()== 6) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void cmbFiltroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbFiltroMouseClicked
        cargarDatos();
        txtBusqueda.setText(null);
    }//GEN-LAST:event_cmbFiltroMouseClicked

    private void cmbTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTipoItemStateChanged
        if(cmbTipo.getSelectedItem().toString().equals("Administrador")){
            txtCodigo.setEnabled(true);
        }else{
            txtCodigo.setEnabled(false);
            txtCodigo.setText(null);
        }
    }//GEN-LAST:event_cmbTipoItemStateChanged

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover btnActualizar;
    private rojeru_san.complementos.RSButtonHover btnAgregar;
    private rojeru_san.complementos.RSButtonHover btnEliminar;
    private rojeru_san.complementos.RSButtonHover btnEmpleado;
    private rojeru_san.complementos.RSButtonHover btnModificar;
    private rojeru_san.complementos.RSButtonHover btnSeleccionarEmpleado;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbFiltro;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTEmpleados;
    private javax.swing.JTable jTUsuarios;
    private javax.swing.JPanel panelEmpleados;
    private app.bolivia.swing.JCTextField txtBusqueda;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtContra;
    private javax.swing.JTextField txtEmpleado;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdEmpleado;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
