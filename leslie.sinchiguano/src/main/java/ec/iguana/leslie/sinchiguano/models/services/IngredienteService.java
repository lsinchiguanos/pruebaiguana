package ec.iguana.leslie.sinchiguano.models.services;

import ec.iguana.leslie.sinchiguano.exceptions.MessageInfo;
import ec.iguana.leslie.sinchiguano.models.entity.Ingrediente;
import ec.iguana.leslie.sinchiguano.models.repositories.IIngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredienteService {

    @Autowired
    IIngredienteRepository ingredienteRepository;

    public List<Ingrediente> getIngrediente(){
        return ingredienteRepository.findAll();
    }

    public void registrarIngrediente(Ingrediente ingrediente) {
        ingredienteRepository.save(ingrediente);
    }

}
