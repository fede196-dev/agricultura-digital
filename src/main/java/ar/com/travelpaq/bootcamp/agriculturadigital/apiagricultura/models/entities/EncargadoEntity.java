package ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.models.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "Encargados")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

//Personas serán los encargados de las acciones que se realizarán en la pagina (Ej riego, cosecha)
//Sus nombres aparecerán al lado de la acción a realizar
public class PersonaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;
    String nombre;
    String apellido;
//    Integer dni;
//    String email;
//    String profesion;

}
