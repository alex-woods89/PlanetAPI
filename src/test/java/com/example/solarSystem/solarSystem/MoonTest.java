package com.example.solarSystem.solarSystem;

import com.example.solarSystem.solarSystem.models.Moon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoonTest {

    private Moon moon1;

    @Before
    public void before() {
         moon1 = new Moon("The Moon", 100);
    }



    @Test
    public void canGetMass(){
        assertEquals(100, moon1.getMass());
    }


}
