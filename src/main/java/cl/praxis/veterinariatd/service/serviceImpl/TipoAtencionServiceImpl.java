package cl.praxis.veterinariatd.service.serviceImpl;
import cl.praxis.veterinariatd.entity.TipoAtencion;
import cl.praxis.veterinariatd.repository.ITipoAtencion;
import cl.praxis.veterinariatd.service.ITipoAtencionService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TipoAtencionServiceImpl implements ITipoAtencionService {

    private ITipoAtencion tipoAtencion;

    public TipoAtencionServiceImpl(ITipoAtencion tipoAtencion) {
        this.tipoAtencion = tipoAtencion;
    }

    @Override
    public List<TipoAtencion> getAllTipoAtencion() {
        return tipoAtencion.findAll();
    }
}
