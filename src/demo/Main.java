package demo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Reference type Animal, object type Dog
        animal.sound(); // Dynamic binding - calls Dog's version of sound()
        Animal animal2 = new Cat();
        animal2.sound();
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        for (Animal a : animals) {
            a.sound();
        }

    }
}