package com.jeffcardillo.BuilderPatternExample;

public class House2 {
	
	public static enum HouseType2 {
		CONDO, DUPLEX, HOUSE, VILLA, UNKNOWN
	}
	
	private int bedrooms = 0;
	private int bathrooms = 0;
	private HouseType2 type = HouseType2.UNKNOWN;
	
	private House2(Builder builder) {
		this.bedrooms = builder.bedrooms;
		this.bathrooms = builder.bathrooms;
		this.type = builder.type;
	}

	public int getBedrooms() {
		return bedrooms;
	}

	public int getBathrooms() {
		return bathrooms;
	}

	public HouseType2 getType() {
		return type;
	}
	
	public static class Builder {
		private int bedrooms;
		private int bathrooms;
		private HouseType2 type;
		
		public Builder() {
			bedrooms = 0;
			bathrooms = 0;
			type = HouseType2.UNKNOWN;
		}
		
		public Builder setBedrooms(int bedrooms) {
			this.bedrooms = bedrooms;
			return this;
		}
		
		public Builder setBathrooms(int bathrooms) {
			this.bathrooms = bathrooms;
			return this;
		}
		
		public Builder setHouseType(HouseType2 type) {
			this.type = type;
			return this;
		}
		
		public House2 build() {
			House2 newHouse = new House2(this);
			
			if (this.bathrooms < 0) {
				throw new IllegalStateException("number of bathrooms must be > 0");				
			}
			
			return newHouse;
		}
	}
}