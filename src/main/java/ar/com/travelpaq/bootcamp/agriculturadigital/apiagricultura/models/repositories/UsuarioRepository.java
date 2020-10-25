package ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.models.repositories;

import ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.models.entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity,Integer> {
    UsuarioEntity findByDni(String dni);
}
