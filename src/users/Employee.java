package users;



public class Employee extends User {
public Employee(String name, String surname, Integer id) {
		super(name, surname, id);
		// TODO Auto-generated constructor stub
	}
private Integer id;
private Integer sallary;
private Integer branchId;

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
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


