/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import DAO.DAOArticle;
import DAO.DAOUser;
import Entidad.Article;
import Entidad.User;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

/**
 *
 * @author leons
 */
public class TableUtils {

    private static DAOArticle daoT = new DAOArticle();
    private static DAOUser daoU = new DAOUser();
    
    public TableUtils() {
    }

    public static void fillTable(JTable schemaClothes) {
        List<Article> list = daoT.findAll();
        DefaultTableModel model = new DefaultTableModel(null, new String[]{
            "Género", "Nombre", "Lavado", "Lavado y Planchado", "Planchado"
        });
        for (Article t : list) {
            model.addRow(new Object[]{t.getGender(), t.getClothName(), t.getWashPrice(), t.getWaiPrice(), t.getIronPrice()});
        }
        schemaClothes.setModel(model);

    }
    
     public static void fillUserTable(JTable userTable){
       List <User> list=  daoU.findAll();
        DefaultTableModel model = new DefaultTableModel(null, new String [] {
                "Nombre","Apellido","Usuario","Contraseña","Rol","País","Dirección","Teléfono"
            });
    for (User t : list) {
        model.addRow(new Object[]{t.getName(), t.getLastName(), t.getUserName(), t.getPassword(), t.getRole(),
                                t.getCountry(),t.getAdress(),t.getPhone()});
    }
    userTable.setModel(model);
        
    }
}
