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
		underTest.feed(1);
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
		System.out.println(underTest.getColorArrayColor(color));
		assertTrue(color >= 0 || color < 7);
	}
	
	@Test
	public void whatGender( ) {
		VirtualPet underTest = new VirtualPet.Builder().build();
		int gender = underTest.getGender();
		if (gender == 0) {
			System.out.println("It's a girl!");
		} else {
			System.out.println("It's a boy!");
		}
		assertTrue(gender == 0 || gender > 0);
	}
	
	@Test
	public void setNameAnthony() {
		VirtualPet underTest = new VirtualPet.Builder().build();
		String newName = underTest.setName("Anthony");
		assertEquals(newName, "Anthony");
	}
	
	@Test
	public void checkNameAnthony() {
		VirtualPet underTest = new VirtualPet.Builder().build();
		underTest.setName("Anthony");
		String testName = underTest.getName();
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
	public void convertToHerHisPrepTestShe() {
		VirtualPet underTest = new VirtualPet.Builder().build();
		String petGender = "She";
		String petGenderHisHer = underTest.convertToHerHis(petGender);
		assertEquals(petGenderHisHer, "Her");
	}
	
	@Test
	public void testPetStatus() {
		VirtualPet underTest = new VirtualPet.Builder().build();
		String petStatus = underTest.petStatus();
		assertEquals(petStatus, "TBD");
	}
}
