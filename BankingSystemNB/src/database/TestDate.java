/*
    This class is made for the sole purpose of using with the TestDate Table.
*/

package database;

import java.sql.ResultSet;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class TestDate {
    
    public Date date;
    SQLDriver db = new SQLDriver();
    
    public TestDate(){
        
    }
    
    public void updateDate(){
        String statement = "UPDATE loan SET testdate=" + this.date + ";";
	db.insert(statement);
        return;
    }
    
    public TestDate getTestDate(){
    	String statement = "SELECT * FROM testdate";
	ResultSet res = (ResultSet)db.select(statement);
	TestDate myDate = new TestDate();
	try
	{
		while (res.next())
		{
			myDate = new TestDate();
			myDate.date = res.getDate(1);
		}
		return myDate;
	}
	catch (Exception ex)
	{
		ex.printStackTrace();
	}
	return null;
    }
    
    public Date getGlobalDate(){
        Date myDate = new Date();
        myDate = this.getTestDate().date;
        return myDate;
    }
    
    public Date getDate(){
        Date myDate = new Date();
        myDate = this.date;
        return myDate;
    }
    
    public void setDateString(String myString){
        Date myDate = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        try{
            myDate = dateFormat.parse(myString);
            System.out.println("I'm here: " + myDate);
            this.date = myDate;
        }catch(Exception ex){
            ex.printStackTrace();
	}
        
    }
    
    public String getDateString(){
        Date myDate = new Date();
        myDate = this.getTestDate().date;
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String myDateString = dateFormat.format(myDate);

        return myDateString;
    
    }
    
}