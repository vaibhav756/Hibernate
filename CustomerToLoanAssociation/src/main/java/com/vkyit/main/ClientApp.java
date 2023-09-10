package com.vkyit.main;

import java.util.Arrays;
import java.util.List;

import com.vkyit.dao.CustomerDao;
import com.vkyit.dao.impl.CustomerDaoImpl;
import com.vkyit.entity.CustomerEntity;
import com.vkyit.entity.LoansEntity;

public class ClientApp {

	public static void main(String[] args) {
		CustomerDao dao=new CustomerDaoImpl();
		
		CustomerEntity cust=new CustomerEntity();
		cust.setCustomerId(101);
		cust.setCustomerName("Vaibhav Yadav");
		
		//Personal Loan
		LoansEntity loan1=new LoansEntity();
		loan1.setLoanId(101);
		loan1.setLoanType("Personal Loan");
		loan1.setLoanAmt(300000.00);
		
		//Home Loan
		LoansEntity loan2=new LoansEntity();
		loan2.setLoanId(102);
		loan2.setLoanType("Personal Loan");
		loan2.setLoanAmt(2500000.00);
		
		//Car Loan
		LoansEntity loan3=new LoansEntity();
		loan3.setLoanId(103);
		loan3.setLoanType("Car Loan");
		loan3.setLoanAmt(500000.00);
		
		List<LoansEntity> listOfLoans=Arrays.asList(loan1,loan2,loan3);
		cust.setListOfLoans(listOfLoans);
		dao.saveCustomer(cust);
		
	}

}