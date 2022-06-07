/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author pc
 */
public class Validaciones {
    
    public static void SoloLetras(java.awt.event.KeyEvent evt){
        if (!Character.isLetter(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar()) && !Character.isSpace(evt.getKeyChar())) { //car == ',' || car == '.' Para no permitir la coma y el punto
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
         }
    }
    
    public static void SoloNumerosLimite(java.awt.event.KeyEvent evt, JTextField campo){
        if (!Character.isDigit(evt.getKeyChar())) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
         }
        if (campo.getText().length()== 8) {
            evt.consume();
        }
        
    }
    
    public static void SoloLetrasConArroba(java.awt.event.KeyEvent evt){
        char car = evt.getKeyChar();
        if (!Character.isLetter(evt.getKeyChar()) && Character.isSpace(evt.getKeyChar()) && car != '@' && car != '.') { //car == ',' || car == '.' Para no permitir la coma y el punto
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
         }
    }
    
    public static void SoloNumerosConGuion(java.awt.event.KeyEvent evt, JTextField campo){
        char car = evt.getKeyChar();
        if (!Character.isDigit(evt.getKeyChar()) && car != '-') {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
         }
        if (campo.getText().length() == 10) {
            evt.consume();
        }
    }
    
}
