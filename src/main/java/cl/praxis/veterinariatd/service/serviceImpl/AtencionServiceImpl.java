package cl.praxis.veterinariatd.service.serviceImpl;
import cl.praxis.veterinariatd.entity.Atencion;
import cl.praxis.veterinariatd.repository.IAtencionRepo;
import cl.praxis.veterinariatd.service.IAtencionService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AtencionServiceImpl implements IAtencionService {

    private IAtencionRepo iAtencionRepo;

    public AtencionServiceImpl(IAtencionRepo iAtencionRepo){
        this.iAtencionRepo = iAtencionRepo;
    }

    @Override
    public List<Atencion> getAllAtenciones() {
        return iAtencionRepo.findAll();
    }

    @Override
    public List<Atencion> searchAtenciones(int sucursalId, int tipoAtencionId) {

        List<Atencion> atenciones = iAtencionRepo.findAll();

        List<Atencion> atencionesFiltradas = atenciones.stream()
                .filter(filtrar -> (sucursalId == 0 || filtrar.getSucursal().getId() == sucursalId)
                        && (tipoAtencionId == 0 || filtrar.getTipoAtencion().getId() == tipoAtencionId))
                .collect(Collectors.toUnmodifiableList());

        System.out.println("Atenciones FILTRADAS!!!" + atencionesFiltradas);
        return atencionesFiltradas;
    }

    @Override
    public Atencion createAtencion(Atencion atencion) {
        return iAtencionRepo.save(atencion);
    }

    @Override
    public Atencion updateAtencion(Atencion atencion) {
        return iAtencionRepo.save(atencion);
    }

}
