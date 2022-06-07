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
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
/**
 *
 * @author home
 */
public class MtoRecuContra {

    //Declarando variables
    private Connection cn;
    private String user;
    private String contra;
    private String respuesta1;
    private String respuesta2;
    private String respuesta3;
    
    /**
     * @return the respuesta1
     */
    public String getRespuesta1() {
        return respuesta1;
    }

    /**
     * @param respuesta1 the respuesta1 to set
     */
    public void setRespuesta1(String respuesta1) {
        this.respuesta1 = respuesta1;
    }

    /**
     * @return the respuesta2
     */
    public String getRespuesta2() {
        return respuesta2;
    }

    /**
     * @param respuesta2 the respuesta2 to set
     */
    public void setRespuesta2(String respuesta2) {
        this.respuesta2 = respuesta2;
    }

    /**
     * @return the respuesta3
     */
    public String getRespuesta3() {
        return respuesta3;
    }

    /**
     * @param respuesta3 the respuesta3 to set
     */
    public void setRespuesta3(String respuesta3) {
        this.respuesta3 = respuesta3;
    }
    
    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the contra
     */
    public String getContra() {
        return contra;
    }

    /**
     * @param contra the contra to set
     */
    public void setContra(String contra) {
        this.contra = contra;
    }
    
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
    public MtoRecuContra(){
    //Establecemos la conexion
       ConexionJava con = new ConexionJava();
       cn = con.getConexion();
    }
    
    public boolean verificarUsuario(){
        String sql = "SELECT * FROM dboLogin WHERE usuario = ?";
        boolean val = false;
        try {
            PreparedStatement pst = null;
            pst = cn.prepareStatement(sql);
            pst.setString(1, user);
            ResultSet rs = null;
            rs = pst.executeQuery();
            if (rs.next()) {
                val = true;
            }            
        } catch (SQLException | HeadlessException ex) {
            System.out.println(ex);
        }
        return val;
    }
    
    //método para modificar
    public boolean modificarUsuario(){
        MtoLogin log = new MtoLogin();
        boolean res = false;
        try{ //Realizar consulta UPDATE
           String sql = "UPDATE dboLogin SET contrasena =? WHERE usuario=?";
           //pide importar clase Prepared Statement
           PreparedStatement cmd = cn.prepareStatement(sql);
           //Lenar los parámetros de la clase, se coloca en el orden de la consulta
           
           cmd.setString(1,log.encode("AtClient", contra));
           cmd.setString(2, user);

            //Si da error devuelve 1, caso contrario 
           //Tomar en cuenta que el ! es negación
           if(!cmd.execute()){
              res=true;
            }
            //cerrando conexion
            cmd.close();
            cn.close();
        }catch(Exception e ){
            System.out.println(e.toString());
        }
        return res;
    }
    
    public boolean verificarPreguntas(){
        String sql = "SELECT dp.* FROM dboPreguntasSeguridad dp, dboLogin dl WHERE dp.idUsuario = dl.idUsuario AND dl.usuario = ? AND dp.respuesta1 = ? AND dp.respuesta2 = ? AND dp.respuesta3 = ?";
        boolean val = false;
        try {
            PreparedStatement pst = null;
            pst = cn.prepareStatement(sql);
            
            pst.setString(1, user);
            pst.setString(2, respuesta1);
            pst.setString(3, respuesta2);
            pst.setString(4, respuesta3);
            
            ResultSet rs = null;
            rs = pst.executeQuery();
            if (rs.next()) {
                val = true;
            }            
        } catch (SQLException | HeadlessException ex) {
            System.out.println(ex);
        }
        return val;
    }
}
