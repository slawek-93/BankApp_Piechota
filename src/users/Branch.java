package users;

import java.util.ArrayList;

public class Branch {
	private Address address;
	private int id;
	private ArrayList<Employee> employeeList = new ArrayList<Employee>();
	
	public ArrayList<Employee> getEmployeeList() {
		return employeeList;
	}

	public Branch(int id, String city, String street, int number, String mail) {
		this.id = id;
		this.address = new Address (city, street, number, mail);
	}
	
		public void addEmployee (Employee employee) {
		employeeList.add(employee);
	}
		public void namesOfEmplyees()
		{
			for (int i=0;i<employeeList.size();i++)
			{
				Employee employee;
				employee = employeeList.get(i);
				System.out.println(employee.getSurname() + " " + employee.getName());
			}
			
		}
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		public int getId() {
			return id;
		}
		public void setId (int id) {
			this.id = id;
		}


}
