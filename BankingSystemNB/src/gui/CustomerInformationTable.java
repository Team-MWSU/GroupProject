package gui;

import people.Customer;
import database.SQLDriver;
import database.CustomerAccounts;
import java.awt.*;
import java.sql.ResultSet;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;



public class CustomerInformationTable extends JFrame{
    
    JTable table;


    public CustomerInformationTable (){
    
        Customer theCustomer = new Customer();
        String customerIDString = "2";//jTextField5.getText(); //This should pull from the database.
        int    customerID = Integer.parseInt(customerIDString);
        theCustomer.search(customerID);
        
        List<CustomerAccounts> theAccountList = theCustomer.getCustomerAccounts();
        
        for(int i = 0; i < theAccountList.size(); i++){
            System.out.println(theAccountList.get(i));
        }
        

        setLayout(new FlowLayout());
                  
        String [] columnHeaders = {"Account #", "Interest", "Balance", "Overdraft", "Date Opened", "Active"};
        
        
        table.setPreferredScrollableViewportSize(new Dimension(500, 100));
        table.setFillsViewportHeight(true);
        
        DefaultTableModel defaultTable =  (DefaultTableModel) table.getModel();
        
        defaultTable.setColumnIdentifiers(columnHeaders);
        /*Object [][] tableData = {
            {"data", "more data", "even more data", null, null, null},
            {null, null, null, null, null, null},
            {"data", "more data", "even more data", null, null, null}
        };*/
        
        defaultTable.addRow(new Object []{});
        
        //table = new JTable(tableData, columnHeaders);

        
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);
    }
    
    public static void main(String args[]){
        
        CustomerInformationTable gui = new CustomerInformationTable();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(600, 200);
        gui.setVisible(true);
        gui.setTitle("here we go again.");
    }
    
}
