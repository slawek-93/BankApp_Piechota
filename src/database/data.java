package database;

import java.util.ArrayList;

import users.Cashier;
import users.Employee;
import users.Security;

public class data {
	public static void main(String[] args){
	final ArrayList<Employee> employeeList = new ArrayList<Employee>();
	
	
	
	//employees
	
	Security security1 = new Security("Aleksander", "Kwasniewski", 10, "Zielona Gora", "Podgorna", 50, "mail@gm.com", 2500, 0);
	Cashier cashier1 = new Cashier("Stefan", "Batory", 1, "Zielona Gora", "Kupiecka", 1, "mail@gmail.com", 1600, 0);

	//Add to array
	
	employeeList.add(security1);
	employeeList.add(cashier1);
	
	}
}
