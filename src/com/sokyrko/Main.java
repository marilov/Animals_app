package com.sokyrko;

public class Main {

    static AnimalManager animalManager = new AnimalManager();

    public static void main(String[] args) {
        System.out.println("I am a " + animalManager.getAnimaltype());
        System.out.println("My name is " + animalManager.getAnimalname());
    }
}
