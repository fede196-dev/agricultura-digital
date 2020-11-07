package ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.models.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "usuarios")

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class UsuarioEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "contrasena")
    private String password;

   private String nombre;

    private String apellido;

    private String dni;//Username del usuario
//
//    private String profesion;
//
//    private String email;


}
