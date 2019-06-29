/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.DAOTemplate;
import Entidad.Template;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

/**
 *
 * @author leons
 */
 
public class listTemplate {
    
    private static DAOTemplate daoT = new DAOTemplate();

    public listTemplate() {
    }
    
    public static void fillTable(JTable schemaClothes){
       List <Template> list=  daoT.findAll();
        DefaultTableModel model = new DefaultTableModel(null, new String [] {
                "Género", "Nombre", "Lavado", "Lavado y Planchado", "Planchado"
            });
    for (Template t : list) {
        model.addRow(new Object[]{t.getGender(), t.getClothName(), t.getWashPrice(), t.getWaiPrice(), t.getIronPrice()});
    }
    schemaClothes.setModel(model);
        
    }
}
