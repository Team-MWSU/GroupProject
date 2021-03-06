package gui;

import database.CustomerAccounts;
import database.SQLDriver;
import static gui.Customer.checkingAccountList;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

public class TellerSelectCustomer extends javax.swing.JFrame {

    /**
     * Creates new form TellerSelectCustomer
     */
    
    public int customerID;
    
    public TellerSelectCustomer() {
        initComponents();
    }
    
    private boolean isNumeric(String input)
    {
        Scanner sc = new Scanner(input);
        return sc.hasNextInt();
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
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Select Customer");
        jButton1.setToolTipText("Select Customer");
        jButton1.setMaximumSize(new java.awt.Dimension(150, 29));
        jButton1.setMinimumSize(new java.awt.Dimension(150, 29));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Teller Select Customer");

        jButton3.setText("Back");
        jButton3.setToolTipText("Return to Previous Screen");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField1.setToolTipText("Enter Customer ID Number");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter Customer ID Number");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)))
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(250, 322));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public people.Customer searchCustomer = new people.Customer();
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String customerIDString = jTextField1.getText();
        SQLDriver db = new SQLDriver();
        database.Customer newCust = new database.Customer();
        
        if (customerIDString.equals("")){
            jLabel3.setText("Enter Customer ID");
        }
        else if(!isNumeric(customerIDString))
        {
            jLabel3.setText("Invalid Input");
        }
        else if(newCust.search(Integer.parseInt(customerIDString))==null)
        {
            jLabel3.setText("Customer Not Found");
        }else{
            customerID = Integer.parseInt(customerIDString);
            people.Customer searchCustomer = new people.Customer();
            int customerID = Integer.parseInt(customerIDString);
            //people.Customer searchCustomer = new people.Customer();
            searchCustomer.search(customerID);
        
            List<CustomerAccounts> theAccountList = searchCustomer.getCustomerAccounts();
       
            
            
            
            //Set the Customer General Info
            TellerActionScreen co = new TellerActionScreen();
            TellerActionScreen.jLabel10.setText(customerIDString);
            TellerActionScreen.jLabel11.setText(searchCustomer.getFirstName());
            TellerActionScreen.jLabel12.setText(searchCustomer.getLastName());
            TellerActionScreen.jLabel13.setText(searchCustomer.getSSNumber());
            TellerActionScreen.jLabel17.setText(searchCustomer.getStreetAddress());
            TellerActionScreen.jLabel16.setText(searchCustomer.getCity());
            TellerActionScreen.jLabel15.setText(searchCustomer.getState());
            TellerActionScreen.jLabel14.setText(searchCustomer.getZipCode());
            
            //Set the Customer Account Info
            DefaultTableModel modelSavings = (DefaultTableModel) TellerActionScreen.jTableSavings.getModel();
            DefaultTableModel modelChecking = (DefaultTableModel) TellerActionScreen.jTableChecking.getModel();
            DefaultTableModel modelLoans = (DefaultTableModel) TellerActionScreen.jTableLoans.getModel();
            DefaultTableModel modelCD = (DefaultTableModel) TellerActionScreen.jTableCD.getModel();
            DefaultTableModel modelCreditCard = (DefaultTableModel) TellerActionScreen.jTableCreditCard.getModel();
            
            //This code works VERY well, but it involves adding an additional .jar file. I'll try another way.
            /*
            String[] differentAccounts = {"savings", "checking", "loan", "cd", "ccard"};
            String[] differentLabels = {"OwnerID", "CustID", "CustID", "CustID", "CustID", "CustID"};
            JTable[] differentTables = {
                TellerActionScreen.jTableSavings,
                TellerActionScreen.jTableChecking,
                TellerActionScreen.jTableLoans,
                TellerActionScreen.jTableCD,
                TellerActionScreen.jTableCreditCard
            };
            for(int i = 0; i<differentAccounts.length; i++){
                SQLDriver db = new SQLDriver();
                String statement = "SELECT * FROM " + differentAccounts[i] + " WHERE " + differentLabels[i] + "="+searchCustomer.getID()+";";
                ResultSet rs = (ResultSet)db.select(statement);
                differentTables[i].setModel(DbUtils.resultSetToTableModel(rs));
            }
            */

            List<String> tempCheckingAcctList = new ArrayList<String>();
            for(int i=0; i<theAccountList.size(); i++){
                String accountType = (theAccountList.get(i)).getAccountType();
                
                int    accountID = (theAccountList.get(i)).getAccountID();
                
                String accountIDString = Integer.toString(accountID);
                
                
                
                switch (accountType){
                    
                    case "Savings":
                        String statementSavings = "SELECT * FROM savings WHERE AccountID = " + accountID + ";";
                        ResultSet resSavings = (ResultSet)db.select(statementSavings);
                        try{
                            while (resSavings.next()){    
                                double interestRate = resSavings.getDouble("Interest");
                                double balance = resSavings.getDouble("Balance");
                                double overdraft = resSavings.getDouble("Overdraft");
                                Date opened = resSavings.getDate("Opened");
                                int active = resSavings.getInt("Active");
                                String activeOut;
                                
                                if (active == 1){
                                    activeOut = "Yes";
                                }else{
                                    activeOut = "No";
                                }
                                                              
                                modelSavings.addRow(new Object[]{accountID, balance, interestRate, 
                                    overdraft, opened, activeOut});
                            }
                        }catch (Exception ex){
                            ex.printStackTrace();
                        }
                        
                        break;
                    case "Checking":
                        String statementChecking = "SELECT * FROM checking WHERE AccountID = " + accountID + ";";
                        ResultSet resChecking = (ResultSet)db.select(statementChecking);
                        try{
                            while (resChecking.next()){    
                                double interestRate = resChecking.getDouble("Interest");
                                double balance = resChecking.getDouble("Value");
                                double overdraftAccount = resChecking.getDouble("SavingsAcct");
                                Date opened = resChecking.getDate("Opened");
                                int active = resChecking.getInt("Active");
                                String type = resChecking.getString("Type");
                                double averageBalance = resChecking.getDouble("AvgBal");
                                String activeOut;
                                
                                if (active == 1){
                                    activeOut = "Yes";
                                }else{
                                    activeOut = "No";
                                }
                                                              
                                modelChecking.addRow(new Object[]{accountID, type,  balance, interestRate, 
                                    overdraftAccount, averageBalance, opened, activeOut});
                                
                                tempCheckingAcctList.add(accountIDString);
                            }
                        }catch (Exception ex){
                            ex.printStackTrace();
                        }

                        break;
                    case "Loan":
                        String statementLoan = "SELECT * FROM loan WHERE AccountID = " + accountID + ";";
                        ResultSet resLoan = (ResultSet)db.select(statementLoan);
                        try{
                            while (resLoan.next()){    
                                double interestRate = resLoan.getDouble("Interest");
                                String loanType = resLoan.getString("Type");
                                double monthly = resLoan.getDouble("Monthly");
                                double totalAmt = resLoan.getDouble("TotalAmt");
                                double currAmt = resLoan.getDouble("CurrAmt");
                                Date nextPmt = resLoan.getDate("NextDue");
                                Date lastFull = resLoan.getDate("LastFull");
                                int flag = resLoan.getInt("Flag");
                                String flagOut;
                                
                                if (flag == 1){
                                    flagOut = "Yes";
                                }else{
                                    flagOut = "No";
                                }
                                
                                int active = resLoan.getInt("Active");
                                String activeOut;
                                
                                if (active == 1){
                                    activeOut = "Yes";
                                }else{
                                    activeOut = "No";
                                }
                                                              
                                modelLoans.addRow(new Object[]{accountID, loanType, interestRate, 
                                    monthly, nextPmt, currAmt, flagOut, lastFull, activeOut});
                            }
                        }catch (Exception ex){
                            ex.printStackTrace();
                        }
                        break;
                    case "CD":
                        String statementCD = "SELECT * FROM cd WHERE AccountID = " + accountID + ";";
                        ResultSet resCD = (ResultSet)db.select(statementCD);
                        try{
                            while (resCD.next()){    
                                double interestRate = resCD.getDouble("Interest");
                                double value = resCD.getDouble("Value");
                                Date opened = resCD.getDate("Opened");
                                Date maturityDate = resCD.getDate("Maturity");
                                Date rolloverDate = resCD.getDate("Rollover");
                                String penalty = resCD.getString("Penalty");
                                                              
                                modelCD.addRow(new Object[]{accountID, value, interestRate, 
                                    opened, maturityDate, rolloverDate, penalty});
                            }
                        }catch (Exception ex){
                            ex.printStackTrace();
                        }
                        break;
                    case "Credit Card":
                        String statementCreditCard = "SELECT * FROM ccard WHERE AccountID = " + accountID + ";";
                        ResultSet resCreditCard = (ResultSet)db.select(statementCreditCard);
                        try{
                            while (resCreditCard.next()){    
                                double interestRate = resCreditCard.getDouble("Interest");
                                double totalCredit = resCreditCard.getDouble("TotalCredit");
                                double openCredit = resCreditCard.getDouble("OpenCredit");
                                double usedCredit = resCreditCard.getDouble("UsedCredit");
                                Date nextDue = resCreditCard.getDate("NextDue");
                                String penalty = resCreditCard.getString("Penalty");
                                int active = resCreditCard.getInt("Active");
                                String activeOut;
                                
                                if (active == 1){
                                    activeOut = "Yes";
                                }else{
                                    activeOut = "No";
                                }

                                                              
                                modelCreditCard.addRow(new Object[]{accountID, interestRate, totalCredit,
                                    openCredit, usedCredit, nextDue, penalty, activeOut});
                            }
                        }catch (Exception ex){
                            ex.printStackTrace();
                        }
                        break;
                        
                }
 

            }
      
            checkingAccountList = tempCheckingAcctList.toArray(new String[tempCheckingAcctList.size()]);
                
            for (int i=0; i<checkingAccountList.length; i++){
                    
            }
            
            dispose();
            co.setResizable(false);
            co.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
        BankingSystemMainScreen bsms = new BankingSystemMainScreen();
        bsms.setResizable(false);
        bsms.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(TellerSelectCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TellerSelectCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TellerSelectCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TellerSelectCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TellerSelectCustomer().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
