package com.vkyit.main;

import java.util.List;

import com.vkyit.dao.BikesDao;
import com.vkyit.dao.impl.BikesDaoImpl;
import com.vkyit.entity.Bikes;

public class ClientApp {

	public static void main(String[] args) {

		BikesDao dao=new BikesDaoImpl();
		
		Bikes bike=new Bikes();
		bike.setBikeName("Unicorn");
		bike.setBikeBrand("Honda");
		bike.setBikePrice(110000L);
		dao.addBikes(bike);
		
		
		List<Bikes> allBikes = dao.getAllBikes();
		allBikes.forEach(System.out::println);
	}

}
