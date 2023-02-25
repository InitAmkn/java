package OOP.zoo.zoo;

import OOP.zoo.animals.Lion;
import OOP.zoo.animals.Snake;
import OOP.zoo.animals.Wolf;
import OOP.zoo.cage.AnimalCage;
import OOP.zoo.cage.LionCage;

// import OOP.zoo.cage.LionCage;
// import OOP.zoo.cage.SnakeCage;
// import OOP.zoo.cage.WolfCage;

public class Zoo {

    public AnimalCage<Wolf> wolfs;
    public AnimalCage<Lion> lions;
    public AnimalCage<Snake> snakes;

    public Zoo() {
    };

    public Zoo(AnimalCage<Wolf> wolfs,
            AnimalCage<Lion> lions,
            AnimalCage<Snake> snakes) {
        this.wolfs = wolfs;
        this.lions = lions;
        this.snakes = snakes;
    }

    public Lion takeOfLion() {
        return lions.releaseAnimalFromCage();
    }

}
