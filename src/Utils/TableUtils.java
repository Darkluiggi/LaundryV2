/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import Control.Controller;
import Entidad.Article;
import Entidad.ArticleRequest;
import Entidad.User;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import sun.net.www.content.image.gif;

/**
 *
 * @author leons
 */
public class TableUtils {

    public TableUtils() {
    }

    public static void fillTableUser(JTable table, List<User> list) {
        DefaultTableModel model = new DefaultTableModel(null, new String [] {
        "Nombre", "Apellido", "Nombre de Usuario", "País", "Dirección", "Teléfono", "Contraseña", "Rol"
    });
        for (User t : list) {
            model.addRow(new Object[]{t.getName(), t.getLastName(), t.getUserName(), t.getCountry(), t.getAdress(),
            t.getPhone(),t.getPassword(),t.getRole()});
        }
        table.setModel(model);
    } 
    
    public static void fillTableArticle(JTable table, List<Article> list) {
        DefaultTableModel model = new DefaultTableModel(null, new String[]{
            "Género", "Nombre", "Lavado", "Lavado y Planchado", "Planchado", "Doblado"
        });
        for (Article t : list) {
            model.addRow(new Object[]{t.getGender(), t.getClothName(), t.getWashPrice(), t.getWaiPrice(), t.getIronPrice()
            ,t.getFoldPrice()});
        }
        table.setModel(model);
    }

    public static void fillTableArticleRequest(JTable table, List<ArticleRequest> list) {
        DefaultTableModel model = new DefaultTableModel(null,
    new String [] {
        "Género", "Nombre", "Servicio", "Doblado", "Express", "Cantidad", "Subtotal"
    }) {
    Class[] types = new Class [] {
        java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class
    };
    boolean[] canEdit = new boolean [] {
        false, false, false, false, false, false, false
    };
    public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
    }
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
    
    public class MiModelo extends DefaultTableModel
{
   /** Primera columna Boolean, segunda Integer y el resto Object */
   public Class getColumnClass(int columna)
   {
      if (columna == 0) return Boolean.class;
      if (columna == 1) return Integer.class;
      return Object.class;
   }
}
    

    public static void addPopUpMenu(JTable table) {
        final JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem editItem = new JMenuItem("Editar");
        JMenuItem disableItem = new JMenuItem("Deshabilitar");
        editItem.addActionListener((ActionEvent e) -> {
            //TODO: Add Popup for editing
        });
        popupMenu.add(editItem);
        table.setComponentPopupMenu(popupMenu);
    }

    public static void clearTable(JTable table) {
        DefaultTableModel dm = (DefaultTableModel) table.getModel();
        int rowCount = dm.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            dm.removeRow(i);
        }
    }
}
