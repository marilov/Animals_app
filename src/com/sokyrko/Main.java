package com.sokyrko;

public class Main {

    public static void main(String[] args) {
        AnimalManager animalManager = new AnimalManager();

        System.out.println("I am a " + animalManager.getAnimaltype());
        System.out.println("My name is " + animalManager.getAnimalname());

    }
}
