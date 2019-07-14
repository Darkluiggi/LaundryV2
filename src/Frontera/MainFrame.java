/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

import Control.LoginControl;
import Utils.PanelUtils;
import Control.ManageAccount;
import DAO.DAORequest;
import Entidad.Request;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;


/**
 *
 * @author leons
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    
    public Login login;                  //instancio los paneles cambiantes del programa   
    public MainMenu menu;
        protected    Article         articlePanel;            
        Account         accountPanel;           
        Estadisticas    estatisticsPanel;        
        Request         requestPanel; 
    
    public MainFrame() {
        login = new Login(this, new LoginControl());
        ManageAccount.createAdmin();
        initComponents();
        PanelUtils.change(BigPanel, login);
        mainTB.setVisible(false);
        backBtn.setVisible(false);

        setLocationRelativeTo(null);   //Centra el programa en la pantalla
        articlePanel            = new Article();
        accountPanel            = new Account();
        estatisticsPanel        = new Estadisticas();
        requestPanel            = new Request();


        setExtendedState( getExtendedState()|MAXIMIZED_BOTH ); //Maximiza el programa automáticamente
        setLocationRelativeTo(null);                            //Centra el programa en la pantalla

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

        headerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BigPanel = new javax.swing.JPanel();
        mainTB = new javax.swing.JToolBar();
        backBtn = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        sessionLbl = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        userLbl = new javax.swing.JLabel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        ExitB = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lavandería a Bordo");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(800, 600));
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWeights = new double[] {1.0};
        layout.rowWeights = new double[] {1.0};
        getContentPane().setLayout(layout);

        headerPanel.setBackground(new java.awt.Color(51, 51, 255));
        headerPanel.setMaximumSize(new java.awt.Dimension(2147483647, 100));
        headerPanel.setPreferredSize(new java.awt.Dimension(800, 100));
        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWeights = new double[] {0.0};
        jPanel1Layout.rowWeights = new double[] {0.0};
        headerPanel.setLayout(jPanel1Layout);

        jLabel1.setFont(new java.awt.Font("Myriad Pro Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frontera/washing-machine.png"))); // NOI18N
        jLabel1.setText("Lavandería a Bordo");
        headerPanel.add(jLabel1, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 410;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        getContentPane().add(headerPanel, gridBagConstraints);

        BigPanel.setBackground(new java.awt.Color(255, 255, 255));
        BigPanel.setOpaque(true);
        BigPanel.setPreferredSize(new java.awt.Dimension(800, 100));
        BigPanel.setLayout(new java.awt.BorderLayout());

        mainTB.setBackground(new java.awt.Color(255, 255, 255));
        mainTB.setFloatable(false);
        mainTB.setRollover(true);

        backBtn.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frontera/left-arrow (1).png"))); // NOI18N
        backBtn.setText("Volver");
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.setFocusable(false);
        backBtn.setMargin(new java.awt.Insets(0, 10, 0, 0));
        backBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        mainTB.add(backBtn);
        mainTB.add(filler1);

        sessionLbl.setText("Sesión iniciada como:");
        mainTB.add(sessionLbl);
        mainTB.add(filler2);
        mainTB.add(userLbl);
        mainTB.add(filler3);

        ExitB.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        ExitB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frontera/sign-out-option (1).png"))); // NOI18N
        ExitB.setText("Salir");
        ExitB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitB.setFocusable(false);
        ExitB.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ExitB.setMargin(new java.awt.Insets(0, 0, 0, 10));
        ExitB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ExitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBActionPerformed(evt);
            }
        });
        mainTB.add(ExitB);

        BigPanel.add(mainTB, java.awt.BorderLayout.PAGE_START);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 505;
        gridBagConstraints.ipady = 395;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weighty = 2.0;
        getContentPane().add(BigPanel, gridBagConstraints);

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        PanelUtils.change(BigPanel, this.menu);
    }//GEN-LAST:event_backBtnActionPerformed

    private void ExitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBActionPerformed
        logOut();
    }//GEN-LAST:event_ExitBActionPerformed

    public void logOut(){
        PanelUtils.change(BigPanel, new Login(this, new LoginControl()));
        mainTB.setVisible(false);
        backBtn.setVisible(false);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BigPanel;
    private javax.swing.JButton ExitB;
    private javax.swing.JButton backBtn;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JToolBar mainTB;
    private javax.swing.JLabel sessionLbl;
    private javax.swing.JLabel userLbl;
    // End of variables declaration//GEN-END:variables

    public JButton getExitB() {
        return ExitB;
    }

    public JPanel getBigPanel() {
        return BigPanel;
    }

    public JToolBar getMainTB() {
        return mainTB;
    }

    public JLabel getUserLbl() {
        return userLbl;
    }

    public JButton getBackBtn() {
        return backBtn;
    }

     
    
    
}

