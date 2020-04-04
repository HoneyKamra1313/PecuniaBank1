package com.cg.pb.service;

import com.cg.pb.bean.Account;
import com.cg.pb.bean.Passbook;

public class TransactionServiceImplementation implements TransactionService{
	Account account=new Account();
PassbookServiceImplementation psi = new PassbookServiceImplementation();
	private double balance;
	private double actNo;

	
	@Override
	public void creditUsingSlip(double actNo,double d) {
		// TODO Auto-generated method stub
		
		if(d<0) {
			System.out.println("invalid");
		}
		else {
				this.balance = this.balance + d;
				Passbook pb = new Passbook(actNo, d, this.balance, "CREDIT");
				psi.storeTransaction(
						pb
				);
				System.out.println("Credited Successfully");

		}
			
		}
	


	@Override
	public void debitUsingSlip(double actNo,double d) {
		
		// TODO Auto-generated method stub
		if(true) {
			this.balance=this.balance-d;
			Passbook pb = new Passbook(actNo,d,this.balance,"DEBIT");
			psi.storeTransaction(
			pb
			);
			System.out.println("Debited Successfully");
		}
		else
			System.out.println("Invalid");
		
		}
		
	

	@Override
	public void creditUsingCheque() {
		// TODO Auto-generated method stub
		
		
	}

	//@Override
  public void debitUsingCheque() {
		// TODO Auto-generated method stub
		
		
      }
}
