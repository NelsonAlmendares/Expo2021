/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.*;
import Controlador.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Mery Chavez Pacifico
 */
public class Clientes extends javax.swing.JInternalFrame {

    DefaultTableModel tb;
    String datos [][] = {};
    String cabecera [] = {"idCliente", "Nombre completo","Teléfono","DUI","Dirección", "E-mail", "Estado"};
    MtoConsultar consulta = new MtoConsultar();
    
    Locale locale;
    public Clientes() {
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
        tb = new DefaultTableModel(datos,cabecera);
        jTClientes.setModel(tb);
        TableColorCellRenderer renderer = new TableColorCellRenderer();
        jTClientes.setDefaultRenderer(Object.class, renderer);
        
        ((DefaultTableCellRenderer)jTClientes.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        
        txtID.setVisible(false);
        
        CargarDatos();
        if (Expo.darkMode == 1) {
            darkMood();
        }
    }
    
    public void darkMood(){
        jPanel4.setBackground(new java.awt.Color(9, 12, 16)); //Fondo
        CustomizeMenu.customizeMenuBar(jMenuBar1);
        jPanel1.setBackground(new java.awt.Color(22, 27, 34)); //Panel de arriba
        jPanel3.setBackground(new java.awt.Color(13, 17, 23)); //Panel principal
        jPanel2.setBackground(new java.awt.Color(22, 27, 34)); //Panel secundario o  lateral
        txtBusquedaClientes.setBackground(new java.awt.Color(13, 17, 23));
        txtNombre.setBackground(new java.awt.Color(22, 27, 34)); // TextBox
        txtTelefono.setBackground(new java.awt.Color(22, 27, 34));
        txtCorreo.setBackground(new java.awt.Color(22, 27, 34));
        txtDUI.setBackground(new java.awt.Color(22, 27, 34));
        txtDireccion.setBackground(new java.awt.Color(22, 27, 34));
        jTClientes.setGridColor(new java.awt.Color(2,103,255));
    } 
    
    private void Internacionalizacion(){
        ResourceBundle bundle = ResourceBundle.getBundle("Res/Bundle", locale);
        this.setTitle(bundle.getString("Clientes.title"));
        jMenu3.setText(bundle.getString("Clientes.jMenu3.text"));
        jMenuItem2.setText(bundle.getString("Clientes.jMenuItem2.text"));
        jMenuItem3.setText(bundle.getString("Clientes.jMenuItem3.text"));
        jLabel4.setText(bundle.getString("Clientes.jLabel4.text"));
        jLabel6.setText(bundle.getString("Clientes.jLabel6.text"));
        jMenu1.setText(bundle.getString("Clientes.jMenu1.text"));
        jMenuItem1.setText(bundle.getString("Clientes.jMenuItem1.text"));
        jLabel7.setText(bundle.getString("Clientes.jLabel7.text"));
        jLabel8.setText(bundle.getString("Clientes.jLabel8.text"));
        jLabel11.setText(bundle.getString("Clientes.jLabel11.text"));
        btnAgregar.setText(bundle.getString("Clientes.btnAgregar.text"));
        btnActualizar.setText(bundle.getString("Clientes.btnActualizar.text"));
        btnModificar.setText(bundle.getString("Clientes.btnModificar.text"));
        btnInhabilitar.setText(bundle.getString("Clientes.btnInhabilitar.text"));
        jLabel2.setText(bundle.getString("Clientes.jLabel2.text"));
    }
    
    static ResultSet res;
    public void CargarDatos(){
        consulta.ConsultaTabla("SELECT dc.idCliente, dc.nombreCliente, dc.numCliente, dc.DUI, dc.direccion, dc.correoElectronico, de.estadoUsuario FROM dboCliente dc, dboEstadoUsuario de where dc.idEstadoUsuario = de.idEstadoUsuario;", jTClientes);
        cargarComboBoxEstado();
        jCBEstado.setEnabled(false);
        jTClientes.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        jTClientes.getColumnModel().getColumn(0).setMaxWidth(0);
    }
    
        public void cargarComboBoxEstado(){
            jCBEstado.removeAllItems();
            res = Controlador.MtoConsultar.Consulta("SELECT * FROM dboEstadoUsuario");

            try{
                while(res.next()){
                    Vector v = new Vector();
                    v.addElement(res.getString(2));
                    jCBEstado.addItem(String.valueOf(v.elementAt(0)));
                }
            }catch(SQLException e){

                        }
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        JScrollPane = new javax.swing.JScrollPane();
        jTClientes = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jCBEstado = new javax.swing.JComboBox<>();
        txtDUI = new javax.swing.JFormattedTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAgregar = new rojeru_san.complementos.RSButtonHover();
        btnActualizar = new rojeru_san.complementos.RSButtonHover();
        btnModificar = new rojeru_san.complementos.RSButtonHover();
        btnInhabilitar = new rojeru_san.complementos.RSButtonHover();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbFiltro = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtBusquedaClientes = new app.bolivia.swing.JCTextField();
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
        setTitle(bundle.getString("Clientes.title")); // NOI18N

        jPanel4.setBackground(new java.awt.Color(220, 220, 220));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel10.setText(bundle.getString("Clientes.jLabel10.text")); // NOI18N
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        JScrollPane.setBackground(new java.awt.Color(255, 255, 255));

        jTClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "idCliente", "Nombre Completo", "Teléfono", "DUI", "Dirección", "E-mail", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTClientes.getTableHeader().setReorderingAllowed(false);
        jTClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTClientesMouseClicked(evt);
            }
        });
        JScrollPane.setViewportView(jTClientes);
        if (jTClientes.getColumnModel().getColumnCount() > 0) {
            jTClientes.getColumnModel().getColumn(0).setHeaderValue(bundle.getString("Clientes.jTClientes.columnModel.title0")); // NOI18N
            jTClientes.getColumnModel().getColumn(1).setHeaderValue(bundle.getString("Clientes.jTClientes.columnModel.title1")); // NOI18N
            jTClientes.getColumnModel().getColumn(2).setHeaderValue(bundle.getString("Clientes.jTClientes.columnModel.title2")); // NOI18N
            jTClientes.getColumnModel().getColumn(3).setHeaderValue(bundle.getString("Clientes.jTClientes.columnModel.title3")); // NOI18N
            jTClientes.getColumnModel().getColumn(4).setHeaderValue(bundle.getString("Clientes.jTClientes.columnModel.title4")); // NOI18N
            jTClientes.getColumnModel().getColumn(5).setHeaderValue(bundle.getString("Clientes.jTClientes.columnModel.title6")); // NOI18N
            jTClientes.getColumnModel().getColumn(6).setHeaderValue(bundle.getString("Clientes.jTClientes.columnModel.title5")); // NOI18N
        }

        jPanel4.add(JScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 890, 300));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText(bundle.getString("Clientes.jLabel4.text")); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        txtNombre.setBackground(new java.awt.Color(227, 227, 227));
        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 340, 30));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText(bundle.getString("Clientes.jLabel6.text")); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        txtTelefono.setBackground(new java.awt.Color(227, 227, 227));
        txtTelefono.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtTelefono.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel3.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 160, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setText(bundle.getString("Clientes.jLabel7.text")); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, -1, -1));

        txtID.setBackground(new java.awt.Color(227, 227, 227));
        txtID.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtID.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 160, 70, 30));

        jLabel8.setBackground(new java.awt.Color(51, 51, 51));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setText(bundle.getString("Clientes.jLabel8.text")); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        jCBEstado.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jCBEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo", "Inactivo Temporalmente" }));
        jCBEstado.setEnabled(false);
        jPanel3.add(jCBEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, 140, 30));

        txtDUI.setBackground(new java.awt.Color(227, 227, 227));
        txtDUI.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        try {
            txtDUI.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDUI.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel3.add(txtDUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 160, 30));

        txtDireccion.setBackground(new java.awt.Color(227, 227, 227));
        txtDireccion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtDireccion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 470, 30));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setText(bundle.getString("Clientes.jLabel12.text")); // NOI18N
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        txtCorreo.setBackground(new java.awt.Color(227, 227, 227));
        txtCorreo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCorreo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 290, 30));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setText(bundle.getString("Clientes.jLabel13.text")); // NOI18N
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, -1, -1));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 890, 190));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setText(bundle.getString("Clientes.jLabel2.text")); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregar.setBackground(new java.awt.Color(51, 51, 51));
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_add_database_25px.png"))); // NOI18N
        btnAgregar.setText(bundle.getString("Clientes.btnAgregar.text")); // NOI18N
        btnAgregar.setColorHover(new java.awt.Color(181, 238, 205));
        btnAgregar.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
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
        btnActualizar.setText(bundle.getString("Clientes.btnActualizar.text")); // NOI18N
        btnActualizar.setColorHover(new java.awt.Color(219, 225, 225));
        btnActualizar.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnActualizar.setIconTextGap(15);
        btnActualizar.setMargin(new java.awt.Insets(4, 5, 4, 5));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 180, -1));

        btnModificar.setBackground(new java.awt.Color(51, 51, 51));
        btnModificar.setForeground(new java.awt.Color(0, 0, 0));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_edit_property_27px.png"))); // NOI18N
        btnModificar.setText(bundle.getString("Clientes.btnModificar.text")); // NOI18N
        btnModificar.setColorHover(new java.awt.Color(102, 153, 255));
        btnModificar.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnModificar.setEnabled(false);
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnModificar.setIconTextGap(15);
        btnModificar.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 180, -1));

        btnInhabilitar.setBackground(new java.awt.Color(51, 51, 51));
        btnInhabilitar.setForeground(new java.awt.Color(0, 0, 0));
        btnInhabilitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_delete_database_25px_1.png"))); // NOI18N
        btnInhabilitar.setText(bundle.getString("Clientes.btnInhabilitar.text")); // NOI18N
        btnInhabilitar.setColorHover(new java.awt.Color(255, 102, 102));
        btnInhabilitar.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnInhabilitar.setEnabled(false);
        btnInhabilitar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnInhabilitar.setIconTextGap(15);
        btnInhabilitar.setMargin(new java.awt.Insets(4, 5, 4, 5));
        btnInhabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInhabilitarActionPerformed(evt);
            }
        });
        jPanel2.add(btnInhabilitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 180, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/Clientes admin.png"))); // NOI18N
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setIconTextGap(0);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 138, 140));

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 200, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_search_25px.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, -1, -1));

        cmbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado", "DUI", "Nombre" }));
        jPanel1.add(cmbFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 140, 30));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setText(bundle.getString("Clientes.jLabel11.text")); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, 30));

        txtBusquedaClientes.setBackground(new java.awt.Color(227, 227, 227));
        txtBusquedaClientes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtBusquedaClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaClientesKeyReleased(evt);
            }
        });
        jPanel1.add(txtBusquedaClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 360, 30));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1100, 50));

        jMenu1.setText(bundle.getString("Clientes.jMenu1.text")); // NOI18N

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_cancel_20px.png"))); // NOI18N
        jMenuItem1.setText(bundle.getString("Clientes.jMenuItem1.text")); // NOI18N
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText(bundle.getString("Clientes.jMenu2.text")); // NOI18N
        jMenuBar1.add(jMenu2);

        jMenu3.setText(bundle.getString("Clientes.jMenu3.text")); // NOI18N

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_whatsapp_20px_1.png"))); // NOI18N
        jMenuItem2.setText(bundle.getString("Clientes.jMenuItem2.text")); // NOI18N
        jMenu3.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_computer_support_20px.png"))); // NOI18N
        jMenuItem3.setText(bundle.getString("Clientes.jMenuItem3.text")); // NOI18N
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
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
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
    
    public void LimpiarCampos(){
        txtNombre.setText(null);
        txtTelefono.setText(null);
        txtDUI.setText(null);
        txtDireccion.setText(null);
        txtCorreo.setText(null);
        txtID.setText(null);
     }
    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (txtNombre.getText().isEmpty() ||
            txtTelefono.getText().isEmpty() || 
            txtDUI.getText().trim().length() != 10) {
            JOptionPane.showMessageDialog(this, "Todos los campos deben de ser completados");
        }else {
            MtoClientes obj = new MtoClientes();
            obj.setNombre(txtNombre.getText());
            obj.setNum(Integer.parseInt(txtTelefono.getText()));
            obj.setDui(txtDUI.getText());
            obj.setDireccion(txtDireccion.getText());
            obj.setCorreo(txtCorreo.getText());
            obj.setEstado(Integer.parseInt(datosComboEstado()));

            //enviando guardar a  SQLServer
            if(obj.guardarCliente()){
                JOptionPane.showMessageDialog(this, "Datos guardados.");
            }else{
                JOptionPane.showMessageDialog(this, "Datos no guardados, error.");
            }
            CargarDatos();
            LimpiarCampos();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (txtNombre.getText().isEmpty() ||
            txtTelefono.getText().isEmpty() || 
            txtDUI.getText().isEmpty()   ) {
            JOptionPane.showMessageDialog(this, "Todos los campos deben de ser completados");
        }
        
        else {
            MtoClientes obj = new MtoClientes();
            obj.setNombre(txtNombre.getText());
            obj.setNum(Integer.parseInt(txtTelefono.getText()));
            obj.setDui(txtDUI.getText());
            obj.setDireccion(txtDireccion.getText());
            obj.setCorreo(txtCorreo.getText());
            obj.setEstado(Integer.parseInt(datosComboEstado()));
            obj.setId(Integer.parseInt(jTClientes.getValueAt(jTClientes.getSelectedRow(), 0).toString()));

            //enviando guardar a  SQLServer
            if(obj.modificarCliente()){
                JOptionPane.showMessageDialog(this, "Datos modificados correctamente.");
            }else{
                JOptionPane.showMessageDialog(this, "Datos no modificados.");
            }
            CargarDatos();
            LimpiarCampos();
            btnAgregar.setEnabled(true);
            btnModificar.setEnabled(false);
            btnInhabilitar.setEnabled(false);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void jTClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTClientesMouseClicked
        if (jTClientes.getSelectedRowCount()>0) {
            txtID.setText(jTClientes.getValueAt(jTClientes.getSelectedRow(), 0).toString());
            txtNombre.setText(jTClientes.getValueAt(jTClientes.getSelectedRow(), 1).toString());
            txtTelefono.setText(jTClientes.getValueAt(jTClientes.getSelectedRow(), 2).toString());
            txtDUI.setText(jTClientes.getValueAt(jTClientes.getSelectedRow(), 3).toString());
            txtDireccion.setText(jTClientes.getValueAt(jTClientes.getSelectedRow(), 4).toString());
            txtCorreo.setText(jTClientes.getValueAt(jTClientes.getSelectedRow(), 5).toString());
            String value = jTClientes.getValueAt(jTClientes.getSelectedRow(), 6).toString();
            jCBEstado.setSelectedItem(value);
            
            btnAgregar.setEnabled(false);
            btnModificar.setEnabled(true);
            btnInhabilitar.setEnabled(true);
            jCBEstado.setEnabled(true);
        }
    }//GEN-LAST:event_jTClientesMouseClicked

    private void btnInhabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInhabilitarActionPerformed
        if (txtNombre.getText().isEmpty() &&
            txtTelefono.getText().isEmpty() && 
            txtID.getText().isEmpty()   ) {
            JOptionPane.showMessageDialog(this, "Todos los campos deben de ser completados");
        }
        
        else {
            MtoClientes obj = new MtoClientes();
            obj.setNombre(txtNombre.getText());
            obj.setNum(Integer.parseInt(txtTelefono.getText()));
            obj.setDui(txtDUI.getText());
            obj.setDireccion(txtDireccion.getText());
            obj.setCorreo(txtCorreo.getText());
            obj.setEstado(2);
            obj.setId(Integer.parseInt(txtID.getText()));

            //enviando guardar a  SQLServer
            if(obj.modificarCliente()){
                JOptionPane.showMessageDialog(this, "Usuario inhabilitado exitosamente.");
            }else{
                JOptionPane.showMessageDialog(this, "Datos no guardados");
            }
            CargarDatos();
            LimpiarCampos();
            btnAgregar.setEnabled(true);
            btnModificar.setEnabled(false);
            btnInhabilitar.setEnabled(false);
        }
    }//GEN-LAST:event_btnInhabilitarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        System.out.println(txtDUI.getText().trim().length());
        CargarDatos();
        LimpiarCampos();
        btnAgregar.setEnabled(true);
            btnModificar.setEnabled(false);
            btnInhabilitar.setEnabled(false);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtBusquedaClientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaClientesKeyReleased
        MtoClientes obj = new MtoClientes();
        obj.Buscar(txtBusquedaClientes.getText(), String.valueOf(cmbFiltro.getSelectedItem()), jTClientes);
        jTClientes.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        jTClientes.getColumnModel().getColumn(0).setMaxWidth(0);
    }//GEN-LAST:event_txtBusquedaClientesKeyReleased

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        Controlador.Validaciones.SoloLetras(evt);
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        Controlador.Validaciones.SoloNumerosLimite(evt, txtTelefono);
    }//GEN-LAST:event_txtTelefonoKeyTyped
    

    public String datosComboEstado(){
        res = Controlador.MtoConsultar.Consulta("SELECT * FROM dboEstadoUsuario");
        String str = "";
        try{
            while(res.next()){
                Vector v = new Vector();
                v.addElement(res.getInt(1));
                v.addElement(res.getString(2));
                if(String.valueOf(jCBEstado.getSelectedItem()).equals(String.valueOf(v.elementAt(1)))){
                    str = String.valueOf(v.elementAt(0));
                }
            }
        }catch(SQLException e){
                     
                    }
        return str;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScrollPane;
    private rojeru_san.complementos.RSButtonHover btnActualizar;
    private rojeru_san.complementos.RSButtonHover btnAgregar;
    private rojeru_san.complementos.RSButtonHover btnInhabilitar;
    private rojeru_san.complementos.RSButtonHover btnModificar;
    private javax.swing.JComboBox<String> cmbFiltro;
    private javax.swing.JComboBox<String> jCBEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTable jTClientes;
    private app.bolivia.swing.JCTextField txtBusquedaClientes;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JFormattedTextField txtDUI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
