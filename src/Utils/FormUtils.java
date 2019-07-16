/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import Entidad.ArticleRequest;
import Entidad.Request;
import java.awt.Color;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
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
    
    public static void enableComponents(JComponent... components){
        Stream.of(components).forEach(c -> c.setEnabled(true));
    }
    
    public static HashMap<String, Double> statisticsTotals(List<Request> list2){
        double wash = 0, iron = 0, ironwash  = 0, total = 0;
        total = list2.stream().mapToDouble(req -> req.getTotal()).sum();
        wash = list2.stream().mapToDouble(r -> r.getArticleSet().stream().filter(ar -> ar.getService().equalsIgnoreCase("lavado")).mapToDouble(ar -> ar.getSubtotal()).sum()).sum();
        iron = list2.stream().mapToDouble(r -> r.getArticleSet().stream().filter(ar -> ar.getService().equalsIgnoreCase("planchado")).mapToDouble(ar -> ar.getSubtotal()).sum()).sum();
        ironwash = list2.stream().mapToDouble(r -> r.getArticleSet().stream().filter(ar -> ar.getService().equalsIgnoreCase("lavado y planchado")).mapToDouble(ar -> ar.getSubtotal()).sum()).sum();
        
        HashMap<String, Double> hm = new HashMap<>();
        hm.put("wash", wash);
        hm.put("iron", iron);
        hm.put("ironwash", ironwash);
        hm.put("total", total);
        
        return hm;
    }
    
}
