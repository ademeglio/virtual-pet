# Virtual Pet
WeCanCodeIT Module 2 Project

*Create a virtual pet. Bonus points if it becomes a fad!*

## Required Tasks

  * VirtualPet class
    * - [ ] Creat a `tick()` method that represent the passage of time.
    * - [x] Create at least three instance variables (aka attributes aka properties aka fields).
    * - [x] Create at least three methods (messages you send to your pet).
  * VirtualPetApp class
    * - [ ] Create a `main` method that...
      * - [ ] implements a *game loop*.
      * - [ ] asks for user input.
      * - [ ] writes output to the console.

### About my pet

Meet a Demegz, a small little creature usually found in the wilderness of Columbus, OH. While rare to come across, they are social creatures
that make a friendly pet. All you have to do to keep it happy is feed it, give it some water, play with it and make sure it gets its rest! Don't
overfeed it though or let it get too tired or it turns into a little gremlin!

* Overtime, the pet will get hungry and or thirsty.
	* As time goes on, it will get hungry and as it gets hungry, it will get thirsty.
	* If the pet has been playing a lot, then its going to get thirsty.
* If the pet has had a lot to eat and drink, well it's time to go potty.
* If the pet hasn't played for a while, then it gets bored.
* If the pet isn't resting or eating healthy, its going to get sick.
* After playing hard, its going to get tired.

#### Notes:
  * Default age will always be 1.

## Features

  1. Attributes
    * - [x] hunger - *need to feed it*. Not hungry = 0
    * - [x] thirst - *needs water*.
    * - [x] waste - *what comes in must go out*.
    * - [x] boredom - *We all like to play*.
    * - [x] health - *is it sick?*
    * - [x] weight - *is it getting bigger (weight or height?)*
    * - [x] tired - *getting tired?*
    * - [x] color - *What color is it?*
    * - [x] gender - *What's the gender?*
    * - [x] name - *What's the pet's name?*
    * - [x] age - *how old is the pet? gets older over time*

  2. Methods
    * - [x] feed() - *If it's hungry, you need to feed it!, and most likely it's going to get thirsty in the process.*
    * - [x] water() - *Thirsty, give it something to drink!*
    * - [x] usePotty() - *after all that food and water, well, you know!*
    * - [ ] play() - *when you're bored, play!*
    * - [ ] medicine() - *If you're sick, sometimes you need some pharmaceuticals to get better!*
    * - [ ] getWeight() - *over time, we all grow a little (until we reach a certain point in our life ;-))*
    * - [x] isHungry() - Boolean. If hunger > 0 == yes, it's hungry.
    * - [x] setHunger() - Use to set hunger
    * - [x] isThirsty() - Boolean. If thirst > 0 == yes, it's thirsty.
    * - [x] setThirst() - Use to set thirst
    * - [x] isPottyTime() - Boolean. If waste > 0 == yes, after eating/drinking it is inevitable.
    * - [x] setWaste() - Use to set waste.
    * - [ ] rest() - *rest up little guy/gal.*
    * - [ ] setColor() - 
    * - [ ] setGender() - 
    * - [ ] setName() -
    * - [ ] tick() - 

### Stretch Tasks
  * - [ ] Give the pet the ability to take care of some of its own needs.
  * - [ ] Create a visual represenation of your pet
  * - [ ] Assign favorite foods to your pet, and add a parameter specifying the type of food to the medod you use to feed your pet.
  Your pet should react accordingly. You could also decide which food it does not like.
  * - [ ] create unit tests!