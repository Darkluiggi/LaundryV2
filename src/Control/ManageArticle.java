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

    private static DAOArticle daoT;
    private static Entidad.Article art;
    public ManageArticle() {
        daoT = new DAOArticle();
        art = new Entidad.Article();
    }
    
    public static void createArticle(JComboBox GenderBox, JTextField NameTF,JTextField WashTF, JTextField IronandWashTF,
            JTextField IronTF,JTextField FoldTF, JCheckBox WashC, JCheckBox WaiC,
            JCheckBox IronC, JCheckBox foldC,JLabel ExceptionField, JTable schemaClothes) {
            Article temp = new Article();
        
                
        String exception = FormUtils.validateField(NameTF, GenderBox, WashTF, IronTF, IronandWashTF, FoldTF);
        if (exception.equals("")) {
            ExceptionField.setText(exception);
            temp.setClothName(NameTF.getText());
            temp.setGender((String)GenderBox.getSelectedItem());
            temp.setWashPrice(Double.parseDouble(WashTF.getText()));
            temp.setWashA(WashC.isSelected());
            temp.setWaiPrice(Double.parseDouble(IronandWashTF.getText()));
            temp.setWaiA(WaiC.isSelected());
            temp.setIronPrice(Double.parseDouble(IronTF.getText()));
            temp.setIronA(IronC.isSelected());
            temp.setFoldPrice(Double.parseDouble(FoldTF.getText()));
            temp.setFoldA(foldC.isSelected());
            temp.setStatus(true);
            daoT.create(temp);
            TableUtils.fillTableArticle(schemaClothes, daoT.findAll());
            FormUtils.clearFields(NameTF, GenderBox, WashTF, IronTF, IronandWashTF, FoldTF);
        }else{
            ExceptionField.setText(exception);
        }
        
        
    }
    public static void TableClicked(JComboBox GenderBox, JTextField NameTF,JTextField WashTF, JTextField IronandWashTF,
            JTextField IronTF,JTextField FoldTF, JCheckBox WashC, JCheckBox WaiC,
            JCheckBox IronC, JCheckBox foldC,JLabel ExceptionField, JTable schemaClothes) {
        
        String a,b;

        a= (String)schemaClothes.getValueAt(schemaClothes.getSelectedRow(), 0);
        b= (String)schemaClothes.getValueAt(schemaClothes.getSelectedRow(), 1);
        art.setGender(a);
        art.setClothName(b);
        art=daoT.read(schemaClothes.getSelectedRow()+1);
        GenderBox.setSelectedItem(art.getGender());
        NameTF.setText(art.getClothName());
        WashTF.setText(Double.toString(art.getWashPrice()));
        WashC.setSelected(art.isWashA());
        IronandWashTF.setText(Double.toString(art.getWaiPrice()));
        WaiC.setSelected(art.isWaiA());
        IronTF.setText(Double.toString(art.getIronPrice()));
        IronC.setSelected(art.isIronA());
        FoldTF.setText(Double.toString(art.getFoldPrice()));
        foldC.setSelected(art.isFoldA());
        
    }

    @Override
    public void executeCallBack(Runnable callback) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
