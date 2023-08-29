package main.java.animalFarm.data;

public class Dog extends Mammal{

    private int digCounter;
    private DogType dogType;
    public Dog(double weight, int id, DogType dogType) {
        super(weight, id);
        digCounter = 0;
        this.dogType = dogType;
    }

    @Override
    public void makeNoise() {
        System.out.println("Woof");
    }

    public void diggingAHole() {
        if (digCounter < 10) {
            System.out.println("Digging a hole...");
            digCounter++;
        } else {
            System.out.println("No digging allowed anymore.");
        }
    }

    @Override
    public void giveBirth() {
        double weight = getWeight();
        weight -= 450;
        setWeight(weight);
    }
}
