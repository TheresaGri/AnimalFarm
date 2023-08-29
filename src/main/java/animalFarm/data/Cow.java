package main.java.animalFarm.data;

public class Cow extends Mammal {
    public Cow(double weight, int id) {
        super(weight, id);
    }

    @Override
    public void giveBirth() {
        double weightOfAnimal = getWeight();
        weightOfAnimal -= 11000;
        setWeight(weightOfAnimal);
    }

    @Override
    public void makeNoise() {
        System.out.println("MOO");
    }
}
