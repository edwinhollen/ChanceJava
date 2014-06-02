# ChanceJava

A library for all things random, based roughly on the fabulous [ChanceJS](https://github.com/victorquinn/chancejs) library.

## Usage
1. Download (or clone) the repository.
2. Include Chance.java in your project.
3. Create an instance:

    Chance chance = new Chance();
    
4. Use it!

    String name = chance.name();
    
    int diceRoll = chance.d12();
    
    int randomInt = chance.integer(-10, 10);

## Features
* Uses the [java.util.Random](http://docs.oracle.com/javase/6/docs/api/java/util/Random.html) library. 
* Can accept a custom seed, or generate one automatically.
* Is fully documented. 

### Can generate random...
* Integers (numbers)
* Booleans (true/false), and with specified likeliness
* Names, first, middle, and last
* Dice rolls, from 4 to 100-sided
* Characters (letters)
* Strings (of characters), sentences, and paragraphs
* Pick from a given array of objects
* Age, in a specified age group
* Gender
