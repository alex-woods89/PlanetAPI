package com.example.solarSystem.solarSystem.repositories;

import com.example.solarSystem.solarSystem.models.Moon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface MoonRepository extends JpaRepository<Moon, Long> {
}
