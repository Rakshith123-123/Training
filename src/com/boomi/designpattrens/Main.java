package com.boomi.designpattrens;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder("John", 30)
                .address("123 Main St.")
                .phoneNumber("555-555-5555")
                .build();

        AnimalFactory animalFactory=new AnimalFactory();
        Animal animal=animalFactory.createAnimal("cat");
        animal.makeSound();

    }
}
