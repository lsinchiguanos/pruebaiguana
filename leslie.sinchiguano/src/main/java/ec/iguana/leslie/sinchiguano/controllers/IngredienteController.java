package ec.iguana.leslie.sinchiguano.controllers;

import ec.iguana.leslie.sinchiguano.exceptions.MessageInfo;
import ec.iguana.leslie.sinchiguano.models.entity.Ingrediente;
import ec.iguana.leslie.sinchiguano.models.services.IngredienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/ingrediente")
public class IngredienteController {

    @Autowired
    private Environment environment;

    @Autowired
    private IngredienteService ingredienteService;

    @GetMapping
    public List<Ingrediente> getIngrediente(){
        return ingredienteService.getIngrediente();
    }

    @PostMapping
    public ResponseEntity<MessageInfo> registroIngrediente(@Valid @RequestBody Ingrediente ingrediente, BindingResult bindingResult){
        ingredienteService.registrarIngrediente(ingrediente);
        return new ResponseEntity<>(new MessageInfo(true, environment.getProperty("objeto.registrado"), null), HttpStatus.OK);
    }
}
