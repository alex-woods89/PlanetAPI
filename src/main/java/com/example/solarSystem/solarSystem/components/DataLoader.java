package com.example.solarSystem.solarSystem.components;


import com.example.solarSystem.solarSystem.models.Moon;
import com.example.solarSystem.solarSystem.models.Planet;
import com.example.solarSystem.solarSystem.models.SolarSystem;
import com.example.solarSystem.solarSystem.repositories.MoonRepository;
import com.example.solarSystem.solarSystem.repositories.PlanetRepository;
import com.example.solarSystem.solarSystem.repositories.SolarSystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    MoonRepository moonRepository;

    @Autowired
    PlanetRepository planetRepository;

    @Autowired
    SolarSystemRepository solarSystemRepository;

    public DataLoader(){}

    public void run(ApplicationArguments args){
        Moon moon1 = new Moon("The Moon", 100);
        moonRepository.save(moon1);

        Planet planet1 = new Planet("Earth", 1000, true);
        planetRepository.save(planet1);

        SolarSystem solarSystem = new SolarSystem("Milky Way");
        solarSystemRepository.save(solarSystem);

        planet1.addMoon(moon1);
        planetRepository.save(planet1);

        solarSystem.addPlanet(planet1);
        solarSystemRepository.save(solarSystem);


    }


}
