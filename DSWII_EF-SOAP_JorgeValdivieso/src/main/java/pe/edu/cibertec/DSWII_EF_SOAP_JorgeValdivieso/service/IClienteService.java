package pe.edu.cibertec.DSWII_EF_SOAP_JorgeValdivieso.service;

import pe.edu.cibertec.ws.objects.GetClienteResponse;
import pe.edu.cibertec.ws.objects.GetClientesResponse;
import pe.edu.cibertec.ws.objects.PostClienteRequest;
import pe.edu.cibertec.ws.objects.PostClienteResponse;

public interface IClienteService {
    GetClientesResponse listarClientes();
    GetClienteResponse obtenerClientexId(Integer id);
    PostClienteResponse registrarCliente(PostClienteRequest request);
    PostClienteResponse actualizarCliente(PostClienteRequest request);
}
