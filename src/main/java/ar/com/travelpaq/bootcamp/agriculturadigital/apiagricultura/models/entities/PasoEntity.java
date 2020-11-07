package ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.models.entities;

//import ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.mappers.PasoPKMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "pasos")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class PasoEntity implements Serializable {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;//Creo una clave primaria compuesta
   private Integer num_paso;
   private Integer tiempo_restante;
   private Integer duracion;
   private String categoria;
   private String descripcion;
   private String nombre_paso;
}
