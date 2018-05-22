package org.wecancodeit.virtual_pet;

import java.util.Scanner;

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
		
		// Variables
		String userName;
		String petGender;
		String petGenderHisHer; // She == Her or He == His
		String petColor;
		String petName;
		
		Scanner userInput = new Scanner(System.in); // user input scanner
		
		// Create VirtualPet Object and set default variables.
		// TODO Determine if I want to setup different values for parameters.
		
		VirtualPet petDemegz = new VirtualPet.Builder().build(); // create the pet
		if (petDemegz.getGender() == 0) { // get gender
			petGender = "She";
		} else {
			petGender = "He";
		}
		
		petGenderHisHer = petDemegz.convertToHerHis(petGender);
		petColor = petDemegz.getColorArrayColor(petDemegz.getColor());
		
		// Introductions
		System.out.println("Virtual-Pet: DeMegz\nPlease Enter you Name:"); //scan user name
		userName = userInput.nextLine();
		System.out.println("Hello "  + userName + ", let me introduce you to " 
				+ "your new pet DeMegz!\n" + petGender + "'s a wonderful little "
				+ petColor.toLowerCase() + " creature for you to take "
				+ "special care\nof, but first," + petGender.toLowerCase() + " needs a name! "
				+ petGenderHisHer + " name is...");
		petName = petDemegz.setName(userInput.nextLine());
		System.out.println(petName + " is a great name!");
		System.out.println("Make sure you take special care of " + petName + "."
				+ " Remember to feed, water, and potty " + petName + "."
				+ "\nOf course, don't forget to play with " + petName + petGender
				+ " can get bored to death! And be sure to rest up after so " + petGender.toLowerCase()
				+ "\ndoesn't get sick! Have fun " + userName + "!");
		
		// Game Loop
		while (true) {
			// Display current pet stats
			System.out.println(petName + " is currently feeling...");
			// Display the menu
		break;	
			// Take actions based on choice
			
			// call tick method to represent the passage of time.
		}
		
		System.out.println("...End Test.");
		userInput.close();
	}

}
