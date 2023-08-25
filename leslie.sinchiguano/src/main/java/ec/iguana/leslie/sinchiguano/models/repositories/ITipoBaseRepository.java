package ec.iguana.leslie.sinchiguano.models.repositories;

import ec.iguana.leslie.sinchiguano.models.entity.TipoBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoBaseRepository extends JpaRepository<TipoBase, Integer> {
}
