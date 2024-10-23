package pe.edu.cibertec.DSWII_EF_CACHE_JorgeValdivieso.servise.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_EF_CACHE_JorgeValdivieso.exception.NotFoundException;
import pe.edu.cibertec.DSWII_EF_CACHE_JorgeValdivieso.model.Cliente;
import pe.edu.cibertec.DSWII_EF_CACHE_JorgeValdivieso.repository.ClienteRepository;
import pe.edu.cibertec.DSWII_EF_CACHE_JorgeValdivieso.servise.IClienteService;

@RequiredArgsConstructor
@Service
public class ClienteService implements IClienteService {

    private final ClienteRepository clienteRepository;

    @Override
    @Cacheable(value = "clientes", key = "#id")
    public Cliente obtenerClientePorId(Integer id) {
        return clienteRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Cliente no encontrado"));
    }
}
