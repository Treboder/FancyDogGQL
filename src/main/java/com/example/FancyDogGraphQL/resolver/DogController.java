package com.example.FancyDogGraphQL.resolver;

import com.example.FancyDogGraphQL.entity.Dog;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class DogController {

    @QueryMapping
    public List<Dog> findAllDogs() { return Dog.dogs; }

}
