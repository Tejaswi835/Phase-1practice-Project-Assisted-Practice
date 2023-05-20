package camerarentalapplication;

public class Wallet {
	private double balance;
	public Wallet() {
        this.balance = 5000;
    }public double getBalance() {
        return balance;
    }public void deposit(double amount) {
        balance += amount;
    }public void deduct(double amount) {
        balance -= amount;
    }
}