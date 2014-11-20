package users;

public class User {
private String name;
private String surname;
private Integer id;
private Address address;



public User(String name, String surname, Integer id, String city, String street, int number, String mail) {
	super();
	this.name = name;
	this.surname = surname;
	this.id = id;
	this.address = new Address (city, street, number, mail);
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSurname() {
	return surname;
}
public void setSurname(String surname) {
	this.surname = surname;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}

}
