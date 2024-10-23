package pe.edu.cibertec.DSWII_EF_SOAP_JorgeValdivieso.service;

import pe.edu.cibertec.ws.objects.GetProveedorResponse;
import pe.edu.cibertec.ws.objects.GetProveedoresResponse;
import pe.edu.cibertec.ws.objects.PostProveedorRequest;
import pe.edu.cibertec.ws.objects.PostProveedorResponse;

public interface IProveedorService {
    GetProveedoresResponse listarProveedores();
    GetProveedorResponse obtenerProveedorexId(Integer id);
    PostProveedorResponse registrarProveedor(PostProveedorRequest request);
    PostProveedorResponse actualizarProveedor(PostProveedorRequest request);
}
