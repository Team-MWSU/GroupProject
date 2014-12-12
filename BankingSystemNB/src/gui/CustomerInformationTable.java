package gui;

import people.Customer;
import database.SQLDriver;
import database.CustomerAccounts;
import static gui.ManagerScreen.accountTypesList;
import static gui.ManagerScreen.checkingAccountList;
import static gui.ManagerScreen.creditCardAccountList;
import static gui.ManagerScreen.longTermLoanAccountList;
import static gui.ManagerScreen.mas;
import static gui.ManagerScreen.savingsAccountList;
import static gui.ManagerScreen.shortTermLoanAccountList;
import java.awt.*;
import java.sql.ResultSet;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;



public class CustomerInformationTable extends JFrame{
    
    JTable table;
    int customerID;


    public CustomerInformationTable (int custID){
        customerID = custID;
        String customerIDString = Integer.toString(customerID);
        SQLDriver db = new SQLDriver();
    
        Customer theCustomer = new Customer();
        theCustomer.search(customerID);
        
            people.Customer searchCustomer = new people.Customer();
            searchCustomer.search(customerID);
            
            dispose();
            
            ManagerActionScreen.jLabelCustomerID.setText(customerIDString);
            ManagerActionScreen.jLabel11.setText(searchCustomer.getFirstName());
            ManagerActionScreen.jLabel12.setText(searchCustomer.getLastName());
            ManagerActionScreen.jLabel13.setText(searchCustomer.getSSNumber());
            ManagerActionScreen.jLabel14.setText(searchCustomer.getStreetAddress());
            ManagerActionScreen.jLabel15.setText(searchCustomer.getCity());
            ManagerActionScreen.jLabel17.setText(searchCustomer.getState());
            ManagerActionScreen.jLabel16.setText(searchCustomer.getZipCode());

            List<CustomerAccounts> theAccountList = searchCustomer.getCustomerAccounts();
            

            
            //Set the Customer Account Info
            DefaultTableModel modelSavings = (DefaultTableModel) ManagerActionScreen.jTableSavings.getModel();
            DefaultTableModel modelChecking = (DefaultTableModel) ManagerActionScreen.jTableChecking.getModel();
            DefaultTableModel modelLoans = (DefaultTableModel) ManagerActionScreen.jTableLoans.getModel();
            DefaultTableModel modelCD = (DefaultTableModel) ManagerActionScreen.jTableCD.getModel();
            DefaultTableModel modelCreditCard = (DefaultTableModel) ManagerActionScreen.jTableCreditCard.getModel();
            
            /* POSSIBLE SOLUTION
            ManagerActionScreen.jTableSavings.repaint();
            ManagerActionScreen.jTableChecking.repaint();
            ManagerActionScreen.jTableLoans.repaint();
            ManagerActionScreen.jTableCD.repaint();
            ManagerActionScreen.jTableCreditCard.repaint();
            */
            
            /* POSSIBLE SOLUTION
            modelSavings.fireTableDataChanged();
            modelChecking.fireTableDataChanged();
            modelLoans.fireTableDataChanged();
            modelCD.fireTableDataChanged();
            modelCreditCard.fireTableDataChanged();
            */
           
            
            //This code works VERY well, but it involves adding an additional .jar file. I'll try another way.
            /*
            String[] differentAccounts = {"savings", "checking", "loan", "cd", "ccard"};
            String[] differentLabels = {"OwnerID", "CustID", "CustID", "CustID", "CustID", "CustID"};
            JTable[] differentTables = {
                ManagerActionScreen.jTableSavings,
                ManagerActionScreen.jTableChecking,
                ManagerActionScreen.jTableLoans,
                ManagerActionScreen.jTableCD,
                ManagerActionScreen.jTableCreditCard
            };
            for(int i = 0; i<differentAccounts.length; i++){
                SQLDriver db = new SQLDriver();
                String statement = "SELECT * FROM " + differentAccounts[i] + " WHERE " + differentLabels[i] + "="+searchCustomer.getID()+";";
                ResultSet rs = (ResultSet)db.select(statement);
                differentTables[i].setModel(DbUtils.resultSetToTableModel(rs));
            }
            */

            List<String> tempCheckingAcctList = new ArrayList<String>();
            List<String> tempCreditCardAcctList = new ArrayList<String>();
            List<String> tempSavingsAcctList = new ArrayList<String>();
            List<String> tempShortTermAcctList = new ArrayList<String>();
            List<String> tempLongTermAcctList = new ArrayList<String>();
            
            List<String> tempTypeAccountList = new ArrayList<String>();
            
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
                                
                                tempSavingsAcctList.add(accountIDString);
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
                                
                                if (loanType.equals("Short")){
                                    tempShortTermAcctList.add(accountIDString);
                                    
                                    if (tempTypeAccountList.contains("Short-Term Loan")){
                                    //Skip adding Type to tempTypeAccountList
                                    }else{
                                        tempTypeAccountList.add("Short-Term Loan");
                                    }
                                }else{
                                    tempLongTermAcctList.add(accountIDString);
                                    
                                    if (tempTypeAccountList.contains("Long-Term Loan")){
                                    //Skip adding Type to tempTypeAccountList
                                    }else{
                                        tempTypeAccountList.add("Long-Term Loan");
                                    }
                                }
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

                                tempCreditCardAcctList.add(accountIDString);
                                                              
                                modelCreditCard.addRow(new Object[]{accountID, interestRate, totalCredit,
                                    openCredit, usedCredit, nextDue, penalty, activeOut});
                            }
                        }catch (Exception ex){
                            ex.printStackTrace();
                        }
                        
                        if (tempTypeAccountList.contains("Credit Card")){
                            //Skip adding Type to tempTypeAccountList
                        }else{
                            tempTypeAccountList.add("Credit Card");
                        }
                        break;
                        
                }
 

            }
            
            modelSavings.fireTableDataChanged();
            modelChecking.fireTableDataChanged();
            modelLoans.fireTableDataChanged();
            modelCD.fireTableDataChanged();
            modelCreditCard.fireTableDataChanged();
            
            checkingAccountList = new String[0];
            savingsAccountList = new String[0];
            creditCardAccountList = new String[0];
            shortTermLoanAccountList = new String[0];
            longTermLoanAccountList = new String[0];
            accountTypesList = new String[0];
            
            checkingAccountList = tempCheckingAcctList.toArray(new String[tempCheckingAcctList.size()]);
            savingsAccountList = tempSavingsAcctList.toArray(new String[tempSavingsAcctList.size()]);
            creditCardAccountList = tempCreditCardAcctList.toArray(new String[tempCreditCardAcctList.size()]);  
            shortTermLoanAccountList = tempShortTermAcctList.toArray(new String[tempShortTermAcctList.size()]);
            longTermLoanAccountList = tempLongTermAcctList.toArray(new String[tempLongTermAcctList.size()]);

            accountTypesList = tempTypeAccountList.toArray(new String[tempTypeAccountList.size()]);

            //mas.setResizable(false);
            //mas.setVisible(true);
    }
    
    public static void main(String args[]){
        
        //CustomerInformationTable gui = new CustomerInformationTable();
        //gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //gui.setSize(600, 200);
        //gui.setVisible(true);
        //gui.setTitle("here we go again.");
    }
    
}
