/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class FormUtils {
    
    public static void clearFields(JTextField... textFields){
        for(JTextField textfield : textFields){
            textfield.setText("");
        }
    }
    
}
