package ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.models.domain;

public class Proyecto {

   private Integer id_proyecto;
   private String nom_proyecto;
   private String estado;
   private Procedimiento[] procedimientos;
   private Tarea[] tareas;
   private Comentario[] comentarios;
   private Encargado encargado;
   private Campo campo;

}
