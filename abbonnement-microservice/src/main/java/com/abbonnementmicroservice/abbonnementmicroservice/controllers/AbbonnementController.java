package com.abbonnementmicroservice.abbonnementmicroservice.controllers;

import com.abbonnementmicroservice.abbonnementmicroservice.beans.Abbonnement;
import com.abbonnementmicroservice.abbonnementmicroservice.repositories.AbbonnementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AbbonnementController {

    @Autowired
    AbbonnementRepository abbonnementRepository;

    @GetMapping("/abonnement")
    public Abbonnement get(){
        return abbonnementRepository.findById(1).get();
    }
}
