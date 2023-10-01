package com.vkyit.dao;

import com.vkyit.entity.Loans;

public interface LoanDAO {

	void saveLoan(Loans loans);
	
	Loans fetchLoanDetailsById(Integer loanId);
	
	void removeLoan(Integer loanId);
}
