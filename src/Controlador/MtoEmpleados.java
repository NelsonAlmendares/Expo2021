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
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Mery Chavez Pacifico
 */
public class MtoEmpleados {

    //Formulario Empleados
    private Connection cn;
    private String nombre;
    private int departamento;
    private String dui;
    private String nit;
    private String fechaN;
    private Integer deptoE;
    private Integer idEmpleado;
    public DefaultTableModel table;
    
    public Connection getCn() {
        return cn;
    }
    
    public void setCn(Connection cn) {
        this.cn = cn;
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the departamento
     */
    public int getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(int departamento) {
        this.departamento = departamento;
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

    /**
     * @return the nit
     */
    public String getNit() {
        return nit;
    }

    /**
     * @param nit the nit to set
     */
    public void setNit(String nit) {
        this.nit = nit;
    }

    /**
     * @return the fechaN
     */
    public String getFechaN() {
        return fechaN;
    }

    /**
     * @param fechaN the fechaN to set
     */
    public void setFechaN(String fechaN) {
        this.fechaN = fechaN;
    }

    /**
     * @return the deptoE
     */
    public Integer getDeptoE() {
        return deptoE;
    }

    /**
     * @param deptoE the deptoE to set
     */
    public void setDeptoE(Integer deptoE) {
        this.deptoE = deptoE;
    }

    /**
     * @return the idEmpleado
     */
    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * @param idEmpleado the idEmpleado to set
     */
    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    
   
    
    public MtoEmpleados(){
        ConexionJava con = new ConexionJava();
        cn = con.getConexion();
    }
    
    public boolean agregarEmpleado(){
        boolean resp = false;
        try{
            String sql = "INSERT INTO dboEmpleado(nombreEmpleado,idDepartamento,DUI,NIT,fechaNacimiento,idDeptoEmpresa) VALUES(?,?,?,?,?,?)";
            PreparedStatement cmd = cn.prepareStatement(sql);
            
            cmd.setString(1, nombre);
            cmd.setInt(2, departamento);
            cmd.setString(3, dui);
            cmd.setString(4, nit);
            cmd.setString(5, fechaN);
            cmd.setInt(6, deptoE);
            
            
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
    
    public boolean modificarEmpleado(){
        boolean resp = false;
        try{
            String sql = "UPDATE dboEmpleado SET nombreEmpleado = ? ,idDepartamento=?, DUI=?,NIT=?,fechaNacimiento=?,idDeptoEmpresa=? WHERE idEmpleado= ?";
            PreparedStatement cmd = cn.prepareStatement(sql);
            
            cmd.setString(1, nombre);
            cmd.setInt(2, departamento);
            cmd.setString(3, dui);
            cmd.setString(4, nit);
            cmd.setString(5, fechaN);
            cmd.setInt(6, deptoE);
            cmd.setInt(7, idEmpleado);
            
            
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
     
    public void Buscar(String valor, String filtro, JTable Tabla){

        String [] columnas={"ID", "Nombre Completo", "Departamento", "DUI", "NIT", "FechaNacimiento", "Departamento Empresa"};
        String [] cuerpo=new String[7];
        table = new DefaultTableModel(null,columnas); 
        Tabla.removeAll();
        String SSQL = "";
        Connection conect = null;

        if(filtro.equals("NIT")){
            SSQL= "SELECT de.idEmpleado, de.nombreEmpleado, dd.departamento, de.DUI, de.NIT, de.fechaNacimiento, dde.departamentoE AS depto FROM dboEmpleado de, dboDepartamento dd, dboDepartamentoEmpresa dde WHERE de.idDepartamento = dd.idDepartamento AND de.idDeptoEmpresa = dde.idDeptoEmpresa AND NIT like '%"+valor+"%'";
        }else if(filtro.equals("Departamento")){
            SSQL= "SELECT de.idEmpleado, de.nombreEmpleado, dd.departamento, de.DUI, de.NIT, de.fechaNacimiento, dde.departamentoE AS depto FROM dboEmpleado de, dboDepartamento dd, dboDepartamentoEmpresa dde WHERE de.idDepartamento = dd.idDepartamento AND de.idDeptoEmpresa = dde.idDeptoEmpresa AND dd.departamento like '%"+valor+"%'";
        }else if (filtro.equals("DUI")) {
            SSQL= "SELECT de.idEmpleado, de.nombreEmpleado, dd.departamento, de.DUI, de.NIT, de.fechaNacimiento, dde.departamentoE AS depto FROM dboEmpleado de, dboDepartamento dd, dboDepartamentoEmpresa dde WHERE de.idDepartamento = dd.idDepartamento AND de.idDeptoEmpresa = dde.idDeptoEmpresa AND DUI like '%"+valor+"%'";
        }else if (filtro.equals("Depto. Empresa")) {
            SSQL= "SELECT de.idEmpleado, de.nombreEmpleado, dd.departamento, de.DUI, de.NIT, de.fechaNacimiento, dde.departamentoE AS depto FROM dboEmpleado de, dboDepartamento dd, dboDepartamentoEmpresa dde WHERE de.idDepartamento = dd.idDepartamento AND de.idDeptoEmpresa = dde.idDeptoEmpresa AND dde.departamentoE like '%"+valor+"%'";
        }else{
            SSQL= "SELECT de.idEmpleado, de.nombreEmpleado, dd.departamento, de.DUI, de.NIT, de.fechaNacimiento, dde.departamentoE AS depto FROM dboEmpleado de, dboDepartamento dd, dboDepartamentoEmpresa dde WHERE de.idDepartamento = dd.idDepartamento AND de.idDeptoEmpresa = dde.idDeptoEmpresa AND nombreEmpleado like '%"+valor+"%'";
        }

        try {
            PreparedStatement st = cn.prepareStatement(SSQL);
            ResultSet rs = st.executeQuery();

            while (rs.next()){

                cuerpo[0]=rs.getString("idEmpleado");
                    cuerpo[1]=rs.getString("nombreEmpleado");
                    cuerpo[2]=rs.getString("departamento");
                    cuerpo[3]=rs.getString("DUI");
                    cuerpo[4]=rs.getString("NIT");
                    cuerpo[5]=rs.getString("fechaNacimiento");
                    cuerpo[6]=rs.getString("depto");
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
