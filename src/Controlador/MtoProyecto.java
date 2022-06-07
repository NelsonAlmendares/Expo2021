package Controlador;

import Conexion.ConexionJava;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Conexion.ConexionJava;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/** @author nelson */

public class MtoProyecto {
    
    //FORMULARIO DE RECLAMOS
    //CONFIGURACIÓN INICIAL Y CRUD GENERAL
    private Connection cn;
    private Integer telefono;
    private String dui;
    
    private Integer idReclamo;
    private String fecha;
    public String tipoReclamo;
    public String descripcion;
    public String deptoE;
    public String estado;
    
    public DefaultTableModel table;
    /** @return the cn */
    public Connection getCn() {
        return cn;
    }
    /**
     * @return the tipoReclamo
     */
    public String getTipoReclamo() {
        return tipoReclamo;
    }

    /**
     * @param tipoReclamo the tipoReclamo to set
     */
    public void setTipoReclamo(String tipoReclamo) {
        this.tipoReclamo = tipoReclamo;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the deptoE
     */
    public String getDeptoE() {
        return deptoE;
    }

    /**
     * @param deptoE the deptoE to set
     */
    public void setDeptoE(String deptoE) {
        this.deptoE = deptoE;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
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
    
    /** @param cn the cn to set */
    public void setCn(Connection cn) {
        this.cn = cn;
    }

    /** @return the telefono */
    public Integer getTelefono() {
        return telefono;
    }

    /** @param telefono the telefono to set */
    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    /** @return the fecha */
    public String getFecha() {
        return fecha;
    }

    /** @param fecha the fecha to set */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /** @return the numero */
    public Integer getIdReclamo() {
        return idReclamo;
    }

    /** @param numero the numero to set */
    public void setIdReclamo(Integer numero) {
        this.idReclamo = numero;
    }

    /** @return the dui */
    public String getDui() {
        return dui;
    }

    /** @param dui the dui to set */
    public void setDui(String dui) {
        this.dui = dui;
    }
    
    public MtoProyecto(){
        ConexionJava con = new ConexionJava();
        cn = con.getConexion();
    }
    
    public void mostrarDatos(JTable Table, String query){
        try{
            String consulta = query;
            String cabecera[]={"N° Reclamo", "DUI", "Descripción", "Tipo reclamo", "Fecha", "Estado"};
            String cuerpo[]= new String[7];
            table = new DefaultTableModel(null, cabecera);
            Statement cmd = cn.createStatement();
            ResultSet rs = cmd.executeQuery(consulta);
            while(rs.next()){
                cuerpo[0]=rs.getString(1);
                cuerpo[1]=rs.getString(2);
                cuerpo[2]=rs.getString(3);
                cuerpo[3]=rs.getString(4);
                cuerpo[4]=rs.getString(5);
                cuerpo[5]=rs.getString(6);
                table.addRow(cuerpo);
            }
            Table.setModel(table);
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
    
    public boolean guadarReclamo(){
        boolean resp = false;
        int nReclamo = 0;
        try {
            String sql = "if((SELECT count(idReclamo) FROM dboReclamo dr, dboEstadoReclamo de WHERE idCliente = (SELECT idCliente FROM dboCliente WHERE DUI = ?) AND dr.idEstadoReclamo = de.idEstadoReclamo AND NOT de.estadoReclamo = 'Inhabilitado' AND NOT de.estadoReclamo = 'Completado') < 6) \n" +
                "	BEGIN \n" +
                "		SELECT COUNT(idReclamo) FROM dboReclamo WHERE idCliente = (SELECT idCliente FROM dboCliente WHERE DUI = ?) AND fecha BETWEEN CONVERT(date, GETDATE()-2) AND CONVERT(date, GETDATE()) \n" +
                "	END";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, dui);
            cmd.setString(2, dui);
            ResultSet rs = cmd.executeQuery();
            while(rs.next()){
                nReclamo=rs.getInt(1);
            }
            
            sql = "INSERT INTO dboReclamo(idCliente, idTipoReclamo, descripcion, fecha, idDeptoEmpresa, idEstadoReclamo) VALUES ((SELECT idCliente from dboCliente where numCliente = ? AND DUI = ?), (SELECT idTipoReclamo FROM dboTipoReclamo WHERE tipoReclamo = ?), ?, ?, (SELECT idDeptoEmpresa FROM dboDepartamentoEmpresa WHERE departamentoE = ?), (SELECT idEstadoReclamo FROM dboEstadoReclamo WHERE estadoReclamo = 'Activo'));";
            cmd = cn.prepareStatement(sql);
            
            cmd.setInt(1, telefono);
            cmd.setString(2, dui);
            cmd.setString(3, tipoReclamo);
            cmd.setString(4, descripcion);
            cmd.setString(5, fecha);
            cmd.setString(6, deptoE);
            
            if (nReclamo < 6) {
                if (!cmd.execute()) {
                    resp = true;
                }
            }
            cmd.close();
            cn.close();
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return resp;
    }
    
    public boolean actualizarReclamo(){
        boolean res = false;
        try{
            String sql = "UPDATE dboReclamo SET idCliente = (SELECT idCliente FROM dboCliente WHERE DUI = ?), idTipoReclamo = (SELECT idTipoReclamo FROM dboTipoReclamo WHERE tipoReclamo = ?), descripcion = ?, fecha = ?, idDeptoEmpresa = (SELECT idDeptoEmpresa FROM dboDepartamentoEmpresa WHERE departamentoE = ?), idEstadoReclamo = (SELECT idEstadoReclamo FROM dboEstadoReclamo WHERE estadoReclamo = ?) WHERE idReclamo = ?;";
            
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, dui);
            cmd.setString(2, tipoReclamo);
            cmd.setString(3, descripcion);
            cmd.setString(4, fecha);
            cmd.setString(5, deptoE);
            cmd.setString(6, estado);
            cmd.setInt(7, idReclamo);
            
            //en caso de error devuelve 1
            if (!cmd.execute()) {
                res = true;
            }
            cmd.close();
            cn.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        return res;
    }
    public boolean actualizarEstadoReclamo(){
        boolean res = false;
        try{
            String sql = "UPDATE dboReclamo SET idEstadoReclamo = (SELECT idEstadoReclamo FROM dboEstadoReclamo WHERE estadoReclamo = ?) WHERE idReclamo = ?;";
            
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1, estado);
            cmd.setInt(2, idReclamo);
            
            //en caso de error devuelve 1
            if (!cmd.execute()) {
                res = true;
            }
            cmd.close();
            cn.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        return res;
    }
    
    public void consultarReclamo(int id){ //Para llenar los textFields
        boolean res = false;
        try{ //Realizar consulta UPDATE
           String sql = "Select idReclamo, nombreCompleto, DUI, numTelefono, correoElectronico, tipoReclamo, descripcion, fecha, idDeptoEmpresa, idEstadoReclamo from dboReclamo where idReclamo = ?";
           //pide importar clase Prepared Statement
           PreparedStatement cmd = cn.prepareStatement(sql);
           //Lenar los parámetros de la clase, se coloca en el orden de la consulta
           cmd.setInt(1, id);
           
           //Ejecutar la consulta
            //pedirá importar la clase ResultSet
            ResultSet rs = cmd.executeQuery();
            //recorrer la lista de registros
            while(rs.next()){
              res=true;
              //asignándole a los atributos de la clase
              idReclamo = rs.getInt(1);
              dui = rs.getString(3);
              telefono = rs.getInt(4);
              tipoReclamo = rs.getString(6);
              descripcion = rs.getString(7);
              fecha = rs.getString(8);
              deptoE = rs.getString(9);
              estado = rs.getString(10);
            }
            //cerrando conexion
            cmd.close();
            cn.close();
        }catch(Exception e ){
            System.out.println(e.toString());
        }
    }
    
    public boolean eliminarReclamo(){
        boolean res = false;
        try{ //Realizar consulta DELETE
           String sql = "DELETE FROM dboReclamo WHERE idReclamo=?";
           PreparedStatement cmd = cn.prepareStatement(sql);//Lenar los parámetros 
           cmd.setInt(1,idReclamo); 
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
    public DefaultComboBoxModel cargarComboTipo(){
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        try{
            String sql = "Select idTipoReclamo, tipoReclamo from dboTipoReclamo";
            Statement st=cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while(rs.next()){
                model.addElement(rs.getString(2));
            }
            
            rs.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        return model;
    }
    
    public DefaultComboBoxModel cargarComboDeptoEmpresa(){
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        try{
            String sql = "Select idDeptoEmpresa, departamentoE from dboDepartamentoEmpresa";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while(rs.next()){
                model.addElement(rs.getString(2));
            }
            
            rs.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        return model;
    }
    
    public DefaultComboBoxModel cargarComboEstado(){
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        try{
            String sql = "Select idEstadoReclamo, estadoReclamo from dboEstadoReclamo";
            Statement st=cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while(rs.next()){
                model.addElement(rs.getString(2));
            }
            cn.close();
            rs.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        return model;
    }
    public void Buscar(String valor, String filtro, JTable Tabla, String estado1, String estado2, String depto){
        String [] columnas={"N° Reclamo", "DUI", "Descripción", "Tipo Reclamo", "Fecha", "Estado"};
        String [] cuerpo=new String[7];
        table = new DefaultTableModel(null,columnas); 
        Tabla.removeAll();
        String SSQL = "";
        Connection conect = null;

        if(filtro.equals("Tipo reclamo")){
            SSQL= "SELECT idReclamo, dc.DUI, descripcion, dt.tipoReclamo, fecha, er.estadoReclamo from dboCliente dc, dboReclamo r, dboTipoReclamo dt, dboEstadoReclamo er where r.idEstadoReclamo = er.idEstadoReclamo AND r.idCliente = dc.idCliente AND r.idTipoReclamo = dt.idTipoReclamo AND NOT er.estadoReclamo = '"+estado1+"' AND NOT er.estadoReclamo = '"+estado2+"' "+depto+" AND dt.tipoReclamo like '%"+valor+"%'";
        }else if(filtro.equals("Estado reclamo")){
            SSQL= "SELECT idReclamo, dc.DUI, descripcion, dt.tipoReclamo, fecha, er.estadoReclamo from dboCliente dc, dboReclamo r, dboTipoReclamo dt, dboEstadoReclamo er where r.idEstadoReclamo = er.idEstadoReclamo AND r.idCliente = dc.idCliente AND r.idTipoReclamo = dt.idTipoReclamo "+depto+" AND er.estadoReclamo like '%"+valor+"%'";
        }else if (filtro.equals("DUI")) {
            SSQL= "SELECT idReclamo, dc.DUI, descripcion, dt.tipoReclamo, fecha, er.estadoReclamo from dboCliente dc, dboReclamo r, dboTipoReclamo dt, dboEstadoReclamo er where r.idEstadoReclamo = er.idEstadoReclamo AND r.idCliente = dc.idCliente AND r.idTipoReclamo = dt.idTipoReclamo AND NOT er.estadoReclamo = '"+estado1+"' AND NOT er.estadoReclamo = '"+estado2+"' "+depto+" AND dc.DUI like '%"+valor+"%'";
        }else{
            SSQL= "SELECT idReclamo, dc.DUI, descripcion, dt.tipoReclamo, fecha, er.estadoReclamo from dboCliente dc, dboReclamo r, dboTipoReclamo dt, dboEstadoReclamo er where r.idEstadoReclamo = er.idEstadoReclamo AND r.idCliente = dc.idCliente AND r.idTipoReclamo = dt.idTipoReclamo AND NOT er.estadoReclamo = '"+estado1+"' AND NOT er.estadoReclamo = '"+estado2+"' "+depto+" AND dc.nombreCliente like '%"+valor+"%'";
        }

        try {
            PreparedStatement st = cn.prepareStatement(SSQL);
            ResultSet rs = st.executeQuery();

            while (rs.next()){
                cuerpo[0]=rs.getString("idReclamo");
                cuerpo[1]=rs.getString("DUI");
                cuerpo[2]=rs.getString("descripcion");
                cuerpo[3]=rs.getString("tipoReclamo");
                cuerpo[4]=rs.getString("fecha");
                cuerpo[5]=rs.getString("estadoReclamo");
                table.addRow(cuerpo);
            }

            Tabla.setModel(table);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);
        }finally{
            if(conect!=null){
                try {conect.close();} 
                catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex, "Error de desconexión", JOptionPane.ERROR_MESSAGE);
                }
            }
          }
    }
    
    
    public void ConsultaAviso(String consulta, JLabel label1, JLabel label2, JLabel label3, JLabel label4){
        try{
            Statement declara= cn.createStatement();
            ResultSet res = declara.executeQuery(consulta);
                while(res.next()){
                    label1.setText(res.getString(2));
                    
                    String label2S = (res.getString(3));
                    String newString2 = label2S.replace("&", "<br>");
                    label2.setText("<html>" + newString2);

                    label3.setText(res.getString(4));
                    Icon Imagenes = new ImageIcon(getClass().getResource("/Sources/" + res.getString(5) + ".png"));
                    label4.setIcon(Imagenes);
                    label4.repaint();
                    
                }
            }catch(Exception e){
//                JOptionPane.showMessageDialog(null, "Error" + e.getMessage(), 
//                        "Error de conexión", JOptionPane.ERROR_MESSAGE);
            }
    }
    
    public void cargarEstadisticas(JLabel label1, JLabel label2){
        try{
            String consulta1 = "Select count(idReclamo) as numeroActivos from dboReclamo where idEstadoReclamo = 1;";
            Statement declara= cn.createStatement();
            ResultSet res = declara.executeQuery(consulta1);
            while(res.next()){
                label1.setText(res.getString(1));
            }
            String consulta2 = "Select count(idReclamo) as numeroProgreso from dboReclamo where idEstadoReclamo = 2;";
            Statement declarar= cn.createStatement();
            ResultSet res2 = declarar.executeQuery(consulta2);
            while(res2.next()){
                label2.setText(res2.getString(1));
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
