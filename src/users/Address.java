package users;

public class Address {
private String street;
private int number;
private String mail;
private String city;



public Address(String city, String street, int number, String mail) {
	super();
	this.street = street;
	this.number = number;
	this.mail = mail;
	this.city = city;
}





public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
}
