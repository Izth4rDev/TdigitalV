package cl.praxis.veterinariatd.repository;
import cl.praxis.veterinariatd.entity.Atencion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAtencionRepo extends JpaRepository<Atencion, Integer> {
}
