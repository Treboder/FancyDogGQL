package com.example.FancyDogGraphQL.repository;

import com.example.FancyDogGraphQL.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {



}
