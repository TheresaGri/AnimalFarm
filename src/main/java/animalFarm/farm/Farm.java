package main.java.animalFarm.farm;

import main.java.animalFarm.data.Animal;
import main.java.animalFarm.data.Goose;

import java.util.List;
import java.util.stream.Collectors;

public class Farm {
    private List<Animal> animals;

    public Farm(List<Animal> animals) {
        this.animals = animals;
    }

    public void interactWithEveryAnimal() {
        animals.forEach(animal -> animal.interact());
    }

    public void findTheGoldenGoose() {
        List<Goose> geeseList = animals.stream().
                filter(animal -> animal instanceof Goose).
                map(animal -> (Goose) animal).
                collect(Collectors.toList());
        int maxLaidEggs = geeseList.get(0).getLaidEggs();
        int id = geeseList.get(0).getId();
        for (int i = 0; i < geeseList.size(); i++) {
            if (maxLaidEggs < geeseList.get(i).getLaidEggs()) {
                id = geeseList.get(i).getId();
                maxLaidEggs = geeseList.get(i).getLaidEggs();
            }
        }
        System.out.println("Goose with most laid eggs: " + id);
    }
}
