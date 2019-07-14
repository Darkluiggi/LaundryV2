/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import Entidad.Article;
import Entidad.ArticleRequest;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

/**
 *
 * @author leons
 */
public class TableUtils {

    public TableUtils() {
    }

    public static void fillTableArticle(JTable table, List<Article> list) {
        DefaultTableModel model = new DefaultTableModel(null, new String[]{
            "Género", "Nombre", "Lavado", "Lavado y Planchado", "Planchado"
        });
        for (Article t : list) {
            model.addRow(new Object[]{t.getGender(), t.getClothName(), t.getWashPrice(), t.getWaiPrice(), t.getIronPrice()});
        }
        table.setModel(model);
    }

    public static void fillTableArticleRequest(JTable table, List<ArticleRequest> list) {
        DefaultTableModel model = new DefaultTableModel(null, new String[]{
            "Género", "Nombre", "Servicio", "Doblado", "Express", "Cantidad", "Subtotal"}){
        };       
        for (ArticleRequest t : list) {
        model.addRow(new Object[]{t.getArticle().getGender(), t.getArticle().getClothName(), t.getService(), t.isFold(), t.isExpress(), t.getQuantity(), t.getSubtotal()});
        }
        table.setModel(model);
    }
    
    public static void fillTableArticleServices(JTable table, List<ArticleRequest> list) {
        DefaultTableModel model = new DefaultTableModel(null, new String [] {
        "ID", "Cabina", "Lavado", "Planchado", "Lav. y Plan.", "Express", "Total"
    });
        for (ArticleRequest t : list) {
        model.addRow(new Object[]{t.getRequest().getId(), t.getRequest().getCabin(), t.getArticle().getClothName(), 
            t.getService(), t.isFold(), t.isExpress(), t.getQuantity(), t.getSubtotal()});
        }
        table.setModel(model);
    }
    
    
    

    public static void addPopUpMenu(JTable table) {
        final JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem editItem = new JMenuItem("Editar");
        editItem.addActionListener((ActionEvent e) -> {
            //TODO: Add Popup for editing
        });
        popupMenu.add(editItem);
        table.setComponentPopupMenu(popupMenu);
    }
}
