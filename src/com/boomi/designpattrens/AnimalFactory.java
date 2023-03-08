package com.boomi.designpattrens;
public class AnimalFactory {
    public Animal createAnimal(String type) {
        if(type.equalsIgnoreCase("dog")) {
            return new Dog();
        } else if(type.equalsIgnoreCase("cat")) {
            return new Cat();
        } else {
            return null;
        }
    }
}
