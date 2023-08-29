package main.java.animalFarm.data;

public abstract class Animal {
    private double weight;
    private int id;

    public Animal(double weight, int id) {
        this.weight = weight;
        this.id = id;
    }

    public abstract void makeNoise();

    public void interact() {
        makeNoise();
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getId() {
        return id;
    }
}
