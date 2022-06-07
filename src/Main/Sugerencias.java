package Main;

import Controlador.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import static Main.Expo.tipoU;
import javax.swing.JOptionPane;
import java.util.Locale;
import java.util.ResourceBundle; 
import java.util.Vector;

/* @author nelson */
public class Sugerencias extends javax.swing.JInternalFrame {

    /**
     * Creates new form EnviarCorreos
     */
    MtoConsultar consulta = new MtoConsultar();
    Locale locale;
    int id;
    int idCliente;
    String Sugerencia;
    MtoLogin log = new MtoLogin();
    public Sugerencias() {
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
        this.setSize(1120,655);
        cargarDatosA();
        if (Expo.darkMode == 1) {
            darkMood();
        }
    }
    
    public void darkMood(){
        jPanel1.setBackground(new java.awt.Color(9, 12, 16)); //Fondo
        CustomizeMenu.customizeMenuBar(jMenuBar1);
        jPanel2.setBackground(new java.awt.Color(22, 27, 34)); //Panel de arriba
        jPanel3.setBackground(new java.awt.Color(13, 17, 23)); //Panel principal
        jPanel4.setBackground(new java.awt.Color(22, 27, 34));
        txtMensaje.setBackground(new java.awt.Color(22, 27, 34)); // TextBox
        txtNombre.setBackground(new java.awt.Color(22, 27, 34));
        btnEliminarTodo.setBackground(new java.awt.Color(22, 27, 34));
        jLblRefresh.setBackground(new java.awt.Color(22, 27, 34));
        jTableSugerencia.setGridColor(new java.awt.Color(2,103,255));
    } 
    
    private void Internacionalizacion(){
        ResourceBundle bundle = ResourceBundle.getBundle("Res/Bundle", locale);
        jMenu4.setText(bundle.getString("Sugerencias.jMenu4.text"));
        jMenuItem6.setText(bundle.getString("Sugerencias.jMenuItem6.text"));
        jLabel2.setText(bundle.getString("Sugerencias.jLabel2.text"));
        jMenu5.setText(bundle.getString("Sugerencias.jMenu5.text"));
        jMenu6.setText(bundle.getString("Sugerencias.jMenu6.text"));
        jLabel1.setText(bundle.getString("Sugerencias.jLabel1.text"));
        jLabel7.setText(bundle.getString("Sugerencias.jLabel7.text"));
        jChboxAnonimo.setText(bundle.getString("Sugerencias.jChboxAnonimo.text"));
        jLabel8.setText(bundle.getString("Sugerencias.jLabel8.text"));
        btnEnviar.setText(bundle.getString("Sugerencias.btnEnviar.text"));
        JBtnLimpiar.setText(bundle.getString("Sugerencias.JBtnLimpiar.text"));
        jLabel12.setText(bundle.getString("Sugerencias.jLabel12.text"));
        jLabel6.setText(bundle.getString("Sugerencias.jLabel6.text"));
    }
    
    public void cargarDatosA(){
        String dui = log.getDUI();
        if (tipoU.equals("Cliente")) {
             consulta.ConsultaTabla("SELECT idSugerencia,sugerencia FROM dboSugerencia WHERE idCliente = (SELECT idCliente FROM dboCliente WHERE DUI = '" + dui +"');", jTableSugerencia);
        }else{
            consulta.ConsultaTabla("SELECT idSugerencia,sugerencia FROM dboSugerencia", jTableSugerencia);
        }
        
        if (tipoU.equals("Cliente")) {
             btnEliminarTodo.setVisible(false); 
             jLabel12.setVisible(false);
             txtNombre.setVisible(false);
        }else{
            btnEnviar.setVisible(false);
        }
    }
    
