/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class OperasiDuaAngkaGUI extends javax.swing.JFrame {

    /** Creates new form OperasiDuaAngkaGUI */
    public OperasiDuaAngkaGUI() {
        initComponents();
    }
    
    private void filterKeyTyped(java.awt.event.KeyEvent evt){
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c)||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Masukkan Hanya Nilai Angka (0-9)");
            evt.consume();
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        angkaPertamaTF = new javax.swing.JTextField();
        angkaKeduaTF = new javax.swing.JTextField();
        hasilTF = new javax.swing.JTextField();
        operatorLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tambahBtn = new javax.swing.JButton();
        kurangBtn = new javax.swing.JButton();
        kaliBtn = new javax.swing.JButton();
        bagiBtn = new javax.swing.JButton();
        keluarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Muhammad Rizky Fadillah", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        angkaPertamaTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                angkaPertamaTFKeyTyped(evt);
            }
        });

        angkaKeduaTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                angkaKeduaTFKeyTyped(evt);
            }
        });

        jLabel2.setText("=");

        tambahBtn.setText("Tambah");
        tambahBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahBtnActionPerformed(evt);
            }
        });

        kurangBtn.setText("Kurang");
        kurangBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurangBtnActionPerformed(evt);
            }
        });

        kaliBtn.setText("Kali");
        kaliBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaliBtnActionPerformed(evt);
            }
        });

        bagiBtn.setText("Bagi");
        bagiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagiBtnActionPerformed(evt);
            }
        });

        keluarBtn.setText("Keluar");
        keluarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(angkaPertamaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(operatorLabel)
                        .addGap(13, 13, 13)
                        .addComponent(angkaKeduaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hasilTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tambahBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kurangBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kaliBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bagiBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(keluarBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angkaPertamaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angkaKeduaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hasilTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(operatorLabel)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambahBtn)
                    .addComponent(kurangBtn)
                    .addComponent(kaliBtn)
                    .addComponent(bagiBtn)
                    .addComponent(keluarBtn))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tambahBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahBtnActionPerformed
        if(angkaPertamaTF.getText().equals("")||angkaKeduaTF.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Input tidak boleh kosong!", "Warning", JOptionPane.WARNING_MESSAGE);
        }else{
            operatorLabel.setText("+");
            double angkapertama = Double.parseDouble(angkaPertamaTF.getText());
            double angkakedua = Double.parseDouble(angkaKeduaTF.getText());
        
            double hasil = angkapertama + angkakedua;
        
            hasilTF.setText(Double.toString(hasil));
        }
    }//GEN-LAST:event_tambahBtnActionPerformed

    private void angkaPertamaTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_angkaPertamaTFKeyTyped
        filterKeyTyped(evt);
    }//GEN-LAST:event_angkaPertamaTFKeyTyped

    private void angkaKeduaTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_angkaKeduaTFKeyTyped
        filterKeyTyped(evt);
    }//GEN-LAST:event_angkaKeduaTFKeyTyped

    private void kurangBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurangBtnActionPerformed
        if(angkaPertamaTF.getText().equals("")||angkaKeduaTF.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Input tidak boleh kosong!", "Warning", JOptionPane.WARNING_MESSAGE);
        }else{
            operatorLabel.setText("-");
            double angkapertama = Double.parseDouble(angkaPertamaTF.getText());
            double angkakedua = Double.parseDouble(angkaKeduaTF.getText());
        
            double hasil = angkapertama - angkakedua;
        
            hasilTF.setText(Double.toString(hasil));
        }
    }//GEN-LAST:event_kurangBtnActionPerformed

    private void kaliBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaliBtnActionPerformed
        if(angkaPertamaTF.getText().equals("")||angkaKeduaTF.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Input tidak boleh kosong!", "Warning", JOptionPane.WARNING_MESSAGE);
        }else{
            operatorLabel.setText("x");
            double angkapertama = Double.parseDouble(angkaPertamaTF.getText());
            double angkakedua = Double.parseDouble(angkaKeduaTF.getText());
        
            double hasil = angkapertama * angkakedua;
        
            hasilTF.setText(Double.toString(hasil));
        }
    }//GEN-LAST:event_kaliBtnActionPerformed

    private void bagiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagiBtnActionPerformed
        if(angkaPertamaTF.getText().equals("")||angkaKeduaTF.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Input tidak boleh kosong!", "Warning", JOptionPane.WARNING_MESSAGE);
        }else{
            operatorLabel.setText("/");
            double angkapertama = Double.parseDouble(angkaPertamaTF.getText());
            double angkakedua = Double.parseDouble(angkaKeduaTF.getText());
        
            double hasil = angkapertama / angkakedua;
        
            hasilTF.setText(Double.toString(hasil));
        }
    }//GEN-LAST:event_bagiBtnActionPerformed

    private void keluarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarBtnActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin keluar aplikasi?", "Warning", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
          System.exit(0);  
        }
    }//GEN-LAST:event_keluarBtnActionPerformed

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
            java.util.logging.Logger.getLogger(OperasiDuaAngkaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OperasiDuaAngkaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OperasiDuaAngkaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OperasiDuaAngkaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperasiDuaAngkaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField angkaKeduaTF;
    private javax.swing.JTextField angkaPertamaTF;
    private javax.swing.JButton bagiBtn;
    private javax.swing.JTextField hasilTF;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton kaliBtn;
    private javax.swing.JButton keluarBtn;
    private javax.swing.JButton kurangBtn;
    private javax.swing.JLabel operatorLabel;
    private javax.swing.JButton tambahBtn;
    // End of variables declaration//GEN-END:variables

}
