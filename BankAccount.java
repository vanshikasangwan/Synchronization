package Synchronization;

public class BankAccount {
	int balance = 100; 
	
	void withdraw(int amount) {
		balance = balance - amount;
	}
	
	int getBalance() {
		return balance;
	}
}
