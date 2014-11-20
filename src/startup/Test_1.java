package startup;

import users.*;
import managers.BankManagers;

public class Test_1 {

	public static void main(String[] args) {

		//inicjacja
		Boss boss_1 = new Boss("Aleksander", "Kwasniewski", 10, "Zielona Gora", "Podgorna", 50, "mail@gm.com", 4000, 0);
		Branch branch_0 = new Branch(0, "Zielona Gora", "Podgorna", 50, "mail@gm.com");
		Branch branch_1 = new Branch(1, "Zielona Gora", "Kupiecka", 5, "mail@gm.com");
		BankManagers menagers = new BankManagers();
		//lets start
		branch_0.addEmployee(boss_1);
		branch_1.addEmployee(boss_1);
		
		
		boss_1.addBranch(branch_0);
		boss_1.addBranch(branch_1);
		boss_1.showBranches();
		
		
		menagers.getAllEmployeesFromBoss(boss_1);
	
	}

}
