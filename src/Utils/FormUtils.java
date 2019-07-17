/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.stream.Stream;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;

/**
 *
 * @author User
 */
public class FormUtils {
    
    public static void clearFields(JComponent... jComponents){
        for(JComponent component : jComponents){
            if(component instanceof JTextField){
                JTextField textfield = (JTextField) component;
                textfield.setText("");
            }else if(component instanceof JComboBox){
                JComboBox combobox = (JComboBox) component;
                combobox.setSelectedIndex(0);
            }else if(component instanceof JCheckBox){
                JCheckBox checkBox = (JCheckBox) component;
                checkBox.setSelected(false);
            }
            
        }
    }
    
    public static String validateField(JComponent... jComponents){
        final String EXCEPTION = "Por favor asegúrese que la información ingresada sea válida";
        String ex = "";
        Border defaultBorder = UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border");
        for(JComponent jComponent : jComponents){
            if(jComponent instanceof JTextField){
                JTextField text = (JTextField) jComponent;
                if(text.getText().isEmpty()){
                    text.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    ex = EXCEPTION;
                }else{
                    ex = "";
                    text.setBorder(defaultBorder);
                }
            }else if(jComponent instanceof JComboBox){
                JComboBox combo = (JComboBox) jComponent;
                defaultBorder = UIManager.getLookAndFeel().getDefaults().getBorder("ComboBox.border");
                if(combo.getSelectedIndex() < 1){
                    combo.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    ex = EXCEPTION;
                }else{
                    ex = "";
                    combo.setBorder(defaultBorder);
                }
            }
        }
        return ex;
    }
    public static void addBorderLayout(JPanel centerMainPanel, JTable userTable) {
         centerMainPanel.setVisible(false);
        centerMainPanel.removeAll();
        centerMainPanel.setLayout(new BorderLayout());
        centerMainPanel.add(userTable);
        centerMainPanel.setVisible(true);
    }
    public static void setFields(JTextField nameTF, JTextField lastNameTF,JTextField userNameTF,JTextField countryTF,
                JTextField adressTF,JTextField passwordTF,JTextField phoneTF,JCheckBox adminC) {
        
        nameTF.setText("Nombre");
        lastNameTF.setText("Apellido");
        userNameTF.setText("Nombre de Usuario");
        countryTF.setText("Pais");
        adressTF.setText("Direccion");
        phoneTF.setText("Telefono");
        passwordTF.setText("Contraseña");
    }
    
    public static void enableComponents(JComponent... components){
        Stream.of(components).forEach(c -> c.setEnabled(true));
    }
    
}
