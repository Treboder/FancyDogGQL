//package com.example.FancyDogGQL.resolver;
//
//
//import com.coxautodev.graphql.tools.GraphQLQueryResolver;
//import com.example.FancyDogGQL.entity.Dog;
//import com.example.FancyDogGQL.exception.DogNotFoundException;
//import com.example.FancyDogGQL.repository.DogRepository;
//import org.springframework.stereotype.Component;
//
//import java.util.Optional;
//
//@Component
//public class Query implements GraphQLQueryResolver {
//    private DogRepository dogRepository;
//
//    public Query(DogRepository dogRepository) {
//        this.dogRepository = dogRepository;
//    }
//
//    // linked to the query findAllDogs: [Dog]! as defined in dog.graphqls section "type QUERY"
//    public Iterable<Dog> findAllDogs() {
//        return dogRepository.findAll();
//    }
//
//    // linked to the query findDogById(id:ID!): Dog! as defined in dog.graphqls section "type QUERY"
//    public Dog findDogById(Long id) {
//        Optional<Dog> optionalDog = dogRepository.findById(id);
//        if (optionalDog.isPresent()) {
//            return optionalDog.get();
//        } else {
//            throw new DogNotFoundException("Dog Not Found", id);
//        }
//    }
//}