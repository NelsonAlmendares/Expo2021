/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controlador.*;
import static Main.Expo.tipoU;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Vector;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JOptionPane;

/**
 *
 * @author Mery Chavez Pacifico
 */
public class Consultas extends javax.swing.JInternalFrame {

    Locale locale;
     MtoConsultar consulta = new MtoConsultar();
     MtoLogin log = new MtoLogin();
    /**
     * Creates new form Consultas
     */
    public Consultas() {
        initComponents();
        cargarDatos();
        if (Expo.Idioma.equals("English")) {
           locale = new Locale("en","US");
           Internacionalizacion();
        }
        else{
           locale = new Locale("es","ES");
           Internacionalizacion();

        }
        jLabel3.setVisible(false);
        txt1.setVisible(false);
        jLabel7.setVisible(false);
        txtId.setVisible(false);
        
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        JTableConsultas.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        JTableConsultas.getColumnModel().getColumn(0).setMaxWidth(0);
        
        JTableConsultas.getTableHeader().getColumnModel().getColumn(2).setMinWidth(0);
        JTableConsultas.getColumnModel().getColumn(2).setMaxWidth(0);
        
        tipoUsuario();
//        UI(new java.awt.Color(169,176,190));
        if (Expo.darkMode == 1) {
            darkMood();
        }
    }
    public void darkMood(){
        jPanel4.setBackground(new java.awt.Color(9, 12, 16)); //Fondo
        CustomizeMenu.customizeMenuBar(jMenuBar1);
        jPanel1.setBackground(new java.awt.Color(22, 27, 34)); //Panel de arriba
        jPanel2.setBackground(new java.awt.Color(13, 17, 23)); //Panel principal
        jPanel3.setBackground(new java.awt.Color(22, 27, 34)); //Panel secundario o  lateral
        txt1.setBackground(new java.awt.Color(13, 17, 23));
        txtConsulta.setBackground(new java.awt.Color(22, 27, 34)); // TextBox
        txtNombre.setBackground(new java.awt.Color(22, 27, 34));
        btnEliminarTodo.setBackground(new java.awt.Color(22, 27, 34));
        btnRefrescar.setBackground(new java.awt.Color(22, 27, 34));
        JTableConsultas.setGridColor(new java.awt.Color(2,103,255));
//        JTableConsultas.setShowHorizontalLines(true);
//        JTableConsultas.setShowVerticalLines(true);
    } 
    
     private void Internacionalizacion(){
        ResourceBundle bundle = ResourceBundle.getBundle("Res/Bundle", locale);
        this.setTitle(bundle.getString("Consultas.title"));
        jMenu3.setText(bundle.getString("Consultas.jMenu3.text"));
        jMenuItem3.setText(bundle.getString("Consultas.jMenuItem3.text"));
        jMenuItem1.setText(bundle.getString("Consultas.jMenuItem1.text"));
        jLabel2.setText(bundle.getString("Consultas.jLabel2.text"));
        jLabel11.setText(bundle.getString("Consultas.jLabel11.text"));
        jMenu1.setText(bundle.getString("Consultas.jMenu1.text"));
        jMenuItem2.setText(bundle.getString("Consultas.jMenuItem2.text"));
        jLabel4.setText(bundle.getString("Consultas.jLabel4.text"));
        jLabel9.setText(bundle.getString("Consultas.jLabel9.text"));
        jLabel6.setText(bundle.getString("Consultas.jLabel6.text"));
        jLabel8.setText(bundle.getString("Consultas.jLabel8.text"));
        btnAgregar.setText(bundle.getString("Consultas.btnAgregar.text"));
        btnEliminar.setText(bundle.getString("Consultas.btnEliminar.text"));
        jLabel10.setText(bundle.getString("Consultas.jLabel10.text"));
        jLabel7.setText(bundle.getString("Consultas.jLabel7.text"));
    }
    
    static ResultSet res;
    private void cargarDatos() {
        String dui = log.getDUI();
        if (tipoU.equals("Cliente")) {
            consulta.ConsultaTabla("SELECT c.idConsulta, c.consulta,cl.nombreCliente,cl.DUI, tc.tipoConsulta FROM dboConsulta c, dboTipoConsulta tc, dboCliente cl where c.idCliente = cl.idCliente and  c.idTipoConsulta = tc.idTipoConsulta AND c.idCliente = (SELECT idCliente FROM dboCliente WHERE DUI = '" + dui + "');", JTableConsultas);
        } else {
            consulta.ConsultaTabla("SELECT c.idConsulta, c.consulta,cl.nombreCliente,cl.DUI, tc.tipoConsulta FROM dboConsulta c, dboTipoConsulta tc, dboCliente cl where c.idCliente = cl.idCliente and  c.idTipoConsulta = tc.idTipoConsulta;", JTableConsultas);
        }
        cargarComboBoxTipo();
    }
    
