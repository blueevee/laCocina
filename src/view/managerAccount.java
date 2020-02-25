/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Blueevee
 */
public class managerAccount extends javax.swing.JFrame {

    /**
     * Creates new form managerAcount
     */
    public managerAccount() {
        initComponents();
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        managerBackBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        productsTBL = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        registerItensMENU = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("La Cocina");

        managerBackBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/back16.png"))); // NOI18N
        managerBackBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                managerBackBTNMouseClicked(evt);
            }
        });

        productsTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "ITEM", "PREÇO", "TIPO", "FORNECEDOR", "DESCRIÇÃO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productsTBL);
        if (productsTBL.getColumnModel().getColumnCount() > 0) {
            productsTBL.getColumnModel().getColumn(0).setHeaderValue("CÓDIGO");
            productsTBL.getColumnModel().getColumn(1).setHeaderValue("ITEM");
            productsTBL.getColumnModel().getColumn(2).setHeaderValue("PREÇO");
            productsTBL.getColumnModel().getColumn(3).setHeaderValue("TIPO");
            productsTBL.getColumnModel().getColumn(4).setHeaderValue("FORNECEDOR");
            productsTBL.getColumnModel().getColumn(5).setHeaderValue("DESCRIÇÃO");
        }

        registerItensMENU.setText("Cadastrar itens");
        registerItensMENU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerItensMENUMouseClicked(evt);
            }
        });
        jMenuBar1.add(registerItensMENU);

        jMenu1.setText("Funcionários");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(managerBackBTN)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(managerBackBTN)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void managerBackBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managerBackBTNMouseClicked
        this.dispose();
        login loginScreen = new login();
        loginScreen.setVisible(true);
    }//GEN-LAST:event_managerBackBTNMouseClicked

    private void registerItensMENUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerItensMENUMouseClicked
       this.dispose();
       registerProducts registerProductsScreen = new registerProducts();
       registerProductsScreen.setVisible(true); 
    }//GEN-LAST:event_registerItensMENUMouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
       this.dispose();
       manageEmployees manageEmployeesScreen = new manageEmployees();
       manageEmployeesScreen.setVisible(true); 
    }//GEN-LAST:event_jMenu1MouseClicked
    private void loadTable(){
        
        DefaultTableModel model = (DefaultTableModel) productsTBL.getModel();
        model.setNumRows(0);
        
        productsTBL.getColumnModel().getColumn(0).setPreferredWidth(5);
        productsTBL.getColumnModel().getColumn(1).setPreferredWidth(50);
        productsTBL.getColumnModel().getColumn(2).setPreferredWidth(10);
        productsTBL.getColumnModel().getColumn(3).setPreferredWidth(30);
        productsTBL.getColumnModel().getColumn(4).setPreferredWidth(30);
        productsTBL.getColumnModel().getColumn(5).setPreferredWidth(20);
        
//        pegar do bd e preencher as linhas
        model.addRow(new Object[]{
            
            
        });
        
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(managerAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new managerAccount().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton managerBackBTN;
    private javax.swing.JTable productsTBL;
    private javax.swing.JMenu registerItensMENU;
    // End of variables declaration//GEN-END:variables
}
