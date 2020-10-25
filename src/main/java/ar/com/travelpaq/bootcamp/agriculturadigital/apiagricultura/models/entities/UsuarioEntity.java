package ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.models.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Table(name = "usuarios")

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;

    @Column(name = "contrasena")
    String password;

    String nombre;

    String apellido;

    String dni;//Username del usuario
//
//    String profesion;
//
//    String email;


}
