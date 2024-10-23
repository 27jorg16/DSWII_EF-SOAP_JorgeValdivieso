package pe.edu.cibertec.DSWII_EF_CACHE_JorgeValdivieso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWII_EF_CACHE_JorgeValdivieso.model.Proveedor;


@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor, Integer> {
}
