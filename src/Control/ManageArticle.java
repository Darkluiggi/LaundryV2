/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.DAOArticle;
import Entidad.Article;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author leons
 */

public class ManageArticle implements Controller{

    private static DAOArticle daoT = new DAOArticle();
    public ManageArticle() {
    }
    
    public static void createArticle(JComboBox GenderBox, JTextField NameTF,JTextField WashTF, JTextField IronandWashTF,
            JTextField IronTF,JTextField FoldTF, JCheckBox WashC, JCheckBox WaiC, JCheckBox IronC, JCheckBox foldC) {
            Article temp = new Article();
        
        temp.setGender((String)GenderBox.getSelectedItem());
        temp.setClothName(NameTF.getText());
        temp.setWashPrice(Float.parseFloat(WashTF.getText()));
        temp.setWashA(WashC.isSelected());
        temp.setWaiPrice(Float.parseFloat(IronandWashTF.getText()));
        temp.setIronPrice(Float.parseFloat(IronTF.getText()));
        temp.setIronA(IronC.isSelected());
        temp.setFoldPrice(Float.parseFloat(FoldTF.getText()));
        temp.setFoldA(foldC.isSelected());
        daoT.create(temp);
        
    }

    @Override
    public void executeCallBack(Runnable callback) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
