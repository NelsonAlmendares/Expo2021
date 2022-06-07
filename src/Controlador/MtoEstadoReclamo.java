/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Conexion.ConexionJava;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author elmer
 */
public class MtoEstadoReclamo {
    
    //definir atributos
    private Connection conec;
    private int NEReclamo;
    private String EstadoReclamo;
    
    
    //generando métodos get y set
    //return conec y conec set
    public Connection getconec(){
        return conec;
    }
    
    public void setconec(Connection conec){
        this.conec=conec;
    }
    
    //return Número tipo reclamo y Número tipo reclamo set
    public Integer getNEReclamo(){
        return NEReclamo;
    }
    
    public void setNEReclamo(Integer NEReclamo){
        this.NEReclamo=NEReclamo;
    }
    
    //return Tipo reclamo y Tipo reclamo set
    public String getEstadoReclamo(){
        return EstadoReclamo;
    }
    
    public void setEstadoReclamo(String EstadoReclamo){
        this.EstadoReclamo=EstadoReclamo;
    }
    
    //estableciendo la conexión
    public MtoEstadoReclamo(){
    //se establece conexión
        ConexionJava conx = new ConexionJava();
        conec = conx.getConexion();
    }
    
    //método para guardar
    public boolean guardarEReclamo(){
        boolean res = false;
        try{
            //Realizar INSERT
            String sql = "INSERT INTO dboEstadoReclamo (estadoReclamo) values (?)";
            PreparedStatement cmd = conec.prepareStatement(sql);
            //Parametros            
            cmd.setString(1, EstadoReclamo);
            
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
    
    //método para modificar
    public boolean modificarEReclamo(){
        boolean res = false;
        try{
            //Realizar UPDATE
            String sql = "UPDATE dboEstadoReclamo SET estadoReclamo=? WHERE idEstadoReclamo=?";
            PreparedStatement cmd = conec.prepareStatement(sql);
            //Parametros            
            cmd.setString(1, EstadoReclamo);
            cmd.setInt(2, NEReclamo);
            
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
    
    //método para eliminar
    public boolean eliminarEReclamo(){
        boolean res = false;
        try{
            //Realizar DELETE
            String sql = "DELETE FROM dboEstadoReclamo WHERE idEstadoReclamo=?";
            PreparedStatement cmd = conec.prepareStatement(sql);
            //Parametros
            cmd.setInt(1, NEReclamo);            
            
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
    
    //método para cargar datos en jtable
    
    public ResultSet Consulta(String consulta){
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
