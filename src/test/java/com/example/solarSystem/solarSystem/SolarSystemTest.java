package com.example.solarSystem.solarSystem;

import com.example.solarSystem.solarSystem.models.Moon;
import com.example.solarSystem.solarSystem.models.Planet;
import com.example.solarSystem.solarSystem.models.SolarSystem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolarSystemTest {

    private SolarSystem solarSystem;
    private Planet planet;
    private Moon moon;




    @Before
    public void before(){
        moon = new Moon("The Moon", 100);
        planet = new Planet("Earth", 1000, true, moon);
        solarSystem = new SolarSystem("Milky Way", planet);

        planet.addMoon(moon);
        solarSystem.addPlanet(planet);
    }

    @Test
    public void canGetName(){
        assertEquals("Milky Way", solarSystem.getName());
    }

    @Test
    public void solarSystemStartsEmpty(){
        assertEquals(1, solarSystem.getNumberOfPlanets());
    }

    @Test
    public void canAddPlanet(){
        solarSystem.addPlanet(planet);
        assertEquals(2, solarSystem.getNumberOfPlanets());
    }

    @Test
    public void canGetNumberOfMoons(){
        assertEquals(1, solarSystem.getNumberOfMoons());
    }



    @Test
    public void canGetMassOfMoons(){
        assertEquals(100, solarSystem.getMassOfMoons());

    }

    @Test
    public void canGetMassOfPlanets(){
        assertEquals(1000, solarSystem.getMassOfPlanets());
    }

    @Test
    public void canGetMassOfSolarSystem(){
        assertEquals(1100, solarSystem.getMassOfSolarSystem());
    }

    @Test
    public void canGetNumberOfHabitablePlanets(){
        Planet saturn = new Planet("saturn", 1000, false, moon);
        solarSystem.addPlanet(saturn);
        assertEquals(1, solarSystem.getNumberOfHabitablePlanets());
    }





}
