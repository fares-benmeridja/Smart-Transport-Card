package com.passagermicroservice.passagermicroservice.controllers;

import com.passagermicroservice.passagermicroservice.Repositories.PassagerRepository;
import com.passagermicroservice.passagermicroservice.beans.Passager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PassagerController {

    @Autowired
    private PassagerRepository passagerRepository;

    @GetMapping("/passagers")
    public List<Passager> index()
    {
        return passagerRepository.findAll();
    }

    @GetMapping("/passagers/{id}")
    public Passager show(@PathVariable("id") int id){
        return  passagerRepository.findById(id).get();
    }

    @PostMapping("/passagers/create")
    public void create(Passager passager)
    {
        passagerRepository.save(passager);
    }

    @DeleteMapping("/passagers/delete/{id}")
    public void destroy(@PathVariable(name = "id") int id)
    {
        passagerRepository.deleteById(id);
    }
}
