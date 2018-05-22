package org.wecancodeit.virtual_pet;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class VirtualPet {
	/*
	 * WeCanCodeIT Module Project 2
	 * by Anthony J. DeMeglio
	 * 5/20/2018
	 * 
	 * VirtualPet()
	 * 'Demegz' Virtual Pet
	 * 
	 */
	
	// instance variables
	private int hunger;  // default set by builder
	private int thirst;  // default set by builder
	private int waste;   // default set by builder
	private int boredom; // default set by builder
	private int tired;   // default set by builder
	private int health;  // default set by builder
	private int color;   // default set by builder random
	private int gender;  // default set by builder random
	private String name; 
	private int age = 1;
	private int weight = 1;
	private String[] colorArray = {"Red", "Orange", "Yellow",
			   "Green", "Blue", "Purple"};
	
	// Builder Pattern
	public static class Builder {
		Random randomNum = new Random(); // create instance of random class for gender
		
		// Required parameters - none
		
		// Optional parameters - initialized to default values
		private int hunger  = 0;
		private int thirst  = 0;
		private int waste   = 0;
		private int boredom = 0;
		private int tired   = 0;
		private int health  = 100; //100% healthy, 0% is dead!
		private int color = ThreadLocalRandom.current().nextInt(0,6); 
		private int gender =  randomNum.nextInt(10);
		
		public Builder hunger(int val) {
			hunger = val;
			return this;
		}

		public Builder thirst(int val) {
			thirst = val;
			return this;
		}

		public Builder waste(int val) {
			waste = val;
			return this;
		}
		
		public Builder boredom(int val) {
			boredom = val;
			return this;
		}
		
		public Builder tired(int val) {
			tired = val;
			return this;
		}
		
		public Builder health(int val) {
			health = val;
			return this;
		}
		
		public VirtualPet build() {
			return new VirtualPet(this);
		}
	}
	
	private VirtualPet(Builder builder) {
		hunger = builder.hunger;
		thirst = builder.thirst;
		waste = builder.waste;
		boredom = builder.boredom;
		tired = builder.tired;
		health = builder.health;
		color = builder.color;
		gender = builder.gender;
	}

	// getters and setters
	
	public int getColor() { 
		return color;
	}
	
	public String getColorArrayColor(int color) {
		return colorArray[color];
	}
	
	public int getGender() {
		// Get Value then determine if it is even or odd
		// even numbers equate to boy
		if (gender % 2 == 0) {
			return 1;
		}
		return 0;
	}
	
	public String setName(String petName) {
		this.name = petName;
		return name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int newWeight) {
		this.weight = newWeight;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int newAge) {
		this.age = newAge;
	}
	
	// methods
	public boolean isHungry() {
		if (hunger > 0) {
			return true;
		} 
		return false;
	}

	public void feed(int foodQty) {
		this.hunger -= foodQty;
	}
	
	public boolean isThirsty() {
		if (thirst > 0) {
			return true;
		}
		return false;
	}
	
	public void water(int water) {
		this.thirst -= water;	
	}

	public boolean isPottyTime() {
		if (waste > 0) {
			return true;
		}
		return false;
	}

	public void usePotty(int potty) {
		this.waste -= potty;	
	}

	public boolean isBored() {
		if (boredom > 0) {
			return true;
		}
		return false;
	}

	public void play(int play) {
		this.boredom -= play;
	}

	public boolean isTired() {
		if (tired > 0) {
			return true;
		}
		return false;
	}

	public void rest(int rest) {
		this.tired -= rest;
	}

	public boolean isSick() {
		if (health < 100) {
			return true;
		}
		return false;
	}

	public void medicine(int medicine) {
		this.health += medicine;	
	}
	
	public void tick() {
		//what happens every x minutes.
		// hunger ++
		// thirsty ++
		// boredom ++
	}

	public String convertToHerHis(String petGender, Boolean obectiveCaseVal) {
		String petGenderHisHer;
		boolean objectiveCase = obectiveCaseVal;
		if (petGender.toLowerCase().equals("she")) {
			if (objectiveCase) {
				petGenderHisHer = "Hers";
			}else {
				petGenderHisHer = "Her";
			}
			return petGenderHisHer;
		} else {
			if (objectiveCase) {
				petGenderHisHer = "Him";
			} else {
			petGenderHisHer = "His";
			}
		}
		return petGenderHisHer;
	}
	
	public String petStatus() {
		String petStatus = "";
		
		return petStatus;
	}	

}
