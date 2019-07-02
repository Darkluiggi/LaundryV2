/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import DAO.DAOArticle;
import Entidad.Article;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

/**
 *
 * @author leons
 */
public class TableUtils {

    public TableUtils() {
    }

    public static void fillTable(JTable table, List<Article> list) {
        DefaultTableModel model = new DefaultTableModel(null, new String[]{
            "Género", "Nombre", "Lavado", "Lavado y Planchado", "Planchado"
        });
        for (Article t : list) {
            model.addRow(new Object[]{t.getGender(), t.getClothName(), t.getWashPrice(), t.getWaiPrice(), t.getIronPrice()});
        }
        table.setModel(model);
    }
}
