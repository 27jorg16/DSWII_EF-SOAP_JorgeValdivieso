package pe.edu.cibertec.DSWII_EF_CACHE_JorgeValdivieso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWII_EF_CACHE_JorgeValdivieso.model.Pedido;

import java.util.List;


@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
    List<Pedido> findByClienteId(Integer clienteId);
}
