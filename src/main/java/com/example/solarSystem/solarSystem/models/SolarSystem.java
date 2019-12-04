package com.example.solarSystem.solarSystem.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="solarSystems")
public class SolarSystem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @JsonIgnoreProperties("solarSystem")
    @OneToMany(mappedBy = "solarSystem")
    private List<Planet> planets;



    public SolarSystem(String name){
        this.name = name;
        this.planets = new ArrayList<Planet>();

    }

    public SolarSystem(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Planet> getPlanets() {
        return this.planets;
    }

    public void setPlanets(ArrayList<Planet> planets) {
        this.planets = planets;
    }

    public void addPlanet(Planet planet){
        planets.add(planet);
    }

    public int getNumberOfPlanets(){
        return this.planets.size();
    }

    public int getNumberOfMoons(){
        int total = 0;
        for(Planet planet : this.planets){
            total +=  planet.getNumberOfMoons();
        }
        return total;
    }

    public int getMassOfMoons() {
        int total = 0;
        for (Planet planet: this.planets){
           total += planet.getMassOfMoons();
        }

        return total;
    }

    public int getMassOfPlanets(){
        int total = 0;
        for (Planet planet: this.planets){
            total += planet.getMass();
        }
        return total;
    }

    public int getMassOfSolarSystem(){
        return this.getMassOfMoons() + this.getMassOfPlanets();
    }

    public int getNumberOfHabitablePlanets() {
        ArrayList<Planet> habitablePlanets = new ArrayList<Planet>();
        for(Planet planet : this.planets) {
            if(planet.isHabitable() == true){
                habitablePlanets.add(planet);
        }

        }
        return habitablePlanets.size();
    }
}
