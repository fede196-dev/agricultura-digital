package ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.models.entities;

import ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.models.domain.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "proyecto")

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor


public class ProyectoEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_proyecto;
    private String nom_proyecto;
    private String estado;
    //private Procedimiento[] procedimientos;
    //private Tarea[] tareas;
    //private Comentario[] comentarios;
    //private Encargado encargado;
    //private Campo campo;

}
