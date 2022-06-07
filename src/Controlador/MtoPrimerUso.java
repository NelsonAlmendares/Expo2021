/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion.ConexionJava;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elmer
 */
public class MtoPrimerUso {
    //definir atributos
    private Connection conec;
    private int idUsuario;
    private String Usuario;
    private String Contraseña;
    private int idTUsuario;
    private int idEUsuario;
    private String Pregunta1;
    private String Pregunta2;
    private String Pregunta3;
    private String Respuesta1;
    private String Respuesta2;
    private String Respuesta3;
    private String DUI;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getDUI() {
        return DUI;
    }

    public void setDUI(String DUI) {
        this.DUI = DUI;
    }
    
    
    
    //generando métodos get y set
    //return conec y conec set
    public Connection getconec(){
        return conec;
    }
    
    public void setconec(Connection conec){
        this.conec=conec;
    }
    
    //return idUsuario y idUsuario set
    public Integer getidUsuario(){
        return idUsuario;
    }
    
    public void setidUsuario(Integer idUsuario){
        this.idUsuario=idUsuario;
    }
    
    //return Usuario y Usuario set
    public String getUsuario(){
        return Usuario;
    }
    
    public void setUsuario(String Usuario){
        this.Usuario=Usuario;
    }
    
    //return Contraseña y Contraseña set
    public String getContraseña(){
        return Contraseña;
    }
    
    public void setContraseña(String Contraseña){
        this.Contraseña=Contraseña;
    }
    
    //return idTUsuario y idTUsuario set
    public Integer getidTUsuario(){
        return idTUsuario;
    }
    
    public void setidTUsuario(Integer idTUsuario){
        this.idTUsuario=idTUsuario;
    }
    
    //return idEUsuario y idTUsuario set
    public Integer getidEUsuario(){
        return idEUsuario;
    }
    
    public void setidEUsuario(Integer idEUsuario){
        this.idEUsuario=idEUsuario;
    }
    
    //return Pregunta1 y Pregunta1 set
    public String getPregunta1(){
        return Pregunta1;
    }
    
    public void setPregunta1(String Pregunta1){
        this.Pregunta1=Pregunta1;
    }
    
    //return Pregunta2 y Pregunta2 set
    public String getPregunta2(){
        return Pregunta2;
    }
    
    public void setPregunta2(String Pregunta2){
        this.Pregunta2=Pregunta2;
    }
    
    //return Pregunta3 y Pregunta3 set
    public String getPregunta3(){
        return Pregunta3;
    }
    
    public void setPregunta3(String Pregunta3){
        this.Pregunta3=Pregunta3;
    }
    
    //return Respuesta1 y Respuesta1 set
    public String getRespuesta1(){
        return Respuesta1;
    }
    
    public void setRespuesta1(String Respuesta1){
        this.Respuesta1=Respuesta1;
    }
    
    //return Respuesta2 y Respuesta2 set
    public String getRespuesta2(){
        return Respuesta2;
    }
    
    public void setRespuesta2(String Respuesta2){
        this.Respuesta2=Respuesta2;
    }
    
    //return Respuesta3 y Respuesta3 set
    public String getRespuesta3(){
        return Respuesta3;
    }
    
    public void setRespuesta3(String Respuesta3){
        this.Respuesta3=Respuesta3;
    }
    
    //estableciendo la conexión
    public MtoPrimerUso(){
    //se establece conexión
        ConexionJava conx = new ConexionJava();
        conec = conx.getConexion();
    }
    
    //método para guardar
    public boolean guardarUsuario(){
        MtoLogin log = new MtoLogin();
        boolean res = false;
        try{
            //Realizar INSERT
            String sql = "INSERT INTO dboLogin(usuario,contrasena,idTipoUsuario,idEstadoUsuario,idEmpleado) \n" +
                         "values (?,?,(SELECT idTipoUsuario FROM dboTipoUsuario WHERE tipoUsuario = 'root'),(SELECT idEstadoUsuario FROM dboEstadoUsuario WHERE estadoUsuario = 'activo'),(SELECT idEmpleado FROM dboEmpleado WHERE DUI=?))";
            PreparedStatement cmd = conec.prepareStatement(sql);
            //Parametros                        
            cmd.setString(1, Usuario);
            cmd.setString(2, log.encode("AtClient", Contraseña));
            cmd.setString(3, DUI);
            
            if(!cmd.execute()){
                res=true;
            }
            //cerrando conexión
//            cmd.close();
//            conec.close();
        } catch(Exception e){
            System.out.println(e.toString());
        }
        return res;
    }
    
    public boolean guardarPreguntas(){
        boolean res = false;
        try{
            //Realizar INSERT
            String sql = "INSERT INTO dboPreguntasSeguridad(pregunta1,respuesta1,pregunta2,respuesta2,pregunta3,respuesta3,idUsuario)\n" + 
                         "values (?,?,?,?,?,?,(SELECT idUsuario FROM dboLogin WHERE usuario=?))";
            PreparedStatement cmd = conec.prepareStatement(sql);
            //Parametros                        
            cmd.setString(1, Pregunta1);
            cmd.setString(2, Respuesta1); 
            cmd.setString(3, Pregunta2);
            cmd.setString(4, Respuesta2);
            cmd.setString(5, Pregunta3);
            cmd.setString(6, Respuesta3);
            cmd.setString(7, Usuario);
            
            if(!cmd.execute()){
                res=true;
            }
            //cerrando conexión
            cmd.close();
            conec.close();
        } catch(Exception e){
            System.out.println(e.toString());
        }
        return res;
    }
    
    public boolean actualizarPreguntas(){
        boolean res = false;
        try{
            String sql = "UPDATE dboPreguntasSeguridad SET pregunta1 = ?, respuesta1 = ?, pregunta2 = ?, respuesta2 = ?, pregunta3 = ?, respuesta3  = ? WHERE idUsuario = (SELECT idUsuario FROM dboLogin WHERE usuario=?)";
            PreparedStatement cmd = conec.prepareStatement(sql);
            //Parametros                        
            cmd.setString(1, Pregunta1);
            cmd.setString(2, Respuesta1); 
            cmd.setString(3, Pregunta2);
            cmd.setString(4, Respuesta2);
            cmd.setString(5, Pregunta3);
            cmd.setString(6, Respuesta3);
            cmd.setString(7, Usuario);
            
            if(!cmd.execute()){
                res=true;
            }
            //cerrando conexión
            cmd.close();
            conec.close();
        } catch(Exception e){
            System.out.println(e.toString());
        }
        return res;
    }
     
    
    public ArrayList<MtoPrimerUso>  getDui(){
        ConexionJava conex = new ConexionJava();
        Connection con = conex.getConexion();        
        Statement stmt;
        ResultSet rs;
        
        ArrayList<MtoPrimerUso> listaDui = new ArrayList<>();
        
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT DUI FROM dboEmpleado");
            
            while(rs.next()){
                MtoPrimerUso dui = new MtoPrimerUso();
                dui.setDUI(rs.getString("DUI"));
                listaDui.add(dui);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MtoPrimerUso.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaDui;
    }
}
