package ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.models.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class VarUva {

   private Long id_uva;
   private String nom_uva;
   private String descripcion;

}
