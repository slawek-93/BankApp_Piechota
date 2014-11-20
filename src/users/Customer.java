package users;

public class Customer extends User{
public Customer(String name, String surname, Integer id) {
		super(name, surname, id);
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
