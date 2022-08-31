package com.example.FancyDogGraphQL.resolver;

import com.example.FancyDogGraphQL.entity.Dog;
import com.example.FancyDogGraphQL.repository.DogRepository;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Scanner;

@Controller
public class DogController {

    private DogRepository dogRepository;

    public DogController(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    @QueryMapping
    public List<Dog> findAllDogs() {
        return (List<Dog>) dogRepository.findAll();
        //return Dog.dogs;
    }

}
