package org.wecancodeit.virtual_pet;

import java.util.concurrent.ThreadLocalRandom;

public class VirtualPetApp {

	public static void main(String[] args) {
		// create the pet
		VirtualPet demegz = new VirtualPet.Builder().build();
		
		for (int i = 0; i < 4; i++) {
			VirtualPet demegz2 = new VirtualPet.Builder().build();
			System.out.println(demegz2.getColor());
		}
		
		while (true) {
			// Display the menu
		break;	
			// Take actions based on choice
			
			// call tick method to represent the passage of time.
		}
		System.out.println(demegz.getColor());
	}

}
