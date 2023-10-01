package com.vkyit;

import com.vkyit.entity.Customer;
import com.vkyit.entity.Loans;
import com.vkyit.entity.dao.LoansDao;
import com.vkyit.entity.dao.impl.LoanDaoImpl;

public class ClientApp {

	public static void main(String[] args) {		
		LoansDao dao=new LoanDaoImpl();
		
		/*Customer cust=new Customer();
		cust.setCustomerId(101);
		cust.setCustomerName("Kamlakar Yadav");
		
		Loans loan1=new Loans();
		loan1.setLoanId(101);
		loan1.setLoanAmt(150000.00);
		loan1.setLoanType("Personal Loan");
		loan1.setCustomer(cust);
		
		Loans loan2=new Loans();
		loan2.setLoanId(102);
		loan2.setLoanAmt(50000.00);
		loan2.setLoanType("Car Loan");
		loan2.setCustomer(cust);
		
		Loans loan3=new Loans();
		loan3.setLoanId(103);
		loan3.setLoanAmt(450000.00);
		loan3.setLoanType("Home");
		loan3.setCustomer(cust);
		
		dao.saveLoan(loan1);
		dao.saveLoan(loan2);
		dao.saveLoan(loan3);*/
		
		//Fetch Loan Details by Id
		//Loans loan = dao.fetchLoans(101);
		//System.out.println(loan);
	
		//dao.deleteLoans(101);
		
	}

}
