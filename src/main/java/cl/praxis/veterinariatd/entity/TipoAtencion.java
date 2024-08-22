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
public class TipoAtencion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tipo_atencion_id", nullable = false)
    private int id;
    @Column(name = "tipo_atencion_descripcion")
    private String tipoAtencionDescripcion;

    @OneToMany(mappedBy = "tipoAtencion")
    private Set<Atencion> atencion;

}
