package ec.iguana.leslie.sinchiguano.controllers;

import ec.iguana.leslie.sinchiguano.models.entity.Persona;
import ec.iguana.leslie.sinchiguano.models.entity.Producto;
import ec.iguana.leslie.sinchiguano.models.services.PersonaService;
import ec.iguana.leslie.sinchiguano.models.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Producto> getProducto(){
        return productoService.getProducto();
    }

    @PostMapping
    public void registroPersona(@RequestBody Producto producto){
        productoService.registrarProducto(producto);
    }
}
