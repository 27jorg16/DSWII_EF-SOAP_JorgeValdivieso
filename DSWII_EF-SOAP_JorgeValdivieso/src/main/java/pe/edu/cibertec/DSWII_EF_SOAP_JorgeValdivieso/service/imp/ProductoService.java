package pe.edu.cibertec.DSWII_EF_SOAP_JorgeValdivieso.service.imp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_EF_SOAP_JorgeValdivieso.exception.NotFoundException;
import pe.edu.cibertec.DSWII_EF_SOAP_JorgeValdivieso.model.Producto;
import pe.edu.cibertec.DSWII_EF_SOAP_JorgeValdivieso.repository.ProductoRepository;
import pe.edu.cibertec.DSWII_EF_SOAP_JorgeValdivieso.service.IProductoService;
import pe.edu.cibertec.DSWII_EF_SOAP_JorgeValdivieso.util.convert.ProductoConvert;
import pe.edu.cibertec.ws.objects.GetProductoResponse;
import pe.edu.cibertec.ws.objects.GetProductosResponse;
import pe.edu.cibertec.ws.objects.PostProductoRequest;
import pe.edu.cibertec.ws.objects.PostProductoResponse;

@RequiredArgsConstructor
@Service
public class ProductoService implements IProductoService {

    private final ProductoRepository productoRepository;
    private final ProductoConvert productoConvert;

    @Override
    public GetProductosResponse listarProductos() {
        GetProductosResponse getProductosResponse = new GetProductosResponse();
        getProductosResponse.getProductos().addAll(
                productoConvert.mapToProductowsList(productoRepository.findAll())
        );
        return getProductosResponse;
    }

    @Override
    public GetProductoResponse obtenerProductoxId(Integer id) {
        GetProductoResponse productoResponse = new GetProductoResponse();
        Producto producto = productoRepository.findById(id).orElse(null);
        if(producto == null){
            throw new NotFoundException("El producto con ID " + id + " no existe.");
        }
        productoResponse.setProducto(productoConvert.mapToProductows(producto));
        return productoResponse;
    }

    @Override
    public PostProductoResponse registrarProducto(PostProductoRequest request) {
        PostProductoResponse postProductoResponse = new PostProductoResponse();
        Producto nuevoProducto = productoRepository.save(productoConvert.mapToProducto(request.getProducto()));
        postProductoResponse.setProducto(productoConvert.mapToProductows(nuevoProducto));
        return postProductoResponse;
    }

    @Override
    public PostProductoResponse actualizarProducto(PostProductoRequest request) {
        PostProductoResponse postProductoResponse = new PostProductoResponse();
        Producto productoExistente = productoRepository.findById(request.getProducto().getProductoId())
                .orElseThrow(() -> new NotFoundException("El producto con ID " + request.getProducto().getProductoId() + " no existe."));

        productoExistente.setNombreProducto(request.getProducto().getNombreProducto());
        productoExistente.setDescripcionProducto(request.getProducto().getDescripcionProducto());
        productoExistente.setPrecioProducto(request.getProducto().getPrecioProducto());
        productoExistente.setStockProducto(request.getProducto().getStockProducto());

        Producto productoActualizado = productoRepository.save(productoExistente);
        postProductoResponse.setProducto(productoConvert.mapToProductows(productoActualizado));
        return postProductoResponse;
    }
}
