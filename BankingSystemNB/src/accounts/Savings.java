package accounts;

import java.sql.ResultSet;

/**
 *
 * @author Nic
 */
public class Savings extends Account
{
    protected double interestRate = 0.0;
    protected double interestAccrued = 0.0;
    protected int savingsType;//0 for CD, 1 for simpleSavings
    protected int day;
    protected int month;
    protected int year;
    
    public Savings(int accNum, int custID, double accTot, String accType, int day, int month, int year)
    {
        super(accNum, custID, accTot, accType);
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public Savings(int accNum, int custID, double accTot, String accType)
    {
        super(accNum, custID, accTot, accType);
    }
    
    public void setInterestRate(double rate)
    {
        interestRate = rate;
    }
    
    public double getInterestRate(double interestRate)
    {
        return interestRate;
    }
    
    public void withdraw(double amount)
    {
        accountTotal -= amount;
    }
    
    public void calculateInterestRate()
    {
        interestAccrued = accountTotal * interestRate;
    }
    
        @Override
    public Account search(int findID){
                String statement = "SELECT * FROM " + databaseCallTableName + " WHERE " + databaseCallAccountNumber + " = " + findID;

                try{
			ResultSet res = (ResultSet)db.select(statement);
			while (res.next()){
                            this.accountNumber = res.getInt("accountID");
                            this.accountTotal = res.getDouble("balance");
                            this.accountOpen = res.getInt("Active");
                            this.interestRate = res.getDouble("Interest");
                            
			}
		}catch (Exception ex){
			ex.printStackTrace();
		}
		return this;
        } 
        
    public void add(){
        /*
         * 2. HARD CODED OVERDRAFT AMOUNT
         * 3. HARD CODED ACTIVE STATUS TO 1
         * 4. INTEREST RATE HARD CODED TO 0.0
         */
                java.util.Date utilDate = new java.util.Date(year, month, day);//FOR JAVA DATES
                java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());//CONVERT TO SQL DATES
		String statement = "INSERT INTO "+databaseCallTableName+" VALUES ('"+this.accountNumber+"','"+this.interestRate+"',"+this.accountTotal+",'"+"100"+"','"+sqlDate+"','"+"1"+"','"+this.customerID+"');";
		db.insert(statement);
	}
}