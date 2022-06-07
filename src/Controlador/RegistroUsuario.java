/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author elmer
 */
public class RegistroUsuario {

    public static String Usuario;
    public static String Contraseña;
    public static String DUI;
    
    public String getUsuario(){
        return Usuario;
    }
    
    public void setUsuario(String Usuario){
        this.Usuario=Usuario;
    }
    
    //return Contraseña y Contraseña set
    public String getContraseña(){
        return Contraseña;
    }
    
    public void setContraseña(String Contraseña){
        this.Contraseña=Contraseña;
    }
    
    /**
     * @return the DUI
     */
    public static String getDUI() {
        return DUI;
    }

    /**
     * @param aDUI the DUI to set
     */
    public static void setDUI(String aDUI) {
        DUI = aDUI;
    }
}
