package com.training.lab4.model;

import com.training.lab4.model.cage.Cage;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class Zoo {
    private List<Cage> cages;

    public int getCountOfAnimals(){
        int count = 0;
        for(Cage cage:cages){
            count+=cage.getNumberOfOccupiedCages();
        }
        return count;
    }

    public void addCage(Cage cage){
        cages.add(cage);
    }
}
