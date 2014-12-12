package accounts;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import database.Loan;
import database.CCard;
import people.Customer;

 
public class ExportNoticesCSV {
    
    String theFile = "Late_Notices_";
    String theFileType = ".csv";
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    Date date = new Date();
    String theDate = dateFormat.format(date);
    String fileName = theFile + theDate + theFileType;
    
    public ExportNoticesCSV(){
        this.resetFlagsLoans();
        this.resetFlagsCreditCards();
        this.exportFile(fileName);
    }
     
    protected void exportFile(String sFileName){
	
        try{
	    FileWriter writer = new FileWriter(sFileName);
            
            writer.append("ID,First Name,LastName,Street Address,City,State,Zip Code,Account Type,Account ID\n");
            writer.append(this.addLoans());
            writer.append(this.addCreditCards());
                    
	    //generate whatever data you want
 
	    writer.flush();
	    writer.close();
	}catch(IOException e){
	     e.printStackTrace();
	} 
    }
    
    protected void resetFlagsLoans(){
        Loan myLoan = new Loan();
        myLoan.updateFlags();
    }
    
    protected String addLoans(){
        String result = "";
        
        Loan aLoan = new Loan();
        List<Loan> flaggedLoans = new ArrayList<Loan>();
                
        flaggedLoans = aLoan.getAllFlaggedRecords();
   
        for (int i=0; i<flaggedLoans.size(); i++){
            Customer theCustomer = new Customer();
            
            int customerID = flaggedLoans.get(i).OwnerID;
            String customerIDString = Integer.toString(customerID);
            
            theCustomer.search(customerID);
            
            String tempString = customerIDString + "," +
                     theCustomer.getFirstName() + "," + 
                     theCustomer.getLastName() + "," + 
                     theCustomer.getStreetAddress() + "," + 
                     theCustomer.getCity() + "," + 
                     theCustomer.getState() + "," + 
                     theCustomer.getZipCode() + "," +
                     "loan" + "," + 
                     flaggedLoans.get(i).LoanID + "\n";
            
            //String tempString = "here,we,go,this,is a,list\n";
            result = result + tempString;
            
        }
        return result;
    }
    
    protected void resetFlagsCreditCards(){
        CCard myCCard = new CCard();
        myCCard.updateFlags();
    }
    
    protected String addCreditCards(){
        String result = "";
        
        CCard aCCard = new CCard();
        List<CCard> flaggedLoans = new ArrayList<CCard>();
                
        flaggedLoans = aCCard.getAllFlaggedRecords();
   
        for (int i=0; i<flaggedLoans.size(); i++){
            Customer theCustomer = new Customer();
            
            int customerID = flaggedLoans.get(i).OwnerID;
            String customerIDString = Integer.toString(customerID);
            
            theCustomer.search(customerID);
            
            String tempString = customerIDString + "," +
                     theCustomer.getFirstName() + "," + 
                     theCustomer.getLastName() + "," + 
                     theCustomer.getStreetAddress() + "," + 
                     theCustomer.getCity() + "," + 
                     theCustomer.getState() + "," + 
                     theCustomer.getZipCode() + "," +
                     "credit card" + "," + 
                     flaggedLoans.get(i).CardID + "\n";
            
            //String tempString = "here,we,go,this,is a,list\n";
            result = result + tempString;
            
        }
        return result;
    }
    
}
