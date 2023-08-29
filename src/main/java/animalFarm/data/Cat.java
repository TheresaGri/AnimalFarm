package main.java.animalFarm.data;

public class Cat extends Mammal{

    public Cat(double weight, int id) {
        super(weight, id);
    }

    @Override
    public void giveBirth() {
        double weight = getWeight();
        weight -= 85;
        setWeight(weight);
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }
}
