package com.example.FancyDogGQL.resolver;

import com.example.FancyDogGQL.entity.Dog;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class DogController {

    @QueryMapping
    public List<Dog> findAllDogs() { return Dog.dogs; }

}
