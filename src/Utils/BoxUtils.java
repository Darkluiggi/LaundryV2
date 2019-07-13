/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import DAO.DAOArticle;
import java.util.Hashtable;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author leons
 */
public class BoxUtils {

    private static DAOArticle daoT = new DAOArticle();
    public BoxUtils() {
    }
    public static void updateBox(List<String> list, JComboBox box){
        String defaultItem = "Seleccionar...";
        list.add(0, defaultItem);
        DefaultComboBoxModel model = new DefaultComboBoxModel(list.toArray());
        box.setModel(model);
        box.setSelectedItem(defaultItem);
    }
    
    public static void getArticlesbyGender(String Gender, Hashtable<String, String[]> subItems){
        List<String> clothes = daoT.getByGender(Gender).stream().map(u -> u.getClothName()).collect(Collectors.toList());
        clothes.add(0, "Seleccionar...");
        String[] clothesArray = clothes.toArray(new String[0]);
        subItems.put(Gender, (String[]) clothesArray);
    }    
}
