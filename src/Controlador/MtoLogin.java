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
import java.security.MessageDigest;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import org.apache.commons.codec.binary.Base64;
/**
 *
 * @author home
 */
public class MtoLogin {

    //Declarando variables
    private String secretKey = "AtClient";
    private Connection cn;
    public static String user;
    private String contrasena;
    private String tipoU;
    private int idDepto;
    public static int num;
    public static String DUI;
   
    public String encode(String secretKey, String cadena){
        String encriptacion = "";
        try{
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] llavePassword = md5.digest(secretKey.getBytes("utf-8"));
            byte[] bytesKey = Arrays.copyOf(llavePassword, 24);
            SecretKey key = new SecretKeySpec(bytesKey, "DESede");
            Cipher cifrado = Cipher.getInstance("DESede");
            cifrado.init(Cipher.ENCRYPT_MODE, key);
            byte[] plainTextBytes = cadena.getBytes("utf-8");
            byte[] buf = cifrado.doFinal(plainTextBytes);
            byte[] base64Bytes = Base64.encodeBase64(buf);
            encriptacion = new String(base64Bytes);
            
        }
        catch(Exception ex){
            
        }
        return encriptacion;
    }
    /**
     * @return the tipoU
     */
    public String getTipoU() {
        return tipoU;
    }

    /**
     * @param tipoU the tipoU to set
     */
    public void setTipoU(String tipoU) {
        this.tipoU = tipoU;
    }  
    
    /**
     * @return the idDepto
     */
    public int getIdDepto() {
        return idDepto;
    }

    /**
     * @param idDepto the idDepto to set
     */
    public void setIdDepto(int idDepto) {
        this.idDepto = idDepto;
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
     * @return the contrasena
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * @param contrasena the contrasena to set
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     * @return the num
     */
    public int getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(int num) {
        this.num = num;
    }
    
    /**
     * @return the DUI
     */
    public String getDUI() {
        return DUI;
    }

    /**
     * @param DUI the DUI to set
     */
    public void setDUI(String DUI) {
        this.DUI = DUI;
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
    public MtoLogin(){
    //Establecemos la conexion
       ConexionJava con = new ConexionJava();
       cn = con.getConexion();
    }
    
    
    public boolean accesoUsuario(){
        boolean acces = false;
        
        String sql = "SELECT dt.tipoUsuario, de.idDeptoEmpresa FROM dboLogin dl, dboTipoUsuario dt, dboEmpleado de WHERE dl.usuario = ? AND dl.contrasena = ? AND dl.idTipoUsuario = dt.idTipoUsuario AND dl.idEmpleado = de.idEmpleado AND NOT dl.idEstadoUsuario = (SELECT idEstadoUsuario FROM dboEstadoUsuario WHERE estadoUsuario = 'Inhabilitado');";
        
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, user);
            pst.setString(2, encode(secretKey, contrasena));
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                acces = true;
                setTipoU(rs.getString(1));
                setIdDepto(rs.getInt(2));
            }
            else{
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }
        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return acces;
    }
    
    public boolean accesoCliente(){
        boolean acces = false;
        
        String sql = "SELECT * FROM dboCliente WHERE numCliente = ? AND DUI = ? AND NOT idEstadoUsuario = (SELECT idEstadoUsuario FROM dboEstadoUsuario WHERE estadoUsuario = 'Inhabilitado');";
        
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, num);
            pst.setString(2, DUI);
            
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                acces = true;
                user = rs.getString(2);
            }
            else{
                JOptionPane.showMessageDialog(null, "El número que ingreso, no existe en la base de datos");
            }
        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return acces;
    }
}
