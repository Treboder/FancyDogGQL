package com.example.FancyDogGQL.repository;

import com.example.FancyDogGQL.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {



}
