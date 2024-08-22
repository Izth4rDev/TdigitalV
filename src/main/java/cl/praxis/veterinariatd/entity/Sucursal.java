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
public class Sucursal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sucursal_id", nullable = false)
    private int id;
    @Column(name = "sucursal_nombre")
    private String sucursalNombre;
    @Column(name = "sucursal_direccion")
    private String sucursalDireccion;
    @Column(name = "sucursal_telefono")
    private String telefono;

    @OneToMany(mappedBy="sucursal")
    private Set<MedicoSucursal> medicoSucursales;

    @OneToMany(mappedBy = "sucursal")
    private Set<Atencion> atencion;
}
