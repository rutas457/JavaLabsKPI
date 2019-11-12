package com.training.lab4.model.cage;

import com.training.lab4.model.NoFreeCageException;
import com.training.lab4.model.entity.Animal;
import com.training.lab4.view.Messages;
import com.training.lab4.view.View;

import java.util.List;


public class Cage<T extends Animal>  {

    private List<T> animals;
    private int capacity;

    int getCapacity(){
        return capacity;
    }

    int getNumberOfOccupiedCages(){
        return capacity - animals.size();
    }

    boolean addAnimal(T animal) throws NoFreeCageException {
        if(animals.size() < capacity){
            return animals.add(animal);
        }else{
            throw new NoFreeCageException(View.bundle.getString(Messages.NO_FREE_CAGE));
        }
    }


}
