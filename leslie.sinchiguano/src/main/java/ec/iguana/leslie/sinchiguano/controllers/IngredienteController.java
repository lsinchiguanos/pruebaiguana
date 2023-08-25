package ec.iguana.leslie.sinchiguano.controllers;

import ec.iguana.leslie.sinchiguano.models.entity.Ingrediente;
import ec.iguana.leslie.sinchiguano.models.services.IngredienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/ingrediente")
public class IngredienteController {

    @Autowired
    private IngredienteService ingredienteService;

    @GetMapping
    public List<Ingrediente> getIngrediente(){
        return ingredienteService.getIngrediente();
    }

    @PostMapping
    public void registroIngrediente(@RequestBody Ingrediente ingrediente){
        ingredienteService.registrarIngrediente(ingrediente);
    }
}
