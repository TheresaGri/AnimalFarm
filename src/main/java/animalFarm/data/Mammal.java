package main.java.animalFarm.data;

 abstract class Mammal extends Animal{
     public Mammal(double weight, int id) {
         super(weight, id);
     }
     public abstract void giveBirth();
}
