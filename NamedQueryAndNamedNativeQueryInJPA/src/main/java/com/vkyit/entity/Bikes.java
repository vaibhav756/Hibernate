package com.vkyit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;

@Entity
//@NamedQuery(name="getBikeByName",query="from Bikes b where b.bikeName=?1")
@NamedNativeQuery(name="getBikeDetails",query="select * from bikes",resultClass=Bikes.class)
public class Bikes {

	@Id
	@Column(name="bike_name")
	private String bikeName;
	
	@Column(name="bike_brand")
	private String bikeBrand;
	
	@Column(name="bike_price")
	private Long bikePrice;

	public String getBikeName() {
		return bikeName;
	}

	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}

	public String getBikeBrand() {
		return bikeBrand;
	}

	public void setBikeBrand(String bikeBrand) {
		this.bikeBrand = bikeBrand;
	}

	public Long getBikePrice() {
		return bikePrice;
	}

	public void setBikePrice(Long bikePrice) {
		this.bikePrice = bikePrice;
	}

	@Override
	public String toString() {
		return "Bikes [bikeName=" + bikeName + ", bikeBrand=" + bikeBrand + ", bikePrice=" + bikePrice + "]";
	}
	
}
