package org.example;

public class Cow extends Animal{

    public Cow(String animal) {
        super(animal);
    }

    @Override
    public void animalSound(){
        System.out.println("muuu");
    }
}
