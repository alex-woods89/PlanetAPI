package com.example.solarSystem.solarSystem.controllers;

import com.example.solarSystem.solarSystem.repositories.MoonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/moons")
public class MoonController {

    @Autowired
    MoonRepository moonRepository;
}
