/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Color;
import java.awt.Component;
import java.awt.Insets;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.MenuElement;
import javax.swing.UIManager;

/**
 *
 * @author home
 */
public class CustomizeMenu {
    public static void customizeMenuBar(JMenuBar menuBar) {

//        menuBar.setUI(new BasicMenuBarUI() {
//
//            @Override
//            public void paint(Graphics g, JComponent c) {
//                g.setColor(new java.awt.Color(5, 4, 45));
//                g.fillRect(0, 0, c.getWidth(), c.getHeight());
//            }
//        });

        MenuElement[] menus = menuBar.getSubElements();

        for (MenuElement menuElement : menus) {

            JMenu menu = (JMenu) menuElement.getComponent();
//            changeComponentColors(menu);
            menu.setForeground(Color.white);
            menu.setMargin(new Insets(2, 5, 1, 4));

            MenuElement[] menuElements = menu.getSubElements();

            for (MenuElement popupMenuElement : menuElements) {

                JPopupMenu popupMenu = (JPopupMenu) popupMenuElement.getComponent();
                popupMenu.setBorder(null);
                MenuElement[] menuItens = popupMenuElement.getSubElements();

                for (MenuElement menuItemElement : menuItens) {
                    JMenuItem menuItem = (JMenuItem) menuItemElement.getComponent();
                    changeComponentColors(menuItem);
                    menuItem.setOpaque(true);
                    menuItem.setMargin(new Insets(3, 3, 3, 2));
                }
            }
        }
    }

    private static void changeComponentColors(Component comp) {
        comp.setBackground(new java.awt.Color(5, 4, 45));
        comp.setForeground(Color.white);
    }
    
    
    public static void UI(Color cl1, Color cl2, Color cl3, Color cl4, Boolean cn, Color cl5, Color cl6){
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    UIManager.put("nimbusBlueGrey", cl1); //MenuBar and TableHeader
                    UIManager.put("text", cl2); //Texto
//                    UIManager.put("textForeground", cl2);
                    UIManager.put("control", cl3); //JScrollPane
                    UIManager.put("nimbusLightBackground", cl4); //Color tablas
                    UIManager.put("info", cl5); //ToolTip
                    UIManager.put("Table.showGrid", cn); //Mostrar grid de tabla
                    UIManager.put("nimbusBase", cl6); //Combo box, boton principal JOPtionPane y marco de formularios
//                    UIManager.put("ComboBox:\"ComboBox.listRenderer\"[Selected].textForeground", new java.awt.Color(255, 4, 45));
                    UIManager.put("nimbusSelectionBackground", new java.awt.Color(10,120,255));
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomizeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
