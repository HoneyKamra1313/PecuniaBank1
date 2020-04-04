package com.cg.pb.service;

public interface TransactionService {
	void creditUsingSlip(double actNo,double amount);
	void debitUsingSlip(double actNo,double amount);
    void creditUsingCheque();
	void debitUsingCheque();
}
