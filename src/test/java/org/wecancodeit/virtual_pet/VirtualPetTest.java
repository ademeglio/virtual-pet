package org.wecancodeit.virtual_pet;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class VirtualPetTest {
	
	@Test
	public void isThePetHungryNo() {
		VirtualPet underTest = new VirtualPet(); // arrange
		boolean isHungry = underTest.isHungry();// act
		assertFalse(isHungry);// assert	
	}
	
	@Test
	public void isThePetHungryYes() {
		VirtualPet underTest = new VirtualPet();
		underTest.setHunger(1);
		boolean isHungry = underTest.isHungry();
		assertTrue(isHungry);
	}
	
	@Test
	public void feedPetStillHungryCheck() {
		VirtualPet underTest = new VirtualPet();
		underTest.setHunger(1);
		underTest.feed(1);
		boolean isHungry = underTest.isHungry();
		assertFalse(isHungry);
	}
	
	@Test
	public void isThePetThirstyNo() {
		VirtualPet underTest = new VirtualPet();
		boolean isThirsty = underTest.isThirsty();
		assertFalse(isThirsty);
	}
	
	@Test
	public void isThePetThirstyYes() {
		VirtualPet underTest = new VirtualPet();
		underTest.setThirst(1);
		boolean isThirsty = underTest.isThirsty();
		assertTrue(isThirsty);
	}
	
	@Test
	public void waterPetStillThirstyCheck() {
		VirtualPet underTest = new VirtualPet();
		underTest.setThirst(1);
		underTest.water(1);
		boolean isThirsty = underTest.isThirsty();
		assertFalse(isThirsty);
	}
		
	@Test
	public void isPottyTimeNo() {
		VirtualPet underTest = new VirtualPet();
		boolean isPottyTime = underTest.isPottyTime();
		assertFalse(isPottyTime);
	}
	
	@Test
	public void isPottyTimeYes() {
		VirtualPet underTest = new VirtualPet();
		underTest.setWaste(1);
		boolean isPottyTime = underTest.isPottyTime();
		assertTrue(isPottyTime);
	}
	
	@Test
	public void stillPottyTimeAfterPottyNo() {
		VirtualPet underTest = new VirtualPet();
		underTest.setWaste(1);
		underTest.usePotty(1);
		boolean isPottyTime = underTest.isPottyTime();
		assertFalse(isPottyTime);
	}
	
	@Test
	public void isBoredNo() {
		VirtualPet underTest = new VirtualPet();
		boolean isPlayTime = underTest.isBored();
		assertFalse(isPlayTime);
	}
	
	@Test
	public void isBoredYes() {
		VirtualPet underTest = new VirtualPet();
		underTest.setBoredom(1);
		boolean isPlayTime = underTest.isBored();
		assertTrue(isPlayTime);
	}
	
	@Test
	
}
