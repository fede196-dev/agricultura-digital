package ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.models.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "Comentarios")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ComentarioEntity implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_comentario;

    private String texto;
    private String usuario;//Luego se referenciará al usuario que creó el comentario.

    @Temporal(TemporalType.DATE)//Solo fecha, no horario por ahora, temporal sirve para poner el tipo de dato fecha
    private Date fecha;
}
