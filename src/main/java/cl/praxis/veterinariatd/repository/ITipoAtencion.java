package cl.praxis.veterinariatd.repository;
import cl.praxis.veterinariatd.entity.TipoAtencion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoAtencion extends JpaRepository<TipoAtencion, Integer> {
}
