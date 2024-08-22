package cl.praxis.veterinariatd.service.serviceImpl;
import cl.praxis.veterinariatd.entity.Sucursal;
import cl.praxis.veterinariatd.repository.ISucursalesRepo;
import cl.praxis.veterinariatd.service.ISucursalService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SucursalServiceImpl implements ISucursalService {

    private ISucursalesRepo sucursalesRepo ;

    public SucursalServiceImpl(ISucursalesRepo sucursalesRepo) {
        this.sucursalesRepo = sucursalesRepo;
    }

    @Override
    public List<Sucursal> getAllSucursal() {
        return sucursalesRepo.findAll();
    }

}
