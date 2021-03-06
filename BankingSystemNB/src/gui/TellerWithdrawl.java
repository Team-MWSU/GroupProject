/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.util.Scanner;

import accounts.Checking;
import accounts.Savings;
import database.Transaction;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Joel Jacobsen
 */
public class TellerWithdrawl extends javax.swing.JFrame {

    /**
     * Creates new form TellerWithdrawl
     */
    
    public int accountID;
    public String accountType;
    
    public TellerWithdrawl() {
        initComponents();
    }

    public boolean isNumeric(String input)
    {
        Scanner sc = new Scanner(input);
        return sc.hasNextDouble();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Withdrawal");
        jButton1.setToolTipText("Withdrawl");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Amount");

        jLabel3.setText("Account Number");

        jButton7.setText("Close");
        jButton7.setToolTipText("Return to Previous Screen");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jComboBox2.setToolTipText("Month");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Teller Withdrawal");

        jLabel2.setText("Date");

        jTextField2.setToolTipText("Amount for Deposit");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024" }));
        jComboBox4.setToolTipText("Year");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBox3.setToolTipText("Day");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))))
                .addGap(285, 285, 285))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(300, 322));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String inDay   = jComboBox2.getSelectedItem().toString();
        String inMonth = jComboBox3.getSelectedItem().toString();
        String inYear  = jComboBox4.getSelectedItem().toString();
        String amount = jTextField2.getText();
        Transaction newTrans;
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        
        int year = Integer.parseInt(inYear);
        year = year - 1900;
        int month = Integer.parseInt(inMonth);
        int day = Integer.parseInt(inDay);
        
        Date date = new Date(year, month, day);
        
        String startDate = formatter.format(date);
        
        if (inDay.equals("")){
            jLabel5.setText("Enter ALL Text");
        }else if(inMonth.equals("")){
            jLabel5.setText("Enter ALL Text");
        }else if(inMonth.equals("")){
            jLabel5.setText("Enter ALL Text");
        }else if(amount.equals("")){
            jLabel5.setText("Enter ALL Text");
        }else if(!isNumeric(amount)){
            jLabel5.setText("Invalid Amount");
        }else if(Double.parseDouble(amount)<0)
        {
            jLabel5.setText("Invalid Amount");
        }else{
            /*
                Again, this needs to push to the database instead. 
            */
            double debitAmount = Double.parseDouble(amount);
            switch(accountType)
            {
                case "Savings":
                    database.Savings newSavings = new database.Savings();
                    newSavings = newSavings.getRecord(accountID);
                    if(newSavings.Active == false)
                    {
                        jLabel5.setText("Account is Inactive");
                    }
                    else
                    {
                        Savings workingSavings = new Savings(accountID, newSavings.CustNum, newSavings.Value, "savings");
                        if(workingSavings.getAccountTotal() < debitAmount)
                        {
                            jLabel5.setText("Not Enough Funds");
                        }
                        else
                        {
                            workingSavings.withdraw(debitAmount);
                            newSavings.Value = workingSavings.getAccountTotal();
                            newSavings.updateRecord(newSavings);
                            System.out.println(newSavings.Value);
                            newTrans = new Transaction(0, startDate, "Teller Withdraw", debitAmount, accountID);
                            newSavings.addTrans(newTrans);
                            dispose();
                        }
                    }
                    break;
                case "Checking":
                    database.Checking newChecking = new database.Checking();
                    newChecking = newChecking.getRecord(accountID);
                    Checking workingChecking = new Checking(accountID, newChecking.OwnerID, newChecking.Balance, "checking", newChecking.Type);
                        if(workingChecking.getAccountTotal() < debitAmount)
                        {
                            jLabel5.setText("Not Enough Funds");
                        }
                        else
                        {
                            workingChecking.debit(debitAmount);
                            System.out.println(workingChecking.getAccountTotal());
                            if(workingChecking.getAccountTotal() < 1000 && newChecking.Type.equals("GD"))
                            {
                                newChecking.Type = "TMB";
                            }
                            newChecking.Balance = workingChecking.getAccountTotal();
                            if(newChecking.SavingsAcct == 0)
                            {
                                newChecking.SavingsAcct = -1;
                            }
                            newChecking.updateRecord(newChecking);
                            System.out.println(newChecking.Balance);
                            newTrans = new Transaction(0, startDate, "Teller Withdraw", debitAmount, accountID);
                            newChecking.addTrans(newTrans);
                            dispose();
                        }
                    break;
                case "Loans":
                    jLabel5.setText("Can't withdraw from Loan");
                    break;
                case "CD":
                    jLabel5.setText("Can't withdraw from CD");
                    break;
                case "CCard":
                    jLabel5.setText("Can't withdraw from Credit Card");
                    break;
                default:
                    break;
            }
        }
            //dispose();
            //TellerActionScreen tas = new TellerActionScreen();
            //tas.setResizable(false);
            //tas.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        dispose();
        //TellerActionScreen tas = new TellerActionScreen();
        //tas.setResizable(false);
        //tas.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(TellerWithdrawl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TellerWithdrawl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TellerWithdrawl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TellerWithdrawl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TellerWithdrawl().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
