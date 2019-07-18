/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import DAO.DAOArticle;
import DAO.DAOArticleRequest;
import DAO.DAOCabin;
import DAO.DAORequest;
import Entidad.Article;
import Entidad.ArticleRequest;
import Entidad.Cabin;
import Entidad.Request;
import Utils.BoxUtils;
import Utils.FormUtils;
import Utils.TableUtils;
import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author User
 */
public class ViewRequest extends javax.swing.JPanel {

    private DAOArticle daoT;
    private ArticleRequest artR;
    private DAOArticleRequest daoAR;
    private DAORequest daoR;
    private Article art;
    private Set<ArticleRequest> articleRequestsSet;
    
    public ViewRequest() {
        initComponents();
        //daoT = new DAOArticle();
        //articleRequestsSet = new HashSet<>();
        //daoAR = new DAOArticleRequest();
        daoR = new DAORequest();
        TableUtils.fillTableRequest(requestTable, daoR.findAll());
        //daoC = new DAOCabin();
        //BoxUtils.updateBoxInt(list, CabinId);
        //CabinId.addActionListener((ev) -> {
//            idSelected(ev);
//        });

//        CabinId.putClientProperty("JComboBox.isTableCellEditor", Boolean.TRUE);
    }

    private void idSelected(ActionEvent evt) {
//        String item = (String)CabinId.getSelectedItem();
//        BoxUtils.getArticlesbyGender(item, subItems);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CabinId = new javax.swing.JComboBox<>();
        FindB = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        requestTable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        editButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(2147483647, 1000));
        setMinimumSize(new java.awt.Dimension(800, 400));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(new java.awt.CardLayout());

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel4.setText("Filtrar servicios en curso");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel1.add(jLabel4, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setText("Id de Cabina");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 10, 10);
        jPanel1.add(jLabel2, gridBagConstraints);

        CabinId.setMaximumSize(new java.awt.Dimension(32767, 30));
        CabinId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CabinIdItemStateChanged(evt);
            }
        });
        CabinId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CabinIdFocusGained(evt);
            }
        });
        CabinId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CabinIdActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 10, 10);
        jPanel1.add(CabinId, gridBagConstraints);

        FindB.setText("Buscar");
        FindB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindBActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 10, 10);
        jPanel1.add(FindB, gridBagConstraints);

        jPanel3.add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setMaximumSize(new java.awt.Dimension(32767, 100));
        jPanel2.setPreferredSize(new java.awt.Dimension(837, 40));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(456, 300));

        requestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cabina", "Total", "Nº Prendas", "Fecha de creación"
            }
        ));
        requestTable.getTableHeader().setReorderingAllowed(false);
        requestTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requestTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(requestTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 514;
        gridBagConstraints.ipady = 399;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 35, 14, 14);
        jPanel2.add(jScrollPane1, gridBagConstraints);

        jPanel3.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel5.setLayout(new java.awt.GridBagLayout());

        editButton.setText("Editar Seleccionado");
        editButton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(15, 700, 15, 40);
        jPanel5.add(editButton, gridBagConstraints);

        jPanel3.add(jPanel5, java.awt.BorderLayout.PAGE_END);

        add(jPanel3, "card2");
        add(jPanel4, "card3");
    }// </editor-fold>//GEN-END:initComponents


    private void CabinIdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CabinIdItemStateChanged

    }//GEN-LAST:event_CabinIdItemStateChanged

    private void CabinIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CabinIdFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_CabinIdFocusGained

    private void CabinIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CabinIdActionPerformed

    }//GEN-LAST:event_CabinIdActionPerformed


    private void FindBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindBActionPerformed
        int a;
        List<ArticleRequest> lista;
        a = (Integer) CabinId.getSelectedItem();
        lista = daoAR.findByIds(a);
        TableUtils.fillTableArticleRequest(requestTable, lista);

    }//GEN-LAST:event_FindBActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editButtonActionPerformed

    private void requestTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestTableMouseClicked
        
    }//GEN-LAST:event_requestTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CabinId;
    private javax.swing.JButton FindB;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable requestTable;
    // End of variables declaration//GEN-END:variables
}
