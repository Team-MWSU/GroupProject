/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Jordan
 */
public class ManagerCreate extends javax.swing.JFrame {

    /**
     * Creates new form ManagerCreate
     */
    public ManagerCreate() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jButtonCreate = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jComboBoxCreateObject = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabelWarning = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTitle.setText("Create");

        jButtonCreate.setText("Create");
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jComboBoxCreateObject.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Item","Savings Account", "Checking Account", "CD",  "Short-Term Loan", "Long-Term Loan", "ATM Card", "Credit Card" }));
        jComboBoxCreateObject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCreateObjectActionPerformed(evt);
            }
        });

        jLabel1.setText("Create A(n) ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBoxCreateObject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButtonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabelTitle)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelTitle)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxCreateObject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelWarning, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxCreateObjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCreateObjectActionPerformed
        
    }//GEN-LAST:event_jComboBoxCreateObjectActionPerformed

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed
        String objectType = jComboBoxCreateObject.getSelectedItem().toString();
        
        if(objectType.equals("Select Item")){
            jLabelWarning.setText("Select An Object");
        }else{
            dispose();
            ManagerScreen.mas.dispose();
            if(objectType.equals("Savings Account")){
                CreateSavingsAccount cas = new CreateSavingsAccount();
                int customerID = Integer.parseInt(ManagerActionScreen.jLabelCustomerID.getText());
                cas.customerID = customerID;
                cas.setResizable(false);
                cas.setVisible(true);
            }else if(objectType.equals("Checking Account")){
                CreateCheckingAccount cca = new CreateCheckingAccount();
                int customerID = Integer.parseInt(ManagerActionScreen.jLabelCustomerID.getText());
                cca.customerID = customerID;
                String customerIDString = Integer.toString(customerID);
                cca.jLabel8.setText(customerIDString);
                cca.setResizable(false);
                cca.setVisible(true);    
            }else if(objectType.equals("CD")){
                CreateCD crcd = new CreateCD();
                int customerID = Integer.parseInt(ManagerActionScreen.jLabelCustomerID.getText());
                crcd.customerID = customerID;
                crcd.setResizable(false);
                crcd.setVisible(true);

            }else if(objectType.equals("Short-Term Loan")){
                CreateShortTermLoan cstl = new CreateShortTermLoan();
                int customerID = Integer.parseInt(ManagerActionScreen.jLabelCustomerID.getText());
                cstl.customerID = customerID;
                String customerIDString = Integer.toString(customerID);
                cstl.jLabel11.setText(customerIDString);
                cstl.setResizable(false);
                cstl.setVisible(true);                
            }else if(objectType.equals("Long-Term Loan")){
                CreateLongTermLoan cltl = new CreateLongTermLoan();
                int customerID = Integer.parseInt(ManagerActionScreen.jLabelCustomerID.getText());
                cltl.customerID = customerID;
                String customerIDString = Integer.toString(customerID);
                cltl.jLabel9.setText(customerIDString);
                cltl.setResizable(false);
                cltl.setVisible(true);                
            }else if(objectType.equals("ATM Card")){
                CreateATMCard catmc = new CreateATMCard();
                catmc.setResizable(false);
                catmc.setVisible(true);                
            }else if(objectType.equals("Credit Card")){
                CreateCreditCard ccc = new CreateCreditCard();
                int customerID = Integer.parseInt(ManagerActionScreen.jLabelCustomerID.getText());
                ccc.customerID = customerID;
                String customerIDString = Integer.toString(customerID);
                ccc.jLabel7.setText(customerIDString);
                ccc.setResizable(false);
                ccc.setVisible(true);                
            }
            
        }
    }//GEN-LAST:event_jButtonCreateActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

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
            java.util.logging.Logger.getLogger(ManagerCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerCreate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JComboBox jComboBoxCreateObject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelWarning;
    // End of variables declaration//GEN-END:variables
}
