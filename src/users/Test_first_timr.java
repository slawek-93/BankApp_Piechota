package users;

public class Test_first_timr {

	public static void main(String[] args) {
		//Branches
		Branch Branch_0 = new Branch();
		Branch Branch_1 = new Branch();
		//Adres
		
		Address address_0 = new Address();
		Address address_1 = new Address();
	
		//workers
		Cashier Cashier_1 = new Cashier("Jack", "Sparrow", 0);
		Boss Boss_1 = new Boss("Marilyn", "Manson", 0);
		Cashier Cashier_2 = new Cashier("Johnny", "Bravo", 1);
		//customers
	
		
		//lets start it works
		Branch_0.addEmployee(Cashier_1);
		Branch_0.addEmployee(Boss_1);
		Branch_0.setName("zerowa");
		address_0.setCity("Zielona Gora");
		address_1.setCity("Warszawa");
		Branch_0.setAddress(address_0);
		Boss_1.addBranch(Branch_0);
		Boss_1.addBranch(Branch_1);
		Branch_1.setAddress(address_1);
		Branch_1.addEmployee(Cashier_2);
		Branch_1.setName("pierwsza");
		Branch_0.namesOfEmplyees();
		Boss_1.showBranches();
		Branch_1.namesOfEmplyees();
		
	}

}
