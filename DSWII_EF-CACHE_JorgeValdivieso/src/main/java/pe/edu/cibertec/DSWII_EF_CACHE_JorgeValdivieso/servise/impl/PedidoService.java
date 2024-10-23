package pe.edu.cibertec.DSWII_EF_CACHE_JorgeValdivieso.servise.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_EF_CACHE_JorgeValdivieso.model.Pedido;
import pe.edu.cibertec.DSWII_EF_CACHE_JorgeValdivieso.repository.PedidoRepository;
import pe.edu.cibertec.DSWII_EF_CACHE_JorgeValdivieso.servise.IPedidoService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PedidoService implements IPedidoService {

    private final PedidoRepository pedidoRepository;

    @Override
    @Cacheable(value = "pedidos", key = "#clienteId")
    public List<Pedido> obtenerPedidosPorCliente(Integer clienteId) {
        return pedidoRepository.findByClienteId(clienteId);
    }
}
