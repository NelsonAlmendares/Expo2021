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
public class MtoTipoReclamo {
    
    //definir atributos
    private Connection conec;
    private int NTReclamo;
    private String TipoReclamo;
    
    
    //generando métodos get y set
    //return conec y conec set
    public Connection getconec(){
        return conec;
    }
    
    public void setconec(Connection conec){
        this.conec=conec;
    }
    
    //return Número tipo reclamo y Número tipo reclamo set
    public Integer getNTReclamo(){
        return NTReclamo;
    }
    
    public void setNTReclamo(Integer NTReclamo){
        this.NTReclamo=NTReclamo;
    }
    
    //return Tipo reclamo y Tipo reclamo set
    public String getTipoReclamo(){
        return TipoReclamo;
    }
    
    public void setTipoReclamo(String TipoReclamo){
        this.TipoReclamo=TipoReclamo;
    }
    
    //estableciendo la conexión
    public MtoTipoReclamo(){
    //se establece conexión
        ConexionJava conx = new ConexionJava();
        conec = conx.getConexion();
    }
    
    //método para guardar
    public boolean guardarTReclamo(){
        boolean res = false;
        try{
            //Realizar INSERT
            String sql = "INSERT INTO dboTipoReclamo (tipoReclamo) values (?)";
            PreparedStatement cmd = conec.prepareStatement(sql);
            //Parametros            
            cmd.setString(1, TipoReclamo);
            
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
    public boolean modificarTReclamo(){
        boolean res = false;
        try{
            //Realizar UPDATE
            String sql = "UPDATE dboTipoReclamo SET tipoReclamo=? WHERE idTipoReclamo=?";
            PreparedStatement cmd = conec.prepareStatement(sql);
            //Parametros            
            cmd.setString(1, TipoReclamo);
            cmd.setInt(2, NTReclamo);
            
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
    public boolean eliminarTReclamo(){
        boolean res = false;
        try{
            //Realizar DELETE
            String sql = "DELETE FROM dboTipoReclamo WHERE idTipoReclamo=?";
            PreparedStatement cmd = conec.prepareStatement(sql);
            //Parametros
            cmd.setInt(1, NTReclamo);            
            
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
    
    //método para consultar
    public boolean consultarTReclamo(){
        boolean res = false;
        try{
            //Realizar UPDATE
            String sql = "SELECT tipoReclamo FROM dboTipoReclamo WHERE idTipoReclamo=?";
            PreparedStatement cmd = conec.prepareStatement(sql);
            //Parametros
            cmd.setInt(1, NTReclamo);            
            
            //Ejecutar consulta
            ResultSet rs = cmd.executeQuery();
            
            if (rs.next()) {
              res=true;
              
              NTReclamo = rs.getInt(1);
              TipoReclamo = rs.getString(2);
            }
                        
            //cerrando conexión
            cmd.close();
            conec.close();
        } catch(Exception e){
            System.out.println(e.toString());
        }
        return res;
    }
    
    //Cargar datos a la tabla Tipos Reclamos
    /*public void mostrarDatos(JTable Table){
        try{
            String consulta = "SELECT idTipoReclamo,tipoReclamo FROM dboTipoReclamo";
            String cabecera[]={"IdTipoReclamo","TipoReclamo"};
            String cuerpo[]=new String[2];
            DefaultTableModel table = new DefaultTableModel(null, cabecera);
            Statement cmd = conec.createStatement();
            ResultSet rs = cmd.executeQuery(consulta);
            while(rs.next()){
                cuerpo[0]=rs.getString("idTipoReclamo");
                cuerpo[1]=rs.getString("tipoReclamo");
                table.addRow(cuerpo);
            }
            Table.setModel(table);
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }*/
    
    //método para cargar datos en la jtable
    
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
