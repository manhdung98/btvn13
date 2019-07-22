package com.topica.bai2;

public class Hosting {
	private int Id;
	private String name;
	private long price;

	public Hosting(int id, String name, long price) {
		Id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	

}
