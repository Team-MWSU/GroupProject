package gui;

public class BankingSystemMainScreen extends javax.swing.JFrame 
{
    public BankingSystemMainScreen() 
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonManagerScreen = new javax.swing.JButton();
        jButtonTellerSelectCustomer = new javax.swing.JButton();
        jButtonCustomer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText(" Banking System Main Screen");

        jButtonManagerScreen.setText("Manager");
        jButtonManagerScreen.setMaximumSize(new java.awt.Dimension(75, 25));
        jButtonManagerScreen.setMinimumSize(new java.awt.Dimension(75, 25));
        jButtonManagerScreen.setPreferredSize(new java.awt.Dimension(75, 25));
        jButtonManagerScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonManagerScreenActionPerformed(evt);
            }
        });

        jButtonTellerSelectCustomer.setText("Teller");
        jButtonTellerSelectCustomer.setMaximumSize(new java.awt.Dimension(75, 25));
        jButtonTellerSelectCustomer.setMinimumSize(new java.awt.Dimension(75, 25));
        jButtonTellerSelectCustomer.setPreferredSize(new java.awt.Dimension(75, 25));
        jButtonTellerSelectCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTellerSelectCustomerActionPerformed(evt);
            }
        });

        jButtonCustomer.setText("Customer");
        jButtonCustomer.setMaximumSize(new java.awt.Dimension(75, 25));
        jButtonCustomer.setMinimumSize(new java.awt.Dimension(75, 25));
        jButtonCustomer.setPreferredSize(new java.awt.Dimension(75, 25));
        jButtonCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonManagerScreen, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(jButtonTellerSelectCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jButtonManagerScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jButtonTellerSelectCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jButtonCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(250, 322));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCustomerActionPerformed
        dispose();
        Customer c = new Customer();
        c.setResizable(false);
        c.setVisible(true);
    }//GEN-LAST:event_jButtonCustomerActionPerformed

    private void jButtonManagerScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonManagerScreenActionPerformed
        dispose();
        ManagerScreen ms = new ManagerScreen();
        ms.setResizable(false);
        ms.setVisible(true);
    }//GEN-LAST:event_jButtonManagerScreenActionPerformed

    private void jButtonTellerSelectCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTellerSelectCustomerActionPerformed
        dispose();
        TellerSelectCustomer ts = new TellerSelectCustomer();
        ts.setResizable(false);
        ts.setVisible(true);
    }//GEN-LAST:event_jButtonTellerSelectCustomerActionPerformed
    
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(BankingSystemMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankingSystemMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankingSystemMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankingSystemMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new BankingSystemMainScreen().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCustomer;
    private javax.swing.JButton jButtonManagerScreen;
    private javax.swing.JButton jButtonTellerSelectCustomer;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}