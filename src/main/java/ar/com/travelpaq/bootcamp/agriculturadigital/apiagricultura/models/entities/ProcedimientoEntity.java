package ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.models.entities;

import ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.models.domain.Paso;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "procedimiento")

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ProcedimientoEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descripcion;

    private Date fecha_comienzo;
    private Date fecha_fin;
//    private Paso[] pasos;
}
