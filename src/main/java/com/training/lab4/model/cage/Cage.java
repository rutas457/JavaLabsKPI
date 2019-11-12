package com.training.lab4.model.cage;

import com.training.lab4.model.exception.NoFreeCageException;
import com.training.lab4.model.entity.Animal;
import com.training.lab4.model.exception.NoSuchAnimalException;
import com.training.lab4.view.Messages;
import com.training.lab4.view.View;
import lombok.Getter;

import java.util.LinkedList;
import java.util.List;

@Getter
public class Cage<T extends Animal>  {

    private List<T> animals;
    private int capacity;

    public Cage(int capacity) {
        this.capacity = capacity;
        animals = new LinkedList<T>();
    }

    public int getCapacity(){
        return capacity;
    }

    public int getNumberOfOccupiedCages(){
        return capacity - animals.size();
    }

    public boolean addAnimal(T animal) throws NoFreeCageException {
        if(animals.size() < capacity){
            return animals.add(animal);
        }else{
            throw new NoFreeCageException(View.bundle.getString(Messages.NO_FREE_CAGE));
        }
    }

    public boolean retrieveAnimal(T animal){
        if(animals.stream().anyMatch(x->x.equals(animal))){
            return animals.remove(animal);
        }else{
            throw new NoSuchAnimalException(View.bundle.getString(Messages.NO_SUCH_ANIMAL));
        }
    }


}
