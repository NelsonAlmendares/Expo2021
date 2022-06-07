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
public class MtoTipoUsuario {
    
    //definir atributos
    private Connection conec;
    private int NTUsuario;
    private String TipoUsuario;
    
    
    //generando métodos get y set
    //return conec y conec set
    public Connection getconec(){
        return conec;
    }
    
    public void setconec(Connection conec){
        this.conec=conec;
    }
    
    //return Número tipo reclamo y Número tipo reclamo set
    public Integer getNTUsuario(){
        return NTUsuario;
    }
    
    public void setNTUsuario(Integer NTUsuario){
        this.NTUsuario=NTUsuario;
    }
    
    //return Tipo reclamo y Tipo reclamo set
    public String getTipoUsuario(){
        return TipoUsuario;
    }
    
    public void setTipoUsuario(String TipoUsuario){
        this.TipoUsuario=TipoUsuario;
    }
    
    //estableciendo la conexión
    public MtoTipoUsuario(){
    //se establece conexión
        ConexionJava conx = new ConexionJava();
        conec = conx.getConexion();
    }
    
    //método para guardar
    public boolean guardarTUsuario(){
        boolean res = false;
        try{
            //Realizar INSERT
            String sql = "INSERT INTO dboTipoUsuario (tipoUsuario) values (?)";
            PreparedStatement cmd = conec.prepareStatement(sql);
            //Parametros            
            cmd.setString(1, TipoUsuario);
            
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
    public boolean modificarTUsuario(){
        boolean res = false;
        try{
            //Realizar UPDATE
            String sql = "UPDATE dboTipoUsuario SET tipoUsuario=? WHERE idTipoUsuario=?";
            PreparedStatement cmd = conec.prepareStatement(sql);
            //Parametros            
            cmd.setString(1, TipoUsuario);
            cmd.setInt(2, NTUsuario);
            
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
    public boolean eliminarTUsuario(){
        boolean res = false;
        try{
            //Realizar DELETE
            String sql = "DELETE FROM dboTipoUsuario WHERE idTipoUsuario=?";
            PreparedStatement cmd = conec.prepareStatement(sql);
            //Parametros
            cmd.setInt(1, NTUsuario);            
            
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
