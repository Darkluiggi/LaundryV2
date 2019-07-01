/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import javax.swing.JPanel;

/**
 *
 * @author leons
 */
public class PanelUtils {

    public PanelUtils() {
    }
    
    public static void change(JPanel panelA, JPanel panelB){
        
        panelA.setVisible(false);
        panelA.removeAll();                                  //cambia el main panel por el loginal dar clic en login
        panelA.updateUI();
        panelA.add(panelB);
        panelA.setVisible(true);
    }
    
    public static void clear(JPanel panelA){
        
        panelA.setVisible(false);
        panelA.removeAll();                                  //cambia el main panel por el loginal dar clic en login
        panelA.updateUI();
        panelA.setVisible(true);
    }
}
