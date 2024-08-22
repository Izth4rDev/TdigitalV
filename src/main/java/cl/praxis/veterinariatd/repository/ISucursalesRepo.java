package cl.praxis.veterinariatd.repository;
import cl.praxis.veterinariatd.entity.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISucursalesRepo extends JpaRepository<Sucursal, Integer> {
}
