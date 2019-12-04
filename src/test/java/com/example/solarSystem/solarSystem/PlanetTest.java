package com.example.solarSystem.solarSystem;

import com.example.solarSystem.solarSystem.models.Moon;
import com.example.solarSystem.solarSystem.models.Planet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlanetTest {

    private Planet earth;
    private Moon moon;

    @Before
    public void before(){
        earth = new Planet("Earth", 1000, true);
        moon = new Moon("The Moon", 100);
    }

    @Test
    public void canGetName(){
        assertEquals("Earth", earth.getName());
    }

    @Test
    public void startsWithNoMoons(){
        assertEquals(0, earth.getNumberOfMoons());
    }

    @Test
    public void canAddMoon(){
        earth.addMoon(moon);
        assertEquals(1, earth.getNumberOfMoons());
    }

    @Test
    public void canGetMassOfMoons(){
        earth.addMoon(moon);
        assertEquals(100, earth.getMassOfMoons());
    }

    @Test
    public void canCheckIfHabitable(){
        assertEquals(true, earth.isHabitable());
    }



}
