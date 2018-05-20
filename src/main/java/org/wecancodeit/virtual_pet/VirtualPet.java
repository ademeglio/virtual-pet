package org.wecancodeit.virtual_pet;

public class VirtualPet {

	// attributes
	private int hunger = 0;
	private int thirst = 0;
	private int waste = 0;
	private int boredom = 0;
	private int health = 100; //100% healthy, 0% is dead!
	private int weight = 1;
	private int tired = 0;
	private String color;
	private String gender;
	private String name;
	private int age = 1;
	
	// Constructor
	public VirtualPet() {

	}

	// getters and setters
	public void setHunger(int hunger) {
		this.hunger = hunger;
	}

	public void setThirst(int thirst) {
		this.thirst = thirst;
	}

	public void setWaste(int waste) {
		this.waste = waste;
	}
	
	public void setBoredom(int boredom) {
		this.boredom = boredom;
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


	
}
