package nl.djja.animalshelter;

import nl.djja.animalshelter.Animals.Animal;
import nl.djja.animalshelter.Animals.Cat;
import nl.djja.animalshelter.Animals.Dog;
import nl.djja.animalshelter.Animals.Gender;

import java.util.ArrayList;
import java.util.List;

public class Reservation {
    public List<Animal> getAnimals() {
        return animals;
    }

    private List<Animal> animals = new ArrayList<Animal>();

    public void newCat(String name, Gender gender, String badHabits){
        animals.add(new Cat(name, gender, badHabits));
    }

    public void newDog(String name, Gender gender){
        animals.add(new Dog(name, gender));
    }
}
