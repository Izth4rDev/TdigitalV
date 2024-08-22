package cl.praxis.veterinariatd.aplicationjava.service.serviceImpl;
import cl.praxis.veterinariatd.aplicationjava.modelo.Mascota;
import cl.praxis.veterinariatd.aplicationjava.service.IAtentionAlert;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class AtentionAlertServiceImpl implements IAtentionAlert {
    private List<Mascota> mascotas;

    public AtentionAlertServiceImpl(List<Mascota> mascotas){
        this.mascotas = mascotas;
    }

    @Override
    public void alertaDeAtencion(LocalDate fecha) {
       List<Mascota> mascotasFiltradas = mascotas.stream().filter(m->m.getFecha_atencion().equals(fecha)).collect(Collectors.toList());
        for(Mascota mascota : mascotasFiltradas){
            System.out.println(mascota.getEspecie()+" "+mascota.getNombre()+" tiene "+mascota.getTipo_atencion());
        }
    }
}
