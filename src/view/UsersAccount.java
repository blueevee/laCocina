/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.MenuElement;
import javax.swing.plaf.basic.BasicMenuBarUI;
import javax.swing.table.DefaultTableModel;
import static view.CustomizeMenuBar.CustomizeMenuBar;

/**
 *
 * @author evelyn.ferreira
 */
public class UsersAccount extends javax.swing.JFrame {
    DefaultComboBoxModel  modelCBOX = new DefaultComboBoxModel();
    /**
     * Creates new form usersAcount
     */
    public UsersAccount() {
        initComponents();
        this.getContentPane().setBackground(Color.decode("14027569"));
        CustomizeMenuBar(userMENU, Color.decode("14027569"), Color.white );
        foodTypeCBOX.setModel(modelCBOX);
        addItem();
        foodTypeCBOX.setBackground(Color.decode("2508315"));
        foodTypeCBOX.setForeground(Color.white);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userBackBTN = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menuTBL = new javax.swing.JTable();
        foodTypeCBOX = new javax.swing.JComboBox<>();
        valueCashbackTXT = new javax.swing.JLabel();
        cashbackTXT = new javax.swing.JLabel();
        userMENU = new javax.swing.JMenuBar();
        cartMENU = new javax.swing.JMenu();
        editProfileMENU = new javax.swing.JMenu();
        feedbackMENU = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cliente La Cocina Bistrô");
        setResizable(false);

        userBackBTN.setBackground(new java.awt.Color(38, 70, 27));
        userBackBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/back16.png"))); // NOI18N
        userBackBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userBackBTNMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo.png"))); // NOI18N

        menuTBL.setAutoCreateRowSorter(true);
        menuTBL.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        menuTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Prato", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        menuTBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuTBLMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(menuTBL);
        if (menuTBL.getColumnModel().getColumnCount() > 0) {
            menuTBL.getColumnModel().getColumn(0).setPreferredWidth(2);
            menuTBL.getColumnModel().getColumn(1).setPreferredWidth(96);
            menuTBL.getColumnModel().getColumn(2).setPreferredWidth(2);
        }

        foodTypeCBOX.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        foodTypeCBOX.setForeground(new java.awt.Color(255, 255, 255));
        foodTypeCBOX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        foodTypeCBOX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foodTypeCBOXMouseClicked(evt);
            }
        });

        valueCashbackTXT.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        valueCashbackTXT.setForeground(new java.awt.Color(255, 255, 255));
        valueCashbackTXT.setText("value");

        cashbackTXT.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cashbackTXT.setForeground(new java.awt.Color(255, 255, 255));
        cashbackTXT.setText("Cashback:");

        userMENU.setBackground(new java.awt.Color(214, 11, 49));
        userMENU.setForeground(new java.awt.Color(255, 255, 255));

        cartMENU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/cart20.png"))); // NOI18N
        cartMENU.setText("Carrinho");
        cartMENU.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cartMENU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartMENUMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cartMENUMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cartMENUMouseExited(evt);
            }
        });
        userMENU.add(cartMENU);

        editProfileMENU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/profileEdit16.png"))); // NOI18N
        editProfileMENU.setText("Perfil");
        editProfileMENU.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        editProfileMENU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editProfileMENUMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editProfileMENUMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editProfileMENUMouseExited(evt);
            }
        });
        userMENU.add(editProfileMENU);

        feedbackMENU.setForeground(new java.awt.Color(255, 255, 255));
        feedbackMENU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/feedback20.png"))); // NOI18N
        feedbackMENU.setText("Meus feedbacks");
        feedbackMENU.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        feedbackMENU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                feedbackMENUMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                feedbackMENUMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                feedbackMENUMouseExited(evt);
            }
        });
        userMENU.add(feedbackMENU);

        setJMenuBar(userMENU);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userBackBTN)
                .addGap(81, 81, 81)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cashbackTXT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valueCashbackTXT))
                    .addComponent(foodTypeCBOX, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(87, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cashbackTXT)
                            .addComponent(valueCashbackTXT))
                        .addGap(11, 11, 11)
                        .addComponent(foodTypeCBOX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(userBackBTN))
                        .addGap(38, 38, 38)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userBackBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userBackBTNMouseClicked
        this.dispose();
        Login loginScreen = new Login();
        loginScreen.setVisible(true);
    }//GEN-LAST:event_userBackBTNMouseClicked

    private void editProfileMENUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editProfileMENUMouseClicked
        this.dispose();
        EditProfile editClientProfileScreen = new EditProfile();
        editClientProfileScreen.setVisible(true);
    }//GEN-LAST:event_editProfileMENUMouseClicked

    private void cartMENUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartMENUMouseClicked
        this.dispose();
        Cart cartScreen = new Cart();
        cartScreen.setVisible(true);
    }//GEN-LAST:event_cartMENUMouseClicked

    private void cartMENUMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartMENUMouseEntered
        cartMENU.setForeground(Color.decode("6554655"));                                                                              
        cartMENU.setIcon(new ImageIcon("C:\\Users\\evelyn.ferreira\\Desktop\\laCocina-master\\src\\assets\\hoverCart20.png"));
    }//GEN-LAST:event_cartMENUMouseEntered

    private void cartMENUMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartMENUMouseExited
        cartMENU.setForeground(Color.white);
        cartMENU.setIcon(new ImageIcon("C:\\Users\\evelyn.ferreira\\Desktop\\laCocina-master\\src\\assets\\cart20.png"));
    }//GEN-LAST:event_cartMENUMouseExited

    private void editProfileMENUMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editProfileMENUMouseEntered
        editProfileMENU.setForeground(Color.decode("6554655"));    
        editProfileMENU.setIcon(new ImageIcon("C:\\Users\\evelyn.ferreira\\Desktop\\laCocina-master\\src\\assets\\hoverProfileEdit.png"));
    }//GEN-LAST:event_editProfileMENUMouseEntered

    private void editProfileMENUMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editProfileMENUMouseExited
        editProfileMENU.setForeground(Color.white);
        editProfileMENU.setIcon(new ImageIcon("C:\\Users\\evelyn.ferreira\\Desktop\\laCocina-master\\src\\assets\\profileEdit16.png"));
    }//GEN-LAST:event_editProfileMENUMouseExited

    private void menuTBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTBLMouseClicked
        //        Menu item = new Menu();
