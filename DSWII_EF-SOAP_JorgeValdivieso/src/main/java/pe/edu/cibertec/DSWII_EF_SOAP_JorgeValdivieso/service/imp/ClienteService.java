package pe.edu.cibertec.DSWII_EF_SOAP_JorgeValdivieso.service.imp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_EF_SOAP_JorgeValdivieso.exception.NotFoundException;
import pe.edu.cibertec.DSWII_EF_SOAP_JorgeValdivieso.model.Cliente;
import pe.edu.cibertec.DSWII_EF_SOAP_JorgeValdivieso.repository.ClienteRepository;
import pe.edu.cibertec.DSWII_EF_SOAP_JorgeValdivieso.service.IClienteService;
import pe.edu.cibertec.DSWII_EF_SOAP_JorgeValdivieso.util.convert.ClienteConvert;
import pe.edu.cibertec.ws.objects.GetClienteResponse;
import pe.edu.cibertec.ws.objects.GetClientesResponse;
import pe.edu.cibertec.ws.objects.PostClienteRequest;
import pe.edu.cibertec.ws.objects.PostClienteResponse;

@RequiredArgsConstructor
@Service
public class ClienteService implements IClienteService {

    private final ClienteRepository clienteRepository;
    private final ClienteConvert clienteConvert;

    @Override
    public GetClientesResponse listarClientes() {
        GetClientesResponse getClientesResponse = new GetClientesResponse();
        getClientesResponse.getClientes().addAll(
                clienteConvert.mapToClientewsList(clienteRepository.findAll())
        );
        return getClientesResponse;
    }

    @Override
    public GetClienteResponse obtenerClientexId(Integer id) {
        GetClienteResponse clienteResponse = new GetClienteResponse();
        Cliente cliente = clienteRepository.findById(id).orElse(null);
        if(cliente == null){
            throw new NotFoundException("El cliente con ID " + id + " no existe.");
        }
        clienteResponse.setCliente(clienteConvert.mapToClientews(cliente));
        return clienteResponse;
    }

    @Override
    public PostClienteResponse registrarCliente(PostClienteRequest request) {
        PostClienteResponse postClienteResponse = new PostClienteResponse();
        Cliente nuevoCliente = clienteRepository.save(clienteConvert.mapToCliente(request.getCliente()));
        postClienteResponse.setCliente(clienteConvert.mapToClientews(nuevoCliente));
        return postClienteResponse;
    }

    @Override
    public PostClienteResponse actualizarCliente(PostClienteRequest request) {
        PostClienteResponse postClienteResponse = new PostClienteResponse();
        Cliente clienteExistente = clienteRepository.findById(request.getCliente().getClienteId())
                .orElseThrow(() -> new NotFoundException("El cliente con ID " + request.getCliente().getClienteId() + " no existe."));

        clienteExistente.setNombreCliente(request.getCliente().getNombreCliente());
        clienteExistente.setCorreoCliente(request.getCliente().getCorreoCliente());
        clienteExistente.setDireccionCliente(request.getCliente().getNombreCliente());
        clienteExistente.setTelefonoCliente(request.getCliente().getTelefonoCliente());

        Cliente clienteActualizado = clienteRepository.save(clienteExistente);
        postClienteResponse.setCliente(clienteConvert.mapToClientews(clienteActualizado));
        return postClienteResponse;
    }
}
