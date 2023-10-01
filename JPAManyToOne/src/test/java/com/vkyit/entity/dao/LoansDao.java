package com.vkyit.entity.dao;

import com.vkyit.entity.Loans;

public interface LoansDao {

	void saveLoan(Loans loan);
	Loans fetchLoans(Integer loanId);
	void deleteLoans(Integer loanId);
	
}
