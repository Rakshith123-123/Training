package com.boomi.designpattrens;

public class Person {
    private String name;
    private int age;
    private String address;
    private String phoneNumber;

    public static class Builder {
        private String name;
        private int age;
        private String address;
        private String phoneNumber;

        public Builder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Person build() {
            Person person = new Person();
            person.name = this.name;
            person.age = this.age;
            person.address = this.address;
            person.phoneNumber = this.phoneNumber;
            return person;
        }
    }

    private Person() {

    }

}
