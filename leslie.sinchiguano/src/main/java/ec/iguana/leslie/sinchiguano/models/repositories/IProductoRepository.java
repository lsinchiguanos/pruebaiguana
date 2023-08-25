package ec.iguana.leslie.sinchiguano.models.repositories;

import ec.iguana.leslie.sinchiguano.models.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Integer> {
}
