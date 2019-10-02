package com.training.lab3.repository;

import com.training.lab3.model.SkiPass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SkiPassRepository extends JpaRepository<SkiPass, String> {
    Optional<SkiPass> findByCardNumber(String cardNumber);
}