package com.example.FancyDogGraphQL.controller;

import com.example.FancyDogGraphQL.entity.Dog;
import com.example.FancyDogGraphQL.exception.DogNotFoundException;
import com.example.FancyDogGraphQL.repository.DogRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class DogQueryController {

    private DogRepository dogRepository;

    public DogQueryController(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    // linked to the query findAllDogs: [Dog]! as defined in dog.graphqls section "type QUERY"
    @QueryMapping
    public List<Dog> findAllDogs() {
        return (List<Dog>) dogRepository.findAll();
    }

    // linked to the query findDogById(id:ID!): Dog! as defined in dog.graphqls section "type QUERY"
    @QueryMapping
    public Dog findDogById(@Argument Long id) {
        Optional<Dog> optionalDog = dogRepository.findById(id);
        if (optionalDog.isPresent()) {
            return optionalDog.get();
        } else {
            throw new DogNotFoundException("Dog Not Found", id);
        }
    }
}
