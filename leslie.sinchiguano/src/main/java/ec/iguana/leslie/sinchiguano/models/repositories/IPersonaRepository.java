package ec.iguana.leslie.sinchiguano.models.repositories;

import ec.iguana.leslie.sinchiguano.models.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Integer> {

    @Query("from persona p where p.identificacionPersona like %?1% order by p.idPersona")
    List<Persona> buscarPersonaCedula(String cadenaBusqueda);
}
