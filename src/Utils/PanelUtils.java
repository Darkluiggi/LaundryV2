/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import Frontera.ManageArticlePanel;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author leons
 */
public class PanelUtils {
    ManageArticlePanel art = new ManageArticlePanel();
    
    public PanelUtils() {
    }
     public static void add(JPanel panelA, ManageArticlePanel art){
        BorderLayout layout = (BorderLayout) panelA.getLayout();
        panelA.setVisible(false);
        Component center = layout.getLayoutComponent(BorderLayout.CENTER);
        if(center != null){
            panelA.remove(center); 
            panelA.updateUI();
        }                           //cambia el main panel por el loginal dar clic en login
        panelA.add(art, BorderLayout.CENTER);
        panelA.setVisible(true);
    }
    
    public static void change(JPanel panelA, JPanel panelB){
        BorderLayout layout = (BorderLayout) panelA.getLayout();
        panelA.setVisible(false);
        Component center = layout.getLayoutComponent(BorderLayout.CENTER);
        if(center != null){
            panelA.remove(center); 
            panelA.updateUI();
        }                           //cambia el main panel por el loginal dar clic en login
        panelA.add(panelB, BorderLayout.CENTER);
        panelA.setVisible(true);
    }
    
    public static void clear(JPanel panelA){
        
        panelA.setVisible(false);
        panelA.removeAll();                                  //cambia el main panel por el loginal dar clic en login
        panelA.updateUI();
        panelA.setVisible(true);
    }
}
