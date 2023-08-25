package ec.iguana.leslie.sinchiguano.models.services;

import ec.iguana.leslie.sinchiguano.models.entity.TipoBase;
import ec.iguana.leslie.sinchiguano.models.repositories.ITipoBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoBaseService {

    @Autowired
    ITipoBaseRepository tipoBaseRepository;

    public List<TipoBase> getTiposBases(){
        return tipoBaseRepository.findAll();
    }

    public void registrarTipoBase(TipoBase tipoBase){
        tipoBaseRepository.save(tipoBase);
    }
}
