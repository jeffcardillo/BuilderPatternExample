package com.jeffcardillo.BuilderPatternExample;

public class House {
	
	public static enum HouseType {
		CONDO, DUPLEX, HOUSE, VILLA, UNKNOWN
	}
	
	private int bedrooms = 0;
	private int bathrooms = 0;
	private HouseType type = HouseType.UNKNOWN;
	
	public House(HouseType type) {
		this.type = type;
	}
	
	public House(int bedrooms, int bathrooms) {
		this.bedrooms = bedrooms;
		this.bathrooms = bathrooms;
	}
	
	public House(HouseType type, int bedrooms, int bathrooms) {
		this.type = type;
		this.bedrooms = bedrooms;
		this.bathrooms = bathrooms;
	}

	public int getBedrooms() {
		return bedrooms;
	}

	public int getBathrooms() {
		return bathrooms;
	}

	public HouseType getType() {
		return type;
	}
}