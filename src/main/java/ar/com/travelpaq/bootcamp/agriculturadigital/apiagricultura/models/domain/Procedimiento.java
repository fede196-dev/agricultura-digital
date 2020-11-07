package ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.models.domain;

import java.util.Date;

public class Procedimiento {
   private Long id;
   private String titulo;
   private String descripcion;
   private Paso[] pasos;
   private Date fecha_comienzo;
   private Date fecha_fin;

}
