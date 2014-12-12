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
public class ViewManagersDesk extends javax.swing.JFrame {

    /**
     * Creates new form ViewManagersDesk
     */
    public ViewManagersDesk() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jLabelCheckingIR = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonLeaveOffice = new javax.swing.JButton();
        jLabelCheckingIR1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabelTitle.setFont(new java.awt.Font("Handwriting - Dakota", 0, 48)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle.setText("Manager's Desk");
        getContentPane().add(jLabelTitle);
        jLabelTitle.setBounds(334, 7, 345, 83);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/DeskCalendar.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 96, 660, 609);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Current Date");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(53, 96, 96, 41);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Interest Rates");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(836, 96, 108, 41);

        jLabelDate.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabelDate);
        jLabelDate.setBounds(53, 143, 99, 29);

        jLabelCheckingIR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabelCheckingIR);
        jLabelCheckingIR.setBounds(905, 143, 46, 30);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Checking:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(836, 143, 63, 30);

        jButtonLeaveOffice.setText("Leave Office");
        jButtonLeaveOffice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLeaveOfficeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLeaveOffice);
        jButtonLeaveOffice.setBounds(836, 649, 163, 56);

        jLabelCheckingIR1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabelCheckingIR1);
        jLabelCheckingIR1.setBounds(905, 143, 46, 30);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Checking:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(836, 143, 63, 30);

        jLabelSavingsIR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabelSavingsIR);
        jLabelSavingsIR.setBounds(910, 180, 46, 30);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Savings:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(840, 180, 70, 30);

        setSize(new java.awt.Dimension(1005, 733));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLeaveOfficeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLeaveOfficeActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonLeaveOfficeActionPerformed

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
            java.util.logging.Logger.getLogger(ViewManagersDesk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewManagersDesk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewManagersDesk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewManagersDesk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewManagersDesk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLeaveOffice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabelCheckingIR;
    private javax.swing.JLabel jLabelCheckingIR1;
    public static javax.swing.JLabel jLabelDate;
    public static final javax.swing.JLabel jLabelSavingsIR = new javax.swing.JLabel();
    private javax.swing.JLabel jLabelTitle;
    // End of variables declaration//GEN-END:variables
}
