package main.java.animalFarm;

import main.java.animalFarm.data.*;
import main.java.animalFarm.farm.Farm;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List <Animal> animalList = generateAnimals();
        Farm farm = new Farm(animalList);
        farm.interactWithEveryAnimal();
        farm.findTheGoldenGoose();

    }

    public static List<Animal> generateAnimals() {
        List<Animal> animals = new ArrayList<>();
        Cat cat1 = new Cat(3000, 1);
        Cat cat2 = new Cat(2800, 2);
        Cat cat3 = new Cat(2500, 3);

        Cow cow1 = new Cow(600000, 1);
        Cow cow2 = new Cow(700000, 2);
        Dog dog1 = new Dog(15000, 1, DogType.RETRIEVER);
        Dog dog2 = new Dog(12000, 2, DogType.SHEPHERD);

        Goose goose1 = new Goose(2500, 1, 3); // Weight: 2500 grams, Laid Eggs: 5
        Goose goose2 = new Goose(2700, 2, 5);
        animals.add(cat1);
        animals.add(cat2);
        animals.add(cat3);
        animals.add(cow1);
        animals.add(cow2);
        animals.add(dog1);
        animals.add(dog2);
        animals.add(goose1);
        animals.add(goose2);

        return animals;
    }
}


