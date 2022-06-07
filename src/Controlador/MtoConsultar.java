/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion.ConexionJava;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Conexion.ConexionJava;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author home
 */
public class MtoConsultar {

    //Declarando variables
    private Connection cn;
    public int extra=0;
    
    /**
     * @return the cn
     */
    public Connection getCn() {
        return cn;
    }

    /**
     * @param cn the cn to set
     */
    public void setCn(Connection cn) {
        this.cn = cn;
    }
    
    //estableciendo la conexión en el constructor
    public MtoConsultar(){
    //Establecemos la conexion
       ConexionJava con = new ConexionJava();
       cn = con.getConexion();
       if(cn==null){
            int resp = JOptionPane.showConfirmDialog(null, "No hay conexión con la base de datos. \n¿Desea volver a intentar conectar con la base?","Error de conexión",2);
            if (JOptionPane.OK_OPTION == resp) {
                extra=1;
            }else if(JOptionPane.CANCEL_OPTION == resp){
                extra=2;
            }
        }
    }
    
    public static ResultSet Consulta(String consulta){
        ConexionJava conex = new ConexionJava();
        Connection con = conex.getConexion();
        Statement declara;
        try{
            declara=con.createStatement();
            ResultSet respuesta = declara.executeQuery(consulta);
            return respuesta;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage(), 
                    "Error de conexión", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    public void ConsultaTabla(String consulta, JTable table){
        try{
            Statement declara= cn.createStatement();
            ResultSet res = declara.executeQuery(consulta);

            DefaultTableModel modelo = (DefaultTableModel) table.getModel();
            modelo.setRowCount(0);
                while(res.next()){
                    Vector v = new Vector();
                    for (int i = 1; i < res.getMetaData().getColumnCount()+1; i++) {
                        v.add(res.getString(i));
                    }
                    modelo.addRow(v);
                    table.setModel(modelo);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error" + e.getMessage(), 
                        "Error de conexión", JOptionPane.ERROR_MESSAGE);
            }
    }
    
    
    public void ConsultaJCombo(String consulta, JTable table){
        try{
            Statement declara= cn.createStatement();
            ResultSet res = declara.executeQuery(consulta);

            DefaultTableModel modelo = (DefaultTableModel) table.getModel();
            modelo.setRowCount(0);
                while(res.next()){
                    Vector v = new Vector();
                    for (int i = 1; i < res.getMetaData().getColumnCount()+1; i++) {
                        v.add(res.getString(i));
                    }
                    modelo.addRow(v);
                    table.setModel(modelo);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error" + e.getMessage(), 
                        "Error de conexión", JOptionPane.ERROR_MESSAGE);
            }
    }   
    
}
