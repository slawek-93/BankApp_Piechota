package users;

import java.util.ArrayList;

public class Manager extends Employee {
	
			
	public Manager(String name, String surname, Integer id, String city,
			String street, int number, String mail, Integer sallary,
			Integer branchId) {
		super(name, surname, id, city, street, number, mail, sallary, branchId);
		this.branchlist = new ArrayList<Branch> ();
	}
	private ArrayList<Branch> branchlist;
	public void addBranch (Branch branch) 
	{
		branchlist.add(branch);
	}
	
	public ArrayList<Branch> getBranchList()
	{
		return this.branchlist;
	}
	
	public void showBranches()
	{
		for (int i=0;i<branchlist.size();i++) 
		{ int id = branchlist.get(i).getId();
			Address address =  branchlist.get(i).getAddress();
		System.out.println("element: " + i + "   nazwa: " + id + "   miasto: " + address.getCity()); 
		}	
	}
	
	
	

	
}
