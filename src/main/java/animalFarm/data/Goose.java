package main.java.animalFarm.data;

public class Goose extends Animal {
    private int laidEggs;

    public Goose(double weight, int id,int laidEggs) {
        super(weight, id);
        this.laidEggs = laidEggs;
    }

    @Override
    public void makeNoise() {
        System.out.println("Honk");
    }

    public void laidEggs() {
        laidEggs += 1;
    }

    public int getLaidEggs() {
        return laidEggs;
    }
}
