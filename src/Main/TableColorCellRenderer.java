/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author pc
 */
public class TableColorCellRenderer implements TableCellRenderer {
    private static final TableCellRenderer RENDERER = new DefaultTableCellRenderer();
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = RENDERER.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        for (int i = 0; i < table.getColumnCount(); i++) { 
            Class<?> col_class = table.getColumnClass(i);
            table.setDefaultEditor(col_class, null); // remove editor }
        } 

        Color color = null;
        String valor = String.valueOf(table.getValueAt(row, column));
        c.setForeground(Color.black);
        switch (valor) {
            case "Activo":
                color = new Color(45, 227, 75);
                c.setBackground(color);
                break;
            case "En progreso":
                color = new Color(255, 230, 43);
                c.setBackground(color);
                break;
            case "Completado":
                color = new Color(2, 103, 255);
                c.setBackground(color);
                break;
            case "Inhabilitado":
                color = new Color(150, 150, 150);
                c.setBackground(color);
                break;
            case "Con dificultades":
                c.setBackground(Color.RED);
                c.setForeground(Color.WHITE);
                break;
                
            default:
                color = new Color(64,126,130);
                c.setForeground(color);
                if (Expo.darkMode == 1) {
                    c.setBackground(new java.awt.Color(13, 17, 23));
                    c.setForeground(Color.white);
                }else{
                    c.setBackground(Color.white);
                }
                break;
        }
//        table.setRowSelectionAllowed(true);
        table.setShowHorizontalLines(true);
//        table.setBackground(Color.green);
//        table.setSelectionBackground(Color.red);
        return c;
    }
    
}
