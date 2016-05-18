package com.jeffcardillo.BuilderPatternExample;

class Main {
    public static void main(String[] args) {
    	House b1 = new House(House.HouseType.CONDO);
    	House b2 = new House(2, 4);
    	House b3 = new House(House.HouseType.DUPLEX, 4, 3);
      
    	House2 b4 = new House2.Builder()
    			.setHouseType(House2.HouseType2.CONDO)
    			.build();
         
    	House2 b5 = new House2.Builder()
    			.setBathrooms(4)
    			.setBedrooms(2)
    			.build();
         
    	House2 b6 = new House2.Builder()
    			.setHouseType(House2.HouseType2.DUPLEX)
    			.setBathrooms(3)
    			.setBedrooms(4)
    			.build();
        
    	House2 b7 = new House2.Builder()
    			.setHouseType(House2.HouseType2.DUPLEX)
    			.setBathrooms(17)
    			.build();
    	
         System.out.println("DONE");
    }
}