package ec.iguana.leslie.sinchiguano.models.services;

import ec.iguana.leslie.sinchiguano.models.entity.Persona;
import ec.iguana.leslie.sinchiguano.models.repositories.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {

    @Autowired
    IPersonaRepository personaRepository;

    public List<Persona> getClientes(){
        return personaRepository.findAll();
    }

    public List<Persona> getBuscarPersona(String cadenaBusqueda){
        return personaRepository.buscarPersonaCedula(cadenaBusqueda);
    }

    public void registrarPersona(Persona persona){
        personaRepository.save(persona);
    }
}
