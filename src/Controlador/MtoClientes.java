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
 * @author home
 */
public class MtoClientes {
    //Declarando variables
    private Connection cn;
    private int id;
    private String nombre;
    private int num;
    private String dui;
    private String correo;
    private String direccion;
    private int estado;
    public DefaultTableModel table;
    
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
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the departamento
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the estado
     */
    public int getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    //estableciendo la conexión en el constructor
    public MtoClientes(){
    //Establecemos la conexion
       ConexionJava con = new ConexionJava();
       cn = con.getConexion();
    }
    
    //método para guardar
    public boolean guardarCliente(){
        boolean res = false;
        try{ //Realizar consulta INSERT
           String sql = "INSERT INTO dboCliente(nombreCliente,numCliente,DUI,direccion,correoElectronico,idEstadoUsuario) VALUES(?,?,?,?,?,?)"; //se pasan por referencia por seguridad
           //pide importar clase Prepared Statement
           PreparedStatement cmd = cn.prepareStatement(sql);
           //Lenar los parámetros de la clase, se coloca en el orden de la tabla
           cmd.setString(1,nombre);
           cmd.setInt(2, num);
           cmd.setString(3, dui);
           cmd.setString(4, direccion);
           cmd.setString(5, correo);
           cmd.setInt(6, estado);

            //Si da error devuelve 1, caso contrario 
           //Tomar en cuenta que el ! es negación
           if(!cmd.execute()){
              res=true;
            }
            //cerrando conexion
            cmd.close();
            cn.close();
        }catch(SQLException e ){
            System.out.println(e.toString());
        }
        return res;
    }
    
    //método para modificar
    public boolean modificarCliente(){
        boolean res = false;
        try{ //Realizar consulta UPDATE
           String sql = "UPDATE dboCliente SET  nombreCliente =?, numCliente =?, DUI=?, direccion=?, correoElectronico = ?, idEstadoUsuario =? WHERE idCliente=?";
           //pide importar clase Prepared Statement
           PreparedStatement cmd = cn.prepareStatement(sql);
           //Lenar los parámetros de la clase, se coloca en el orden de la consulta
           
           cmd.setString(1,nombre);
           cmd.setInt(2, num);
           cmd.setString(3, dui);
           cmd.setString(4, direccion);
           cmd.setString(5, correo);
           cmd.setInt(6, estado);
           
           cmd.setInt(7, id);

            //Si da error devuelve 1, caso contrario 
           //Tomar en cuenta que el ! es negación
           if(!cmd.execute()){
              res=true;
            }
            //cerrando conexion
            cmd.close();
            cn.close();
        }catch(Exception e ){
            System.out.println(e.toString());
        }
        return res;
    }
    
    public void Buscar(String valor, String filtro, JTable Tabla){
        String [] columnas={"idCliente", "Nombre completo","Teléfono","DUI","Dirección", "E-mail", "Estado"};
        String [] cuerpo=new String[7];
        table = new DefaultTableModel(null,columnas); 
        Tabla.removeAll();
        String SSQL = "";
        Connection conect = null;

        if(filtro.equals("Estado")){
            SSQL= "SELECT dc.idCliente, dc.nombreCliente, dc.numCliente, dc.DUI, dc.direccion, dc.correoElectronico, de.estadoUsuario FROM dboCliente dc, dboEstadoUsuario de where dc.idEstadoUsuario = de.idEstadoUsuario and de.estadoUsuario like '%"+valor+"%'";
        }
        else if (filtro.equals("DUI")) {
            SSQL= "SELECT dc.idCliente, dc.nombreCliente, dc.numCliente, dc.DUI, dc.direccion, dc.correoElectronico, de.estadoUsuario FROM dboCliente dc, dboEstadoUsuario de where dc.idEstadoUsuario = de.idEstadoUsuario and dc.DUI like '%"+valor+"%'";
        } else{
            SSQL= "SELECT dc.idCliente, dc.nombreCliente, dc.numCliente, dc.DUI, dc.direccion, dc.correoElectronico, de.estadoUsuario FROM dboCliente dc, dboEstadoUsuario de where dc.idEstadoUsuario = de.idEstadoUsuario and dc.nombreCliente like '%"+valor+"%'";
        }

        try {
            PreparedStatement st = cn.prepareStatement(SSQL);
            ResultSet rs = st.executeQuery();
            while (rs.next()){  
                cuerpo[0]=rs.getString("idCliente");
                    cuerpo[1]=rs.getString("nombreCliente");
                    cuerpo[2]=rs.getString("numCliente");
                    cuerpo[3]=rs.getString("DUI");
                    cuerpo[4]=rs.getString("direccion");
                    cuerpo[5]=rs.getString("correoElectronico");
                    cuerpo[6]=rs.getString("estadoUsuario");
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
