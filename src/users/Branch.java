package users;

import java.util.ArrayList;

public class Branch {
	private Address address;
	private String name;
	private ArrayList<Employee> employeeList = new ArrayList<Employee>();
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
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}


}