    public void cargarComboBoxTipo(){
            cmbTipoConsulta.removeAllItems();           
            res = Controlador.MtoConsultas.Consulta("SELECT * FROM dboTipoConsulta");

            try{
                while(res.next()){
                    Vector v = new Vector();
                    v.addElement(res.getString(2));
                    cmbTipoConsulta.addItem(String.valueOf(v.elementAt(0)));
                }
            }catch(SQLException e){

                        }
        }
    public String datosComboTipo(){
        res = Controlador.MtoConsultas.Consulta("SELECT * FROM dboTipoConsulta");
        String str = "";
        try{
            while(res.next()){
                Vector v = new Vector();
                v.addElement(res.getInt(1));
                v.addElement(res.getString(2));
                if(String.valueOf(cmbTipoConsulta.getSelectedItem()).equals(String.valueOf(v.elementAt(1)))){
                    str = String.valueOf(v.elementAt(0));
                }
            }
        }catch(SQLException e){
                     
                    }
        return str;
    }


    private void tipoUsuario(){
        if (tipoU.equals("Cliente")) {
             btnEliminarTodo.setVisible(false); 
             jLabel10.setVisible(false);
             txtNombre.setVisible(false);
        }else{
            btnAgregar.setVisible(false);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt1 = new app.bolivia.swing.JCTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbTipoConsulta = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtConsulta = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        btnAgregar = new rojeru_san.complementos.RSButtonHover();
        btnEliminar = new rojeru_san.complementos.RSButtonHover();
        jLabel9 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnRefrescar = new rojeru_san.complementos.RSButtonHover();
        btnEliminarTodo = new rojeru_san.complementos.RSButtonHover();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTableConsultas = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Res/Bundle"); // NOI18N
        setTitle(bundle.getString("Consultas.title")); // NOI18N

        jPanel4.setBackground(new java.awt.Color(220, 220, 220));
        jPanel4.setAutoscrolls(true);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setText(bundle.getString("Consultas.jLabel2.text")); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel1.setText(bundle.getString("Consultas.jLabel1.text")); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(730, 40));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_search_25px.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        txt1.setBackground(new java.awt.Color(227, 227, 227));
        txt1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 360, 30));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1100, 50));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText(bundle.getString("Consultas.jLabel4.text")); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 550, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText(bundle.getString("Consultas.jLabel6.text")); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 30));

        cmbTipoConsulta.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cmbTipoConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbTipoConsulta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(cmbTipoConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 160, 34));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setText(bundle.getString("Consultas.jLabel7.text")); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, -1, 30));

        txtId.setBackground(new java.awt.Color(227, 227, 227));
        txtId.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtId.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, 90, 30));

        txtConsulta.setBackground(new java.awt.Color(227, 227, 227));
        txtConsulta.setColumns(20);
        txtConsulta.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtConsulta.setLineWrap(true);
        txtConsulta.setRows(5);
        txtConsulta.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(txtConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 680, 220));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setText(bundle.getString("Consultas.jLabel8.text")); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        btnAgregar.setBackground(new java.awt.Color(51, 51, 51));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_add_database_25px.png"))); // NOI18N
        btnAgregar.setText(bundle.getString("Consultas.btnAgregar.text")); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 170, -1));

        btnEliminar.setBackground(new java.awt.Color(51, 51, 51));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_delete_database_25px_1.png"))); // NOI18N
        btnEliminar.setText(bundle.getString("Consultas.btnEliminar.text")); // NOI18N
        btnEliminar.setColorHover(new java.awt.Color(255, 102, 102));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 170, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel9.setText(bundle.getString("Consultas.jLabel9.text")); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 540, -1));

        txtNombre.setBackground(new java.awt.Color(227, 227, 227));
        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 310, 30));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setText(bundle.getString("Consultas.jLabel10.text")); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, 30));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/consulta.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 120));

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 720, 530));

        jPanel3.setBackground(new java.awt.Color(240, 241, 240));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRefrescar.setBackground(new java.awt.Color(240, 240, 240));
        btnRefrescar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_refresh_25px_1.png"))); // NOI18N
        btnRefrescar.setColorHover(new java.awt.Color(240, 240, 240));
        btnRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrescarActionPerformed(evt);
            }
        });
        jPanel3.add(btnRefrescar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 40, 40));

        btnEliminarTodo.setBackground(new java.awt.Color(240, 240, 240));
        btnEliminarTodo.setBorder(null);
        btnEliminarTodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_delete_database_25px_1.png"))); // NOI18N
        btnEliminarTodo.setColorHover(new java.awt.Color(240, 240, 240));
        btnEliminarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTodoActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 40, -1));

        JTableConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "idConsulta", "Consulta", "Nombre Cliente", "DUI", "Tipo Consulta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTableConsultas.getTableHeader().setReorderingAllowed(false);
        JTableConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableConsultasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(JTableConsultas);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 360, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel11.setText(bundle.getString("Consultas.jLabel11.text")); // NOI18N
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, 380, 530));

        jMenu2.setText(bundle.getString("Consultas.jMenu2.text")); // NOI18N

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_cancel_20px.png"))); // NOI18N
        jMenuItem1.setText(bundle.getString("Consultas.jMenuItem1.text")); // NOI18N
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu1.setText(bundle.getString("Consultas.jMenu1.text")); // NOI18N
        jMenuBar1.add(jMenu1);

        jMenu3.setText(bundle.getString("Consultas.jMenu3.text")); // NOI18N

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_whatsapp_20px_1.png"))); // NOI18N
        jMenuItem2.setText(bundle.getString("Consultas.jMenuItem2.text")); // NOI18N
        jMenu3.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_computer_support_20px.png"))); // NOI18N
        jMenuItem3.setText(bundle.getString("Consultas.jMenuItem3.text")); // NOI18N
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1163, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
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
        MtoLogin client = new MtoLogin();
        if (txtConsulta.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos.", "Campos vacíos.", 1);
        }else if(txtConsulta.getText().length() >= 500){
            JOptionPane.showMessageDialog(null, "Ha excedido el limite de carácteres permitidos");
        }{
            MtoConsultas obj = new MtoConsultas();
            obj.setDui(client.getDUI());
            obj.setConsulta(txtConsulta.getText());
            obj.setIdTipo(Integer.parseInt(datosComboTipo()));
            String fechaActual = new SimpleDateFormat("yyyy/MM/dd").format(Calendar.getInstance().getTime());
            obj.setFecha(fechaActual);
           
            
            if (obj.agregarConsulta()) {
                JOptionPane.showMessageDialog(this, "Datos guardados exitosamente");
            }
            else{
                JOptionPane.showMessageDialog(this, "Error al subir los datos");
            }
        }
        cargarDatos();
    }//GEN-LAST:event_btnAgregarActionPerformed
    
     private void limpiarDatos(){
        txtId.setText(null);
        txtConsulta.setText(null);
        txtNombre.setText(null);
    }
    private void btnRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescarActionPerformed
        limpiarDatos();
        btnAgregar.setEnabled(true);
        cargarDatos();
    }//GEN-LAST:event_btnRefrescarActionPerformed

    private void btnEliminarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTodoActionPerformed
        MtoConsultas obj = new MtoConsultas();
        int eliminar = JOptionPane.showConfirmDialog(this, "Está seguro que desea eliminar todas las consultas?", "Atencion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(eliminar==0){
            
            if(obj.eliminarTConsulta()){
                JOptionPane.showMessageDialog(this, "Consultas eliminadas");
            }else{
                JOptionPane.showMessageDialog(this, "Error al eliminar");
            }
        }
    
        cargarDatos();
    }//GEN-LAST:event_btnEliminarTodoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
            MtoConsultas obj = new MtoConsultas();
            
        if (JTableConsultas.getSelectedRowCount()>0) {
            obj.setIdConsulta(Integer.parseInt(txtId.getText()));
            int eliminar = JOptionPane.showConfirmDialog(this, "Está seguro que desea eliminar?", "Atencion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
            if(eliminar==0){

                if(obj.eliminarConsulta()){
                    JOptionPane.showMessageDialog(this, "Consulta eliminada");
                }else{
                    JOptionPane.showMessageDialog(this, "Error al eliminar");
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una consulta primero.");
        }
            
            
    
        cargarDatos();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void JTableConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableConsultasMouseClicked
        if (JTableConsultas.getSelectedRowCount()>0) {
            
            txtId.setText(JTableConsultas.getValueAt(JTableConsultas.getSelectedRow(), 0).toString());
            txtConsulta.setText(JTableConsultas.getValueAt(JTableConsultas.getSelectedRow(), 1).toString());
            txtNombre.setText(JTableConsultas.getValueAt(JTableConsultas.getSelectedRow(), 2).toString());
            String value = JTableConsultas.getValueAt(JTableConsultas.getSelectedRow(), 4).toString();
            cmbTipoConsulta.setSelectedItem(value);
            
            btnAgregar.setEnabled(false);
            btnEliminarTodo.setEnabled(true);
        //    btnInhabilitar.setEnabled(true);
        }
    }//GEN-LAST:event_JTableConsultasMouseClicked
    
   
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableConsultas;
    private rojeru_san.complementos.RSButtonHover btnAgregar;
    private rojeru_san.complementos.RSButtonHover btnEliminar;
    private rojeru_san.complementos.RSButtonHover btnEliminarTodo;
    private rojeru_san.complementos.RSButtonHover btnRefrescar;
    private javax.swing.JComboBox<String> cmbTipoConsulta;
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
    private javax.swing.JScrollPane jScrollPane2;
    private app.bolivia.swing.JCTextField txt1;
    private javax.swing.JTextArea txtConsulta;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
