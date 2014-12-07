/*This class exists as a way to list all customer accounts and their associated types
 * for the Customer class getCustomerAccounts method. It contains Customer ID, Account ID, and 
 * Account Type only, and has no functionality.
 */

package database;

public class CustomerAccounts {

	public int CustID;
	public int AccountID;
	public String AccountType;
	
	public CustomerAccounts()
	{
		CustID=0;
		AccountID=0;
		AccountType="";
	}
	
	public CustomerAccounts(int CNum, int ANum, String AType)
	{
		CustID=CNum;
		AccountID=ANum;
		AccountType=AType;
	}
        
        public int getCustomerID(){
            return CustID;
        }
        
        public int getAccountID(){
            return AccountID;
        }
        
        public String getAccountType(){
            return AccountType;
        }
        
        public String toString(){
            //Added for testing
            //Used the following code to test in another class.
            /*
            
                List<CustomerAccounts> theAccountList = theCustomer.getCustomerAccounts();
        
                for(int i = 0; i < theAccountList.size(); i++){
                    System.out.println(theAccountList.get(i));
                }
            
            */
            
            String customerID = Integer.toString(CustID);
            String accountID = Integer.toString(AccountID);
            
            String printedString = "Customer ID: " + customerID + "\tAccountID: " + accountID + "\tAccount Type: " + AccountType;
            
            return printedString;
        }
}
