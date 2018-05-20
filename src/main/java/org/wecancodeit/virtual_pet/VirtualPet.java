package org.wecancodeit.virtual_pet;

public class VirtualPet {
	// instance variables
	private int hunger;
	private int thirst;
	private int waste;
	private int boredom;
	private int tired;
	private int health;
	
	// Builder Pattern
	public static class Builder {
		// Required parameters - none
		
		// Optional parameters - initialized to default values
		private int hunger  = 0;
		private int thirst  = 0;
		private int waste   = 0;
		private int boredom = 0;
		private int tired   = 0;
		private int health  = 100; //100% healthy, 0% is dead!
		private int color;
		private String gender;
		private String name;
		private int age = 1;
		private int weight = 1;
	
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
	}

	// getters and setters
	public String getColor() { //When the pet is created, return random color.
		return "color";
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


	
	



	
}
