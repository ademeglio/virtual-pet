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
		String petGenderHisHer;  // She == Her or He == His
		String petGenderHimHer; // She == Her or He == Him
		String petColor;
		String petName;
		String userAction = "0";
		
		Scanner userInput = new Scanner(System.in); // user input scanner	
		
// Create VirtualPet Object and set default variables.
		// TODO Determine if I want to setup different values for parameters.
		
		VirtualPet petDemegz = new VirtualPet.Builder().hunger(1).thirst(1).waste(1).boredom(1).tired(2).health(99).build(); // create the pet
		
		petGender = petDemegz.getGenderString();
		petGenderHisHer = petDemegz.convertToHerHis(petGender, false);
		petGenderHimHer = petDemegz.convertToHerHis(petGender, true);
		
		petColor = petDemegz.getColorArrayColor(petDemegz.getColor());
		
// Introductions
		System.out.println("Your Virtual-Pet DeMegz\nPlease Enter Your Name:"); //scan user name
		userName = userInput.nextLine();
		System.out.println("Hello "  + userName + ", let me introduce you to " 
				+ "your new pet DeMegz!\n" + petGender + "'s a wonderful little "
				+ petColor.toLowerCase() + " creature for you to take "
				+ "special\ncare of, but first, " + petGender.toLowerCase() + " needs a name! "
				+ petGenderHisHer + " name is...");
		petDemegz.setPetName(userInput.nextLine());
		petName = petDemegz.getPetName();
		System.out.println(petName + " is a great name!\n");
		System.out.println("Make sure you take special care of " + petName + "."
				+ " Remember to feed,\nwater, and potty " + petGenderHimHer.toLowerCase() + "."
				+ "\n\nOf course, don't forget to play with " + petName + ", we don't want " + petGenderHimHer.toLowerCase()
				+ " to get bored\nto death! Be sure to rest up after play so " + petGender.toLowerCase()
				+ " doesn't get sick!\n\nHave fun " + userName + " & " + petName + "!\n");
		
// Game Loop
		while (true) {
			
			// Display current pet status
			
			System.out.println(petName + " is currently........");
			
			System.out.println(petDemegz.petStatus());
			System.out.println("TEST: HungerVal:" + petDemegz.getHunger() + "ThirstyVal: ");
			
			// Display the menu
			System.out.println("\n" + userName + ", what would you like to do with " + petName + "?");
					
			System.out.println(" 1. Feed     5. Rest\n"
					         + " 2. Water    6. Give " + petGenderHimHer + " medicine\n"
					         + " 3. Potty    7. EXIT GAME\n"
					         + " 4. Play");
			System.out.println("Select an option above...");
			userAction = userInput.nextLine();
			
			
			switch (userAction) {
			
// Take actions based on choice
			case "1": // feed the pet
				petDemegz.feed(1);
				break;
			case "2": // water the pet
				petDemegz.water(1);
				break;
			case "3": // potty the pet
				petDemegz.usePotty(1);
				break;
			case "4": // play with the pet
				petDemegz.play(1);				
				break;
			case "5": // rest for the pet
				petDemegz.rest(1);
				break;
			case "6": // give pet medicine
				petDemegz.medicine(1);
				break;
			case "7": // exit game
				userInput.close();
				System.out.println("Thank you for playing!");
				System.exit(0);
			default:
				System.out.println("Try again, please choose between 1 - 7\n");
				continue;
			}

// React to choice
			System.out.println("TEST AFTER CHOICE: HungerVal:" + petDemegz.getHunger() + "ThirstyVal: ");
			
			System.out.println(petDemegz.petStatus());
// call tick method to represent the passage of time.
			petDemegz.tick();
		}
		
	}

} // END
