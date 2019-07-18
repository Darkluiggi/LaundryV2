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
import java.util.Set;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author User
 */
public class EditRequest1 extends javax.swing.JPanel {

    private DAOArticle daoT;
    private ArticleRequest artR;
    private DAOArticleRequest daoAR;
    private DAORequest daoR;
    private Article art;
    private Set<ArticleRequest> articleRequestsSet;
    private Hashtable<String, String[]> subItems= new Hashtable<String, String[]>();
    private Request request;
    private Cabin cabin;
    private DAOCabin daoC;

    public EditRequest1() {
        initComponents();
        TableUtils.fillTableArticleRequest(requestTable, Collections.emptyList());
        daoT = new DAOArticle();
        articleRequestsSet = new HashSet<>();
        daoAR = new DAOArticleRequest();
        daoR = new DAORequest();
        daoC = new DAOCabin();
        createRequestBtn.setEnabled(false);
        BoxUtils.updateBox(daoT.getGenders(), GenderBox);
        GenderBox.addActionListener((ev)->{
            genderSelected(ev);
        });
                
        GenderBox.putClientProperty("JComboBox.isTableCellEditor", Boolean.TRUE);
    }
    
    private void genderSelected(ActionEvent evt){
        String item = (String)GenderBox.getSelectedItem();
        BoxUtils.getArticlesbyGender(item, subItems);
        Object o = subItems.get(item);

        if (o == null)
        {
            ClothBox.setModel( new DefaultComboBoxModel() );
        }
        else
        {
            ClothBox.setModel( new DefaultComboBoxModel( (String[])o ) );
        }
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

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        GenderBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        requestTable = new javax.swing.JTable();
        washChk = new javax.swing.JCheckBox();
        ironChk = new javax.swing.JCheckBox();
        foldChk = new javax.swing.JCheckBox();
        clothL = new javax.swing.JLabel();
        ClothBox = new javax.swing.JComboBox<>();
        AddB = new javax.swing.JButton();
        CancelB = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        QuantityTF = new javax.swing.JTextField();
        ironWashChk = new javax.swing.JCheckBox();
        XpressChk = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        createRequestBtn = new javax.swing.JButton();
        cancelRequest = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CabinTF = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(2147483647, 1000));
        setMinimumSize(new java.awt.Dimension(800, 400));
        setPreferredSize(new java.awt.Dimension(800, 520));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel4.setText("Añadir Prendas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        jPanel1.add(jLabel4, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setText("Género");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 14, 8, 5);
        jPanel1.add(jLabel2, gridBagConstraints);

        GenderBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                GenderBoxItemStateChanged(evt);
            }
        });
        GenderBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                GenderBoxFocusGained(evt);
            }
        });
        GenderBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 8, 0);
        jPanel1.add(GenderBox, gridBagConstraints);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(456, 300));

        requestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Género", "Nombre", "Servicio", "Doblado", "Express", "Cantidad", "Subtotal"
            }
        ) {
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
        });
        requestTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(requestTable);
        if (requestTable.getColumnModel().getColumnCount() > 0) {
            requestTable.getColumnModel().getColumn(0).setResizable(false);
            requestTable.getColumnModel().getColumn(1).setResizable(false);
            requestTable.getColumnModel().getColumn(2).setResizable(false);
            requestTable.getColumnModel().getColumn(3).setResizable(false);
            requestTable.getColumnModel().getColumn(4).setResizable(false);
            requestTable.getColumnModel().getColumn(5).setResizable(false);
            requestTable.getColumnModel().getColumn(6).setResizable(false);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 514;
        gridBagConstraints.ipady = 399;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 35, 14, 14);
        jPanel1.add(jScrollPane1, gridBagConstraints);

        washChk.setText("Lavado");
        washChk.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                washChkStateChanged(evt);
            }
        });
        washChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                washChkActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 14, 5, 5);
        jPanel1.add(washChk, gridBagConstraints);

        ironChk.setText("Planchado");
        ironChk.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ironChkStateChanged(evt);
            }
        });
        ironChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ironChkActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 14, 5, 5);
        jPanel1.add(ironChk, gridBagConstraints);

        foldChk.setText("Doblado");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 14, 5, 5);
        jPanel1.add(foldChk, gridBagConstraints);

        clothL.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        clothL.setText("Prenda");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 14, 8, 5);
        jPanel1.add(clothL, gridBagConstraints);

        ClothBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ClothBoxItemStateChanged(evt);
            }
        });
        ClothBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ClothBoxFocusGained(evt);
            }
        });
        ClothBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClothBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 8, 0);
        jPanel1.add(ClothBox, gridBagConstraints);

        AddB.setText("Agregar");
        AddB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        jPanel1.add(AddB, gridBagConstraints);

        CancelB.setText("Cancelar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel1.add(CancelB, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel3.setText("Cantidad");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 14, 8, 5);
        jPanel1.add(jLabel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 77;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 8, 0);
        jPanel1.add(QuantityTF, gridBagConstraints);

        ironWashChk.setText("Lavado y planchado");
        ironWashChk.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ironWashChkStateChanged(evt);
            }
        });
        ironWashChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ironWashChkActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 14, 5, 5);
        jPanel1.add(ironWashChk, gridBagConstraints);

        XpressChk.setText("Express");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 14, 5, 5);
        jPanel1.add(XpressChk, gridBagConstraints);

        add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setMaximumSize(new java.awt.Dimension(32767, 100));
        jPanel2.setPreferredSize(new java.awt.Dimension(837, 40));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        createRequestBtn.setText("Crear Solicitud");
        createRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createRequestBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        jPanel2.add(createRequestBtn, gridBagConstraints);

        cancelRequest.setText("Cancelar");
        cancelRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelRequestActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        jPanel2.add(cancelRequest, gridBagConstraints);

        jLabel1.setText("Id de cabina");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanel2.add(jLabel1, gridBagConstraints);

        CabinTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CabinTFKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanel2.add(CabinTF, gridBagConstraints);

        add(jPanel2, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void GenderBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_GenderBoxItemStateChanged
      
    }//GEN-LAST:event_GenderBoxItemStateChanged

    private void GenderBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GenderBoxFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderBoxFocusGained

    private void GenderBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderBoxActionPerformed

    }//GEN-LAST:event_GenderBoxActionPerformed

    private void washChkStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_washChkStateChanged

    }//GEN-LAST:event_washChkStateChanged

    private void washChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_washChkActionPerformed
        if(washChk.isSelected()){
            ironWashChk.setEnabled(false);
            ironChk.setEnabled(false);
        }else{
            ironWashChk.setEnabled(true);
            ironChk.setEnabled(true);
        }
    }//GEN-LAST:event_washChkActionPerformed

    private void ironChkStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ironChkStateChanged

    }//GEN-LAST:event_ironChkStateChanged

    private void ironChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ironChkActionPerformed
        if(ironChk.isSelected()){
            ironWashChk.setEnabled(false);
            washChk.setEnabled(false);
        }else{
            washChk.setEnabled(true);
            ironWashChk.setEnabled(true);
        }
    }//GEN-LAST:event_ironChkActionPerformed

    private void ClothBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ClothBoxItemStateChanged
        Article article = new Article();
        String a, b;
        int c;
        a = (String) ClothBox.getSelectedItem();
        b = (String)GenderBox.getSelectedItem();
        article.setGender(b);
        article.setClothName(a);
        c = daoT.findID(article);
        article = daoT.read(c);
        foldChk.setSelected(false);
        foldChk.setEnabled(article.getFold());        // TODO add your handling code here:
    }//GEN-LAST:event_ClothBoxItemStateChanged

    private void ClothBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ClothBoxFocusGained

    }//GEN-LAST:event_ClothBoxFocusGained

    private void ClothBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClothBoxActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_ClothBoxActionPerformed
        
    
    private void AddBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBActionPerformed
        String articleName, articleGender;
        int articleId , quantity;
        
        artR = new ArticleRequest();
        art = new Article();
        
        double price = 0.0;
        
        articleName = (String) ClothBox.getSelectedItem();
        articleGender = (String) GenderBox.getSelectedItem();
        
        art.setClothName(articleName);
        art.setGender(articleGender);
        
        articleId = daoT.findID(art);
        art = daoT.read(articleId);
        
        artR.setArticle(art);
        
        quantity = Integer.parseInt(QuantityTF.getText());
        
        artR.setQuantity(quantity);
        
        if(washChk.isSelected()){
            price = art.getWashPrice();
            artR.setService("Lavado");
        }else if (ironChk.isSelected()) {
            price = art.getIronPrice();
            artR.setService("Planchado");
        }else if (ironWashChk.isSelected()) {
            price = art.getWaiPrice();
            artR.setService("Lavado y Planchado");
        }
        artR.setSubtotal(quantity*price);
        
        artR.setFold(foldChk.isSelected());
        artR.setExpress(XpressChk.isSelected());
        
        articleRequestsSet.add(artR);
        
        TableUtils.fillTableArticleRequest(requestTable, new ArrayList<>(articleRequestsSet));
        FormUtils.clearFields(GenderBox, ClothBox, QuantityTF, washChk, ironChk, ironWashChk, foldChk, XpressChk);
        if(articleRequestsSet.size()>0 && !CabinTF.getText().isEmpty()){
            createRequestBtn.setEnabled(true);
        }
        
        FormUtils.enableComponents(washChk, ironChk, ironWashChk, foldChk);
    }//GEN-LAST:event_AddBActionPerformed

    private void ironWashChkStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ironWashChkStateChanged

    }//GEN-LAST:event_ironWashChkStateChanged

    private void ironWashChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ironWashChkActionPerformed
        if(ironWashChk.isSelected()){
            washChk.setEnabled(false);
            ironChk.setEnabled(false);
        }else{
            washChk.setEnabled(true);
            ironChk.setEnabled(true);
        }
    }//GEN-LAST:event_ironWashChkActionPerformed

    private void createRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createRequestBtnActionPerformed
        cabin = new Cabin();
        request = new Request();
        Cabin cab = daoC.read(Integer.parseInt(CabinTF.getText()));
        if(cab == null){
            cabin.setId(Integer.parseInt(CabinTF.getText()));
            daoC.create(cabin);
        }else{
            cabin.setId(cab.getId());
        }
        request.setCabin(cabin);
        request.setCreated_at(new Date(System.currentTimeMillis()));
        daoR.create(request);
        articleRequestsSet.forEach((ar) -> {
            ar.setRequest(request);
            daoAR.create(ar);
        });
        FormUtils.clearFields(CabinTF, GenderBox, ClothBox, QuantityTF, washChk, ironChk, ironWashChk, foldChk, XpressChk);
        articleRequestsSet.clear();
        TableUtils.clearTable(requestTable);
        FormUtils.enableComponents(washChk, ironChk, ironWashChk, foldChk);

    }//GEN-LAST:event_createRequestBtnActionPerformed

    private void cancelRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelRequestActionPerformed
        FormUtils.clearFields(CabinTF, GenderBox, ClothBox, QuantityTF, washChk, ironChk, ironWashChk, foldChk, XpressChk);
        articleRequestsSet.clear();
        TableUtils.clearTable(requestTable);
        FormUtils.enableComponents(washChk, ironChk, ironWashChk, foldChk);

    }//GEN-LAST:event_cancelRequestActionPerformed

    private void CabinTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CabinTFKeyTyped
        if(articleRequestsSet.size()>0){
            createRequestBtn.setEnabled(true);
        }
    }//GEN-LAST:event_CabinTFKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddB;
    private javax.swing.JTextField CabinTF;
    private javax.swing.JButton CancelB;
    private javax.swing.JComboBox<String> ClothBox;
    private javax.swing.JComboBox<String> GenderBox;
    private javax.swing.JTextField QuantityTF;
    private javax.swing.JCheckBox XpressChk;
    private javax.swing.JButton cancelRequest;
    private javax.swing.JLabel clothL;
    private javax.swing.JButton createRequestBtn;
    private javax.swing.JCheckBox foldChk;
    private javax.swing.JCheckBox ironChk;
    private javax.swing.JCheckBox ironWashChk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable requestTable;
    private javax.swing.JCheckBox washChk;
    // End of variables declaration//GEN-END:variables
}
