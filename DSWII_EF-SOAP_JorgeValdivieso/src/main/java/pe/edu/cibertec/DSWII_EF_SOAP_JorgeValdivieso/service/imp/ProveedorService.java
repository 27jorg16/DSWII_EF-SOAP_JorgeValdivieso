package pe.edu.cibertec.DSWII_EF_SOAP_JorgeValdivieso.service.imp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_EF_SOAP_JorgeValdivieso.exception.NotFoundException;
import pe.edu.cibertec.DSWII_EF_SOAP_JorgeValdivieso.model.Proveedor;
import pe.edu.cibertec.DSWII_EF_SOAP_JorgeValdivieso.repository.ProveedorRepository;
import pe.edu.cibertec.DSWII_EF_SOAP_JorgeValdivieso.service.IProveedorService;
import pe.edu.cibertec.DSWII_EF_SOAP_JorgeValdivieso.util.convert.ProveedorConvert;
import pe.edu.cibertec.ws.objects.GetProveedorResponse;
import pe.edu.cibertec.ws.objects.GetProveedoresResponse;
import pe.edu.cibertec.ws.objects.PostProveedorRequest;
import pe.edu.cibertec.ws.objects.PostProveedorResponse;

@RequiredArgsConstructor
@Service
public class ProveedorService implements IProveedorService {

    private final ProveedorRepository proveedorRepository;
    private final ProveedorConvert proveedorConvert;

    @Override
    public GetProveedoresResponse listarProveedores() {
        GetProveedoresResponse getProveedoresResponse = new GetProveedoresResponse();
        getProveedoresResponse.getProveedores().addAll(
                proveedorConvert.mapToProveedorwsList(proveedorRepository.findAll())
        );
        return getProveedoresResponse;
    }

    @Override
    public GetProveedorResponse obtenerProveedorexId(Integer id) {
        GetProveedorResponse proveedorResponse = new GetProveedorResponse();
        Proveedor proveedor = proveedorRepository.findById(id).orElse(null);
        if(proveedor == null){
            throw new NotFoundException("El proveedor con ID " + id + " no existe.");
        }
        proveedorResponse.setProveedor(proveedorConvert.mapToProveedorws(proveedor));
        return proveedorResponse;
    }

    @Override
    public PostProveedorResponse registrarProveedor(PostProveedorRequest request) {
        PostProveedorResponse postProveedorResponse = new PostProveedorResponse();
        Proveedor nuevoProveedor = proveedorRepository.save(proveedorConvert.mapToProveedor(request.getProveedor()));
        postProveedorResponse.setProveedor(proveedorConvert.mapToProveedorws(nuevoProveedor));
        return postProveedorResponse;
    }

    @Override
    public PostProveedorResponse actualizarProveedor(PostProveedorRequest request) {
        PostProveedorResponse postProveedorResponse = new PostProveedorResponse();
        Proveedor proveedorExistente = proveedorRepository.findById(request.getProveedor().getProveedorId())
                .orElseThrow(() -> new NotFoundException("El proveedor con ID " + request.getProveedor().getProveedorId() + " no existe."));

        proveedorExistente.setNombreProveedor(request.getProveedor().getNombreProveedor());
        proveedorExistente.setTelefonoProveedor(request.getProveedor().getTelefonoProveedor());
        proveedorExistente.setCorreoProveedor(request.getProveedor().getNombreProveedor());
        proveedorExistente.setDireccionProveedor(request.getProveedor().getTelefonoProveedor());

        Proveedor proveedorActualizado = proveedorRepository.save(proveedorExistente);
        postProveedorResponse.setProveedor(proveedorConvert.mapToProveedorws(proveedorActualizado));
        return postProveedorResponse;
    }
}
