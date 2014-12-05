package people;
import accounts.Account;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args){
	
		Person testPerson = new Person(1, "Jordan", "Fjellman", "239890983", "243 North Road St.", "Saint Joseph", "MO", "23451");
		Employee testEmployee = new Employee(1, "Jessica", "Fjellman", "234222345", "5243 North Road St.", "Saint Joseph", "MO", "23451");
		Manager testManager = new Manager(1, "Jaren", "Fjellman", "486638593", "2343 South St.", "Des Moines", "IA", "50022");
		Teller testTeller = new Teller(1, "Jacob", "Fjellman", "582756283", "1 West St.", "Saint Joseph", "MO", "23451");
		
                //Account anAccount = new Account(12341234, 24);
                //Account secondAccount = new Account(98769876, 6789);
                
                //ArrayList<Account> theArrayList = new ArrayList<Account>();
                //System.out.println(theArrayList.size());
                //theArrayList.add(anAccount);
                //System.out.println(theArrayList.size());
                //theArrayList.add(secondAccount);
                //System.out.println(theArrayList.size());
                
                //people.Customer testCustomer = new people.Customer(1, "Lily", "Fjellman", "363879283", "5243 East Road Ave.", "Atlantic", "IA", "50022", theArrayList);
                //database.Customer testDBCustomer = new database.Customer("MyLastName", "MyFirstName", 1);
	}//End method main

}//End class main
