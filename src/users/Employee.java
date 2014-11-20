package users;



public class Employee extends User {

public Employee(String name, String surname, Integer id, String city,
			String street, int number, String mail,
			Integer sallary, Integer branchId) {
		super(name, surname, id, city, street, number, mail);
		this.sallary = sallary;
		this.branchId = branchId;
	}
private Integer sallary;
private Integer branchId;


public Integer getSallary() {
	return sallary;
}
public void setSallary(Integer sallary) {
	this.sallary = sallary;
}
public Integer getBranchId() {
	return branchId;
}
public void setBranchId(Integer branchId) {
	this.branchId = branchId;
}

}


