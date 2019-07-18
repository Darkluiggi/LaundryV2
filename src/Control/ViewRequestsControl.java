/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class ViewRequestsControl {
    public static void TableClicked(JComboBox gender, JComboBox cloth, JTextField quantity, JCheckBox wash, JCheckBox iron, JCheckBox ironWash
    , JCheckBox fold, JCheckBox Xpress, JTable table){
        String a, b, c;

        a = (String) table.getValueAt(table.getSelectedRow(), 1);
        b = (String) table.getValueAt(table.getSelectedRow(), 2);
        c = (String) table.getValueAt(table.getSelectedRow(), 3);
        
        boolean d = (boolean) table.getValueAt(table.getSelectedRow(), 4);
        boolean e = (boolean) table.getValueAt(table.getSelectedRow(), 5);
        
        int quant = (int) table.getValueAt(table.getSelectedRow(), 6);
        //double subtotal = (double) table.getValueAt(table.getSelectedRow(), 6);
        
        gender.setSelectedItem(a);
        cloth.setSelectedItem(b);
        
        switch(c.toLowerCase()){
            case "lavado":
                wash.setSelected(true);
                break;
            case "planchado":
                iron.setSelected(true);
                break;
            case "lavado y planchado":
                ironWash.setSelected(true);
                break;
            default:
                break;
        }
        
        fold.setSelected(d);
        Xpress.setSelected(e);
        
        quantity.setText(String.valueOf(quant));
        
    }
}
