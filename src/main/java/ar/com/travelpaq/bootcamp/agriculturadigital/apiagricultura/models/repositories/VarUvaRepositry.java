package ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.models.repositories;

import ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.models.entities.VarUvaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VarUvaRepositry extends JpaRepository<VarUvaEntity,Long> {
}
