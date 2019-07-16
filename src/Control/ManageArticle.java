/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.DAOArticle;
import Entidad.Article;
import Utils.FormUtils;
import Utils.TableUtils;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author leons
 */

public class ManageArticle implements Controller{

    private static DAOArticle daoA = new DAOArticle();
    private static Article temp = new Article();
    public ManageArticle() {
        
        
    }
    
    public static void createArticle( JComboBox GenderBox, JTextField NameTF,JTextField WashTF, JTextField IronandWashTF,
            JTextField IronTF,JTextField foldTF, JCheckBox WashC, JCheckBox WaiC,
            JCheckBox IronC, JCheckBox foldC ) {
            
            Article temp = new Article();
            temp.setClothName(NameTF.getText());
            temp.setGender((String)GenderBox.getSelectedItem());
            temp.setWashPrice(Double.parseDouble(WashTF.getText()));
            temp.setWashA(WashC.isSelected());
            temp.setWaiPrice(Double.parseDouble(IronandWashTF.getText()));
            temp.setWaiA(WaiC.isSelected());
            temp.setIronPrice(Double.parseDouble(IronTF.getText()));
            temp.setIronA(IronC.isSelected());
            temp.setFoldPrice(Double.parseDouble(foldTF.getText()));
            temp.setFoldA(foldC.isSelected());
            temp.setStatus(true);
            daoA.create(temp);
            
    }
        public static void editArticle( JComboBox GenderBox, JTextField NameTF,JTextField WashTF, JTextField IronandWashTF,
            JTextField IronTF,JTextField foldTF, JCheckBox WashC, JCheckBox WaiC,
            JCheckBox IronC, JCheckBox foldC) {
            
            
            temp.setClothName(NameTF.getText());
            temp.setGender((String)GenderBox.getSelectedItem());
            temp.setWashPrice(Double.parseDouble(WashTF.getText()));
            temp.setWashA(WashC.isSelected());
            temp.setWaiPrice(Double.parseDouble(IronandWashTF.getText()));
            temp.setWaiA(WaiC.isSelected());
            temp.setIronPrice(Double.parseDouble(IronTF.getText()));
            temp.setIronA(IronC.isSelected());
            temp.setFoldPrice(Double.parseDouble(foldTF.getText()));
            temp.setFoldA(foldC.isSelected());
            temp.setStatus(true);
            daoA.update(temp);
            
    }
        
   
    public static void TableClicked(JComboBox GenderBox, JTextField NameTF,JTextField WashTF, JTextField IronandWashTF,
            JTextField IronTF,JTextField FoldTF, JCheckBox WashC, JCheckBox WaiC,
            JCheckBox IronC, JCheckBox foldC,JLabel ExceptionField, JTable schemaClothes) {
        
        String a,b;
        
        a= (String)schemaClothes.getValueAt(schemaClothes.getSelectedRow(), 0);
        b= (String)schemaClothes.getValueAt(schemaClothes.getSelectedRow(), 1);
        temp.setGender(a);
        temp.setClothName(b);
        temp=daoA.read(schemaClothes.getSelectedRow()+1);
        GenderBox.setSelectedItem(temp.getGender());
        NameTF.setText(temp.getClothName());
        WashTF.setText(Double.toString(temp.getWashPrice()));
        WashC.setSelected(temp.isWashA());
        IronandWashTF.setText(Double.toString(temp.getWaiPrice()));
        WaiC.setSelected(temp.isWaiA());
        IronTF.setText(Double.toString(temp.getIronPrice()));
        IronC.setSelected(temp.isIronA());
        FoldTF.setText(Double.toString(temp.getFoldPrice()));
        foldC.setSelected(temp.isFoldA());
        
    }

    @Override
    public void executeCallBack(Runnable callback) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
