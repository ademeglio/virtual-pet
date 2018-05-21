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
  * Used builder pattern to construct class. http://www.informit.com/articles/article.aspx?p=1216151&seqNum=2
  	>This allowed me to create tests that I can easily change instance values without creating a complicated
  	>contstructor that would have to take a large amount of arguments. Instead, I can call the parameters I want
  	>to change by using method calls.*

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

    * - [x] isHungry() - Boolean. If hunger > 0 == yes, it's hungry.
    * - [x] ~~setHunger() - Use to set hunger~~
    * - [x] feed() - *If it's hungry, you need to feed it!, and most likely it's going to get thirsty in the process.*


    * - [x] isThirsty() - Boolean. If thirst > 0 == yes, it's thirsty.
    * - [x] ~~setThirst() - Use to set thirst~~
    * - [x] water() - *Thirsty, give it something to drink!*


    * - [x] isPottyTime() - Boolean. If waste > 0 == yes, after eating/drinking it is inevitable.
    * - [x] ~~setWaste() - Use to set waste.~~
    * - [x] usePotty() - *after all that food and water, well, you know!*


    * - [x] isBored() - Boolean. If bored is > 0 == yes. Play time!
    * - [x] ~~setBoredom() - use to set boredom~~
    * - [x] play() - *when you're bored, play!*


    * - [x] isTired() - Boolean. If tired > 0 == yes. Rest time!
    * - [x] ~~setTired() - use to set tired~~
    * - [x] rest() - *rest up little guy/gal.*


    * - [x] isSick() - Boolean. If health < 100 == yes. rest or medicine. **If Health is less than zero - DIE**
    * - [x] ~~setHealth() - use to set health.~~
    * - [x] medicine() - *If you're sick, sometimes you need some pharmaceuticals to get better!*


    * - [x] getColor() - 
      * - [X] Store color as an int? Random generate the color when creating a new Demegz.
    * - [x] setColor() - ~Generate random?~ Color is randomly generated when object is created.


    * - [x] getGender() - determines if the pet is a girl or boy by setting even random int as = 1 in the method
    * - [x] ~setGender()~ - Generate random int when creating object.


    * - [x] getName() -
    * - [x] setName() - set the name of the pet


    * - [x] getWeight() - *over time, we all grow a little (until we reach a certain point in our life ;-))*
    * - [x] setWeight() 

    * - [ ] tick() - 

### Stretch Tasks
  * - [ ] Give the pet the ability to take care of some of its own needs.
  * - [ ] Create a visual represenation of your pet
  * - [ ] Assign favorite foods to your pet, and add a parameter specifying the type of food to the medod you use to feed your pet.
  Your pet should react accordingly. You could also decide which food it does not like.
  * - [ ] create unit tests!