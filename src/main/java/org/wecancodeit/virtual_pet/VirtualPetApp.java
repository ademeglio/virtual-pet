package org.wecancodeit.virtual_pet;

public class VirtualPetApp {

	/*
	 * WeCanCodeIT Module Project 2
	 * by Anthony J. DeMeglio
	 * 5/20/2018
	 * 
	 * VirtualPetApp()
	 * 'Demegz' Virtual Pet
	 * 
	 */
	
	public static void main(String[] args) {
		// create the pet
		//VirtualPet demegz = new VirtualPet.Builder().build();
		String genderIs = "";
		int petColor;
		for (int i = 0; i < 20; i++) {
			VirtualPet demegz2 = new VirtualPet.Builder().build();
			if (demegz2.getGender() == 0) {
				genderIs = "Girl!";
			} else
				genderIs = "Boy!";
			petColor = demegz2.getColor();
			System.out.println("It's an " + demegz2.getColorArrayColor(petColor) 
								+ " " + genderIs);
			System.out.println("--------------------");
		}
		
		while (true) {
			// Display the menu
		break;	
			// Take actions based on choice
			
			// call tick method to represent the passage of time.
		}
		
	}

}
