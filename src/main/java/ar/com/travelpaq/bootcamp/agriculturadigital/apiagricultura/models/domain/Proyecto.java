package ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.models.domain;

public class Proyecto {

    Integer id_proyecto;
    String nom_proyecto;
    String estado;
    Procedimiento[] procedimientos;
    Tarea[] tareas;
    Comentario[] comentarios;
    Encargado encargado;
    Campo campo;

}
