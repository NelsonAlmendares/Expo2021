package Main;

import Controlador.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;

public class CasosDepto extends javax.swing.JInternalFrame {

    Locale locale;  
    MtoConsultar consulta = new MtoConsultar();
    
    public CasosDepto() {
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
            txtDui.setEditable(false);
            txtDescripcion.setEditable(false);
            rsDate.setVisible(false);
            cmbTipo.setEnabled(false);
        }
         
        MostrarDatos();
        btnActualizar.setEnabled(false);
        btnAgregar.setEnabled(false);
        btnEliminar.setEnabled(false);
        jLabel13.setVisible(false);
        cmbDepto.setVisible(false);
        jPanel4.setVisible(false);
        
        MtoProyecto obj = new MtoProyecto();
        cmbTipo.setModel(obj.cargarComboTipo());
        cmbDepto.setModel(obj.cargarComboDeptoEmpresa());
        cmbEstado.setModel(obj.cargarComboEstado());
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        TableColorCellRenderer renderer = new TableColorCellRenderer();
        jTReclamos.setDefaultRenderer(Object.class, renderer);

        ((DefaultTableCellRenderer)jTReclamos.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        if (Expo.darkMode == 1) {
            darkMood();
        }
    }
    
    public void darkMood(){
        jPanel5.setBackground(new java.awt.Color(9, 12, 16)); //Fondo
        CustomizeMenu.customizeMenuBar(jMenuBar1);
        jPanel1.setBackground(new java.awt.Color(22, 27, 34)); //Panel de arriba
        jPanel3.setBackground(new java.awt.Color(13, 17, 23)); //Panel principal
        jPanel4.setBackground(new java.awt.Color(13, 17, 23));
        jPanel2.setBackground(new java.awt.Color(22, 27, 34));
        txtBusqueda.setBackground(new java.awt.Color(13, 17, 23));
        txtDescripcion.setBackground(new java.awt.Color(22, 27, 34)); // TextBox
        txtDui.setBackground(new java.awt.Color(22, 27, 34));
        txtFecha.setBackground(new java.awt.Color(22, 27, 34));
        txtReclamo.setBackground(new java.awt.Color(22, 27, 34));
        txtDUI.setBackground(new java.awt.Color(60, 60, 60));
        jTReclamos.setGridColor(new java.awt.Color(2,103,255));
    }
    
