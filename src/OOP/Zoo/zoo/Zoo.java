package OOP.zoo.zoo;

import OOP.zoo.animals.Lion;
import OOP.zoo.animals.Snake;
import OOP.zoo.animals.Wolf;
import OOP.zoo.cage.AnimalCage;

import OOP.zoo.cage.LionCage;
import OOP.zoo.cage.SnakeCage;
import OOP.zoo.cage.WolfCage;

public class Zoo {

    private AnimalCage<Wolf> wolfs = new WolfCage();
    private AnimalCage<Lion> lions = new LionCage();
    private AnimalCage<Snake> snakes = new SnakeCage();
}
