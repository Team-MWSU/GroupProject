package people;

import database.CustomerAccounts;
import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;

/*
    This is the customer class. It inherits a lot of the characteristics of people. 
    That should be noted when pulling form the database.
    Some of these functions could be rewritten in the Person class.
*/


public class Customer extends Person {
        
        protected List<CustomerAccounts> accountList;
	
        public Customer(){

		ID = 0;
		firstName = "";
		lastName = "";
		SSN = "";
		streetAddress = "";
		city = "";
		state = "";
		zipCode = "";
                
                databaseCallTableName = "customer";
                databaseCallLastName  = "LName";
                databaseCallID        = "CustID";
                
                List<CustomerAccounts> customerAccountList = new ArrayList<CustomerAccounts>();
                
                accountList = customerAccountList;
	}
	
	public Customer(int ID, String firstName, String lastName, String SSN, String streetAddress, String city, String state, String zipCode, ArrayList<CustomerAccounts> customerAccountList){
		super(ID, firstName, lastName, SSN, streetAddress, city, state, zipCode);
                
                databaseCallTableName = "customer";
                databaseCallLastName  = "LName";
                databaseCallID        = "CustID";
                
                accountList = customerAccountList;
	}
         
        public List<CustomerAccounts> getCustomerAccounts()
	{
		String statement = "SELECT AccountID FROM savings WHERE CustID="+this.ID+";";
		List<CustomerAccounts> AccountList = new ArrayList<CustomerAccounts>();
		ResultSet rs = (ResultSet)db.select(statement);
		CustomerAccounts CA = new CustomerAccounts();
		try
		{
			while(rs.next())
			{
				CA = new CustomerAccounts();
				CA.AccountID=rs.getInt(1);
				CA.CustID=this.ID;
				CA.AccountType="Savings";
				AccountList.add(CA);
			}
		}
		
		catch(Exception ex)
		{
			
		}
		statement = "SELECT AccountID FROM checking WHERE CustID="+this.ID+";";
		rs = (ResultSet)db.select(statement);
		try
		{
			while(rs.next())
			{
				CA = new CustomerAccounts();
				CA.AccountID=rs.getInt(1);
				CA.CustID=this.ID;
				CA.AccountType="Checking";
				AccountList.add(CA);
			}
		}
		catch(Exception ex)
		{}
		statement = "SELECT AccountID FROM loan WHERE CustID="+this.ID+";";
		rs = (ResultSet)db.select(statement);
		try
		{
			while(rs.next())
			{
				CA = new CustomerAccounts();
				CA.AccountID=rs.getInt(1);
				CA.CustID=this.ID;
				CA.AccountType="Loan";
				AccountList.add(CA);
			}
		}
		catch(Exception ex)
		{}
		statement = "SELECT AccountID FROM cd WHERE CustID="+this.ID+";";
		rs = (ResultSet)db.select(statement);
		try
		{
			while(rs.next())
			{
				CA = new CustomerAccounts();
				CA.AccountID=rs.getInt(1);
				CA.CustID=this.ID;
				CA.AccountType="CD";
				AccountList.add(CA);
			}
		}
		catch(Exception ex)
		{}
		statement = "SELECT AccountID FROM ccard WHERE CustID="+this.ID+";";
		rs = (ResultSet)db.select(statement);
		try
		{
			while(rs.next())
			{
				CA = new CustomerAccounts();
				CA.AccountID=rs.getInt(1);
				CA.CustID=this.ID;
				CA.AccountType="Credit Card";
				AccountList.add(CA);
			}
		}
		catch(Exception ex)
		{}
                database.Checking newChecking = new database.Checking();
               // newChecking.get
                statement = "SELECT TransactionID FROM checkingrecord WHERE AccountID="+this.ID+";";
		rs = (ResultSet)db.select(statement);
		try
		{
			while(rs.next())
			{
				CA = new CustomerAccounts();
				CA.AccountID=rs.getInt(1);
				CA.CustID=this.ID;
				CA.AccountType="Checks";
				AccountList.add(CA);
			}
		}
		catch(Exception ex)
		{}
		return AccountList;
		
	}
        
}//End class Customer
