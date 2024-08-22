package cl.praxis.veterinariatd.service;
import cl.praxis.veterinariatd.entity.Atencion;
import java.util.List;
public interface IAtencionService {
    public List<Atencion> getAllAtenciones();
    public List<Atencion> searchAtenciones(int sucursalId, int tipoAtencionId);
    public Atencion createAtencion(Atencion atencion);
    public Atencion updateAtencion(Atencion atencion);
}