//        MenuDAO dao = new MenuDao();
         
        int index = menuTBL.getSelectedRow();
        if(index > -1){
            this.dispose();
            ItemDetailed itemScreen = new ItemDetailed();
            itemScreen.setVisible(true);
            
//            item = dao.Listar().get(index);
        }
    }//GEN-LAST:event_menuTBLMouseClicked

    private void foodTypeCBOXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foodTypeCBOXMouseClicked
        String type = (String) foodTypeCBOX.getSelectedItem();
        
            ///Trazer todos que tenham Type
            loadTable();
    }//GEN-LAST:event_foodTypeCBOXMouseClicked

    private void feedbackMENUMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feedbackMENUMouseEntered
        feedbackMENU.setForeground(Color.decode("6554655"));    
        feedbackMENU.setIcon(new ImageIcon("C:\\Users\\evelyn.ferreira\\Desktop\\laCocina-master\\src\\assets\\hoverFeedback20.png"));
    }//GEN-LAST:event_feedbackMENUMouseEntered

    private void feedbackMENUMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feedbackMENUMouseExited
        feedbackMENU.setForeground(Color.white);    
        feedbackMENU.setIcon(new ImageIcon("C:\\Users\\evelyn.ferreira\\Desktop\\laCocina-master\\src\\assets\\feedback20.png"));
    }//GEN-LAST:event_feedbackMENUMouseExited

    private void feedbackMENUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feedbackMENUMouseClicked
        //Tela meus feedbacks
    }//GEN-LAST:event_feedbackMENUMouseClicked

      private void loadTable(){
        
        DefaultTableModel model = (DefaultTableModel) menuTBL.getModel();
        model.setNumRows(0);
        
        menuTBL.getColumnModel().getColumn(0).setPreferredWidth(2);
        menuTBL.getColumnModel().getColumn(1).setPreferredWidth(96);
        menuTBL.getColumnModel().getColumn(2).setPreferredWidth(2);
        
//        MenuDao dao = new MenuDao();
//        for(Menu item: dao.List()){
//            model.addRow(new Object[]{
//                item.getId(),
//                item.getName,
//                item.getPrice               
//            });
//        }
        
    }
      private void addItem(){
        String[] foodType = {
            "Todos",
            "Veganos",
            "Bebidas",
            "Picantes",
            "Do chef"};
        for(String type: foodType){
            modelCBOX.addElement(type);
        } 
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UsersAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsersAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsersAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsersAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new UsersAccount().setVisible(true);
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu cartMENU;
    private javax.swing.JLabel cashbackTXT;
    private javax.swing.JMenu editProfileMENU;
    private javax.swing.JMenu feedbackMENU;
    private javax.swing.JComboBox<String> foodTypeCBOX;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable menuTBL;
    private javax.swing.JButton userBackBTN;
    private javax.swing.JMenuBar userMENU;
    private javax.swing.JLabel valueCashbackTXT;
    // End of variables declaration//GEN-END:variables

}
