package cl.praxis.veterinariatd.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Atencion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "atencion_id", nullable = false)
    private int id;
    @Column(name = "fecha_realizacion")
    private Date fechaRealizacion;
    @Column(name = "fecha_proxima_revision")
    private Date fechaProximaRevision;
    @Column(name = "box_atencion")
    private String boxAtencion;

    //relacion uno a muchos hacia medico
    @ManyToOne
    @JoinColumn(name="medico_id")
    private Medico medico;

    //relacion uno a muchos hacia sucursal
    @ManyToOne
    @JoinColumn(name="sucursal_id")
    private Sucursal sucursal;

    //relacion uno a mucho hacia mascota
    @ManyToOne
    @JoinColumn(name="mascota_id")
    private Mascota mascota;

    @ManyToOne
    @JoinColumn(name="tipo_atencion_id")
    private TipoAtencion tipoAtencion;
}
