package ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.models.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


//encargados serán los responsables de las acciones que se realizarán en la pagina (Ej riego, cosecha)
//Sus nombres aparecerán al lado de la acción a realizar
@Table(name = "encargados")

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class EncargadoEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    @Column(nullable = false)
    private String profesion;
//    Integer dni;
//    String email;


}
