package pe.edu.cibertec.DSWII_EF_CACHE_JorgeValdivieso.servise;

import pe.edu.cibertec.DSWII_EF_CACHE_JorgeValdivieso.model.Pedido;

import java.util.List;

public interface IPedidoService {
    List<Pedido> obtenerPedidosPorCliente(Integer clienteId);
}
