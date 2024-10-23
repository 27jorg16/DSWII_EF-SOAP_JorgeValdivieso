package pe.edu.cibertec.DSWII_EF_CACHE_JorgeValdivieso.servise.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_EF_CACHE_JorgeValdivieso.model.Producto;
import pe.edu.cibertec.DSWII_EF_CACHE_JorgeValdivieso.repository.ProductoRepository;
import pe.edu.cibertec.DSWII_EF_CACHE_JorgeValdivieso.servise.IProductoService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductoService implements IProductoService {

    private final ProductoRepository productoRepository;

    @Override
    @Cacheable("productos")
    public List<Producto> obtenerProductos() {
        return productoRepository.findAll();
    }
}
