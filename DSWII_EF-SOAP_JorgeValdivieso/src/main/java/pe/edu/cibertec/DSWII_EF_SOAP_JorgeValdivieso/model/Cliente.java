package pe.edu.cibertec.DSWII_EF_SOAP_JorgeValdivieso.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer clienteId;

    @Column(name = "NombreCliente")
    private String nombreCliente;

    @Column(name = "CorreoCliente")
    private String correoCliente;

    @Column(name = "TelefonoCliente")
    private String telefonoCliente;

    @Column(name = "DireccionCliente")
    private String direccionCliente;
}
