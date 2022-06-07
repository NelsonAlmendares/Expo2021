package Main;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import Controlador.*;
import static Main.Clientes.res;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/* @author nelso
 */
public class SplashScreen extends javax.swing.JFrame {

    /**
     * Creates new form SplashScreen
     */
    public SplashScreen() {
        initComponents();
        setLocationRelativeTo(null);
       setIconImage(new ImageIcon(getClass().getResource("/Main/Icon.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ProgressBar = new javax.swing.JProgressBar();
        jSeparator1 = new javax.swing.JSeparator();
        jLoadingText = new javax.swing.JLabel();
        jValueText = new javax.swing.JLabel();
        jBtnAcceder = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AtClient - Cargando...");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProgressBar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(ProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 860, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 420, 10));

        jLoadingText.setBackground(new java.awt.Color(102, 102, 102));
        jLoadingText.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLoadingText.setForeground(new java.awt.Color(255, 255, 255));
        jLoadingText.setText("Loading....");
        jPanel1.add(jLoadingText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        jValueText.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jValueText.setForeground(new java.awt.Color(51, 51, 51));
        jValueText.setText("0  %");
        jPanel1.add(jValueText, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 420, -1, -1));

        jBtnAcceder.setText("Iniciar");
        jBtnAcceder.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBtnAcceder.setEnabled(false);
        jBtnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAccederActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnAcceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 150, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/AtClient.fw.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/Background.fw.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAccederActionPerformed
        this.dispose();
        Login abrir = new Login();
        abrir.show(true);
    }//GEN-LAST:event_jBtnAccederActionPerformed
    
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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        SplashScreen sp = new SplashScreen();
        sp.setVisible(true);
        
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(100);
                sp.jValueText.setText(i  + "%");
                
                if (i == 20) {
                    sp.jLoadingText.setText("Turning On Modules...");
                }
                if (i == 30) {
                    sp.jLoadingText.setText("Loading Modules...");
                }
                if (i == 50) {
                    sp.jLoadingText.setText("Connecting to Database...");
                    MtoConsultar obj = new MtoConsultar();
                    if (obj.extra==1) {
                        i=0;                                                
                    }else if(obj.extra==2){
                        System.exit(0);
                    }
                }
                if (i == 70) {
                    sp.jLoadingText.setText("Searching for Users...");
                    //MtoConsultar obj = new MtoConsultar();
                    if (!verificarUsuarios()) {
                        //cerrar splashscreen
                        
                        int answer = JOptionPane.showConfirmDialog(null,"No se han detectado usuarios. ¿Desea registrarse?");
                        if (answer==JOptionPane.YES_OPTION) {
                            PrimerUso abrir = new PrimerUso();
                            abrir.show(true);
                            sp.dispose();
                        }else{
                            System.exit(0);
                        }
                        
                    }
                    
                }
                if (i == 90) {
                    sp.jLoadingText.setText("Loading Data...");
                }
                if (i == 100) {
                    sp.jLoadingText.setText("Succesfull...");
                }
                sp.ProgressBar.setValue(i);
                
                if (i < 99) {
                    sp.jBtnAcceder.setEnabled(false);
                }
                else{
                    sp.jBtnAcceder.setEnabled(true);
                    sp.jBtnAcceder.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                }
            }
            
        } catch (Exception e) {
        }                
    }
    
     public static boolean verificarUsuarios(){  
        int id=0;
        ResultSet res;
        res = Controlador.MtoConsultar.Consulta("SELECT top 1 idUsuario FROM dboLogin");
        try{
            if (res.next()) {
                return true;
            }
            
        }catch(SQLException e){
                     
        }  
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar ProgressBar;
    private javax.swing.JButton jBtnAcceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLoadingText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jValueText;
    // End of variables declaration//GEN-END:variables

}
