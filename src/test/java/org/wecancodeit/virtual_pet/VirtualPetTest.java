package org.wecancodeit.virtual_pet;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class VirtualPetTest {
	/*
	 * Example of creating a new class instance using builder method.
	 * 
	 * VirtualPet underTest = new VirtualPet.Builder().hungry(val).thirsty(val).build();
	 */
	
	
	
	@Test
	public void isThePetHungryNo() {
		VirtualPet underTest = new VirtualPet.Builder().build(); // arrange
		boolean isHungry = underTest.isHungry();// act
		assertFalse(isHungry);// assert	
	}
	
	@Test
	public void isThePetHungryYes() {
		VirtualPet underTest = new VirtualPet.Builder().hunger(1).build();
		boolean isHungry = underTest.isHungry();
		assertTrue(isHungry);
	}
	
	@Test
	public void feedPetStillHungryCheck() {
		VirtualPet underTest = new VirtualPet.Builder().hunger(1).build();
		//String petStatus = underTest.petStatus();
		//System.out.println("Initial:\n" + petStatus);
		underTest.feed(1);
		//petStatus = underTest.petStatus();
		//System.out.println("After feeding:\n" + petStatus);
		boolean isHungry = underTest.isHungry();
		assertFalse(isHungry);
	}
	
	@Test
	public void isThePetThirstyNo() {
		VirtualPet underTest = new VirtualPet.Builder().build();
		boolean isThirsty = underTest.isThirsty();
		assertFalse(isThirsty);
	}
	
	@Test
	public void isThePetThirstyYes() {
		VirtualPet underTest = new VirtualPet.Builder().thirst(1).build();
		boolean isThirsty = underTest.isThirsty();
		assertTrue(isThirsty);
	}
	
	@Test
	public void waterPetStillThirstyCheck() {
		VirtualPet underTest = new VirtualPet.Builder().thirst(1).build();
		underTest.water(1);
		boolean isThirsty = underTest.isThirsty();
		assertFalse(isThirsty);
	}
		
	@Test
	public void isPottyTimeNo() {
		VirtualPet underTest = new VirtualPet.Builder().build();
		boolean isPottyTime = underTest.isPottyTime();
		assertFalse(isPottyTime);
	}
	
	@Test
	public void isPottyTimeYes() {
		VirtualPet underTest = new VirtualPet.Builder().waste(1).build();
		boolean isPottyTime = underTest.isPottyTime();
		assertTrue(isPottyTime);
	}
	
	@Test
	public void stillPottyTimeAfterPottyNo() {
		VirtualPet underTest = new VirtualPet.Builder().waste(1).build();
		underTest.usePotty(1);
		boolean isPottyTime = underTest.isPottyTime();
		assertFalse(isPottyTime);
	}
	
	@Test
	public void isBoredNo() {
		VirtualPet underTest = new VirtualPet.Builder().build();
		boolean isPlayTime = underTest.isBored();
		assertFalse(isPlayTime);
	}
	
	@Test
	public void isBoredYes() {
		VirtualPet underTest = new VirtualPet.Builder().boredom(1).build();
		boolean isPlayTime = underTest.isBored();
		assertTrue(isPlayTime);
	}
	
	@Test
	public void isBoredAfterPlayNo( ) {
		VirtualPet underTest = new VirtualPet.Builder().boredom(1).build();
		underTest.play(1);
		boolean isPlayTime = underTest.isBored();
		assertFalse(isPlayTime);
	}
	
	@Test
	public void isTiredNo() {
		VirtualPet underTest = new VirtualPet.Builder().build();
		boolean isSleepTime = underTest.isTired();
		assertFalse(isSleepTime);
	}
	
	@Test
	public void isTiredYes() {
		VirtualPet underTest = new VirtualPet.Builder().tired(1).build();
		boolean isSleepTime = underTest.isTired();
		assertTrue(isSleepTime);
	}
	
	@Test
	public void isTiredAfterSleepNo() {
		VirtualPet underTest = new VirtualPet.Builder().tired(1).build();
		underTest.rest(1);
		boolean isSleepTime = underTest.isTired();
		assertFalse(isSleepTime);
	}
	
	@Test
	public void isSickNo() {
		VirtualPet underTest = new VirtualPet.Builder().build();
		boolean isSick = underTest.isSick();
		assertFalse(isSick);
	}
	
	@Test
	public void isSickYes() {
		VirtualPet underTest = new VirtualPet.Builder().health(99).build();
		boolean isSick = underTest.isSick();
		assertTrue(isSick);
	}
	
	@Test
	public void isSickAfterMedicineNo() {
		VirtualPet underTest = new VirtualPet.Builder().health(99).build();
		underTest.medicine(1);
		boolean isSick = underTest.isSick();
		assertFalse(isSick);
	}
	
	@Test
	public void whatColor() {
		VirtualPet underTest = new VirtualPet.Builder().build();
		int color = underTest.getColor();
		//System.out.println(underTest.getColorArrayColor(color));
		assertTrue(color >= 0 || color < 7);
	}
	
	@Test
	public void whatGender( ) {
		VirtualPet underTest = new VirtualPet.Builder().build();
		int gender = underTest.getGender();
		if (gender == 0) {
			//System.out.println("It's a girl!");
		} else {
			//System.out.println("It's a boy!");
		}
		assertTrue(gender == 0 || gender > 0);
	}
	
	@Test
	public void setPetNameAnthony() {
		VirtualPet underTest = new VirtualPet.Builder().build();
		underTest.setPetName("Anthony");
		String newName = underTest.getPetName();
		assertEquals(newName, "Anthony");
	}
	
	@Test
	public void checkNameAnthony() {
		VirtualPet underTest = new VirtualPet.Builder().build();
		underTest.setPetName("Anthony");
		String testName = underTest.getPetName();
		assertEquals(testName, "Anthony");
	}
	
	@Test
	public void checkWeightIs1() {
		VirtualPet underTest = new VirtualPet.Builder().build();
		int petWeight = underTest.getWeight();
		assertEquals(petWeight, 1);
	}
	
	@Test
	public void setWeightCheckWeightIs2() {
		VirtualPet underTest = new VirtualPet.Builder().build();
		underTest.setWeight(2);
		int petWeight = underTest.getWeight();
		assertEquals(petWeight, 2);
	}
	
	@Test
	public void getAgeCheck() {
		VirtualPet underTest = new VirtualPet.Builder().build();
		int petAge = underTest.getAge();
		assertEquals(petAge, 1);
	}
	
	@Test
	public void setAge2Check() {
		VirtualPet underTest = new VirtualPet.Builder().build();
		underTest.setAge(2);
		int petAge = underTest.getAge();
		assertEquals(petAge, 2);
	}
	
	@Test
	public void convertToHerHisPrepTestSheToHer() {
		VirtualPet underTest = new VirtualPet.Builder().build();
		String petGender = "She";
		String petGenderHisHer = underTest.convertToHerHis(petGender, false);
		assertEquals(petGenderHisHer, "Her");
	}
	
	@Test
	public void testPetStatus() {
		VirtualPet underTest = new VirtualPet.Builder().hunger(1).thirst(1).waste(1)
				.tired(1).health(99).boredom(1).gender(3).build();
		underTest.setPetName("Foo");
		String petStatus = underTest.petStatus();
		//System.out.println("Testing Pet Status Gender: " + underTest.getGenderString());
		//System.out.println(petStatus);
		assertEquals(petStatus, "\t\t\tHungry! Please feed her. (" + underTest.getHunger() + ")"
				+ "\n\t\t\tThirsty! Please give her some water. "
				+ "\n\t\t\tIt's time to go potty! "
				+ "\n\t\t\tPretty bored. It must be play time! "
				+ "\n\t\t\t\"Yawn...\" " + underTest.getPetName() + " looks pretty sleepy."
				+ "\n\t\t\t" + underTest.getPetName() + " isn't looking too good.");
	}
	
	@Test
	public void getHunger5() {
		VirtualPet underTest = new VirtualPet.Builder().hunger(5).build();
		int petHunger = underTest.getHunger();
		assertEquals(petHunger, 5);
	}
	
	@Test
	public void getHunger4() {
		VirtualPet underTest2 = new VirtualPet.Builder().hunger(1).thirst(1).waste(1)
				.tired(1).health(99).boredom(1).gender(3).build();
		underTest2.setPetName("Foo");
		String petStatus = underTest2.petStatus();
		System.out.println("Initial:\n" + petStatus);
		int petHunger = underTest2.getHunger();
		underTest2.feed(1);
		int petHunger2 = underTest2.getHunger();
		System.out.println("After Feeding:\n" + petStatus);
		assertEquals(petHunger - 1, petHunger2);
	}
	
}
