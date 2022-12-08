package org.example;

public class Main {
    public static void main(String[] args) {
        Animal carlo = new Animal("carlo");
        Cow mucca = new Cow("mucca");
        Lion leo = new Lion("Leo");

        carlo.animalSound();
        mucca.animalSound();
        leo.animalSound();
    }
}