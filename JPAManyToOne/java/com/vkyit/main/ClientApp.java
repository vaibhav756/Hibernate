package com.vkyit.main;

import com.vkyit.dao.LoanDAO;
import com.vkyit.dao.impl.LoanDAOImpl;
import com.vkyit.entity.Customer;
import com.vkyit.entity.Loans;

public class ClientApp {

	public static void main(String[] args) {
		LoanDAO dao=new LoanDAOImpl();
		Loans loan=new Loans();
		loan.setLoanId(105);
		loan.setLoanType("Personal Loan");
		loan.setLoanAmt(120000.00);
		
		Loans loan1=new Loans();
		loan1.setLoanId(106);
		loan1.setLoanType("Car Loan");
		loan1.setLoanAmt(45000.00);
		
		Loans loan2=new Loans();
		loan2.setLoanId(107);
		loan2.setLoanType("Home Loan");
		loan2.setLoanAmt(2200000.00);
		
		Customer cust=new Customer();
		cust.setCustomerId(103);
		cust.setCustomerName("Kamlakar Yadav");
		loan.setCustomer(cust);
		loan1.setCustomer(cust);
		loan2.setCustomer(cust);
		dao.saveLoan(loan);
	}

}
