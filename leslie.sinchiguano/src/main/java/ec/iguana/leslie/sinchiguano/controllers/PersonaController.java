package ec.iguana.leslie.sinchiguano.controllers;

import ec.iguana.leslie.sinchiguano.models.entity.Persona;
import ec.iguana.leslie.sinchiguano.models.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/clientes")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping
    public List<Persona> getClientes(){
        return personaService.getClientes();
    }

    @GetMapping(value = "/buscar")
    public List<Persona> getClientesxIdentificacion(@RequestParam(name="identificacion") String cadenaBusqueda){
        return personaService.getBuscarPersona(cadenaBusqueda);
    }

    @PostMapping
    public ResponseEntity<String> registroPersona(@RequestBody @Valid Persona persona){
        personaService.registrarPersona(persona);
        return new ResponseEntity<>("Request is valid", HttpStatus.OK);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<String>> handleValidationException(MethodArgumentNotValidException ex) {
        List<String> errors = new ArrayList<>();
        ex.getBindingResult().getAllErrors().forEach(error -> {
            errors.add(error.getDefaultMessage());
        });
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }
}
