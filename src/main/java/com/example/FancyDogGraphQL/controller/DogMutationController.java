package com.example.FancyDogGraphQL.controller;

import com.example.FancyDogGraphQL.entity.Dog;
import com.example.FancyDogGraphQL.exception.BreedNotFoundException;
import com.example.FancyDogGraphQL.exception.DogNotFoundException;
import com.example.FancyDogGraphQL.repository.DogRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

import java.util.Optional;

@Controller
public class DogMutationController {
    private DogRepository dogRepository;

     public DogMutationController(DogRepository dogRepository) {
         this.dogRepository = dogRepository;
     }

     @MutationMapping
     public boolean deleteDogBreed(@Argument String breed) {
        boolean deleted = false;
        Iterable<Dog> allDogs = dogRepository.findAll();
        // Loop through all dogs to check their breed
        for (Dog d:allDogs) {
            if (d.getBreed().equals(breed)) {
                // Delete if the breed is found
                dogRepository.delete(d);
                deleted = true;
            }
        }
        // Throw an exception if the breed doesn't exist
        if (!deleted) {
            throw new BreedNotFoundException("Breed Not Found", breed);
        }
        return deleted;
    }

    @MutationMapping
    public Dog updateDogName(@Argument String newName, Long id) {
        Optional<Dog> optionalDog = dogRepository.findById(id);

        if (optionalDog.isPresent()) {
            Dog dog = optionalDog.get();
            // Set the new name and save the updated dog
            dog.setName(newName);
            dogRepository.save(dog);
            return dog;
        } else {
            throw new DogNotFoundException("Dog Not Found", id);
        }
    }
}
