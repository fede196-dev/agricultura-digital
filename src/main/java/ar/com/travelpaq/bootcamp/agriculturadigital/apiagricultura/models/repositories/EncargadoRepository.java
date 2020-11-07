package ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.models.repositories;

import ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.models.entities.EncargadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EncargadoRepository extends JpaRepository<EncargadoEntity,Integer> {
}
