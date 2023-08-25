package ec.iguana.leslie.sinchiguano.models.services;

import ec.iguana.leslie.sinchiguano.models.entity.Producto;
import ec.iguana.leslie.sinchiguano.models.repositories.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    IProductoRepository productoRepository;

    public List<Producto> getProducto(){
        return productoRepository.findAll();
    }

    public void registrarProducto(Producto producto){
        productoRepository.save(producto);
    }
}
