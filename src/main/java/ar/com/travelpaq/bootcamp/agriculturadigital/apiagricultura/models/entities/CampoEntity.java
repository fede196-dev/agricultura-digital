package ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.models.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "campos")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class CampoEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_campo;

    @Column(nullable = false )
    private Integer cantidad_plantas;

    @Column(nullable = false)
    private Integer superficie;

    @Column(nullable = false)
    private String ubicacion;

    @Column(nullable = false)
    private Integer produccion_esperada;

//    @ManyToMany
//    @JoinTable(name = "variedad_uvas",joinColumns = @JoinColumn(name = "id_campo"),inverseJoinColumns = @JoinColumn(name = "id_uva"))
//    @Column(nullable = false)
//    private Set<Var_uvaEntity> var_uvaEntities;
}
