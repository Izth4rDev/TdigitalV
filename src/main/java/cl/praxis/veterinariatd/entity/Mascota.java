package cl.praxis.veterinariatd.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mascota_id", nullable = false)
    private int id;
    @Column(name = "mascota_nombre")
    private String mascotaNombre;
    @Column(name = "mascota_raza")
    private String mascotaRaza;

    @ManyToOne
    @JoinColumn(name="dueno_id")
    private Dueno dueno;

    @OneToMany(mappedBy = "mascota")
    private Set<Atencion> atencion;
}
