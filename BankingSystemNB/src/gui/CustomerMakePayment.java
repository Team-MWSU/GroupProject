package gui;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class CustomerMakePayment extends javax.swing.JFrame {

    String[] temporaryList = {"Select Type"};

    /**
     * Creates new form CustomerMakePayment
     */
    public CustomerMakePayment() {
        initComponents();
    }
    private boolean isNumeric(String input)
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

        jButtonCancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxAccountType = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldPaymentAmount = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButtonMakePayment = new javax.swing.JButton();
        jComboBoxAccountNumber = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButtonCancel.setText("Cancel");
        jButtonCancel.setToolTipText("Return to Previous Screen");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Customer Make Payment");

        jComboBoxAccountType.setModel(new javax.swing.DefaultComboBoxModel(Customer.accountTypesList));
        jComboBoxAccountType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAccountTypeActionPerformed(evt);
            }
        });

        jLabel2.setText("Account Type:");

        jLabel3.setText("Account Number:");

        jLabel4.setText("Payment Amount:");

        jButtonMakePayment.setText("Make Payment");
        jButtonMakePayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMakePaymentActionPerformed(evt);
            }
        });

        /*
        String selectedType = jComboBoxAccountType.getSelectedItem().toString();
        String[] selectedList;

        String[] ccardList = Customer.creditCardAccountList;
        String[] shortLoanList = Customer.shortTermLoanAccountList;
        String[] longLoanList = Customer.longTermLoanAccountList;

        if(selectedType.equals("Credit Card")){
            selectedList = ccardList;
        }else if(selectedType.equals("Short-Term Loan")){
            selectedList = shortLoanList;
        }else{
            selectedList = longLoanList;
        }
        */
        jComboBoxAccountNumber.setModel(new javax.swing.DefaultComboBoxModel(temporaryList));
        jComboBoxAccountNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAccountNumberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonMakePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldPaymentAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxAccountType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxAccountNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPaymentAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMakePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(271, 274));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonMakePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMakePaymentActionPerformed
        String accountType = jComboBoxAccountType.getSelectedItem().toString();
        String accountNumber  = jComboBoxAccountNumber.getSelectedItem().toString();
        String paymentAmount   = jTextFieldPaymentAmount.getText();
        boolean success = false;

        
        if (paymentAmount.equals("")){
            jLabel5.setText("Enter ALL Text");
        }else if(accountNumber.equals("")){
            jLabel5.setText("Enter ALL Text");
        }else if(accountType.equals("")){
            jLabel5.setText("Enter ALL Text");
        }else if(!isNumeric(paymentAmount)){
            jLabel5.setText("Amount invalid");
        }else if(Double.parseDouble(paymentAmount)<=0){
            jLabel5.setText("Amount invalid");
        }else{
            DateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
            Calendar cal = Calendar.getInstance();
            String myDate = dFormat.format(cal.getTime());
            cal.add(Calendar.MONTH, 1);
            String fDate = dFormat.format(cal.getTime());
            
            database.Transaction newTrans;
            double Payment = Double.parseDouble(paymentAmount);
            int Account = Integer.parseInt(accountNumber);
            newTrans = new database.Transaction(0, myDate, "Payment", Payment, Account);
            int selection = jComboBoxAccountType.getSelectedIndex();
            switch (selection){
                case 0: 
                {
                    database.Loan myLoan = new database.Loan();
                    myLoan = myLoan.getRecord(Integer.parseInt(accountNumber));
                    if(Payment > myLoan.CurrAmt)
                    {
                        jLabel5.setText("Payment exceeds amount owed");
                    }
                    else{
                        myLoan.addTrans(newTrans);
                        myLoan.CurrAmt-=Payment;
                        if(Payment>=myLoan.Monthly)
                        {
                            myLoan.NextDue = fDate;
                            myLoan.LastFull = myDate;
                        }
                        myLoan.updateRecord(myLoan);
                        success=true;
                    }
                    break;
                }
                case 1:
                {
                    database.Loan myLoan = new database.Loan();
                    myLoan = myLoan.getRecord(Integer.parseInt(accountNumber));
                    if(Payment > myLoan.CurrAmt)
                    {
                        jLabel5.setText("Payment exceeds amount owed");
                    }
                    else{
                        myLoan.addTrans(newTrans);
                        myLoan.CurrAmt-=Payment;
                        if(Payment>=myLoan.Monthly)
                        {
                            myLoan.NextDue = fDate;
                            myLoan.LastFull = myDate;
                        }
                        myLoan.updateRecord(myLoan);
                        success=true;
                    }
                    break;
                }
                case 2:
                {
                    database.CCard myCard = new database.CCard();
                    myCard = myCard.getRecord(Integer.parseInt(accountNumber));
                    if(Payment > myCard.UsedCredit)
                    {
                        jLabel5.setText("Payment exceeds amount owed");
                    }
                    else{
                        myCard.addTrans(newTrans);
                        myCard.UsedCredit-=Payment;
                        myCard.OpenCredit+=Payment;
                        myCard.NextDue = fDate;
                        myCard.updateRecord(myCard);
                        success=true;
                    }
                    break;
                }
                    
            }
            if (success==true)
            {
                dispose();
            }
        
            //Add code for the transaction below. This will have to work with the database. 
        }
    }//GEN-LAST:event_jButtonMakePaymentActionPerformed

    private void jComboBoxAccountTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAccountTypeActionPerformed
        String selectedType = jComboBoxAccountType.getSelectedItem().toString();
        String[] selectedList; 

        String[] ccardList = Customer.creditCardAccountList; 
        String[] shortLoanList = Customer.shortTermLoanAccountList; 
        String[] longLoanList = Customer.longTermLoanAccountList;

        jComboBoxAccountNumber.removeAllItems();
        
        if(selectedType.equals("Credit Card")){
            selectedList = ccardList;            
        }else if(selectedType.equals("Short-Term Loan")){
            selectedList = shortLoanList;
        }else{
            selectedList = longLoanList;
        }
        
        for(int i=0; i<selectedList.length; i++){
            jComboBoxAccountNumber.addItem(selectedList[i]);
        }        
    }//GEN-LAST:event_jComboBoxAccountTypeActionPerformed

    private void jComboBoxAccountNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAccountNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAccountNumberActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jComboBoxAccountType.setSelectedIndex(0);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(CustomerMakePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerMakePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerMakePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerMakePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerMakePayment().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonMakePayment;
    public javax.swing.JComboBox jComboBoxAccountNumber;
    public static javax.swing.JComboBox jComboBoxAccountType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextFieldPaymentAmount;
    // End of variables declaration//GEN-END:variables
}
