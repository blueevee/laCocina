/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author evelyn.ferreira
 */
public class Cart extends javax.swing.JFrame {

    /**
     * Creates new form cart
     */
    public Cart() {
        initComponents();
        this.getContentPane().setBackground(Color.decode("14027569"));
        paymentPANE.setVisible(false);
        debitRBTN.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paymentBTNG = new javax.swing.ButtonGroup();
        cartBackBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cartTBL = new javax.swing.JTable();
        discountTXT = new javax.swing.JLabel();
        totalValueLBL = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        paymentPANE = new javax.swing.JLayeredPane();
        debitRBTN = new javax.swing.JRadioButton();
        creditRBN = new javax.swing.JRadioButton();
        cancelBTN = new javax.swing.JLabel();
        confirmBTN = new javax.swing.JLabel();
        totalLBL1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Carrinho La Cocina Bistrô");
        setResizable(false);

        cartBackBTN.setBackground(new java.awt.Color(38, 70, 27));
        cartBackBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/back16.png"))); // NOI18N
        cartBackBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartBackBTNMouseClicked(evt);
            }
        });

        cartTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PEDIDO", "QUANTIDADE", "PREÇO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(cartTBL);
        if (cartTBL.getColumnModel().getColumnCount() > 0) {
            cartTBL.getColumnModel().getColumn(0).setPreferredWidth(96);
            cartTBL.getColumnModel().getColumn(1).setPreferredWidth(2);
            cartTBL.getColumnModel().getColumn(2).setPreferredWidth(2);
        }

        discountTXT.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        discountTXT.setForeground(new java.awt.Color(255, 255, 255));
        discountTXT.setText("Desconto:");

        totalValueLBL.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        totalValueLBL.setForeground(new java.awt.Color(255, 255, 255));
        totalValueLBL.setText("jLabel1");

        jButton1.setBackground(new java.awt.Color(38, 70, 27));
        jButton1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Pagar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo.png"))); // NOI18N

        paymentBTNG.add(debitRBTN);
        debitRBTN.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        debitRBTN.setForeground(new java.awt.Color(255, 255, 255));
        debitRBTN.setText("Débito");

        paymentBTNG.add(creditRBN);
        creditRBN.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        creditRBN.setForeground(new java.awt.Color(255, 255, 255));
        creditRBN.setText("Crédito");

        cancelBTN.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cancelBTN.setForeground(new java.awt.Color(255, 255, 255));
        cancelBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/cancel24.png"))); // NOI18N
        cancelBTN.setToolTipText("Cancelar");
        cancelBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelBTNMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelBTNMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelBTNMouseExited(evt);
            }
        });

        confirmBTN.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        confirmBTN.setForeground(new java.awt.Color(255, 255, 255));
        confirmBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/check24.png"))); // NOI18N
        confirmBTN.setToolTipText("Confirmar");
        confirmBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmBTNMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                confirmBTNMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                confirmBTNMouseExited(evt);
            }
        });

        paymentPANE.setLayer(debitRBTN, javax.swing.JLayeredPane.DEFAULT_LAYER);
        paymentPANE.setLayer(creditRBN, javax.swing.JLayeredPane.DEFAULT_LAYER);
        paymentPANE.setLayer(cancelBTN, javax.swing.JLayeredPane.DEFAULT_LAYER);
        paymentPANE.setLayer(confirmBTN, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout paymentPANELayout = new javax.swing.GroupLayout(paymentPANE);
        paymentPANE.setLayout(paymentPANELayout);
        paymentPANELayout.setHorizontalGroup(
            paymentPANELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentPANELayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(cancelBTN)
                .addGap(18, 18, 18)
                .addComponent(debitRBTN)
                .addGap(6, 6, 6)
                .addComponent(creditRBN)
                .addGap(18, 18, 18)
                .addComponent(confirmBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paymentPANELayout.setVerticalGroup(
            paymentPANELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentPANELayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paymentPANELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paymentPANELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(debitRBTN)
                        .addComponent(creditRBN))
                    .addGroup(paymentPANELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(confirmBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cancelBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        totalLBL1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        totalLBL1.setForeground(new java.awt.Color(255, 255, 255));
        totalLBL1.setText("TOTAL:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(paymentPANE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(discountTXT)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(totalValueLBL)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(totalLBL1)
                                    .addGap(60, 60, 60))))))
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cartBackBTN)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cartBackBTN)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(discountTXT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(totalValueLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalLBL1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paymentPANE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cartBackBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartBackBTNMouseClicked
        this.dispose();
        UsersAccount usersScreen = new UsersAccount();
        usersScreen.setVisible(true);
    }//GEN-LAST:event_cartBackBTNMouseClicked

    private void confirmBTNMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmBTNMouseEntered
        confirmBTN.setForeground(Color.decode("6554655"));                                                                              
        confirmBTN.setIcon(new ImageIcon("C:\\Users\\evelyn.ferreira\\Desktop\\laCocina-master\\src\\assets\\hoverCheck24.png"));
    }//GEN-LAST:event_confirmBTNMouseEntered

    private void confirmBTNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmBTNMouseExited
        confirmBTN.setForeground(Color.decode("6554655"));                                                                              
        confirmBTN.setIcon(new ImageIcon("C:\\Users\\evelyn.ferreira\\Desktop\\laCocina-master\\src\\assets\\check24.png"));
    }//GEN-LAST:event_confirmBTNMouseExited

    private void cancelBTNMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBTNMouseEntered
        cancelBTN.setForeground(Color.decode("6554655"));                                                                              
        cancelBTN.setIcon(new ImageIcon("C:\\Users\\evelyn.ferreira\\Desktop\\laCocina-master\\src\\assets\\hoverCancel24.png"));
    }//GEN-LAST:event_cancelBTNMouseEntered

    private void cancelBTNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBTNMouseExited
        cancelBTN.setForeground(Color.decode("6554655"));                                                                              
        cancelBTN.setIcon(new ImageIcon("C:\\Users\\evelyn.ferreira\\Desktop\\laCocina-master\\src\\assets\\cancel24.png"));
    }//GEN-LAST:event_cancelBTNMouseExited

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        paymentPANE.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void cancelBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBTNMouseClicked
        paymentPANE.setVisible(false);
    }//GEN-LAST:event_cancelBTNMouseClicked

    private void confirmBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmBTNMouseClicked
        Payment paymentDialog = new Payment(this , true);
        paymentDialog.setVisible(true);
    }//GEN-LAST:event_confirmBTNMouseClicked

    /**
     * @param args the command line arguments
     */
    
    private void loadTable(){
        
        DefaultTableModel model = (DefaultTableModel) cartTBL.getModel();
        model.setNumRows(0);
        
        cartTBL.getColumnModel().getColumn(0).setPreferredWidth(5);
        cartTBL.getColumnModel().getColumn(1).setPreferredWidth(5);
        cartTBL.getColumnModel().getColumn(2).setPreferredWidth(80);
         
//        pegar do bd e preencher as linhas
        model.addRow(new Object[]{
            
            
        });

        
    }
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new RunnableImpl());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancelBTN;
    private javax.swing.JButton cartBackBTN;
    private javax.swing.JTable cartTBL;
    private javax.swing.JLabel confirmBTN;
    private javax.swing.JRadioButton creditRBN;
    private javax.swing.JRadioButton debitRBTN;
    private javax.swing.JLabel discountTXT;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup paymentBTNG;
    private javax.swing.JLayeredPane paymentPANE;
    private javax.swing.JLabel totalLBL1;
    private javax.swing.JLabel totalValueLBL;
    // End of variables declaration//GEN-END:variables

    private static class RunnableImpl implements Runnable {

        public RunnableImpl() {
        }

        @Override
        public void run() {
            new Cart().setVisible(true);
        }
    }
}
