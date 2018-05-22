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
		String petGenderHimHers; // She == hers or He == Him
		String petColor;
		String petName;
		String userAction = "0";
		
		Scanner userInput = new Scanner(System.in); // user input scanner	
		
// Create VirtualPet Object and set default variables.
		// TODO Determine if I want to setup different values for parameters.
		
		VirtualPet petDemegz = new VirtualPet.Builder().hunger(1).boredom(1).build(); // create the pet
		if (petDemegz.getGender() == 0) { // get gender
			petGender = "She";
		} else {
			petGender = "He";
		}
		
		petGenderHisHer = petDemegz.convertToHerHis(petGender, false);
		petGenderHimHers = petDemegz.convertToHerHis(petGender, true);
		petColor = petDemegz.getColorArrayColor(petDemegz.getColor());
		
// Introductions
		System.out.println("Virtual-Pet: DeMegz\nPlease Enter Your Name:"); //scan user name
		userName = userInput.nextLine();
		System.out.println("Hello "  + userName + ", let me introduce you to " 
				+ "your new pet DeMegz!\n" + petGender + "'s a wonderful little "
				+ petColor.toLowerCase() + " creature for you to take "
				+ "special\ncare of, but first, " + petGender.toLowerCase() + " needs a name! "
				+ petGenderHisHer + " name is...");
		petName = petDemegz.setName(userInput.nextLine());
		System.out.println(petName + " is a great name!");
		System.out.println("Make sure you take special care of " + petName + "."
				+ " Remember to feed,\nwater, and potty " + petName + "."
				+ "\n\nOf course, don't forget to play with " + petName + ", " + petGender.toLowerCase()
				+ " can get bored\nto death! Be sure to rest up after play so " + petGender.toLowerCase()
				+ " doesn't get sick!\nHave fun " + userName + "!\n");
		
// Game Loop
		while (true) {
			
			// TODO Display current pet status
			
			System.out.println(petName + " is currently feeling...\n");
			
			System.out.println(PetStatus(petDemegz));
			
			// Display the menu
			System.out.println("\n" + userName + ", what would you like to do with " + petName + "?");
					
			System.out.println(" 1. Feed     5. Rest\n"
					         + " 2. Water    6. Give " + petGenderHisHer + " medicine\n"
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
				break;
			case "3": // potty the pet
				break;
			case "4": // play with the pet
				break;
			case "5": // rest for the pet
				break;
			case "6": // give pet medicine
				break;
			case "7": // exit game
				userInput.close();
				System.out.println("Thank you for playing!");
				System.exit(0);
			default:
				System.out.println("Try again, please choose between 1 - 7\n");
				continue;
			}

// call tick method to represent the passage of time.
			petDemegz.tick();
		}
		
	}
	
	public static String PetStatus(VirtualPet petDemegz) {
		//variables
		String hungry = "";
		String thirsty = "";
		String potty = "";
		String bored = "";
		String tired = "";
		String sick = "";
		
		// check if hungry
		if (petDemegz.isBored()) {
			hungry = "Is hungry! Please feed him/her. ";
		}
		// check if thirsty
		if (petDemegz.isThirsty()) {
			thirsty = "Is thirsty! Please give him/her some water. ";
		}
		// check if it's time to potty
		if (petDemegz.isPottyTime()) {
			potty = "It's time to go potty! ";
		}
		// check if bored
		if (petDemegz.isBored()) {
			bored = "Is pretty bored. It must be play time! ";
		}
		// check if tired
		if (petDemegz.isTired()) {
			tired = "Yawn... " + petDemegz.getName() + " looks pretty sleepy.";
		}
		// check if sick
		if (petDemegz.isSick()) {
			sick = petDemegz.getName() + " isn't looking to good :-(";
		}
		
		return hungry + thirsty + potty + bored + tired + sick;
	}

} // END
