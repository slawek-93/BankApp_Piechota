package users;

public class Customer extends User{


public Customer(String name, String surname, Integer id, String city,
			String street, int number, String mail) {
		super(name, surname, id, city, street, number, mail);
		// TODO Auto-generated constructor stub
	}

private Account account;

public Account getAccount() {
	return account;
}

public void setAccount(Account account) {
	this.account = account;
}

	
	
	
}
