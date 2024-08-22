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
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "medico_id", nullable = false)
    private int id;
    @Column(name = "medico_rut")
    private String medicoRut;
    @Column(name = "medico_nombre")
    private String medicoNombre;
    @Column(name = "medico_apellidos")
    private String medicoApellidos;
    @Column(name = "medico_email")
    private String medicoEmail;

    @OneToMany(mappedBy="medico")
    private Set<MedicoSucursal> medicoSucursales;

    @OneToMany(mappedBy = "medico")
    private Set<Atencion> atencion;
}