    private void Internacionalizacion(){
        ResourceBundle bundle = ResourceBundle.getBundle("Res/Bundle", locale);
        this.setTitle(bundle.getString("CasosDepto.title"));
        jLabel13.setText(bundle.getString("CasosDepto.jLabel13.text"));
        jLabel11.setText(bundle.getString("CasosDepto.jLabel11.text"));
        jLabel14.setText(bundle.getString("CasosDepto.jLabel14.text"));
        jLabel15.setText(bundle.getString("CasosDepto.jLabel15.text"));
        jLabel12.setText(bundle.getString("CasosDepto.jLabel12.text"));
        btnAgregar.setText(bundle.getString("CasosDepto.btnAgregar.text"));
        btnCliente.setText(bundle.getString("CasosDepto.btnCliente.text"));
        btnRegresar.setText(bundle.getString("CasosDepto.btnRegresar.text"));
        jLabel2.setText(bundle.getString("CasosDepto.jLabel2.text"));
        jMenu1.setText(bundle.getString("CasosDepto.jMenu1.text"));
        jMenuItem2.setText(bundle.getString("CasosDepto.jMenuItem2.text"));
        jLabel5.setText(bundle.getString("CasosDepto.jLabel5.text"));
        btnActualizar.setText(bundle.getString("CasosDepto.btnActualizar.text"));
        btnLimpiar.setText(bundle.getString("CasosDepto.btnLimpiar.text"));
        btnEliminar.setText(bundle.getString("CasosDepto.btnEliminar.text"));
        jMenu2.setText(bundle.getString("CasosDepto.jMenu2.text"));
        jLabel10.setText(bundle.getString("CasosDepto.jLabel10.text"));
        jMenu3.setText(bundle.getString("CasosDepto.jMenu3.text"));
        jMenuItem3.setText(bundle.getString("CasosDepto.jMenuItem3.text"));
        jLabel7.setText(bundle.getString("CasosDepto.jLabel7.text"));
        jLabel8.setText(bundle.getString("CasosDepto.jLabel8.text"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTClientes = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        btnRegresar = new rojeru_san.complementos.RSButtonHover();
        jLabel15 = new javax.swing.JLabel();
        txtDUI = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtBusqueda = new app.bolivia.swing.JCTextField();
        cmbFiltro = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnActualizar = new rojeru_san.complementos.RSButtonHover();
        btnLimpiar = new rojeru_san.complementos.RSButtonHover();
        btnEliminar = new rojeru_san.complementos.RSButtonHover();
        btnAgregar = new rojeru_san.complementos.RSButtonHover();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTReclamos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtReclamo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cmbDepto = new javax.swing.JComboBox<>();
        cmbEstado = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextArea();
        txtDui = new javax.swing.JFormattedTextField();
        rsDate = new rojeru_san.componentes.RSDateChooser();
        btnCliente = new rojeru_san.complementos.RSButtonHover();
        jLabel16 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setBackground(new java.awt.Color(220, 220, 220));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Res/Bundle"); // NOI18N
        setTitle(bundle.getString("CasosDepto.title")); // NOI18N
        setOpaque(true);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTClientes.setBackground(new java.awt.Color(74, 151, 156));
        jTClientes.setForeground(new java.awt.Color(255, 255, 255));
        jTClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "DUI", "Teléfono", "Nombre completo", "Dirección"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTClientes.setGridColor(new java.awt.Color(255, 255, 255));
        jTClientes.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTClientes.setSelectionForeground(new java.awt.Color(74, 151, 156));
        jTClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTClientes);
        if (jTClientes.getColumnModel().getColumnCount() > 0) {
            jTClientes.getColumnModel().getColumn(0).setResizable(false);
            jTClientes.getColumnModel().getColumn(0).setHeaderValue(bundle.getString("CasosDepto.jTReclamos.columnModel.title1")); // NOI18N
            jTClientes.getColumnModel().getColumn(1).setResizable(false);
            jTClientes.getColumnModel().getColumn(1).setHeaderValue(bundle.getString("CasosDepto.jTReclamos.columnModel.title2")); // NOI18N
            jTClientes.getColumnModel().getColumn(2).setHeaderValue(bundle.getString("CasosDepto.jTReclamos.columnModel.title3")); // NOI18N
            jTClientes.getColumnModel().getColumn(3).setResizable(false);
            jTClientes.getColumnModel().getColumn(3).setHeaderValue(bundle.getString("CasosDepto.jTClientes.columnModel.title4")); // NOI18N
        }

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 960, 300));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(62, 118, 122));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText(bundle.getString("CasosDepto.jLabel8.text")); // NOI18N
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 70, -1, -1));

        btnRegresar.setBackground(new java.awt.Color(51, 51, 51));
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_expand_arrow_20px.png"))); // NOI18N
        btnRegresar.setText(bundle.getString("CasosDepto.btnRegresar.text")); // NOI18N
        btnRegresar.setToolTipText(bundle.getString("CasosDepto.btnRegresar.toolTipText")); // NOI18N
        btnRegresar.setAutoscrolls(true);
        btnRegresar.setColorHover(new java.awt.Color(219, 225, 225));
        btnRegresar.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnRegresar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnRegresar.setIconTextGap(15);
        btnRegresar.setMargin(new java.awt.Insets(4, 4, 4, 4));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel4.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 170, 40));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(62, 118, 122));
        jLabel15.setText(bundle.getString("CasosDepto.jLabel15.text")); // NOI18N
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, -1));

        txtDUI.setBackground(new java.awt.Color(227, 227, 227));
        txtDUI.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtDUI.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtDUI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDUIKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDUIKeyTyped(evt);
            }
        });
        jPanel4.add(txtDUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, 180, 20));

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 1100, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(745, 40));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_search_25px.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, -1, -1));

        txtBusqueda.setBackground(new java.awt.Color(227, 227, 227));
        txtBusqueda.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyReleased(evt);
            }
        });
        jPanel1.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 360, 30));

        cmbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo reclamo", "Estado reclamo", "DUI", "Nombre" }));
        cmbFiltro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbFiltroMouseClicked(evt);
            }
        });
        jPanel1.add(cmbFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 130, 30));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setText(bundle.getString("CasosDepto.jLabel11.text")); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, 30));

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1100, 50));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_get_help_120px.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        btnActualizar.setBackground(new java.awt.Color(51, 51, 51));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_edit_property_27px.png"))); // NOI18N
        btnActualizar.setText(bundle.getString("CasosDepto.btnActualizar.text")); // NOI18N
        btnActualizar.setColorHover(new java.awt.Color(183, 219, 243));
        btnActualizar.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnActualizar.setIconTextGap(15);
        btnActualizar.setMargin(new java.awt.Insets(4, 4, 4, 4));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 180, 40));

        btnLimpiar.setBackground(new java.awt.Color(51, 51, 51));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_refresh_25px_1.png"))); // NOI18N
        btnLimpiar.setText(bundle.getString("CasosDepto.btnLimpiar.text")); // NOI18N
        btnLimpiar.setAutoscrolls(true);
        btnLimpiar.setColorHover(new java.awt.Color(219, 225, 225));
        btnLimpiar.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLimpiar.setIconTextGap(15);
        btnLimpiar.setMargin(new java.awt.Insets(4, 4, 4, 4));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 180, 40));

        btnEliminar.setBackground(new java.awt.Color(51, 51, 51));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_delete_database_25px_1.png"))); // NOI18N
        btnEliminar.setText(bundle.getString("CasosDepto.btnEliminar.text")); // NOI18N
        btnEliminar.setColorHover(new java.awt.Color(248, 193, 186));
        btnEliminar.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnEliminar.setIconTextGap(15);
        btnEliminar.setMargin(new java.awt.Insets(4, 4, 4, 4));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 180, 40));

        btnAgregar.setBackground(new java.awt.Color(51, 51, 51));
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_add_database_25px.png"))); // NOI18N
        btnAgregar.setText(bundle.getString("CasosDepto.btnAgregar.text")); // NOI18N
        btnAgregar.setColorHover(new java.awt.Color(181, 238, 205));
        btnAgregar.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAgregar.setIconTextGap(15);
        btnAgregar.setMargin(new java.awt.Insets(4, 4, 4, 4));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 180, 40));

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 200, 500));

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseEntered(evt);
            }
        });

        jTReclamos.setForeground(new java.awt.Color(64, 126, 130));
        jTReclamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nº Reclamo", "DUI", "Descripción", "Tipo Reclamo", "Fecha", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTReclamos.setGridColor(new java.awt.Color(74, 151, 156));
        jTReclamos.setSelectionBackground(new java.awt.Color(74, 151, 156));
        jTReclamos.getTableHeader().setReorderingAllowed(false);
        jTReclamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTReclamosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTReclamosMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jTReclamos);
        if (jTReclamos.getColumnModel().getColumnCount() > 0) {
            jTReclamos.getColumnModel().getColumn(0).setHeaderValue(bundle.getString("CasosDepto.jTReclamos.columnModel.title0")); // NOI18N
            jTReclamos.getColumnModel().getColumn(1).setResizable(false);
            jTReclamos.getColumnModel().getColumn(1).setHeaderValue(bundle.getString("CasosDepto.jTReclamos.columnModel.title1_1")); // NOI18N
            jTReclamos.getColumnModel().getColumn(2).setHeaderValue(bundle.getString("CasosDepto.jTReclamos.columnModel.title2_1")); // NOI18N
            jTReclamos.getColumnModel().getColumn(3).setHeaderValue(bundle.getString("CasosDepto.jTReclamos.columnModel.title3_1")); // NOI18N
            jTReclamos.getColumnModel().getColumn(4).setHeaderValue(bundle.getString("CasosDepto.jTReclamos.columnModel.title4")); // NOI18N
            jTReclamos.getColumnModel().getColumn(5).setHeaderValue(bundle.getString("CasosDepto.jTReclamos.columnModel.title5")); // NOI18N
        }

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 890, 300));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setText(bundle.getString("CasosDepto.jLabel2.text")); // NOI18N
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setText(bundle.getString("CasosDepto.jLabel3.text")); // NOI18N
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtReclamo.setEditable(false);
        txtReclamo.setBackground(new java.awt.Color(227, 227, 227));
        txtReclamo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtReclamo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtReclamo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.add(txtReclamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 50, 90, 30));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setText(bundle.getString("CasosDepto.jLabel12.text")); // NOI18N
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        cmbTipo.setMaximumRowCount(12);
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Telefónico", "Falla Técnica", "Mal Servicio", "Imcumplimiento de servicio", "Perdida de servicio", "Otro" }));
        cmbTipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoActionPerformed(evt);
            }
        });
        jPanel3.add(cmbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 175, 30));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setText(bundle.getString("CasosDepto.jLabel10.text")); // NOI18N
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setText(bundle.getString("CasosDepto.jLabel7.text")); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setText(bundle.getString("CasosDepto.jLabel13.text")); // NOI18N
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, 110, -1));

        cmbDepto.setMaximumRowCount(12);
        cmbDepto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contabilidad", "Finaciero", "Soporte" }));
        cmbDepto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbDepto.setEnabled(false);
        jPanel3.add(cmbDepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, 120, 30));

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "En proceso", "Finalizado", "Inhabilitado" }));
        cmbEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(cmbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 140, 125, 30));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel14.setText(bundle.getString("CasosDepto.jLabel14.text")); // NOI18N
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText(bundle.getString("CasosDepto.jLabel5.text")); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        txtFecha.setEditable(false);
        txtFecha.setBackground(new java.awt.Color(227, 227, 227));
        txtFecha.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFecha.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtFecha.setMargin(new java.awt.Insets(2, 6, 2, 3));
        jPanel3.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 114, 30));

        txtDescripcion.setBackground(new java.awt.Color(227, 227, 227));
        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setRows(5);
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });
        jPanel3.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 340, 120));

        txtDui.setEditable(false);
        txtDui.setBackground(new java.awt.Color(227, 227, 227));
        txtDui.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        try {
            txtDui.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDui.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(txtDui, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 120, 30));

        rsDate.setColorBackground(new java.awt.Color(2, 56, 89));
        rsDate.setColorButtonHover(new java.awt.Color(153, 153, 153));
        rsDate.setColorForeground(new java.awt.Color(0, 0, 0));
        rsDate.setPreferredSize(new java.awt.Dimension(140, 27));
        jPanel3.add(rsDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 150, 30));
        rsDate.getAccessibleContext().setAccessibleDescription(bundle.getString("CasosDepto.rsDate.AccessibleContext.accessibleDescription")); // NOI18N

        btnCliente.setBackground(new java.awt.Color(51, 41, 225));
        btnCliente.setForeground(new java.awt.Color(0, 0, 0));
        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_add_20px.png"))); // NOI18N
        btnCliente.setText(bundle.getString("CasosDepto.btnCliente.text")); // NOI18N
        btnCliente.setColorHover(new java.awt.Color(74, 151, 156));
        btnCliente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCliente.setIconTextGap(15);
        btnCliente.setMargin(new java.awt.Insets(4, 4, 4, 4));
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });
        jPanel3.add(btnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 210, 30));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel16.setText(bundle.getString("CasosDepto.jLabel16.text")); // NOI18N
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, -1, -1));

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 890, 190));

        jMenu1.setText(bundle.getString("CasosDepto.jMenu1.text")); // NOI18N

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_cancel_20px.png"))); // NOI18N
        jMenuItem2.setText(bundle.getString("CasosDepto.jMenuItem2.text")); // NOI18N
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText(bundle.getString("CasosDepto.jMenu2.text")); // NOI18N
        jMenuBar1.add(jMenu2);

        jMenu3.setText(bundle.getString("CasosDepto.jMenu3.text")); // NOI18N

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_whatsapp_20px_1.png"))); // NOI18N
        jMenuItem3.setText(bundle.getString("CasosDepto.jMenuItem3.text")); // NOI18N
        jMenu3.add(jMenuItem3);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_computer_support_20px.png"))); // NOI18N
        jMenuItem1.setText(bundle.getString("CasosDepto.jMenuItem1.text")); // NOI18N
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1118, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que quiere salir del Formulario?");
        if (JOptionPane.OK_OPTION == resp) {
            this.dispose();
        } else if (JOptionPane.NO_OPTION == resp) {

        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jTReclamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTReclamosMouseClicked
        if (jTReclamos.getSelectedRowCount()>0) {
            int fila = jTReclamos.getSelectedRow();
//            MostrarDatos();
//            int id = Integer.parseInt(jTReclamos.getValueAt(fila, 0).toString());// Esta forma funciona cuando en la tabla se muestra el id también
//            MtoProyecto obj = new MtoProyecto();
//            obj.consultarReclamo(id);
            rsDate.setDatoFecha(null);
            txtReclamo.setText(jTReclamos.getValueAt(fila, 0).toString());
            txtDui.setText(jTReclamos.getValueAt(fila, 1).toString());
            txtDescripcion.setText(jTReclamos.getValueAt(fila, 2).toString());
            cmbTipo.setSelectedItem(jTReclamos.getValueAt(fila, 3).toString());
            txtFecha.setText(jTReclamos.getValueAt(fila, 4).toString());
            cmbEstado.setSelectedItem(jTReclamos.getValueAt(fila, 5).toString());
            
            btnAgregar.setEnabled(false);
            btnActualizar.setEnabled(true);
            btnEliminar.setEnabled(true);
        }
    }//GEN-LAST:event_jTReclamosMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        MtoLogin client = new MtoLogin();
        if (txtDescripcion.getText().isEmpty() || txtDui.getText().equals("        - ") || txtFecha.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos.");
        }else if(client.getNum() == 0){
            JOptionPane.showMessageDialog(null, "No es un cliente.");
        }else if(txtDescripcion.getText().length() >= 800){
            JOptionPane.showMessageDialog(null, "Ha sobrepasado el número límite de caracteres permitidos en la descripción. \nPor favor reduzca su respuesta.","Límite sobrepasado, error.", 0);
        }else{
            String fechaActual = new SimpleDateFormat("yyyy/MM/dd").format(Calendar.getInstance().getTime());
            
            MtoProyecto obj = new MtoProyecto();
            obj.setDui(client.getDUI());
            obj.setTelefono(client.getNum());
            obj.setTipoReclamo(String.valueOf(cmbTipo.getSelectedItem()));
            obj.setDescripcion(txtDescripcion.getText());
            obj.setFecha(fechaActual);
            
            int tipo = cmbTipo.getSelectedIndex();
            String depto = cmbDepto.getItemAt(tipo);
            obj.setDeptoE(depto);
            
            if (obj.guadarReclamo()) {
                JOptionPane.showMessageDialog(this, "Datos guardados exitosamente");
                LimpiarCampos();
            }
            else{
                JOptionPane.showMessageDialog(this, "Ha alcazado el limite de reclamos permitidos, en este periodo de tiempo. \n"
                        + "Por favor intente de nuevo dentro de 24hrs o espere a que se completen los reclamos activos actualmente.", "Error de reclamo", 0);
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        LimpiarCampos();
//        if (!Expo.tipoU.equals("Operador")) {
//            btnAgregar.setEnabled(true);;
//        }
        MostrarDatos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (txtDescripcion.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Todos los campos deben de estar llenos");
        }else if(txtDescripcion.getText().length() >= 800){
            JOptionPane.showMessageDialog(null, "Ha sobrepasado el número límite de caracteres permitidos en la descripción. \nPor favor reduzca su respuesta.","Límite sobrepasado, error.", 0);
        }else{
            MtoProyecto obj = new MtoProyecto();
            obj.setIdReclamo(Integer.parseInt(txtReclamo.getText()));
            obj.setDui(txtDui.getText());
            obj.setTipoReclamo(String.valueOf(cmbTipo.getSelectedItem()));
            obj.setDescripcion(txtDescripcion.getText());
            obj.setFecha(txtFecha.getText());
            
            int tipo = cmbTipo.getSelectedIndex();
            String depto = cmbDepto.getItemAt(tipo);
            obj.setDeptoE(depto);
            
            obj.setEstado(String.valueOf(cmbEstado.getSelectedItem()));

            if (obj.actualizarReclamo()) {
                JOptionPane.showMessageDialog(this, "Datos actualizados exitosamente");
                LimpiarCampos();
//                if (!Expo.tipoU.equals("Operador")) {
//                    btnAgregar.setEnabled(true);
//                }
                MostrarDatos();
            } else {
                JOptionPane.showMessageDialog(this, "Error al subir los datos");
            }
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //enviando la información a la clase
        MtoProyecto obj = new MtoProyecto();
        //confirmando que quiere eliminar
        int inhabilitar = JOptionPane.showConfirmDialog(this, "Está seguro que desea inhabilitar?", "Atencion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (inhabilitar == 0) {
            //enviando el registro a inhabilitar en SQLServer
            obj.setIdReclamo(Integer.parseInt(txtReclamo.getText()));
            obj.setDui(txtDui.getText());
            obj.setTipoReclamo(String.valueOf(cmbTipo.getSelectedItem()));
            obj.setDescripcion(txtDescripcion.getText());
            obj.setFecha(txtFecha.getText());
            
            int tipo = cmbTipo.getSelectedIndex();
            String depto = cmbDepto.getItemAt(tipo);
            obj.setDeptoE(depto);
            
            obj.setEstado("Inhabilitado");

            if (obj.actualizarReclamo()) {
                JOptionPane.showMessageDialog(this, "Datos actualizados exitosamente");
                LimpiarCampos();
                MostrarDatos();
            } else {
                JOptionPane.showMessageDialog(this, "Error al subir los datos");
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
        MtoProyecto obj = new MtoProyecto();
        if (Expo.tipoU.equals("Operador")) {
            obj.Buscar(txtBusqueda.getText(), String.valueOf(cmbFiltro.getSelectedItem()), jTReclamos, "Inhabilitado", "Completado", "AND idDeptoEmpresa = " + String.valueOf(Expo.idDepto));
            jTReclamos.getTableHeader().getColumnModel().getColumn(3).setMinWidth(0);
            jTReclamos.getColumnModel().getColumn(3).setMaxWidth(0);
        }else{
            obj.Buscar(txtBusqueda.getText(), String.valueOf(cmbFiltro.getSelectedItem()), jTReclamos, "''", "''", "");
        }
    }//GEN-LAST:event_txtBusquedaKeyReleased

    private void cmbFiltroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbFiltroMouseClicked
        MostrarDatos();
        txtBusqueda.setText(null);
    }//GEN-LAST:event_cmbFiltroMouseClicked

    private void jTReclamosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTReclamosMouseEntered
        if (rsDate.getDatoFecha() != null) {
            String formatoFecha = "yyyy-MM-dd";
            Date fecha = rsDate.getDatoFecha();
            SimpleDateFormat obj = new SimpleDateFormat(formatoFecha);
            txtFecha.setText(obj.format(fecha));

        }
    }//GEN-LAST:event_jTReclamosMouseEntered

    private void jScrollPane1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseEntered
        if (rsDate.getDatoFecha() != null) {
            String formatoFecha = "yyyy-MM-dd";
            Date fecha = rsDate.getDatoFecha();
            SimpleDateFormat obj = new SimpleDateFormat(formatoFecha);
            txtFecha.setText(obj.format(fecha));

        }
    }//GEN-LAST:event_jScrollPane1MouseEntered

    private void cmbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        consulta.ConsultaTabla("SELECT dc.DUI, dc.numCliente, dc.nombreCliente, dc.direccion FROM dboCliente dc, dboEstadoUsuario de where dc.idEstadoUsuario = de.idEstadoUsuario AND NOT de.estadoUsuario = 'Inhabilitado';", jTClientes);
        jPanel4.setVisible(true);
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jScrollPane1.setVisible(false);
    }//GEN-LAST:event_btnClienteActionPerformed

    private void jTClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTClientesMouseClicked
       if (jTClientes.getSelectedRowCount()>0) {
            int fila = jTClientes.getSelectedRow();
            txtDui.setText(jTClientes.getValueAt(fila, 0).toString());
            jPanel4.setVisible(false);
            jPanel2.setVisible(true);
            jPanel3.setVisible(true);
            jScrollPane1.setVisible(true);
        }
    }//GEN-LAST:event_jTClientesMouseClicked

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        jPanel4.setVisible(false);
        jPanel2.setVisible(true);
        jPanel3.setVisible(true);
        jScrollPane1.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtDUIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDUIKeyReleased
        consulta.ConsultaTabla("SELECT dc.DUI, dc.numCliente, dc.nombreCliente, dc.direccion FROM dboCliente dc, dboEstadoUsuario de where dc.idEstadoUsuario = de.idEstadoUsuario AND NOT de.estadoUsuario = 'Inhabilitado' AND dc.DUI LIKE '%"+txtDUI.getText()+"%';", jTClientes);
    }//GEN-LAST:event_txtDUIKeyReleased

    private void txtDUIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDUIKeyTyped
        Validaciones.SoloNumerosConGuion(evt, txtDUI);
    }//GEN-LAST:event_txtDUIKeyTyped

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped
        if (txtDescripcion.getText().length() >= 800){ 
         evt.consume(); 
        } 
    }//GEN-LAST:event_txtDescripcionKeyTyped

    public int LimpiarCampos() {
        txtDescripcion.setText(null);
        txtFecha.setText(null);
        rsDate.setDatoFecha(null);
        txtReclamo.setText(null);
        txtDui.setText(null);
        txtBusqueda.setText(null);
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        return 0;
    }

    public void MostrarDatos() {
        MtoProyecto obj = new MtoProyecto();
        if (Expo.tipoU.equals("Operador")) {
            obj.mostrarDatos(jTReclamos, "SELECT idReclamo, dc.DUI, descripcion, dt.tipoReclamo, fecha, er.estadoReclamo from dboCliente dc, dboReclamo r, dboTipoReclamo dt, dboEstadoReclamo er where r.idEstadoReclamo = er.idEstadoReclamo AND r.idCliente = dc.idCliente AND r.idTipoReclamo = dt.idTipoReclamo AND NOT er.estadoReclamo = 'Inhabilitado' AND NOT er.estadoReclamo = 'Completado' AND idDeptoEmpresa = " + String.valueOf(Expo.idDepto));
            jTReclamos.getTableHeader().getColumnModel().getColumn(3).setMinWidth(0);
            jTReclamos.getColumnModel().getColumn(3).setMaxWidth(0);
        }else{
            obj.mostrarDatos(jTReclamos, "SELECT idReclamo, dc.DUI, descripcion, dt.tipoReclamo, fecha, er.estadoReclamo from dboCliente dc, dboReclamo r, dboTipoReclamo dt, dboEstadoReclamo er where r.idEstadoReclamo = er.idEstadoReclamo AND r.idCliente = dc.idCliente AND r.idTipoReclamo = dt.idTipoReclamo;");
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel * /
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CasosDepto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover btnActualizar;
    private rojeru_san.complementos.RSButtonHover btnAgregar;
    private rojeru_san.complementos.RSButtonHover btnCliente;
    private rojeru_san.complementos.RSButtonHover btnEliminar;
    private rojeru_san.complementos.RSButtonHover btnLimpiar;
    private rojeru_san.complementos.RSButtonHover btnRegresar;
    private javax.swing.JComboBox<String> cmbDepto;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbFiltro;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTClientes;
    private javax.swing.JTable jTReclamos;
    private rojeru_san.componentes.RSDateChooser rsDate;
    private app.bolivia.swing.JCTextField txtBusqueda;
    private javax.swing.JTextField txtDUI;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JFormattedTextField txtDui;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtReclamo;
    // End of variables declaration//GEN-END:variables
}
