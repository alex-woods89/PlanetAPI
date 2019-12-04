package com.example.solarSystem.solarSystem.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "planets")
public class Planet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "mass")
    private int mass;

    @JsonIgnoreProperties("planet")
    @OneToMany(mappedBy = "planet")

    private List<Moon> moons;

    @Column(name = "habitable")
    private boolean habitable;

    @JsonIgnoreProperties("planets")
    @ManyToOne
    @JoinColumn(name = "solarSystem_id")
    private SolarSystem solarSystem;




    public Planet(String name, int mass, boolean habitable){
        this.name = name;
        this.moons = new ArrayList<Moon>();
        this.mass = mass;
        this.habitable = habitable;
        this.solarSystem = solarSystem;

    }

    public Planet(){}

    public SolarSystem getSolarSystem() {
        return solarSystem;
    }

    public void setSolarSystem(SolarSystem solarSystem) {
        this.solarSystem = solarSystem;
    }

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

    public List<Moon> getMoons() {
        return moons;
    }

    public void setMoons(ArrayList<Moon> moons) {
        this.moons = moons;
    }

    public void addMoon(Moon moon){
        moons.add(moon);
    }

    public int getNumberOfMoons(){
        return this.moons.size();
    }

    public int getMassOfMoons() {
        int total = 0;
        for(Moon moon : this.moons){
           total += moon.getMass();
        }
        return total;
    }

    public int getMass() {
        return this.mass;
    }

    public void setMass(int mass){
        this.mass = mass;
    }

    public boolean isHabitable() {
        return habitable;
    }

    public void setHabitable(boolean habitable) {
        this.habitable = habitable;
    }
}
