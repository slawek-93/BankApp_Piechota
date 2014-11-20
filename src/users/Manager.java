package users;

import java.util.ArrayList;

public class Manager extends Employee {

		
	private ArrayList<Branch> branchlist = new ArrayList<Branch> ();
	public void addBranch (Branch branch) 
	{
		branchlist.add(branch);
	}
	public void showBranches()
	{
		for (int i=0;i<branchlist.size();i++) 
		{ String name = branchlist.get(i).getName();
			Address address =  branchlist.get(i).getAddress();
		System.out.println("element: " + i + "   nazwa: " + name + "   miasto: " + address.getCity()); 
		}	
	}
	
	
	
	public Manager(String name, String surname, Integer id) {
		super(name, surname, id);
		// TODO Auto-generated constructor stub
	}
	
}
