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
public class MtoDeptEmpresa {
    //Formulario DepartamentoEmpresa
    private Connection cn;
    private String departamento;
    private Integer idDepartamento;
    
    public Connection getCn() {
        return cn;
    }
    
    public void setCn(Connection cn) {
        this.cn = cn;
    }
    
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public Integer getIdDepartamento() {
        return idDepartamento;
    }
    
    public void setIdDepartamento(Integer idDepartamento) {
        this.idDepartamento = idDepartamento;
    }
    public MtoDeptEmpresa(){
        ConexionJava con = new ConexionJava();
        cn = con.getConexion();
    }
    
   public boolean agregarDepartamento(){
        boolean resp = false;
        try{
            String sql = "INSERT INTO dboDepartamentoEmpresa(departamentoE) VALUES(?);";
            PreparedStatement cmd = cn.prepareStatement(sql);
            
            cmd.setString(1, departamento);
            
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
   
   public boolean modificarDepartamento(){
        boolean resp = false;
        try{
            String sql = "UPDATE dboDepartamentoEmpresa SET departamentoE=? WHERE idDeptoEmpresa= ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            
            cmd.setString(1, departamento);
            cmd.setInt(2, idDepartamento);
            
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
   
      
      public boolean eliminarDepartamento(){
        boolean resp = false;
        try{
            String sql = "DELETE FROM dboDepartamentoEmpresa where idDeptoEmpresa=?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setInt(1, idDepartamento);
          
            if(!cmd.execute()){
              resp=true;
            }
            cmd.close();
            cn.close();
        }catch(SQLException e ){
            System.out.println(e.toString());
        }
        return resp;
    }          
}
