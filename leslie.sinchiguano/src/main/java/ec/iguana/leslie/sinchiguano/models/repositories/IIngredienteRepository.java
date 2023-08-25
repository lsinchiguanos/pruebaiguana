package ec.iguana.leslie.sinchiguano.models.repositories;

import ec.iguana.leslie.sinchiguano.models.entity.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IIngredienteRepository extends JpaRepository<Ingrediente, Integer> {
}
