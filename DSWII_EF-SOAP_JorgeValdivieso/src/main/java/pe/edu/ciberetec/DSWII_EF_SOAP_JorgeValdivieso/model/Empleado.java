package pe.edu.ciberetec.DSWII_EF_SOAP_JorgeValdivieso.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empleadoId;

    @Column(name = "NombreEmpleado")
    private String nombreEmpleado;

    @Column(name = "CargoEmpleado")
    private String cargoEmpleado;

    @Column(name = "SalarioEmpleado")
    private Double salarioEmpleado;
}
