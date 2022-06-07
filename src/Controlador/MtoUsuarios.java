/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion.ConexionJava;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author jefry
 */
public class MtoUsuarios {

    private String secretKey = "AtClient";
    private Connection cn;
    private DefaultTableModel table;
    private int id;
    private String user;
    private String contrasena;
    private String codigo;
    private String tipoUsuario;
    private String estadoUsuario;
    private int empleado;
    private String dui;

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
    
    public String decode(String secretKey, String cadenaEncriptada){
        String desencriptacion = "";
        try{
            byte[] message = Base64.decodeBase64(cadenaEncriptada.getBytes("utf-8"));
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md5.digest(secretKey.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
            SecretKey key = new SecretKeySpec(keyBytes, "DESede");
            Cipher descifrado = Cipher.getInstance("DESede");
            
            descifrado.init(Cipher.DECRYPT_MODE, key);
            byte[] plainText = descifrado.doFinal(message);
            desencriptacion = new String(plainText, "UTF-8");
            
        }
        catch(Exception ex){
            System.out.println("Algo salio mal en la encriptación");
        }
        return desencriptacion;
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

    /**
     * @return the table
     */
    public DefaultTableModel getTable() {
        return table;
    }

    /**
     * @param table the table to set
     */
    public void setTable(DefaultTableModel table) {
        this.table = table;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the tipoUsuario
     */
    public String getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * @param tipoUsuario the tipoUsuario to set
     */
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    /**
     * @return the estadoUsuario
     */
    public String getEstadoUsuario() {
        return estadoUsuario;
    }

    /**
     * @param estadoUsuario the estadoUsuario to set
     */
    public void setEstadoUsuario(String estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    /**
     * @return the empleado
     */
    public int getEmpleado() {
        return empleado;
    }

    /**
     * @param Usuario the empleado to set
     */
    public void setEmpleado(int Empleado) {
        this.empleado = Empleado;
    }

        /**
     * @return the dui
     */
    public String getDui() {
        return dui;
    }

    /**
     * @param dui the dui to set
     */
    public void setDui(String dui) {
        this.dui = dui;
    }
    public MtoUsuarios() {
        ConexionJava con = new ConexionJava();
        cn = con.getConexion();
    }

    public boolean guadarUsuario() {
        boolean resp = false;
        try {
            String sql = "Insert into dboLogin(usuario, contrasena, codigo, idTipoUsuario, idEstadoUsuario, idEmpleado) VALUES (?, ?, ?, (SELECT idTipoUsuario FROM dboTipoUsuario WHERE tipoUsuario = ?), (SELECT idEstadoUsuario FROM dboEstadoUsuario WHERE estadoUsuario = ?), ?)";
            PreparedStatement cmd = cn.prepareStatement(sql);

            cmd.setString(1, user);
            cmd.setString(2, encode(secretKey, contrasena));
            cmd.setString(3, codigo);
            cmd.setString(4, tipoUsuario);
            cmd.setString(5, estadoUsuario);
            cmd.setInt(6, empleado);

            if (!cmd.execute()) {
                resp = true;
            }
            cmd.close();
            cn.close();

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return resp;
    }

    public boolean actualizarUsuario() {
        boolean res = false;
        try {
            String sql = "update dboLogin set usuario = ?, contrasena = ?, codigo= ?, idTipoUsuario= (SELECT idTipoUsuario FROM dboTipoUsuario WHERE tipoUsuario = ?), idEstadoUsuario= (SELECT idEstadoUsuario FROM dboEstadoUsuario WHERE estadoUsuario = ?), idEmpleado = ? where idUsuario= ?";

            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, user);
            cmd.setString(2, encode(secretKey, contrasena));
            cmd.setString(3, codigo);
            cmd.setString(4, tipoUsuario);
            cmd.setString(5, estadoUsuario);
            cmd.setInt(6, empleado);
            cmd.setInt(7, id);

            //en caso de error devuelve 1
            if (!cmd.execute()) {
                res = true;
            }
            cmd.close();
            cn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return res;
    }

    public void consultarUsuario(int idp) { //Para llenar los textFields
        boolean res = false;
        try { //Realizar consulta UPDATE
            String sql = "Select idUsuario, usuario, contrasena, codigo, idTipoUsuario, idEstadoUsuario, idEmpleado from dboLogin where idUsuario = ?";
            //pide importar clase Prepared Statement
            PreparedStatement cmd = cn.prepareStatement(sql);
            //Lenar los parámetros de la clase, se coloca en el orden de la consulta
            cmd.setInt(1, idp);

            //Ejecutar la consulta
            //pedirá importar la clase ResultSet
            ResultSet rs = cmd.executeQuery();
            //recorrer la lista de registros
            while (rs.next()) {
                res = true;
                //asignándole a los atributos de la clase
                id = rs.getInt(1);
                user = rs.getString(2);
                contrasena = decode(secretKey, rs.getString(3));
                codigo = rs.getString(4);
                tipoUsuario = rs.getString(5);
                estadoUsuario = rs.getString(6);
                empleado = rs.getInt(7);
            }
            //cerrando conexion
            cmd.close();
            cn.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public boolean eliminarReclamo() {
        boolean res = false;
        try { //Realizar consulta DELETE
            String sql = "DELETE FROM dboLogin WHERE idUsuario=?";
            PreparedStatement cmd = cn.prepareStatement(sql);//Lenar los parámetros 
            cmd.setInt(1, id);
            //Si da error devuelve 1, caso contrario 
            //Tomar en cuenta que el ! es negación
            if (!cmd.execute()) {
                res = true;
            }
            //cerrando conexion
            cmd.close();
            cn.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return res;
    }

    public boolean obtenerEmpleado(int idp) {
        boolean res = false;
        try { //Realizar consulta DELETE
            String sql = "Select idEmpleado, DUI from dboEmpleado where idEmpleado = ?";
            //pide importar clase Prepared Statement
            PreparedStatement cmd = cn.prepareStatement(sql);
            //Lenar los parámetros de la clase, se coloca en el orden de la consulta
            cmd.setInt(1, idp);
            ResultSet rs = cmd.executeQuery();
            //recorrer la lista de registros
            while (rs.next()) {
                res = true;
                //asignándole a los atributos de la clase
                setEmpleado(rs.getInt(1));
                setDui(rs.getString(2));
            }
            //cerrando conexion
            cmd.close();
            cn.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return res;
    }

    public DefaultComboBoxModel cargarComboTipoUser(){
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        try{
            String sql = "Select tipoUsuario from dboTipoUsuario";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while(rs.next()){
                model.addElement(rs.getString(1));
            }
            
            rs.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        return model;
    }

    public DefaultComboBoxModel comboEstadoUser(){
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        try{
            String sql = "Select estadoUsuario from dboEstadoUsuario";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while(rs.next()){
                model.addElement(rs.getString(1));
            }
            
            rs.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        return model;
    }
     
    public void Buscar(String valor, String filtro, JTable Tabla){

    String [] columnas={"idUsuario", "Usuario", "contraseña", "Código", "Tipo Usuario", "Estado Usuario", "DUI"};
    String [] cuerpo=new String[7];
    table = new DefaultTableModel(null,columnas); 
    Tabla.removeAll();
    String SSQL = "";
    Connection conect = null;
 
    //Usuario, Tipo Usuario, Estado Usuario, DUI
    if(filtro.equals("Usuario")){
    
        SSQL= "	Select idUsuario, usuario, contrasena, codigo, tu.tipoUsuario, eu.estadoUsuario, e.DUI from dboLogin l, dboTipoUsuario tu, dboEstadoUsuario eu, dboEmpleado e where l.idTipoUsuario = tu.idTipoUsuario and l.idEstadoUsuario = eu.idEstadoUsuario and l.idEmpleado = e.idEmpleado and usuario like '%"+valor+"%' and not l.idEstadoUsuario = 2";
        
    }else if(filtro.equals("Tipo usuario")){
    
        SSQL= "	Select idUsuario, usuario, contrasena, codigo, tu.tipoUsuario, eu.estadoUsuario, e.DUI from dboLogin l, dboTipoUsuario tu, dboEstadoUsuario eu, dboEmpleado e where l.idTipoUsuario = tu.idTipoUsuario and l.idEstadoUsuario = eu.idEstadoUsuario and l.idEmpleado = e.idEmpleado and tu.tipoUsuario like '%"+valor+"%' and not l.idEstadoUsuario = 2";
    
    }
    else if (filtro.equals("Estado usuario")) {
        SSQL= "Select idUsuario, usuario, contrasena, codigo, tu.tipoUsuario, eu.estadoUsuario, e.DUI from dboLogin l, dboTipoUsuario tu, dboEstadoUsuario eu, dboEmpleado e where l.idTipoUsuario = tu.idTipoUsuario and l.idEstadoUsuario = eu.idEstadoUsuario and l.idEmpleado = e.idEmpleado and eu.estadoUsuario like '%"+valor+"%'";
        
    } else{
    
        SSQL= "Select idUsuario, usuario, contrasena, codigo, tu.tipoUsuario, eu.estadoUsuario, e.DUI from dboLogin l, dboTipoUsuario tu, dboEstadoUsuario eu, dboEmpleado e where l.idTipoUsuario = tu.idTipoUsuario and l.idEstadoUsuario = eu.idEstadoUsuario and l.idEmpleado = e.idEmpleado and e.DUI like '%"+valor+"%' and not l.idEstadoUsuario = 2";
    }
    
           
     
    try {

        PreparedStatement st = cn.prepareStatement(SSQL);
        ResultSet rs = st.executeQuery();

        while (rs.next()){
          
            cuerpo[0]=rs.getString("idUsuario");
                cuerpo[1]=rs.getString("usuario");
                cuerpo[2]=rs.getString("contrasena");
                cuerpo[3]=rs.getString("codigo");
                cuerpo[4]=rs.getString("tipoUsuario");
                cuerpo[5]=rs.getString("estadoUsuario");
                cuerpo[6]=rs.getString("DUI");
                table.addRow(cuerpo);
          
           
        }
        
        Tabla.setModel(table);

    } catch (SQLException e) {


        JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);
    
    }finally{

        if(conect!=null){
        
            try {

                conect.close();

            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex, "Error de desconexión", JOptionPane.ERROR_MESSAGE);

            }
        }
      }
    }
}
