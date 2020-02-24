/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.placeholder.PlaceHolder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import jtextfieldround.BorderLineRound;

/**
 *
 * @author evelyn.ferreira
 */
public class registerProducts extends javax.swing.JFrame {

    /**
     * Creates new form registerProducts
     */
    public registerProducts() {
        initComponents();
        
        PlaceHolder placeHolderName = new PlaceHolder(productNameTXT, "Qual o nome do produto?");
        PlaceHolder placeHolderPrice = new PlaceHolder(productPriceTXT, "   Preço");
        PlaceHolder placeHolderProvider = new PlaceHolder(drinkProviderTXT, "Fornecedor");
        PlaceHolder placeHolderDescription = new PlaceHolder(foodDescriptionTXT, "Descrição do item");
        
        productNameTXT.setBorder(new BorderLineRound(Color.GRAY, true)); 
        productNameTXT.setFont(new Font("Century Gothic", 0, 12)); 
        productNameTXT.setHorizontalAlignment(SwingConstants.CENTER);
        
        productPriceTXT.setBorder(new BorderLineRound(Color.GRAY, true));
        productPriceTXT.setFont(new Font("Century Gothic", 0, 12)); 
        productPriceTXT.setHorizontalAlignment(SwingConstants.CENTER);
        
        drinkProviderTXT.setBorder(new BorderLineRound(Color.GRAY, true));
        drinkProviderTXT.setFont(new Font("Century Gothic", 0, 12)); 
        drinkProviderTXT.setHorizontalAlignment(SwingConstants.CENTER);
        
        foodDescriptionTXT.setVisible(false);
        
        emptyDataLBL.setVisible(false);
        emptyData2LBL.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        choicefoodGRP = new javax.swing.ButtonGroup();
        productsBackBTN = new javax.swing.JButton();
        registerProductsPNL = new javax.swing.JPanel();
        Cadastrar = new javax.swing.JButton();
        productNameTXT = new javax.swing.JTextField();
        productFoodRBTN = new javax.swing.JRadioButton();
        productDrinkRBTN = new javax.swing.JRadioButton();
        drinkProviderTXT = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        foodDescriptionTXT = new javax.swing.JTextArea();
        productPriceTXT = new javax.swing.JTextField();
        emptyDataLBL = new javax.swing.JLabel();
        emptyData2LBL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        productsBackBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/back16.png"))); // NOI18N
        productsBackBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productsBackBTNMouseClicked(evt);
            }
        });

        Cadastrar.setText("Cadastrar");
        Cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CadastrarMouseClicked(evt);
            }
        });

        choicefoodGRP.add(productFoodRBTN);
        productFoodRBTN.setText("Comida");
        productFoodRBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productFoodRBTNMouseClicked(evt);
            }
        });

        choicefoodGRP.add(productDrinkRBTN);
        productDrinkRBTN.setText("Bebida");
        productDrinkRBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productDrinkRBTNMouseClicked(evt);
            }
        });

        foodDescriptionTXT.setColumns(20);
        foodDescriptionTXT.setRows(5);
        jScrollPane1.setViewportView(foodDescriptionTXT);

        emptyDataLBL.setForeground(new java.awt.Color(255, 102, 102));
        emptyDataLBL.setText("* Todos os campos devem");

        emptyData2LBL.setForeground(new java.awt.Color(255, 102, 102));
        emptyData2LBL.setText("ser preenchidos");

        javax.swing.GroupLayout registerProductsPNLLayout = new javax.swing.GroupLayout(registerProductsPNL);
        registerProductsPNL.setLayout(registerProductsPNLLayout);
        registerProductsPNLLayout.setHorizontalGroup(
            registerProductsPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerProductsPNLLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(registerProductsPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(drinkProviderTXT)
                    .addComponent(productNameTXT)
                    .addGroup(registerProductsPNLLayout.createSequentialGroup()
                        .addComponent(productFoodRBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(productDrinkRBTN)))
                .addGroup(registerProductsPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerProductsPNLLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(registerProductsPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(registerProductsPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(productPriceTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(emptyDataLBL)))
                    .addGroup(registerProductsPNLLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(emptyData2LBL)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        registerProductsPNLLayout.setVerticalGroup(
            registerProductsPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerProductsPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(registerProductsPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productNameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productPriceTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(registerProductsPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productFoodRBTN)
                    .addComponent(productDrinkRBTN)
                    .addComponent(emptyDataLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emptyData2LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(registerProductsPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerProductsPNLLayout.createSequentialGroup()
                        .addComponent(drinkProviderTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Cadastrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(registerProductsPNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(productsBackBTN))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productsBackBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerProductsPNL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void productsBackBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productsBackBTNMouseClicked
        this.dispose();
        managerAccount managerScreen = new managerAccount();
        managerScreen.setVisible(true);
    }//GEN-LAST:event_productsBackBTNMouseClicked

    private void productFoodRBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productFoodRBTNMouseClicked
       foodDescriptionTXT.setVisible(true);
       drinkProviderTXT.setVisible(false);
    }//GEN-LAST:event_productFoodRBTNMouseClicked

    private void productDrinkRBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productDrinkRBTNMouseClicked
        drinkProviderTXT.setVisible(true);
        foodDescriptionTXT.setVisible(false);
    }//GEN-LAST:event_productDrinkRBTNMouseClicked

    private void CadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastrarMouseClicked
        if((drinkProviderTXT.getText().trim().isEmpty() &&
           foodDescriptionTXT.getText().trim().isEmpty()) || 
           productNameTXT.getText().trim().isEmpty() || 
           productPriceTXT.getText().trim().isEmpty()){
        
            emptyDataLBL.setVisible(true);
            emptyData2LBL.setVisible(true);
        }
               
    }//GEN-LAST:event_CadastrarMouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new registerProducts().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar;
    private javax.swing.ButtonGroup choicefoodGRP;
    private javax.swing.JTextField drinkProviderTXT;
    private javax.swing.JLabel emptyData2LBL;
    private javax.swing.JLabel emptyDataLBL;
    private javax.swing.JTextArea foodDescriptionTXT;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton productDrinkRBTN;
    private javax.swing.JRadioButton productFoodRBTN;
    private javax.swing.JTextField productNameTXT;
    private javax.swing.JTextField productPriceTXT;
    private javax.swing.JButton productsBackBTN;
    private javax.swing.JPanel registerProductsPNL;
    // End of variables declaration//GEN-END:variables
}
