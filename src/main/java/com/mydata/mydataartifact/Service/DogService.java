package com.mydata.mydataartifact.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mydata.mydataartifact.Model.Dog;
import com.mydata.mydataartifact.repository.DogRepo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Service layer is where all the business logic lies
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class DogService {

    private final DogRepo DogRepo;

    public List<Dog> getAllDogs(){
        return DogRepo.findAll();
    }

    public Dog getDogById(Integer id){
        Optional<Dog> optionalDog = DogRepo.findById(id);
        if(optionalDog.isPresent()){
            return optionalDog.get();
        }
        log.info("Dog with id: {} doesn't exist", id);
        return null;
    }

    public Dog saveDog (Dog dog){
        Dog savedDog = DogRepo.save(dog);

        log.info("Dog with id: {} saved successfully", dog.getId());
        return savedDog;
    }

    public Dog updateDog (Dog dog) {
        Optional<Dog> existingDog = DogRepo.findById(dog.getId());
        Dog updatedDog = DogRepo.save(dog);

        log.info("Dog with id: {} updated successfully", dog.getId());
        return updatedDog;
    }

    public void deleteDogById (Integer id) {
        DogRepo.deleteById(id);
    }

}
