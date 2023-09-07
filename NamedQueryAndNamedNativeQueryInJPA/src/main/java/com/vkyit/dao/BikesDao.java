package com.vkyit.dao;

import java.util.List;

import com.vkyit.entity.Bikes;

public interface BikesDao {

	void addBikes(Bikes bikes);
	Bikes getBikeByBikeName(String bikeName);
	List<Bikes> getAllBikes();
	
}
