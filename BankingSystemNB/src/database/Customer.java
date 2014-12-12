/*This class maintains the records of the customers of this bank
 * 
 * Attributes:
 * 
 * String LName - Customer's last name
 * String FName - Customer's first name
 * int CustNum - Unique number associated with this customer
 * String SSN - Customer Social Security number
 * String Street - Street Address
 * String City - City of residence
 * String State - State of residence
 * String ZIP - ZIP code of residence
 * 
 * Methods:
 * 
 * Customer() - Empty constructor, initializes to empty strings and 0;
 * Customer(String, String, int, String, String, String, String, String). Accepts customer information in the order listed above.
 * Customer search(int) - Returns Customer object associated with passed in Customer Number
 * Customer search(String) - Returns Customer object associated with last name passed in
 * List<Customer> getAll() - Returns a list of all customers of this bank, as an ArrayList of Customer objects
 * void addRecord(Customer) - Adds the passed-in Customer object to the Customer table
 * void updateRecord(Customer) - Accepts Customer object, updates the record in the database that has the same CustID
 * void delete(int) - Accepts Customer ID as integer, removes that customer record from database
 * List<CustomerAccounts> getCustomerAccounts(Customer) - Accepts Customer object, returns a CustomerAccounts arraylist with all account numbers and types
 * print and printall - Using for testing, don't worry about these
 */

package database;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Customer {
	
	SQLDriver db = new SQLDriver();
	
	String LName;
	String FName;
	public int CustNum;
	String SSN;
	String Street;
	String City;
	String State;
	String ZIP;
	
	public Customer(String Last, String First, int CustID, String ssn, String street, String city, String state, String zip)
	{
		LName = Last;
		FName = First;
		CustNum = CustID;
		Street = street;
		City = city;
		State = state;
		ZIP = zip;
		SSN = ssn;
	}
	
	public Customer()
	{
		LName = "";
		FName = "";
		CustNum = 0;
		Street = "";
		City = "";
		State = "";
		ZIP = "";
		SSN="";
	}
	
	public Customer search(int CustID)
	{
		String statement = "SELECT * FROM customer WHERE CustID ="+CustID;

		try
		{
			ResultSet res = (ResultSet)db.select(statement);
                        if (!res.isBeforeFirst())
                        {
                            return null;
                        }
			while (res.next())
			{
				LName = res.getString(1);
				FName = res.getString(2);
				CustNum = res.getInt(3);
				SSN = res.getString(4);
				Street = res.getString(5);
				City = res.getString(6);
				State = res.getString(7);
				ZIP = res.getString(8);
			}
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
		return this;
	}
	
	public List<Customer> getAll()
	{
		String statement = "SELECT * FROM customer";

		List<Customer> custList = new ArrayList<Customer>();
		try{
		ResultSet res = (ResultSet)db.select(statement);
		while (res.next())
		{
			Customer cust = new Customer(res.getString(1), res.getString(2), res.getInt(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8));
			custList.add(cust);
		}
		printall(custList);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return custList;
		
	}
	
	public Customer search(String LName)
	{
		String statement = "SELECT * FROM customer WHERE LName =\""+LName+"\";";
		try
		{
			ResultSet res = (ResultSet)db.select(statement);
			while (res.next())
			{
				LName = res.getString(1);
				FName = res.getString(2);
				CustNum = res.getInt(3);
				SSN = res.getString(4);
				City = res.getString(5);
				Street = res.getString(6);
				State = res.getString(7);
				ZIP = res.getString(8);

			}
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
		return this;
	}
	
	public void addRecord(Customer newCust)
	{
		String statement = "INSERT INTO customer VALUES (\""+newCust.LName+"\",\""+newCust.FName+"\","+"0"+",\""+newCust.SSN+"\",\""+newCust.Street+"\", \""+newCust.City+"\", \""+newCust.State+"\", \""+newCust.ZIP+"\");";
		db.insert(statement);
	}
	
	public void updateRecord(Customer newCust)
	{
		String statement = "UPDATE customer SET LName=\""+newCust.LName+"\", FName=\""+newCust.FName+"\", SSN=\""+newCust.SSN+"\", Street=\""+newCust.Street+"\", City=\""+newCust.City+"\", State=\""+newCust.State+"\", ZIP=\""+newCust.ZIP+"\" WHERE CustID="+newCust.CustNum+";";
		db.insert(statement);
	}
	
	public void print()
	{
		System.out.println(LName+"   "+FName+"    "+CustNum);
	}
	
	public void delete(int CustomerID)
	{
		String statement = "DELETE FROM customer WHERE CustID = "+CustomerID;
		db.insert(statement);
		
	}
	public void printall(List<Customer> objectList)
	{
		int iterator = objectList.size();
		for (int x = 0;x<iterator;x++)
		{
			objectList.get(x).print();
		}
	}
	
	public List<CustomerAccounts> getCustomerAccounts(Customer cust)
	{
		String statement = "SELECT AccountID FROM savings WHERE OwnerID="+cust.CustNum+";";
		List<CustomerAccounts> AccountList = new ArrayList<CustomerAccounts>();
		ResultSet rs = (ResultSet)db.select(statement);
		CustomerAccounts CA = new CustomerAccounts();
		try
		{
			while(rs.next())
			{
				CA = new CustomerAccounts();
				CA.AccountID=rs.getInt(1);
				CA.CustID=cust.CustNum;
				CA.AccountType="Savings";
				AccountList.add(CA);
			}
		}
		
		catch(Exception ex)
		{
			
		}
		statement = "SELECT AccountID FROM checking WHERE CustID="+cust.CustNum+";";
		rs = (ResultSet)db.select(statement);
		try
		{
			while(rs.next())
			{
				CA = new CustomerAccounts();
				CA.AccountID=rs.getInt(1);
				CA.AccountID=cust.CustNum;
				CA.AccountType="Checking";
				AccountList.add(CA);
			}
		}
		catch(Exception ex)
		{}
		statement = "SELECT AccountID FROM loan WHERE CustID="+cust.CustNum+";";
		rs = (ResultSet)db.select(statement);
		try
		{
			while(rs.next())
			{
				CA = new CustomerAccounts();
				CA.AccountID=rs.getInt(1);
				CA.AccountID=cust.CustNum;
				CA.AccountType="Loan";
				AccountList.add(CA);
			}
		}
		catch(Exception ex)
		{}
		statement = "SELECT AccountID FROM cd WHERE CustID="+cust.CustNum+";";
		rs = (ResultSet)db.select(statement);
		try
		{
			while(rs.next())
			{
				CA = new CustomerAccounts();
				CA.AccountID=rs.getInt(1);
				CA.AccountID=cust.CustNum;
				CA.AccountType="CD";
				AccountList.add(CA);
			}
		}
		catch(Exception ex)
		{}
		statement = "SELECT AccountID FROM ccard WHERE CustID="+cust.CustNum+";";
		rs = (ResultSet)db.select(statement);
		try
		{
			while(rs.next())
			{
				CA = new CustomerAccounts();
				CA.AccountID=rs.getInt(1);
				CA.AccountID=cust.CustNum;
				CA.AccountType="Credit Card";
				AccountList.add(CA);
			}
		}
		catch(Exception ex)
		{}
		return AccountList;
		
	}
}
