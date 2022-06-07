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
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author elmer
 */
public class MtoSugerencias {
    //definir atributos
    private int idSugerencia;
    private String sugerencia;
    private String DUI;
    private String nombreC;
    private Connection conec;

    //generando métodos get y set   
    public Connection getConec() {
        return conec;
    }

    public void setConec(Connection conec) {
        this.conec = conec;
    }

    public int getIdSugerencia() {
        return idSugerencia;
    }

    public void setIdSugerencia(int idSugerencia) {
        this.idSugerencia = idSugerencia;
    }

    public String getSugerencia() {
        return sugerencia;
    }

    public void setSugerencia(String sugerencia) {
        this.sugerencia = sugerencia;
    }

    public String getDUI() {
        return DUI;
    }

    public void setDUI(String DUI) {
        this.DUI = DUI;
    }   
    
     public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }
    
    //estableciendo la conexión
    public MtoSugerencias(){
    //se establece conexión
        ConexionJava conx = new ConexionJava();
        conec = conx.getConexion();
    }
    
    //método para guardar
    public boolean guardarSugerencia(){
        boolean res = false;
        try{
            //Realizar INSERT
            String sql = "INSERT INTO dboSugerencia(idCliente,sugerencia)\n" +
                        "VALUES ((SELECT idCliente FROM dboCliente WHERE DUI=?),?)";
            PreparedStatement cmd = conec.prepareStatement(sql);
            //Parametros       
            cmd.setString(1, DUI);
            cmd.setString(2, sugerencia);

            
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
      
    
    public boolean eliminarSugerencia(){
        boolean res = false;
        try{
            //Realizar DELETE
            String sql = "DELETE dboSugerencia WHERE idSugerencia=?";
            PreparedStatement cmd = conec.prepareStatement(sql);
            //Parametros       
            cmd.setInt(1, idSugerencia);

            
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
    
     public boolean eliminarSugerencias(){
        boolean res = false;
        try{
            //Realizar DELETE
            String sql = "DELETE dboSugerencia";
            PreparedStatement cmd = conec.prepareStatement(sql);
            //Parametros       
            
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
    
}
