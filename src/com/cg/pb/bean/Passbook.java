package com.cg.pb.bean;

import java.util.ArrayList;

public class Passbook {
	private double accNo;
	private double amount;
	private double balance;
	private String type;
	public static ArrayList<Passbook> listPassBook = new ArrayList<>() ;
	public Passbook(double accNo, double amount, double balance,String type) {
		this.accNo = accNo;
		this.amount = amount;
		this.balance = balance;
		this.type = type;


	}
	public double getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public double getAccNo() {
		return accNo;
	}

	public void setAccNo(Double accNo) {
		this.accNo = accNo;
	}

	public String getPassBook() {
		return "PassBook [accNo=" + accNo
				+ ", amount=" + amount + ", balance=" + balance + ",Transaction-Type = "+type+"]";
	}

}
