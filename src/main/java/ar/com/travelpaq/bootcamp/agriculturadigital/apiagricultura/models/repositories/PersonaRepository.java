package ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.models.repositories;

import ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.models.entities.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<PersonaEntity,Integer> {
}
