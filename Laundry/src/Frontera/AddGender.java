/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;


import static Frontera.NewServicePanel.genders;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author leons
 */
public class AddGender extends javax.swing.JFrame {

    /**
     * Creates new form AddGender
     */
    public String NewGender = new String();         //creo un string de acceso público para recibir el dato del textfield
    
    public AddGender() {
        initComponents();
        setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GenderTF = new javax.swing.JTextField();
        AcceptB = new javax.swing.JButton();
        CancelB = new javax.swing.JButton();
        NGenderL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo Género");

        GenderTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderTFActionPerformed(evt);
            }
        });
        GenderTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                GenderTFKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                GenderTFKeyReleased(evt);
            }
        });

        AcceptB.setText("Aceptar");
        AcceptB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptBActionPerformed(evt);
            }
        });

        CancelB.setText("Cancelar");
        CancelB.setMaximumSize(new java.awt.Dimension(100, 25));
        CancelB.setMinimumSize(new java.awt.Dimension(100, 25));
        CancelB.setPreferredSize(new java.awt.Dimension(100, 25));
        CancelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBActionPerformed(evt);
            }
        });

        NGenderL.setText("Nuevo Género:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NGenderL)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(GenderTF)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AcceptB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CancelB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 12, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NGenderL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GenderTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AcceptB)
                    .addComponent(CancelB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GenderTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderTFActionPerformed
        
// TODO add your handling code here:
    }//GEN-LAST:event_GenderTFActionPerformed

    private void AcceptBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptBActionPerformed
      
        
        NewGender = GenderTF.getText();                             //lee el texto en el textfield
        int w = NewServicePanel.genders.size();                       //me da el tamaño del array donde estoy guardando la lista de géneros
        NewServicePanel.genders.add( NewGender);                         //guardo los datos en el array
        String a = (String) genders.get(w);                             //traigo los datos guardados en el array
        NewServicePanel.GenderBox.addItem(a);                           //guardo los datos en el combobox
        this.dispose();                                                 //cierro la ventana e nuevo genero
        GenderTF.setText(null);                                         //borro lo escrito en el textfield
// TODO add your handling code here:
    }//GEN-LAST:event_AcceptBActionPerformed

    private void CancelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBActionPerformed
       
       this.dispose();                                                  //al presionar cancelar, cierra la ventana
       // TODO add your handling code here:
    }//GEN-LAST:event_CancelBActionPerformed

    private void GenderTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GenderTFKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderTFKeyPressed

    private void GenderTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GenderTFKeyReleased
           if(evt.getKeyCode()==KeyEvent.VK_ENTER)
           {AcceptBActionPerformed(null);                                   //al presionar enter creando el género presiona aceptar y guarda el dato
                      }
// TODO add your handling code here:
    }//GEN-LAST:event_GenderTFKeyReleased

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddGender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddGender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddGender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddGender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddGender().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcceptB;
    private javax.swing.JButton CancelB;
    private javax.swing.JTextField GenderTF;
    private javax.swing.JLabel NGenderL;
    // End of variables declaration//GEN-END:variables
}
