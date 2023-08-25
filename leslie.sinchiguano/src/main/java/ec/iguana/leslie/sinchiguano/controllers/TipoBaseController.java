package ec.iguana.leslie.sinchiguano.controllers;

import ec.iguana.leslie.sinchiguano.models.entity.TipoBase;
import ec.iguana.leslie.sinchiguano.models.services.TipoBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/tipobase")
public class TipoBaseController {

    @Autowired
    private TipoBaseService tipoBaseService;

    @GetMapping
    public List<TipoBase> getTiposBase(){
        return tipoBaseService.getTiposBases();
    }

    @PostMapping
    public void registroTipoBase(@RequestBody TipoBase tipoBase) {
        tipoBaseService.registrarTipoBase(tipoBase);
    }
}
