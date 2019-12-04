package com.example.solarSystem.solarSystem.controllers;


import com.example.solarSystem.solarSystem.repositories.SolarSystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/solarsystems")
public class SolarSystemController {

    @Autowired
    SolarSystemRepository solarSystemRepository;
}
