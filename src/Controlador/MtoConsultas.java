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
import javax.swing.JOptionPane;

/**
 *
 * @author Mery Chavez Pacifico
 */
public class MtoConsultas {

    
    //Formulario Consulta
    private Connection cn;
    private Integer idConsulta;
    private String DUI;
    private String consulta;
    private Integer idTipo;
    private String fecha;

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
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
     * @return the idConsulta
     */
    public Integer getIdConsulta() {
        return idConsulta;
    }

    /**
     * @param idConsulta the idConsulta to set
     */
    public void setIdConsulta(Integer idConsulta) {
        this.idConsulta = idConsulta;
    }

    /**
     * @return the idCliente
     */
    public String getDui() {
        return DUI;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setDui(String DUI) {
        this.DUI = DUI;
    }

    /**
     * @return the consulta
     */
    public String getConsulta() {
        return consulta;
    }

    /**
     * @param consulta the consulta to set
     */
    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    /**
     * @return the idTipo
     */
    public Integer getIdTipo() {
        return idTipo;
    }

    /**
     * @param idTipo the idTipo to set
     */
    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }
    
    public MtoConsultas(){
        ConexionJava con = new ConexionJava();
        cn = con.getConexion();
    }
    
    public boolean agregarConsulta(){
        boolean resp = false;
        try{
            String sql = "INSERT INTO dboConsulta (idCliente,consulta,idTipoConsulta, fechaConsulta) VALUES((SELECT idCliente FROM dboCliente WHERE DUI=?),?,?,?)";
            PreparedStatement cmd = cn.prepareStatement(sql);
            
            cmd.setString(1, DUI);
            cmd.setString(2, consulta);
            cmd.setInt(3, idTipo);
            cmd.setString(4, fecha);
            
            if (!cmd.execute()) {
                resp = true;
            }
            cmd.close();
            cn.close();
        }
        catch(SQLException e){
            System.out.println(e.toString());
        }
        return resp;
    }
    
     public boolean eliminarTConsulta(){
        boolean resp = false;
        try{
            String sql = "truncate table dboConsulta";
            PreparedStatement cmd = cn.prepareStatement(sql);

            
            if (!cmd.execute()) {
                resp = true;
            }
            cmd.close();
            cn.close();
        }
        catch(SQLException e){
            System.out.println(e.toString());
        }
        return resp;
    }
     
      public boolean eliminarConsulta(){
        boolean resp = false;
        try{
            String sql = "DELETE FROM dboConsulta where idConsulta=? ";
            PreparedStatement cmd = cn.prepareStatement(sql);
       
            cmd.setInt(1, idConsulta);
            
            if (!cmd.execute()) {
                resp = true;
            }
            cmd.close();
            cn.close();
        }
        catch(SQLException e){
            System.out.println(e.toString());
        }
        return resp;
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
    
}
