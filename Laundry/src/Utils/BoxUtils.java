/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import DAO.DAOArticle;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author leons
 */
public class BoxUtils {

    private DAOArticle daoT = new DAOArticle();
    public BoxUtils() {
    }
    public static void updateBox(List<String> list, JComboBox box){
      
        DefaultComboBoxModel model = new DefaultComboBoxModel(list.toArray());
        box.setModel(model);
    }
    
}
