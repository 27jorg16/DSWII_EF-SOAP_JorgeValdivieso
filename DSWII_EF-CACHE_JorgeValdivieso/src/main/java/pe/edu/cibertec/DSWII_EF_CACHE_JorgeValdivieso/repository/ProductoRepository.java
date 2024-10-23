package pe.edu.cibertec.DSWII_EF_CACHE_JorgeValdivieso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWII_EF_CACHE_JorgeValdivieso.model.Producto;


@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}
