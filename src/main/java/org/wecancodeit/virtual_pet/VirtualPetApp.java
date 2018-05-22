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
		
		VirtualPet petDemegz = new VirtualPet.Builder().hunger(1).thirst(1).waste(0).boredom(1).tired(0).health(10).build(); // create the pet
		
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
				+ " doesn't get sick!\n\nHave fun " + userName + " & " + petName + "!");
		
// Display initial pet status
		
			System.out.println(petName + " is currently........");
			System.out.println(petDemegz.petStatus());

		
// Game Loop
		while (true) {
			
			
	// Display the menu
			System.out.println("\n" + userName + ", what would you like to do with " + petName + "?");
					
			System.out.println(" 1. Play       5. Check On " + petName + "\n"
					         + " 2. Feed       6. Rest\n"
					         + " 3. Water      7. Give " + petGenderHimHer + " medicine\n"
					         + " 4. Potty      8. EXIT GAME");
			System.out.println("Select an option above...");
			userAction = userInput.nextLine();
			
	// Manage menu selection	
			switch (userAction) {
			
			case "1": 
				petDemegz.play(1);				
				break;
			
			case "2": // feed the pet
				petDemegz.feed(1);
				System.out.println("\"...num, num, num...\"");
				if (petDemegz.getHunger() > 0) {
					System.out.println(petGender + " still seems hungry! Better keep feeding " 
										+ petGenderHimHer + ".");
				} else {
					System.out.println(petName + " looks pretty satisfied! Good Job!");
				}
				break;
			
			case "3": // water the pet
				petDemegz.water(1);
				if (petDemegz.getThirst() > 0) {
					System.out.println(petGender + " still seems thirsty! More water for " 
										+ "little " + petGenderHimHer + ".");
				} else {
					System.out.println(petName + " looks happy! Good Job!");
				}
				break;
				
			case "4": // potty the pet
				petDemegz.usePotty(1);
				if (petDemegz.getWaste() > 0) {
					System.out.println("Are you sure " + petGender + "'s finished?");
				} else {
					System.out.println("Whew, that could have been messy!");
				}
				break;
			
			case "5": // get status
				System.out.println(petName + " is currently........");
				System.out.println(petDemegz.petStatus());
				break;
			
			case "6": // rest for the pet
				petDemegz.rest(1);
				petDemegz.medicine(1);
				if (petDemegz.getTired() > 0) {
					System.out.println("I don't know, " + petName + " is still looking a little tired...");
				} else {
					System.out.println("Someone looks well rested now!");
				}
				break;
			
			case "7": // give pet medicine
				petDemegz.medicine(1);
				if (petDemegz.getHealth() < 10) {
					System.out.println(petName + " is looking a little better. Maybe some rest or more medicine?");
				} else {
					System.out.println("Well look who is ready to play!");
				}
				break;
			
			case "8": // exit game
				userInput.close();
				System.out.println("Thank you for playing!");
				System.exit(0);
			
			default:
				System.out.println("Please Try again, choose a number between 1 - 7\n");
				continue;
			}

			
			
// call tick method to represent the passage of time.
			petDemegz.tick();
		
		} // end loop
		
	} //end main

} // END
