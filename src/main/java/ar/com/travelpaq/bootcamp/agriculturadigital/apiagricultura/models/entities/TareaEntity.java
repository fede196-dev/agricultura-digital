package ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.models.entities;

import ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.models.domain.Paso;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "tareas")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class TareaEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descripcion;
    //private Paso[] pasos;

    @Temporal(TemporalType.DATE)//Solo fecha, no horario por ahora, temporal sirve para poner el tipo de dato fecha
    private Date fecha_comienzo;

    @Temporal(TemporalType.DATE)//Solo fecha, no horario por ahora, temporal sirve para poner el tipo de dato fecha
    private Date fecha_fin;


    private String estado;
}