    static ResultSet res;
    public void cargarNombre(){
            res = Controlador.MtoConsultar.Consulta("SELECT nombreCliente FROM dboCliente WHERE idCliente = (SELECT idCliente FROM dboSugerencia WHERE idSugerencia = "+id+")");

            try{
                while(res.next()){
                    Vector v = new Vector();
                    v.addElement(res.getString(1));
                    txtNombre.setText(String.valueOf(v.elementAt(0)));
                }
            }catch(SQLException e){

                        }
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMensaje = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableSugerencia = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btnEliminarTodo = new javax.swing.JLabel();
        jLblRefresh = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnEnviar = new rojeru_san.complementos.RSButtonHover();
        JBtnLimpiar = new rojeru_san.complementos.RSButtonHover();
        jLblContador = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jChboxAnonimo = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jPanel1.setBackground(new java.awt.Color(220, 220, 220));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1100, 50));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Res/Bundle"); // NOI18N
        jLabel1.setText(bundle.getString("Sugerencias.jLabel1.text")); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 550, 40));

        txtMensaje.setBackground(new java.awt.Color(227, 227, 227));
        txtMensaje.setColumns(20);
        txtMensaje.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtMensaje.setLineWrap(true);
        txtMensaje.setRows(5);
        txtMensaje.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        txtMensaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMensajeKeyTyped(evt);
            }
        });
        jPanel3.add(txtMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 710, 220));

        jPanel4.setBackground(new java.awt.Color(240, 241, 240));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableSugerencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID Sugerencia", "Sugerencia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableSugerencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableSugerenciaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableSugerencia);
        if (jTableSugerencia.getColumnModel().getColumnCount() > 0) {
            jTableSugerencia.getColumnModel().getColumn(0).setHeaderValue(bundle.getString("Sugerencias.jTableSugerencia.columnModel.title0")); // NOI18N
            jTableSugerencia.getColumnModel().getColumn(1).setHeaderValue(bundle.getString("Sugerencias.jTableSugerencia.columnModel.title1")); // NOI18N
        }

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 330, 450));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel6.setText(bundle.getString("Sugerencias.jLabel6.text")); // NOI18N
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        btnEliminarTodo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEliminarTodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_delete_database_25px_1.png"))); // NOI18N
        btnEliminarTodo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarTodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarTodoMouseClicked(evt);
            }
        });
        jPanel4.add(btnEliminarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 40, 40));

        jLblRefresh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_refresh_25px_1.png"))); // NOI18N
        jLblRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLblRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblRefreshMouseClicked(evt);
            }
        });
        jPanel4.add(jLblRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 40, 40));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 350, 530));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText(bundle.getString("Sugerencias.jLabel7.text")); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel8.setText(bundle.getString("Sugerencias.jLabel8.text")); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        btnEnviar.setBackground(new java.awt.Color(51, 51, 51));
        btnEnviar.setForeground(new java.awt.Color(0, 0, 0));
        btnEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_add_database_25px.png"))); // NOI18N
        btnEnviar.setText(bundle.getString("Sugerencias.btnEnviar.text")); // NOI18N
        btnEnviar.setToolTipText(bundle.getString("Sugerencias.btnEnviar.toolTipText")); // NOI18N
        btnEnviar.setColorHover(new java.awt.Color(181, 238, 205));
        btnEnviar.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnEnviar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnEnviar.setIconTextGap(15);
        btnEnviar.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        jPanel3.add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 150, 40));

        JBtnLimpiar.setBackground(new java.awt.Color(51, 51, 51));
        JBtnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8_delete_database_25px_1.png"))); // NOI18N
        JBtnLimpiar.setText(bundle.getString("Sugerencias.JBtnLimpiar.text")); // NOI18N
        JBtnLimpiar.setAutoscrolls(true);
        JBtnLimpiar.setColorHover(new java.awt.Color(255, 102, 102));
        JBtnLimpiar.setColorTextHover(new java.awt.Color(51, 51, 51));
        JBtnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        JBtnLimpiar.setIconTextGap(15);
        JBtnLimpiar.setMargin(new java.awt.Insets(4, 14, 4, 14));
        JBtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnLimpiarActionPerformed(evt);
            }
        });
        jPanel3.add(JBtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 150, 40));

        jLblContador.setForeground(new java.awt.Color(102, 102, 102));
        jLblContador.setText("300");
        jPanel3.add(jLblContador, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 470, -1, -1));

        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Números de caracteres:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, -1, -1));

        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("/300");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 470, -1, -1));

        txtNombre.setBackground(new java.awt.Color(227, 227, 227));
        txtNombre.setText(bundle.getString("Sugerencias.txtNombre.text")); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 310, 30));

        jChboxAnonimo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jChboxAnonimo.setText(bundle.getString("Sugerencias.jChboxAnonimo.text")); // NOI18N
        jChboxAnonimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChboxAnonimoActionPerformed(evt);
            }
        });
        jPanel3.add(jChboxAnonimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 110, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setText(bundle.getString("Sugerencias.jLabel12.text")); // NOI18N
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 1100, 530));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setText(bundle.getString("EstadoReclamos.jLabel3.text")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setText(bundle.getString("Sugerencias.jLabel2.text")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        jMenu4.setText(bundle.getString("Sugerencias.jMenu4.text")); // NOI18N

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/icons8_cancel_20px.png"))); // NOI18N
        jMenuItem6.setText(bundle.getString("Sugerencias.jMenuItem6.text")); // NOI18N
        jMenuItem6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuBar1.add(jMenu4);

        jMenu5.setText(bundle.getString("Sugerencias.jMenu5.text")); // NOI18N
        jMenuBar1.add(jMenu5);

        jMenu6.setText(bundle.getString("Sugerencias.jMenu6.text")); // NOI18N
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1120, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que quiere salir del Fromulario?");
        if (JOptionPane.OK_OPTION == resp) {
            this.dispose();
        }
        else if(JOptionPane.NO_OPTION == resp){

        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        String cliente;
        MtoLogin client = new MtoLogin();
        MtoSugerencias obj = new MtoSugerencias();
        
        if (jChboxAnonimo.isSelected()) {
            cliente = "null";
            obj.setDUI(cliente);
        }else{
            obj.setDUI(client.getDUI());
        }
        obj.setSugerencia(txtMensaje.getText());

        if(obj.guardarSugerencia()){
            JOptionPane.showMessageDialog(this, "Sugerencia hecha.");
        }else{
            JOptionPane.showMessageDialog(this, "Sugerencia no hecha, hubo un error, por favor reintente.");
        }
        Limpiar();
        cargarDatosA();
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void JBtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnLimpiarActionPerformed
        if (jTableSugerencia.getSelectedRowCount()>0) {
            this.id = Integer.parseInt(String.valueOf(jTableSugerencia.getValueAt(jTableSugerencia.getSelectedRow(), 0)));
            MtoSugerencias obj = new MtoSugerencias();
            obj.setIdSugerencia(id);

            //confirmando que se quiere eliminar
            int eliminar = JOptionPane.showConfirmDialog(this, "Está seguro que desea eliminar la sugerencia?", "Alerta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if(eliminar==0){
                //enviando el registro a eliminar en SQLServer
                if(obj.eliminarSugerencia()){
                    JOptionPane.showMessageDialog(this, "Sugerencia eliminada");
                }else{
                    JOptionPane.showMessageDialog(this, "Error al eliminar la sugerencia");
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una sugerencia primero.");
        }
        
        Limpiar();        
        int c = txtMensaje.getText().length(); 
        if (c<=300) {            
        jLblContador.setText(String.valueOf(300-c));        
        }
        cargarDatosA();
    }//GEN-LAST:event_JBtnLimpiarActionPerformed

    private void btnEliminarTodoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarTodoMouseClicked
        MtoSugerencias obj = new MtoSugerencias();
       
        //confirmando que se quiere eliminar
        int eliminar = JOptionPane.showConfirmDialog(this, "Está seguro que desea eliminar las sugerencias?", "Alerta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(eliminar==0){
            //enviando el registro a eliminar en SQLServer
            if(obj.eliminarSugerencias()){
                JOptionPane.showMessageDialog(this, "Sugerencias eliminadas");
            }else{
                JOptionPane.showMessageDialog(this, "Error al eliminar las sugerencias");
            }
        }
        Limpiar();
        cargarDatosA();
    }//GEN-LAST:event_btnEliminarTodoMouseClicked

    private void jLblRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblRefreshMouseClicked
        cargarDatosA();
        Limpiar();
    }//GEN-LAST:event_jLblRefreshMouseClicked

    private void jTableSugerenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableSugerenciaMouseClicked
        Limpiar();
        this.Sugerencia = (String) jTableSugerencia.getValueAt(jTableSugerencia.getSelectedRow(), 1);
        this.id = Integer.parseInt(String.valueOf(jTableSugerencia.getValueAt(jTableSugerencia.getSelectedRow(), 0)));
        MtoSugerencias name = new MtoSugerencias();
        txtMensaje.setText(Sugerencia);
        name.setIdSugerencia(id);
                
        cargarNombre(); 
        
        int c = txtMensaje.getText().length(); 
        if (c<=300) {
            
        jLblContador.setText(String.valueOf(300-c));
        }
        else{
        evt.consume();
        }
    }//GEN-LAST:event_jTableSugerenciaMouseClicked

    private void txtMensajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMensajeKeyTyped
        int c = txtMensaje.getText().length(); 
        if (c<=300) {
            
        jLblContador.setText(String.valueOf(300-c));        
        }
        else{
            evt.consume();
        }
        
    }//GEN-LAST:event_txtMensajeKeyTyped

    private void jChboxAnonimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChboxAnonimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jChboxAnonimoActionPerformed

    public int Limpiar(){
        
        txtMensaje.setText(null);
        txtNombre.setText(null);
        jChboxAnonimo.setSelected(false);
        return 0;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover JBtnLimpiar;
    private javax.swing.JLabel btnEliminarTodo;
    private rojeru_san.complementos.RSButtonHover btnEnviar;
    private javax.swing.JCheckBox jChboxAnonimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLblContador;
    private javax.swing.JLabel jLblRefresh;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableSugerencia;
    private javax.swing.JTextArea txtMensaje;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
