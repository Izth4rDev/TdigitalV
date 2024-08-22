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
public class Dueno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dueno_id", nullable = false)
    private int id;
    @Column(name = "dueno_rut")
    private String duenoRut;
    @Column(name = "dueno_nombre")
    private String duenoNombre;
    @Column(name = "dueno_apellidos")
    private String duenoApellidos;
    @Column(name = "dueno_email")
    private String duenoEmail;

    @OneToMany(mappedBy = "dueno")
    private Set<Mascota> mascota;
}
