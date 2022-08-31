package com.example.FancyDogGraphQL.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.List;

@Entity
public class Dog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String breed;
    private String origin;

    public Dog() {
    }

    public Dog(String name, String breed, String origin) {
        this.name = name;
        this.breed = breed;
        this.origin = origin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    // static method to be used by DogController for debugging
    public static List<Dog> dogs = Arrays.asList(
            new Dog("Fluffy", "Pomeranian", "Mountain View, CA"),
            new Dog("Spot", "Pit Bull", "Austin, TX"),
            new Dog("Ginger", "Cocker Spaniel", "Kansas City, KS"),
            new Dog("Lady", "Direwolf", "The North"),
            new Dog("Sasha", "Husky", "Buffalo, NY")
    );


}
