package com.training.lab3.service;

import com.training.lab3.model.SkiPass;
import com.training.lab3.model.enumeration.PassTime;
import com.training.lab3.repository.SkiPassRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

@Slf4j
@Service
public class SkiPassService {

    private final SkiPassRepository passRepository;

    @Autowired
    public SkiPassService(SkiPassRepository passRepository) {
        this.passRepository = passRepository;
    }

    public void createNewPass(SkiPass pass) {
        if (!pass.getPassTime().equals(PassTime.LIMITED)) {
            pass.setEndDate(LocalDate.now().plusDays(pass.getNumberOfDays() + 1));
        }
        try {
            passRepository.save(pass);
        } catch (Exception e) {
            log.error(e.getLocalizedMessage());
        }
    }

    public Optional<SkiPass> findPassByNumber(String number) {
        return passRepository.findByCardNumber(number);
    }

    public String generateCardNumber() {
        return UUID.randomUUID().toString().substring(0, 7);
    }

    public LocalDate evaluateEndDate() {
        int quantityOfDays = 1;

        return LocalDate.now().plusDays(quantityOfDays);
    }
}
