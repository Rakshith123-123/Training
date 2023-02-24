package com.boomi.problems;

public final class ImmutableClass {
        private final String name;
        private final int age;

        public ImmutableClass(){
            this("default",0);
        }

        public ImmutableClass(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
      public ImmutableClass withName(String newName) {
        return new ImmutableClass(newName, this.age);
    }

      public ImmutableClass withAge(int newAge) {
        return new ImmutableClass(this.name, newAge);
    }
}
