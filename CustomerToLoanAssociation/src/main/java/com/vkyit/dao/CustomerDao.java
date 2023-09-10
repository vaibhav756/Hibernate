package com.vkyit.dao;

import com.vkyit.entity.CustomerEntity;

public interface CustomerDao {

	void saveCustomer(CustomerEntity customer);
	CustomerEntity fetchCustomer(Integer customerId);
	void removeCustomer(Integer customerId);
	
}
