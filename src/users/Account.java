package users;

public class Account {
private int number;
private int balance;
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
public void addMoney(int money){
	this.balance = balance + money;
}
}