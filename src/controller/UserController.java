package controller;

import java.util.ArrayList;

import users.Boss;
import users.Branch;
import users.Address;
import users.User;
import users.Cashier;
import users.Employee;
import users.Account;
import users.Admin;
import users.Customer;
import users.Accountant;
import users.Manager;
import users.Security;

public class UserController
{	
	public ArrayList<Employee> getAllEmployeesFromBoss (Boss boss)
	{
		ArrayList<Employee> employeesList = new ArrayList<Employee>();
		ArrayList<Branch> branchlist =  boss.getBranchList();
		for (int i = 0; i < branchlist.size(); i++)
		{	
			int j = 0;
			System.out.println("z branch " + i);
			
			ArrayList<Employee> employees = branchlist.get(i).getEmployeeList();
			for (int k = 0; i < employees.size(); k++, j++)
			{
				employeesList.add(employees.get(j));
				System.out.println("do listy dodano: " +  employees.get(j).getName() + " " + employees.get(j).getSurname());
				
			}
			
			
		}
		return employeesList;
	}
	//TODO getAllEmployees, getAllCustomers, getCustomerById(string Id)
	
	
	
}
