package ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.models.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "variedad_uvas")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class VarUvaEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_uva;
    private String nom_uva;
    private String descripcion;

}
