package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/** @author nelson */

public class ConexionJava {

    public Connection getConexion(){
        
        String sql = "jdbc:sqlserver://DESKTOP-EIR6FIA:1433;"
                //DESKTOP-EIR6FIA Josué
                //DESKTOP-EE0H2A3 Vicky
                //DESKTOP-AEINNU3
                //DESKTOP-44G05AI Elmercito

            + "database=DBAtClient;"
            + "user=Josue;"
            + "password=1234;"
            + "loginTimeout=3;";

        try {
            Connection con = DriverManager.getConnection(sql);
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
    }
}
