package pe.edu.cibertec.DSWII_EF_SOAP_JorgeValdivieso.service;

import pe.edu.cibertec.ws.objects.GetProductoResponse;
import pe.edu.cibertec.ws.objects.GetProductosResponse;
import pe.edu.cibertec.ws.objects.PostProductoRequest;
import pe.edu.cibertec.ws.objects.PostProductoResponse;

public interface IProductoService {
    GetProductosResponse listarProductos();
    GetProductoResponse obtenerProductoxId(Integer id);
    PostProductoResponse registrarProducto(PostProductoRequest request);
    PostProductoResponse actualizarProducto(PostProductoRequest request);
}
